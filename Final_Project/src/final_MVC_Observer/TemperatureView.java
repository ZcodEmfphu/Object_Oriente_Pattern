package final_MVC_Observer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class TemperatureView extends JFrame {

	private JPanel pnRight, pnLeft, pnSubTopLeft, pnSubBelowLeft;
	private JButton btnRaiseFahrenheit, btnRaiseCelsius, btnLowerFahrenheit, btnLowerCelsius;
	private JTextField txtFahrenheit, txtCelsius;
	private JProgressBar thanhDoNhietDo;
	private int indexF = 50, indexC = 10;

	private TemperatureController temperatureData;
	private CelsiusController celsiusClient;
	private FahrentheitController fahrentheitClient;

	public TemperatureView(TemperatureController data) {
		this.temperatureData = data;

		setTitle("Temperature");
		setLayout(new GridLayout(1, 1, 20, 20));

		add(pnLeft = new JPanel());
		add(pnRight = new JPanel());

		pnLeft.setLayout(new GridLayout(2, 1, 20, 20));
		pnLeft.add(pnSubTopLeft = new JPanel());
		pnLeft.add(pnSubBelowLeft = new JPanel());
		pnSubTopLeft.setBorder(new TitledBorder("Farenheit Temperature"));
		pnSubBelowLeft.setBorder(new TitledBorder("Celsius Temperature"));

		// dat component
		pnSubTopLeft.add(txtFahrenheit = new JTextField(20));
		pnSubTopLeft.add(btnRaiseFahrenheit = new JButton("Raise"));
		pnSubTopLeft.add(btnLowerFahrenheit = new JButton("Lower"));

		pnSubBelowLeft.add(txtCelsius = new JTextField(20));
		pnSubBelowLeft.add(btnRaiseCelsius = new JButton("Raise"));
		pnSubBelowLeft.add(btnLowerCelsius = new JButton("Lower"));

		// dat componet cho thanh do
		thanhDoNhietDo = new JProgressBar(JProgressBar.VERTICAL, 0, 100);
		thanhDoNhietDo.setForeground(Color.RED);
		JPanel clear = new JPanel();
		clear.setPreferredSize(new Dimension(250, 50));
		pnRight.add(clear);
		pnRight.setLayout(new FlowLayout(FlowLayout.CENTER));
		pnRight.add(thanhDoNhietDo);

		// dat gia tri
		thanhDoNhietDo.setValue(indexF);
		txtFahrenheit.setText(indexF + "");
		txtCelsius.setText(indexC + "");

		// xử lí sự kiện
		eventHandler();

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 300);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public JTextField getTxtTop() {
		return txtFahrenheit;
	}

	public JTextField getTxtBottom() {
		return txtCelsius;
	}

	public JProgressBar getBar() {
		return thanhDoNhietDo;
	}

	public void setIndexF(int indexF) {
		this.indexF = indexF;
	}

	public void setIndexC(int indexC) {
		this.indexC = indexC;
	}

	/*
	 * actionListener
	 */
	public void eventHandler() {
		btnLowerFahrenheit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				indexF--;
				temperatureData.setTemperature(new Fahrenheit(indexF));
				temperatureData.noti();
			}
		});

		btnLowerCelsius.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				indexC--;
				temperatureData.setTemperature(new Celsius(indexC));
				temperatureData.noti();
			}
		});

		btnRaiseFahrenheit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				indexF++;
				temperatureData.setTemperature(new Fahrenheit(indexF));
				temperatureData.noti();
			}
		});

		btnRaiseCelsius.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				indexC++;
				temperatureData.setTemperature(new Celsius(indexC));
				temperatureData.noti();
			}
		});
	}

	public static void main(String[] args) {
		TemperatureModel temperatureModel = new TemperatureModel();

		TemperatureController temperatureController = new TemperatureController();
		TemperatureView temperatureView = new TemperatureView(temperatureController);

//		CelsiusController celsiusController = new CelsiusController(temperatureController, temperatureView);
		FahrentheitController fahrentheitController = new FahrentheitController(temperatureController, temperatureView);
	}

}
