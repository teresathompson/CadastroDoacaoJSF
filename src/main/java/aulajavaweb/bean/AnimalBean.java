package aulajavaweb.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import aulajavaweb.dao.AnimalDao;
import aulajavaweb.dao.TutorDao;
import aulajavaweb.model.Animal;
import aulajavaweb.model.enums.Especie;
import aulajavaweb.model.enums.RacaCao;
import aulajavaweb.model.enums.RacaGato;
import aulajavaweb.model.enums.Sexo;
import aulajavaweb.model.enums.Temperamento;



@ManagedBean
public class AnimalBean implements Bean<Animal> {
	
	private Animal animal = new Animal();
	private AnimalDao dao = AnimalDao.singleton(); 
	
	public AnimalBean() {
	}
	
	public Especie[] getEspecies(){
		return Especie.values();
	}
	
	public Sexo[] getSexos(){
		return Sexo.values();
	}
	
	public RacaCao[] getRacacao(){
		return RacaCao.values();
	}
	
	public RacaGato[] getRacagato(){
		return RacaGato.values();
	}
	
	public Temperamento[] getTemperamento(){
		return Temperamento.values();
	}
	
	public String cadastrar() {
		AnimalDao.singleton().cadastrar(animal);
		return "";
	}
	
	public Animal getAnimal() {
		return animal;
	}

	@Override
	public void inserir(Animal t) {
		dao.inserir(t);
	}

	@Override
	public void excluir(Animal t) {
		dao.excluir(t);
	}
	
	@Override
	public Animal buscar(Integer id) {
		return dao.buscar(id);
	}

	@Override
	public List<Animal> buscarTodos() {
		return dao.buscarTodos();
	}

	@Override
	public void atualizar(Animal t) {
		dao.atualizar(t);
	}
	
	
	
		
}