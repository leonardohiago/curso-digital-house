package delivery;

public class Bolo extends Lanche {
	
	String massa;
	String recheio;
	String cobertura;
	
	public Bolo(String massa, String recheio, String cobertura) {
		super();
		this.massa = massa;
		this.recheio = recheio;
		this.cobertura = cobertura;
		this.preco = 15.49;
		this.tempoPreparo = 10.0;
	}

	public String getMassa() {
		return massa;
	}
	
	public void setMassa(String massa) {
		this.massa = massa;
	}
	
	public String getRecheio() {
		return recheio;
	}
	
	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
	
	public String getCobertura() {
		return cobertura;
	}
	
	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}

	@Override
	public String toString() {
		return "Obrigado por realizar o pedido do seu Bolo ;) \n\n"
				+ "Massa: " + massa + "\n"
				+ "Recheio: " + recheio + "\n"
				+ "Cobertura: " + cobertura + "\n"
				+ "Tempo de preparo: " + tempoPreparo + " min\n"
				+ "Preço: R$" + preco;
	}
	
	
}
