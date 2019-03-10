package associacao_auto11_pessoaMaePai;

public class Pessoa {

	Pessoa pai;
	Pessoa mae;

	public Pessoa() {      
	}

	public Pessoa(Pessoa pai, Pessoa mae) {
		this.pai = pai;
		this.mae = mae;
	}

	public Pessoa getPai() {
		return pai;
	}

	public void setPai(Pessoa pai) {
		this.pai = pai;
	}

	public Pessoa getMae() {
		return mae;
	}

	public void setMae(Pessoa mae) {
		this.mae = mae;
	}
	
	
}
