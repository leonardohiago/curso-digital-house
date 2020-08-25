package delivery;

public class Lasanha extends Massa {

	public Lasanha(String molho) {
		super(molho);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Obrigado por realizar o pedido da sua Lasanha ;) \n\n"
				+ "Molho: " + molho + "\n"
				+ "Tempo Preparo: " + tempoPreparo + " min\n"
				+ "Preço: R$" + preco;
	}

}
