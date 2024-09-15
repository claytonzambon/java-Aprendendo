package a001_exerciciosbasicos.calculaFatorial;

import javax.swing.JOptionPane;

public class CalculaFatorial {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog(
					"### Programa que cacula o Fatorial de um número ###"
					+ "\n\nInforme um número:" 
				));
		
		int fatorial = 1;
		
		for (int i = 1; i <= numero ; i++) {
			fatorial *= i;
		}
		
		String mensagem = String.format("O Fatorial de %s é %s.", numero, fatorial);
		JOptionPane.showMessageDialog(null, mensagem);
	}

}
