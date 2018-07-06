package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GenerateRandom implements ActionListener{
	JButton buttony = new JButton("Generate");
	JLabel labely = new JLabel();
	Random random = new Random();
	int randomInt= random.nextInt(100-0);
	GenerateRandom(){
		JFrame framy = new JFrame();
		framy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framy.setVisible(true);
		JPanel panely = new JPanel();
		framy.add(panely);
		panely.add(buttony);
		buttony.addActionListener(this);
		labely.setText(""+randomInt);
		panely.add(labely);
		framy.pack();
	}
	public static void main(String[] args) {
		GenerateRandom robeye = new GenerateRandom();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttony) {
			int randomInt= random.nextInt(100-0);
			labely.setText(""+randomInt);
		}
		// TODO Auto-generated method stub
		
	}
}

