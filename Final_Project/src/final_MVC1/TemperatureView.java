package final_MVC1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureView extends JFrame {

	private JLabel jLabel;
	private JTextField jTextField;
	private String[] tempList = { "Celsius", "Fahrenheit" };
	private JComboBox<String> comboBoxs;
	private JButton button;
	private JTextField resultTextField;

	private TemperatureController controller;
	private TemperatureModel model;

	public TemperatureView(TemperatureController controller, TemperatureModel model) {
		this.controller = controller;
		this.model = model;

		createView();
		eventHandler();
	}

	public void createView() {
		setLayout(new FlowLayout());

		jLabel = new JLabel("Temp");
		jTextField = new JTextField(20);
		add(jLabel);
		add(jTextField);

		comboBoxs = new JComboBox<>(tempList);
		comboBoxs.setSelectedItem("Celsius"); // Default selection
		add(comboBoxs);

		button = new JButton("Convert");
		add(button);

		resultTextField = new JTextField(20); // Text field to display result
		resultTextField.setEditable(false); // Make it non-editable
		add(resultTextField);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 150);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void eventHandler() {
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					double temperature = Double.parseDouble(jTextField.getText());
					String selectedUnit = (String) comboBoxs.getSelectedItem();
					if (selectedUnit.equals("Celsius")) {
						controller.celsiusToFahrenheit(temperature);
					} else if (selectedUnit.equals("Fahrenheit")) {
						controller.fahrenheitToCelsius(temperature);
					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Vui lòng nhập một số hợp lệ.");
				}
			}
		});
	}

	// Method to update the result text field
	public void updateResultText(String resultText) {
		resultTextField.setText(resultText);
	}

	public static void main(String[] args) {
		TemperatureModel model = new TemperatureModel();
		TemperatureController controller = new TemperatureController(model);
		new TemperatureView(controller, model);
	}
}