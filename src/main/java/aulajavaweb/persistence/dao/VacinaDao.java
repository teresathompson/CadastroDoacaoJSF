package aulajavaweb.persistence.dao;

import java.util.ArrayList;
import java.util.List;

import aulajavaweb.model.Animal;
import aulajavaweb.model.Vacina;

public class VacinaDao implements Dao<Vacina>{
	
	private static VacinaDao dao;
	private List<Vacina> vacinas = new ArrayList<Vacina>();

	private VacinaDao(){
		
	}
	
	public static VacinaDao singleton() {
		return dao == null ? new VacinaDao() : dao;
	}
	
	public List<Vacina> getVacinas() {
		return vacinas;
	}


	public void cadastrar(Vacina vacina) {
		
		
	}

	

	@Override
	public void insert(Vacina t) {
	vacinas.add(t);
		
	}

	@Override
	public void delete(Integer t) {
		vacinas.remove(t);
		
	}

	@Override
	public Vacina find(Integer id) {
		
		return vacinas.get(id);
	}

	@Override
	public List<Vacina> findAll() {
		
		return vacinas;
	}

	@Override
	public void update(Vacina t) {
		vacinas.remove(t);
		vacinas.add(t);
		
	}

	
	
}
