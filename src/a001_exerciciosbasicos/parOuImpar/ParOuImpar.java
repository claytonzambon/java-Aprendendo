package a001_exerciciosbasicos.parOuImpar;

import javax.swing.JOptionPane;

public class ParOuImpar {

	public static void main(String[] args) {
		
		double numero = Double.parseDouble(JOptionPane.showInputDialog(
				"### Verifica se o número é Par ou Ímpar ###"
				+ "\nInforme um número: "
				));
		
		String mensagem;
		if (numero % 2 == 0) {
			mensagem = ">>> O número informado é PAR <<<";
		} else {
			mensagem = ">>> o número informado é ÍMPAR <<<";
		}
		
		mensagem += "\n\n--- Fim da execução do Software ---";
		JOptionPane.showMessageDialog(null, mensagem);
	}

}
