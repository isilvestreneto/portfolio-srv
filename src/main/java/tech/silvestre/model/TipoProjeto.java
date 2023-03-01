package tech.silvestre.model;

public enum TipoProjeto {
	WEB("Web"), MOBILE("Mobile"), DESKTOP("Desktop"), IA("I.A.");

	private final String tipo;

	TipoProjeto(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}
}