package aulajavaweb.model.enums;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public enum FabricanteVacina {
 MERIAL((byte) 1, "Merial"), 
 HERTAPE((byte) 2, "Hertape"), 
 BIOVET((byte) 3, "Biovet"), 
 VIRBAC((byte) 4, "Virbac"),
 VENCOFARMA((byte) 5, "Vencofarma"),
 NOVARTIS((byte) 6, "Novartis"),
 VALEÉ((byte) 7, "Valeé"),
 FORT_DODGE((byte) 8, "Virbac");
 
 private byte code;
	private String description;
	
	private FabricanteVacina(byte code, String description) {
		this.code = code;
		this.description = description;
	}
	
	public byte getCode() {
		return code;
	}
	
	public String getDescription() {
		return description;
	}
	
	public FabricanteVacina getByCode(byte code) {
		for(FabricanteVacina f : values()) {
			if(f.code == code) return f; 
		}
		return null;
	}
	
	public FabricanteVacina getByDescription(String description) {
		for(FabricanteVacina f : values()) {
			if(f.description.equalsIgnoreCase(description)) return f;
		}
		return null;
	}
	
	
	

}



