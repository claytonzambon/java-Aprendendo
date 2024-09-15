package a001_exerciciosbasicos.valorComDesconto;

import javax.swing.JOptionPane;

public class ValorComDesconto {

	public static void main(String[] args) {
		double precoOriginal = 320.00;
		double percentualDesconto = 10;
		double valorComDesconto = precoOriginal * (1 - percentualDesconto / 100);
		
		String mensagem = String.format("O valor original de R$ %.2f com %.2f%% de desconto é: R$ %.2f", 
				precoOriginal, percentualDesconto, valorComDesconto);
		
		JOptionPane.showMessageDialog(null, mensagem);

	}

}
