package final_MVC;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class StudentView {

	private StudentController controller;
	private StudentList model;

	private JButton btn1, btn2, btn3, btn4, btn5;
	private JTextField jTextField1, jTextField2, jTextField3;
	private JTextArea jTextArea;

	public StudentView(StudentController controller, StudentList model) {
		this.controller = controller;
		this.model = model;
		
		JFrame frame = new JFrame("Student view");
		frame.setLayout(new GridLayout(6, 1));

		// row 1
		JPanel panel1 = new JPanel();
		JLabel jLabel1 = new JLabel("Mã Số SV");
		jTextField1 = new JTextField(20);

		panel1.add(jLabel1);
		panel1.add(jTextField1);

		// row 2
		JPanel panel2 = new JPanel();
		JLabel jLabel2 = new JLabel("Họ và Tên");
		jTextField2 = new JTextField(20);

		panel2.add(jLabel2);
		panel2.add(jTextField2);

		// row 3
		JPanel panel3 = new JPanel();
		JLabel jLabel3 = new JLabel("Ngày Sinh");
		jTextField3 = new JTextField(20);

		panel3.add(jLabel3);
		panel3.add(jTextField3);

		// row 4
		JPanel panel4 = new JPanel();
		btn1 = new JButton("Add");
		btn2 = new JButton("Remove");
		btn3 = new JButton("Update");
		btn4 = new JButton("Find");
		btn5 = new JButton("Clear");

		panel4.add(btn1);
		panel4.add(btn2);
		panel4.add(btn3);
		panel4.add(btn4);
		panel4.add(btn5);

		// row 5
		JPanel panel5 = new JPanel();
		jTextArea = new JTextArea(10, 30);
		panel5.add(jTextArea);

		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		frame.add(panel4);
		frame.add(panel5);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public void eventHanding() {
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				controller.addStudent(jTextField1.getText(), jTextField2.getText());
			}
		});
	}

	public void updateList(String text) {
		jTextArea.setText("" + text);
	}

	public static void main(String[] args) {
		
	}

}
