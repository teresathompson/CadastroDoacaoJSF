package aulajavaweb.model;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


import aulajavaweb.model.enums.TipoTutor;

@Entity
@ManagedBean( name="tutor")
public class Tutor implements Model {
	
	@Id
	private Integer id;
	private String nome;
	@OneToMany
	private List<Animal> animais;
	private String telefone;
	private String email;
	@OneToOne
	private Endereco endereco;
	private TipoTutor tipo;
	
	@Override
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Animal> getAnimais() {
		return animais;
	}
	
	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public TipoTutor getTipo() {
		return tipo;
	}
	
	public void setTipo(TipoTutor tipo) {
		this.tipo = tipo;
	}
	
}
