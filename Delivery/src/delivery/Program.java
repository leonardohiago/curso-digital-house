package delivery;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		int menu;
		int op = 0;
		
		double tempoEntrega = 0;
		double preco = 0;
		
		do {
			menu = Integer.parseInt(JOptionPane.showInputDialog("Bem-Vindo ao Delivery Restaurante"
					+ "\n \n"
					+ "Escolha uma das op��es abaixo:"
					+ "\n \n"
					+ "[1] Sandu�ches"
					+ "\n"
					+ "[2] Massas"
					+ "\n"
					+ "[3] Bolos"
					+ "\n \n"
					+ "[0] Sair"));
			
			switch(menu) {
				case 1:
						
						List<String> ingrediente = new ArrayList<String>();
						
						int quantIngredientes;
						
						JOptionPane.showConfirmDialog(null, "Informe os ingredientes do seu pedido");
						
						for(quantIngredientes = 0; quantIngredientes < 10; quantIngredientes ++) {

							ingrediente.add(JOptionPane.showInputDialog("Digite o " + (quantIngredientes + 1) + "� ingrediente do seu sandu�che"));
							
							int continua;
							
							if (quantIngredientes != 9) {
								
								continua = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais algum ingrediente?");
								
								if (continua == 1 || continua == 2) {
									quantIngredientes = 11;
								}
							}
							
						}
						
						Sanduiche sanduiches = new Sanduiche(ingrediente);
						tempoEntrega = sanduiches.tempoPreparo;
						preco = sanduiches.preco;
						
						JOptionPane.showConfirmDialog(null, sanduiches.toString());
						
						break;
						
				case 2:
						
						int escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das op��es de massa abaixo: \n\n"
							+ "[1] Macarr�o"
							+ "\n"
							+ "[2] Pizza"
							+ "\n"
							+ "[3] Lasanha"
							+ "\n\n"
							+ "[4] Sair"));
						
						if (escolha == 1) {
							
							Macarrao macarrao = new Macarrao("");
							
							macarrao.setMolho(JOptionPane.showInputDialog("Informe o molho que deseja: "));
							
							JOptionPane.showMessageDialog(null, macarrao.toString());
							
							preco = macarrao.preco;
							tempoEntrega = macarrao.tempoPreparo;
							
						} else if (escolha == 2) {
							
							Pizza pizza = new Pizza("");
							
							pizza.setMolho(JOptionPane.showInputDialog("Informe o molho que deseja:"));
							
							JOptionPane.showMessageDialog(null, pizza.toString());
							
							preco = pizza.preco;
							tempoEntrega = pizza.tempoPreparo;
							
						} else if (escolha == 3) {
							
							Lasanha lasanha = new Lasanha("");
							
							lasanha.setMolho(JOptionPane.showInputDialog("Informe o molho que deseja:"));
							
							JOptionPane.showMessageDialog(null, lasanha.toString());
							
							preco = lasanha.preco;
							tempoEntrega = lasanha.tempoPreparo;
							
						}
					
						break;
					
				case 3: 
						
						String massa = JOptionPane.showInputDialog("Informe a massa que deseja:");
						String recheio = JOptionPane.showInputDialog("Informe o recheio que deseja:");
						String cobertura = JOptionPane.showInputDialog("Informe a cobertura que deseja:");
						
						Bolo bolo = new Bolo(massa, recheio, cobertura);
						
						JOptionPane.showMessageDialog(null, bolo.toString());
						
						tempoEntrega = 10;
						preco = bolo.preco;
						
						break;

			}
					
			
			if(tempoEntrega != 0 && preco != 0) {
				
				double distancia = Double.parseDouble(JOptionPane.showInputDialog("Agora vamos para as informa��es de entrega :D\n\n"
						+ "Informe a dist�ncia (em km) do local de entrega at� o restaurante: "));
				
				Entrega entrega = new Entrega(distancia, preco, tempoEntrega);
				
				JOptionPane.showMessageDialog(null, entrega.toString());
				
				menu = 0;
				
			}
			
		} while(menu != 0);
	}

}
