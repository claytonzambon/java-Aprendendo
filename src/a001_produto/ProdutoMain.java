package a001_produto;

import javax.swing.JOptionPane;

public class ProdutoMain {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		double precoFinal1 = p1.preco * (1 - p1.desconto);
		double precoFinal2 = p2.preco * (1 - p2.desconto);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

		String resultadoFinal = String.format("### Exibição Final###\n"
				+ "Nome de p1.nome: %s\n"
				+ "Nome de p2.nome: %s\n"
				+ "Media do Carrinho: R$ %.2f", 
				p1.nome, p2.nome, mediaCarrinho);
		JOptionPane.showMessageDialog(null, resultadoFinal);
	}

}
