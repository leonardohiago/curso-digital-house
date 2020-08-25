package delivery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class Sanduiche extends Lanche {
	
	List<String> ingredientes = new ArrayList<String>();
	
	public Sanduiche(List<String> ingredientes) {
		super();
		this.ingredientes = ingredientes;
		this.preco = 14.99;
		this.tempoPreparo = 15.0;
	}

	public List<String> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<String> ingredientes) {
		this.ingredientes = ingredientes;
	}

	@Override
	public String toString() {
		return "Obrigado pro realizar o seu pedido ;) \n \n"
				+ "Ingredientes do seu Sanduiche: \n" 
				+ ingredientes.toString().replace("[", "").replace("]", "")
				+ "\nTempo de preparo: " + tempoPreparo + " min\n"
				+ "Preço: R$" + preco;
	}
	
}
