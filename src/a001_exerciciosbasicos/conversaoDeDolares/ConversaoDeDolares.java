package a001_exerciciosbasicos.conversaoDeDolares;

import javax.swing.JOptionPane;

public class ConversaoDeDolares {

	public static void main(String[] args) {
		
		double valorEmDolares = 150.50;
		double valorDoDolarEmReais = 5.50;
		double valorTotal = valorEmDolares * valorDoDolarEmReais;
		
		String mensagem = String.format("O valor de $ %.2f dólares em Reais é de R$ %.2f", 
				valorEmDolares, valorTotal);
		
		JOptionPane.showMessageDialog(null, mensagem);

	}

}
