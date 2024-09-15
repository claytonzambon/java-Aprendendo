package a001_exerciciosbasicos.positivoOuNegativo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PositivoOuNegativo {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		JOptionPane.showMessageDialog(null, "### Programa que informa se o número digitado é Positivo ou Negativo ###");
		
		int numeroDigitado = 1;
		
		while (numeroDigitado != 0) {
			numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog(
					"Informe um número inteiro Positivo ou Negativo ou digite 0 para sair: ")); 
			
			if (numeroDigitado == 0) {
				break;
			}
			
			if (numeroDigitado > 0) {
				JOptionPane.showMessageDialog(null, "*** O número digitado é positivo *** \n");
			} else {
				JOptionPane.showMessageDialog(null, "*** O número digitado é negativo *** \n");
			}
		}
		
		leitura.close();
		JOptionPane.showMessageDialog(null, "\n>>> Fim da execução do Software <<<\n");

	}

}
