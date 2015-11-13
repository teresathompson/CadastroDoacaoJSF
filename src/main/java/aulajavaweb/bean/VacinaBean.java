package aulajavaweb.bean;


import java.util.List;

import javax.faces.bean.ManagedBean;


import aulajavaweb.model.Vacina;

import aulajavaweb.model.enums.TipoVacina;
import aulajavaweb.persistence.dao.Dao;
import aulajavaweb.persistence.dao.VacinaDao;

@ManagedBean
public class VacinaBean implements Dao<Vacina>{
	
	private Vacina vacina = new Vacina();

	private VacinaDao dao = VacinaDao.singleton();
	
	

	public String cadastrar() {
		VacinaDao.singleton().cadastrar(vacina);
		return "";
	}

	public Vacina getVacina() {
		return vacina;
	}

	public void setVacina(Vacina vacina) {
		this.vacina = vacina;
	}
	
	public TipoVacina[] getTipoVacina(){
		return TipoVacina.values();
		
	}

	
	@Override
	public void insert(Vacina t) {
		dao.insert(t);
		
	}

	@Override
	public void delete(Integer t) {
		dao.delete(t);
		
	}

	@Override
	public Vacina find(Integer id) {
		
		return dao.find(id);
	}

	@Override
	public List<Vacina> findAll() {
		
		return dao.findAll();
	}

	@Override
	public void update(Vacina t) {
		dao.update(t);
		
	}
	
	
	
	
}
