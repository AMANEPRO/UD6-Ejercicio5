package ejercicios;

import javax.swing.JOptionPane;

public class ejercicio5 {

	public static void main (String []args ) {
		String numerousuariobeta=JOptionPane.showInputDialog("Introduce un numero DECIMAL por favor");
		int numerousuario=Integer.parseInt(numerousuariobeta);
		JOptionPane.showMessageDialog(null, "El numero que has escrito convertido a binario es " + numerobinario(numerousuario));
	}
	private static String numerobinario(int numerousuario) {
	String numerobinariofinal=Integer.toBinaryString(numerousuario);
		return numerobinariofinal;
	}
}
