package br.com.zup.modelo;

public class Brasileiro extends Pessoa{

	// Atributos
	private String idioma;
	private boolean gostaDeFeijoada;
	
	// Construtor
	public Brasileiro(String nome, String sobrenome, int idade, String idioma, boolean gostaDeFeijoada) {
		super(nome, sobrenome, idade);
		this.idioma = idioma;
		this.gostaDeFeijoada = gostaDeFeijoada;
	}

	// Getters e Setters
	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public boolean getGostaDeFeijoada() {
		return gostaDeFeijoada;
	}

	public void setGostaDeFeijoada(boolean gostaDeFeijoada) {
		this.gostaDeFeijoada = gostaDeFeijoada;
	}
	
	// toString Método
	
	public String toString() {
		
		String modelo = "";
		
		modelo += "Nome -> " + super.getNome() + "\n";
		modelo += "Sobrenome -> " + super.getSobrenome() + "\n";
		modelo += "Idade -> " + super.getIdade() + "\n";
		modelo += "Idioma ->" + this.getIdioma() + "\n";
		modelo += "Gosta de feijoada ->" + this.getGostaDeFeijoada() + "\n";
		
		return modelo;
		
	}
	
	
}
