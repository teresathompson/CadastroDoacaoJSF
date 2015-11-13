package aulajavaweb.bean;

import java.util.List;

import aulajavaweb.dao.Dao;

import aulajavaweb.model.Vermifugo;

import aulajavaweb.persistence.dao.VermifugoDao;

public class VermifugoBean implements Dao<Vermifugo>{
	
	private Vermifugo vermifugo = new Vermifugo();

	private VermifugoDao dao = VermifugoDao.singleton();
	
	

	public Vermifugo getVermifugo() {
		return vermifugo;
	}


	public void setVermifugo(Vermifugo vermifugo) {
		this.vermifugo = vermifugo;
	}


	public String cadastrar() {
		VermifugoDao.singleton().cadastrar(vermifugo);
		return "";
	}
	

	@Override
	public void inserir(Vermifugo t) {
		dao.insert(t);
		
	}

	
	@Override
	public Vermifugo buscar(Integer id) {
		
		return vermifugo.getId(id);
	}

	@Override
	public List<Vermifugo> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizar(Vermifugo t) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void excluir(Vermifugo t) {
		// TODO Auto-generated method stub
		
	}

}
