package a001_exerciciosbasicos.medianotasdecimais;

import javax.swing.JOptionPane;

public class MediaNotasDecimais {

	public static void main(String[] args) {
		
		double notaDecimalUm = 8.3;
		double notaDecimalDois = 7.6;
		
		double media = (notaDecimalUm + notaDecimalDois) / 2;
		
		JOptionPane.showMessageDialog(null, "Resultado: " + media);

	}

}
