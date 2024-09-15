package a001_exerciciosbasicos.calcularAreaDoQuadradoOuAreaDoCirculo;

import javax.swing.JOptionPane;

public class CalcularAreaQuadradoAreaCirculo {

	public static void main(String[] args) {
	
		int opcao = 0;
		
		while (opcao != -1) {
			
			opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"### Programa para Calcular a Área do Quadrado ou do Círculo ###\n\n"
					+ "*** Abaixo as opções de cálculo disponíveis ***\n"
					+ "1 - Calcular a área do quadrado\n"
					+ "2 - Calcular a área do círculo\n"
					+ "* Digite -1 para sair *\n"
					+ "Informe a opção desejada:"));
			
			if (opcao == -1) {
				break;
			}
			
			if (opcao == 1) {
				double medidaLado = Double.parseDouble(
							JOptionPane.showInputDialog("\nInforme a medida dos lados do quadrado: ")
						);

				double areaQuadrado = medidaLado * medidaLado;
				JOptionPane.showMessageDialog(null, "A área do quadrado informado é: " + areaQuadrado);
			}
			
			if (opcao == 2) {
				double raio = Double.parseDouble(
							JOptionPane.showInputDialog("Informe a medida do raio do círculo: ")
						);
				double areaCirculo = Math.PI * Math.pow(raio, 2);
				JOptionPane.showMessageDialog(null, "A área do círculo informado é: " + areaCirculo);
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "--- Fim da execução do Software ---");
	}

}
