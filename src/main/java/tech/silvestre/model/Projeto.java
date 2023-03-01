package tech.silvestre.model;

import org.hibernate.validator.constraints.NotBlank;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
public class Projeto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	private String nome;

	private String descricao;

	@Column(nullable = false)
	@Size(min = 1)
	private String[] tecnologiasUtilizadas;

	private String imagem;

	private TipoProjeto tipo;

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

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public TipoProjeto getTipo() {
		return tipo;
	}

	public void setTipo(TipoProjeto tipo) {
		this.tipo = tipo;
	}

}
