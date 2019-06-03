
public class Escopo {
	private int x = 1;
	
	
	public void inicio() 
	{
		int x = 5;
		
		System.out.printf("O valor de x local no método inicio %d\n", x);
		
		usaVariavelLocal();
		usaCampo();
		usaVariavelLocal();
		usaCampo();
		
		System.out.printf("\nO valor de x local no método início vale agora %d\n", x);
		
	
	}
	
	public void usaVariavelLocal() 
	{
		int x = 25;
		
		System.out.printf("\nO valor da variável x no início do método usaVariavelLocal é %d\n", x);
		++x;
		System.out.printf("\nO valor da variável x no final do método usaVariavelLocal é %d\n", x);
	}

	public void usaCampo()
	{
		System.out.printf("\nO valor da variável x no início do método usaCampo é %d\n", x);
		x *=10;
		System.out.printf("\nO valor da variável x no final do método usaCampo é %d\n", x);
	}

}
