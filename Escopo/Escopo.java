
public class Escopo {
	private int x = 1;
	
	
	public void inicio() 
	{
		int x = 5;
		
		System.out.printf("O valor de x local no m�todo inicio %d\n", x);
		
		usaVariavelLocal();
		usaCampo();
		usaVariavelLocal();
		usaCampo();
		
		System.out.printf("\nO valor de x local no m�todo in�cio vale agora %d\n", x);
		
	
	}
	
	public void usaVariavelLocal() 
	{
		int x = 25;
		
		System.out.printf("\nO valor da vari�vel x no in�cio do m�todo usaVariavelLocal � %d\n", x);
		++x;
		System.out.printf("\nO valor da vari�vel x no final do m�todo usaVariavelLocal � %d\n", x);
	}

	public void usaCampo()
	{
		System.out.printf("\nO valor da vari�vel x no in�cio do m�todo usaCampo � %d\n", x);
		x *=10;
		System.out.printf("\nO valor da vari�vel x no final do m�todo usaCampo � %d\n", x);
	}

}
