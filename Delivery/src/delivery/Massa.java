package delivery;

import javax.swing.JOptionPane;

public abstract class Massa extends Lanche {
	
	String molho;
	
	public Massa(String molho) {
		super();
		this.molho = molho;
		this.preco = 29.99;
		this.tempoPreparo = 30.0;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

}
