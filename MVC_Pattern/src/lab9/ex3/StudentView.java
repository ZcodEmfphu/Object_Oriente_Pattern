package lab9.ex3;

import javax.swing.JFrame;

public class StudentView extends JFrame {

	public StudentView() {
		JFrame frame = new JFrame();

		frame.setTitle("Student App");
		frame.setSize(300, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		new StudentView();
	}
}