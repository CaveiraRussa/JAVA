//import java.util.Scanner; 
import javax.swing.JOptionPane;



public class Calculadora {

	static public void main (String [] args )
	{
		//Scanner input = new Scanner (System.in);
		
		//int peso;
		//float altura;
		float IMC;
		
		String peso = JOptionPane.showInputDialog("Digite seu peso ");
		String altura = JOptionPane.showInputDialog("Digite sua altura ");

		int calcPeso = Integer.parseInt(peso);			
		float calcAltura = Float.parseFloat(altura);			
		
		IMC = calcPeso/(calcAltura*calcAltura);
			if (IMC < 18.5) 
			{
				String mensagem = String.format("%.2f Abaixo do peso ", IMC);

				JOptionPane.showMessageDialog (null, mensagem);
				return;
			}
			if ((IMC >= 18.5) && (IMC <24.9))
			{
				String mensagem = String.format("%.2f Normal ", IMC);

				JOptionPane.showMessageDialog (null, mensagem);
				return;
			}
			if ((IMC >= 25) && (IMC <29.9))
			{
				String mensagem = String.format("%.2f Sobrepeso ", IMC);

				JOptionPane.showMessageDialog (null, mensagem);
				return;
		    }
			else
			{
				
				String mensagem = String.format("%.2f Obeso ", IMC);

				JOptionPane.showMessageDialog (null, mensagem);
				//System.out.printf("Obeso ");
				return;
			

			}
	
	}
}
