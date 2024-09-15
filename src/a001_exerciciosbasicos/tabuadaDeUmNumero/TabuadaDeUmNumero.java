package a001_exerciciosbasicos.tabuadaDeUmNumero;

import javax.swing.JOptionPane;

public class TabuadaDeUmNumero {

	public static void main(String[] args) {
		
		double numero = Double.parseDouble(JOptionPane.showInputDialog(
				"### Programa que exibe a Tabuada do número informado ###\n\n"
				+ "Informe um número: "
				));
		
		String mensagem = "*** Resultado ***\n";
		for (int i = 1; i <= 10; i++) {
			mensagem += String.format("\n%s x %s = %s", numero, i, numero * i);
		}
		
		mensagem += "\n\n--- Fim da execução do Software ---";
		JOptionPane.showMessageDialog(null, mensagem);
	}

}
