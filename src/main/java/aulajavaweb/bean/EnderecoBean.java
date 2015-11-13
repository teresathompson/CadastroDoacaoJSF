package aulajavaweb.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import aulajavaweb.dao.EnderecoDao;
import aulajavaweb.model.Endereco;
import aulajavaweb.model.enums.Estado;





@ManagedBean
public class EnderecoBean implements Bean<Endereco> {
	
	private Endereco endereco = new Endereco();
	private EnderecoDao dao = EnderecoDao.singleton();
	
	
	public Endereco getEndereco() {
		return endereco;
	}

	public Estado[] getEstado(){
		return Estado.values();
	}
	
	@Override
	public void inserir(Endereco t) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void excluir(Endereco t) {
		dao.excluir(t);
		
	}
	@Override
	public Endereco buscar(Integer id) {
		
		return dao.buscar(id);
	}
	@Override
	public List<Endereco> buscarTodos() {
		
		return dao.buscarTodos();
	}
	@Override
	public void atualizar(Endereco t) {
		dao.excluir(t);
		dao.atualizar(t);
		
	}


	
}