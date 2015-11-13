package aulajavaweb.model.enums;

import javax.faces.bean.ManagedBean;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@ManagedBean
public  enum Temperamento {
	
	DOCIL((byte) 1, "Dócil"), 
	DE_GUARDA((byte) 2, "Animal de guarda"), 
	ANIMAL_DE_COMPANHIA((byte) 3, "Animal de companhia"),
	ANIMAL_DE_ALTA_ENERGIA((byte) 4, "Animal de alta energia");
	
	
	private byte code;
	private String description;
	
	private Temperamento(byte code, String description) {
		this.code = code;
		this.description = description;
	}
	
	public byte getCode() {
		return code;
	}
	
	public String getDescription() {
		return description;
	}
	
	public Temperamento getByCode(byte code) {
		for(Temperamento t : values()) {
			if(t.code == code) return t; 
		}
		return null;
	}
	
	public Temperamento getByDescription(String description) {
		for(Temperamento t : values()) {
			if(t.description.equalsIgnoreCase(description)) return t;
		}
		return null;
	}
	
	
	

}

