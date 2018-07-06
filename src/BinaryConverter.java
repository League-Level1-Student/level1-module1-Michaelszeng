import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener{
	JFrame framy = new JFrame();
	JPanel panely = new JPanel();
	JLabel labely = new JLabel();
	JButton buttony = new JButton("Convert");
	JTextField textfieldy = new JTextField(16);
	BinaryConverter(){
		framy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framy.setVisible(true);
		framy.add(panely);
		panely.add(labely);
		panely.add(textfieldy);
		panely.add(buttony);
		buttony.addActionListener(this);
		framy.pack();
		
	}
	public static void main(String[] args) {
		BinaryConverter joe = new BinaryConverter();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttony) {
			
		}
		// TODO Auto-generated method stub
		
	}
	String convert(String input) {
        if(input.length() != 8){
             JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
             return "-";
        }
        String binary = "[0-1]+";    //must contain numbers in the given range
        if (!input.matches(binary)) {
             JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
             return "-";
        }
        try {
             int asciiValue = Integer.parseInt(input, 2);
             char theLetter = (char) asciiValue;
             return "" + theLetter;
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
             return "-";
        }
   }

}
