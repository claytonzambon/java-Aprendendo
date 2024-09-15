package a001_exerciciosbasicos.precoProduto;

import javax.swing.JOptionPane;

public class PrecoProduto {

	public static void main(String[] args) {
		double precoProduto = 12.99;
		int quantidade = 12;
		double resultado = precoProduto * quantidade;
		
		JOptionPane.showMessageDialog(null, "O valor total é de: " + resultado);

	}

}
