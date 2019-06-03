import java.util.Scanner;

import javax.swing.JOptionPane;

public class BoletimTeste {

	public static void main (String[] args)
	{
				
		//System.out.print("Por favor, digite o nome de seu curso: ");
		
		String nome = JOptionPane.showInputDialog("Por favor, digite o nome de seu curso: ");

		Boletim boletim = new Boletim( nome );

		
		System.out.println();
		
		boletim.displayMessage();
	}
}
