package aulajavaweb.model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.persistence.Entity;
import javax.persistence.Id;

import aulajavaweb.model.enums.Especie;
import aulajavaweb.model.enums.RacaCao;
import aulajavaweb.model.enums.RacaGato;
import aulajavaweb.model.enums.Sexo;
import aulajavaweb.model.enums.Temperamento;

@Entity
@ManagedBean(name="animal")
public class Animal implements Model, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Integer id;
	private String nomeAnimal;
	
	
	
	private Tutor nome;
	private Especie especie;
	private RacaCao racacao;
	private RacaGato racagato;
	private Sexo sexo;
	private Integer meses;
	private Temperamento temperamento;
	private String pelagem;
	// em gramas
	private Integer peso;
	private HistoricoMedico historicoMedico;	
	
	@Override
	public Integer getId() {
		return id;
	}

	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}

	

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Integer getMeses() {
		return meses;
	}

	public void setMeses(Integer meses) {
		this.meses = meses;
	}

	public Temperamento getTemperamento() {
		return temperamento;
	}

	public void setTemperamento(Temperamento temperamento) {
		this.temperamento = temperamento;
	}

	public String getPelagem() {
		return pelagem;
	}

	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public HistoricoMedico getHistoricoMedico() {
		return historicoMedico;
	}

	public void setHistoricoMedico(HistoricoMedico historicoMedico) {
		this.historicoMedico = historicoMedico;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeAnimal() {	return nomeAnimal;}

	public void setNomeAnimal(String newValue) {
		nomeAnimal = newValue;
	}

	public Tutor getNome() {
		return nome;
	}

	public void setNome(Tutor nome) {
		this.nome = nome;
	}

	public RacaGato getRacagato() {
		return racagato;
	}

	public void setRacagato(RacaGato racagato) {
		this.racagato = racagato;
	}

	public RacaCao getRacacao() {
		return racacao;
	}

	public void setRacacao(RacaCao racacao) {
		this.racacao = racacao;
	}
	
}
