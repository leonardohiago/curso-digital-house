package delivery;

public class Pizza extends Massa {

	public Pizza(String molho) {
		super(molho);
	}
	
	@Override
	public String toString() {
		return "Obrigado por realizar o pedido da sua Pizza ;) \n\n"
				+ "Molho: " + molho + "\n"
				+ "Tempo Preparo: " + tempoPreparo + " min\n"
				+ "Preço: R$" + preco;
	}

}
