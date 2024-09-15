package a001_exerciciosbasicos.comparandoInteiros;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ComparandoInteiros {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		JOptionPane.showMessageDialog(null, "### Programa que compara dois números inteiros digitados ###");
		//System.out.println("### Programa que compara dois números inteiros digitados ###\n");
		
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
		
		leitura.close();
		JOptionPane.showMessageDialog(null, "--- Fim da execução do Software ---");

	}

}
