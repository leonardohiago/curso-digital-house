package delivery;

public class Macarrao extends Massa {

	public Macarrao(String molho) {
		super(molho);
	
	}

	@Override
	public String toString() {
		return "Obrigado por realizar o pedido do seu Macarr�o ;) \n\n"
				+ "Molho: " + molho + "\n"
				+ "Tempo Preparo: " + tempoPreparo + " min\n"
				+ "Pre�o: R$" + preco;
	}
	
}
