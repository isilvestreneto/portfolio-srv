package tech.silvestre.model;

public class ProjetoDTO {

	private Long id;
	private String nome;
	private String descricao;
	private String[] tecnologiasUtilizadas;
	
	public ProjetoDTO() {
	}

	public ProjetoDTO(Long id, String nome, String descricao, String[] tecnologiasUtilizadas) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.tecnologiasUtilizadas = tecnologiasUtilizadas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String[] getTecnologiasUtilizadas() {
		return tecnologiasUtilizadas;
	}

	public void setTecnologiasUtilizadas(String[] tecnologiasUtilizadas) {
		this.tecnologiasUtilizadas = tecnologiasUtilizadas;
	}
}
