package auth;

import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.servlet.http.HttpSession;

import aulajavaweb.model.Usuario;

public class Auth implements PhaseListener{
	
	private static final long serialVersionUID = 1L;

	@Override
	public void afterPhase(PhaseEvent event) {
	FacesContext context = event.getFacesContext();
	String page = context.getViewRoot().getViewId();
	HttpSession session = (HttpSession) context.getExternalContext().getSession(true);
	
	Usuario user = (Usuario) session.getAttribute("currentUser");
	
	String path = (String) session.getAttribute("pageTo");
	if(path == null || path.contains("login.xhtml")){
		session.setAttribute("pageTo", "/CadastroAnimaisDoacao" + page);
	}
	if(!page.contains("login.xhtml") && user == null){
		NavigationHandler nh = context.getApplication().getNavigationHandler();
		nh.handleNavigation(context, null, "loginPage");
	}
		
	}

	@Override
	public void beforePhase(PhaseEvent arg0) {
		
		
	}

	@Override
	public PhaseId getPhaseId() {
		
		return PhaseId.RESTORE_VIEW;
	}

}
