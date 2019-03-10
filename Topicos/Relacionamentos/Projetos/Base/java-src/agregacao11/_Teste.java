package agregacao11;

public class _Teste {
	public static void main(String[] args) {
		
		// agregacao de multiplicidade 11, um voo possui um aviao, num certo momento
		
		Parte aviao1 = new Parte();
		Todo voo1 = new Todo(aviao1);         // agregacao por construtor em 2 passos, in line
		
		Todo voo2 = new Todo();               // agregacao posterior, via setter
		
		Parte aviao2 = new Parte();           // agregacao por setter em 2 passos
		voo2.setParte(aviao2);		
		
		System.out.println(voo1.toString());  // imprime endereco do objeto
		System.out.println(voo2.toString());
	}
}

