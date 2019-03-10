package associacao_auto11;

public class ClasseA {

	ClasseA instanciaDeA;

	public ClasseA() {                     // COMPOSICAO - injecao por construtora
		this.instanciaDeA = new ClasseA();
	}

	public ClasseA(ClasseA instanciaDeA) { // AGREGACAO - injecao por construtora
		this.instanciaDeA = instanciaDeA;
	}

}
