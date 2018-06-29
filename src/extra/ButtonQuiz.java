package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ButtonQuiz implements ActionListener {
	JButton buttony1 = new JButton("INCREASE");
	JButton buttony2 = new JButton("SHOW");
	int clicks = 0;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Click!");
		if (e.getSource() == buttony1) {
			clicks = clicks + 1;
		}
		if (e.getSource() == buttony2) {
			JOptionPane.showMessageDialog(null, clicks);
			clicks = 0;
		}
	}

	// constructor is a method
	// 1) no return type
	// 2) the name of the method is the same as the class
	ButtonQuiz() {
		JFrame framy = new JFrame();
		framy.setVisible(true);
		framy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panely = new JPanel();
		framy.add(panely);
		panely.add(buttony1);
		panely.add(buttony2);
		framy.pack();
		buttony1.addActionListener(this);
		buttony2.addActionListener(this);
	}

	public static void main(String[] args) {
		ButtonQuiz rob = new ButtonQuiz();

	}
}