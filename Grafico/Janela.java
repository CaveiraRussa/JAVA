import javax.swing.JOptionPane;
public class Janela {

	public static void main(String[] args) 
	{
		String nome = JOptionPane.showInputDialog("Qual o seu nome?");
		JOptionPane.showInputDialog("Como vai?");

		String mensagem = String.format("Bom dia, %s, sejam bem-vindo! ", nome);
		
		JOptionPane.showMessageDialog(null, mensagem);
		
	}
}
