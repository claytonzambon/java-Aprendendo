package a001_exerciciosbasicos.comparandoInteiros;

import javax.swing.JOptionPane;

public class ComparandoInteiros {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "### Programa que compara dois números inteiros digitados ###");
		
		int primeiroNumero = 1;
		int segundoNumero = 1;
		
		while (primeiroNumero != 0 && segundoNumero != 0) {
			primeiroNumero = Integer.parseInt(JOptionPane.showInputDialog("Informe o Primeiro número ou 0 para sair: "));
			
			segundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Informe o Segundo número ou 0 para sair: "));
			
			String mensagem = "### Resultado ###";
			
			if (primeiroNumero == 0 || segundoNumero == 0) {
				break;
			}
			
			if (primeiroNumero == segundoNumero) {
				mensagem += "\n\n>>> O números digitados são iguais <<<";
			}
			if (primeiroNumero != segundoNumero) {
				mensagem += "\n\n>>> Os números digitados são diferentes <<<";
			}
			if (primeiroNumero > segundoNumero) {
				mensagem += "\n\n>>> O primeiro número é maior que o segundo <<<";
			}
			if (primeiroNumero < segundoNumero) {
				mensagem += "\n\n>>> O primeiro número é menor que o segundo <<<";
			}
			JOptionPane.showMessageDialog(null, mensagem);
		}
		
		JOptionPane.showMessageDialog(null, "--- Fim da execução do Software ---");

	}

}
