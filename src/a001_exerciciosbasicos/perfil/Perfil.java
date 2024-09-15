package a001_exerciciosbasicos.perfil;

import javax.swing.JOptionPane;

public class Perfil {
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Informe seu nome: ");
		
		JOptionPane.showMessageDialog(null, "Olá Mundo, tudo bem " + nome);
	}
}
