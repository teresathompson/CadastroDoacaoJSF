package aulajavaweb.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import aulajavaweb.dao.TutorDao;
import aulajavaweb.model.Endereco;
import aulajavaweb.model.Tutor;
import aulajavaweb.model.enums.Estado;
import aulajavaweb.model.enums.TipoTutor;


@ManagedBean
@RequestScoped
public class TutorBean {

	private Tutor tutor = new Tutor();
	
	public TutorBean() {
	}
	
	public String cadastrar() {
		TutorDao.singleton().cadastrar(tutor);
		return "";
	}
	
	public Tutor getTutor() {
		return tutor;
	}
	
	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}
	
	public TipoTutor[] getTipos() {
		return TipoTutor.values();
	}
	
	public Estado[] getEstado(){
		return Estado.values();
	}
	
		
	
	public List<Endereco> getEnderecos() {
		List<Endereco> enderecos = new ArrayList<Endereco>();
		for(int i = 0; i < 10; i++) {
			Endereco e = new Endereco();
			e.setId(i);
			enderecos.add(e);
		}
		return enderecos;
	}
	
	
	
	public static void main(String[] args){
		String telefone = "dfd987s987df9s8d7f9s";
		if(telefone.replaceAll("[0-9]", "").length() > 0) {
			
		}
	}
}