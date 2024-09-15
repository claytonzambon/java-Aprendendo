package a001_exerciciosbasicos.castDoubleParaInt;

import javax.swing.JOptionPane;

public class CastDeDoubleParaInt {

	public static void main(String[] args) {
		
		double altura = 1.81;
		int idade = 38;
		
		JOptionPane.showMessageDialog(
					null, 
					"Idade: " + idade 
					+ "\nAltura sem Cast: " + altura
					+ "\nAltura com Cast (int): " + (int)altura
				);

	}

}
