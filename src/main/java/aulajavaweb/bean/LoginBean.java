package aulajavaweb.bean;

import java.io.IOException;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import aulajavaweb.model.Usuario;

@ManagedBean
@ApplicationScoped
public class LoginBean   {

	private Usuario usuario = new Usuario();
	
	public LoginBean(){
		
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void logar(){
		FacesContext context = FacesContext.getCurrentInstance();
		ExternalContext external = context.getExternalContext();
		HttpSession session =(HttpSession) external.getSession(true);
		session.setAttribute("currentUser", usuario);
		try{
			external.redirect((String) session.getAttribute("pageTo"));
		}catch (IOException e){
			e.printStackTrace();
		}
	}
	
	
}
