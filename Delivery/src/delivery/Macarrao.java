package delivery;

public class Macarrao extends Massa {

	public Macarrao(String molho) {
		super(molho);
	
	}

	@Override
	public String toString() {
		return "Obrigado por realizar o pedido do seu Macarrão ;) \n\n"
				+ "Molho: " + molho + "\n"
				+ "Tempo Preparo: " + tempoPreparo + " min\n"
				+ "Preço: R$" + preco;
	}
	
}
