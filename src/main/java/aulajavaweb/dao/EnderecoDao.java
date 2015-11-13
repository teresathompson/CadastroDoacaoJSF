package aulajavaweb.dao;

import java.util.ArrayList;
import java.util.List;

import aulajavaweb.model.Endereco;

public class EnderecoDao implements Dao<Endereco>{

	private static EnderecoDao dao;
	private List<Endereco> enderecos = new ArrayList<>();
	
	
	private EnderecoDao() {
	}
	
	public static EnderecoDao singleton() {
		return dao == null ? new EnderecoDao() : dao;
	}
	
	public void cadastrar(Endereco endereco) {
	}
	
	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	@Override
	public void inserir(Endereco t) {
		enderecos.add(t);
		
	}

	@Override
	public void excluir(Endereco t) {
		enderecos.remove(t);
		
	}

	@Override
	public Endereco buscar(Integer id) {
		
		return enderecos.get(id);
	}

	@Override
	public List<Endereco> buscarTodos() {
		
		return enderecos;
	}

	@Override
	public void atualizar(Endereco t) {
		enderecos.remove(t);
		enderecos.add(t);
	}
	
}