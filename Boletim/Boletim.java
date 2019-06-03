import javax.swing.JOptionPane;

public class Boletim 
{
	private String nomeDoCurso;
	
	public Boletim(String nome)
	{
		nomeDoCurso = nome;
	}
	public void setNomeDoCurso (String nome) 
	{
		nomeDoCurso = nome;
	}
	
	public String getNomeDoCurso() 
	{
		return nomeDoCurso;
	}
	
	public void displayMessage() 
	{
		String mensagem = String.format("Bem-Vindo ao Boletim de seu curso de %s! ", getNomeDoCurso());

		
		JOptionPane.showMessageDialog(null, mensagem);

		//System.out.printf("Bem-Vindo ao Boletim de seu curso de %s!", getNomeDoCurso());
		
	}
}