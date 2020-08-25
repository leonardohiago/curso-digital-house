package delivery;

public class Entrega extends Lanche {
	
	double distancia;
	double tempo;

	public Entrega(double distancia, double preco, double tempo) {
		super();
		this.distancia = distancia;
		this.preco = preco;
		this.tempo = tempo;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	public double calcularEntrega(double distancia, double preparo) {
		return distancia * 10 + preparo;
	}
	
	@Override
	public String toString() {
		return "Relaxe um pouco ;) \n\n"
				+ "A sua entrega chega em " + (distancia * 10 + tempo) + " min\n"
				+ "Por apenas R$" + preco + "\n\n"
				+ "Obrigado por realizar seu pedido";
	}
	
}
