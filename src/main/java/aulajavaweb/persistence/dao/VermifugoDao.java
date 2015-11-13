package aulajavaweb.persistence.dao;

import java.util.ArrayList;
import java.util.List;

import aulajavaweb.model.Vermifugo;

public class VermifugoDao implements Dao<Vermifugo> {
	
	private static VermifugoDao dao;
	private List<Vermifugo> vermifugo = new ArrayList<Vermifugo>();

	private VermifugoDao(){
		
	}
	
	public static VermifugoDao singleton() {
		return dao == null ? new VermifugoDao() : dao;
	}
	
	public List<Vermifugo> getVermifugos() {
		return getVermifugos();
	}


	public void cadastrar(Vermifugo vermifugo) {
		
		
	}
	
	@Override
	public void insert(Vermifugo t) {
		vermifugo.add(t);
		
	}

	@Override
	public void delete(Integer t) {
		vermifugo.remove(t);
		
	}

	@Override
	public Vermifugo find(Integer id) {
		
		return vermifugo.get(id);
	}

	@Override
	public List<Vermifugo> findAll() {
		
		return vermifugo;
	}

	@Override
	public void update(Vermifugo t) {
		vermifugo.remove(t);
		vermifugo.add(t);
		
	}
	
}
