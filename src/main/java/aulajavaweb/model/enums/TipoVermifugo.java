package aulajavaweb.model.enums;

import javax.faces.bean.ManagedBean;
import javax.xml.bind.annotation.XmlRootElement;
@ManagedBean
@XmlRootElement
public enum TipoVermifugo {
	
	CANEX_COMPOSTO((byte) 1, ""), 
	CANEX_ORIGINAL((byte) 2, ""), 
	CANEX_PLUS_3((byte) 3, ""), 
	CANEX_PREMIUM((byte) 4, ""), 
	CARDOMEC_PLUS((byte) 5, ""), 
	DUO_PET((byte) 6, ""), 
	ENDOGARD((byte) 7, ""), 
	GIARDICID_SUSPENSAO((byte) 8, ""), 
	GRANTELM((byte) 9, ""), 
	KONIG_BASKEN_PLUS((byte) 10, ""), 
	KONIG_BASKEN_PLUS_20((byte) 11, ""), 
	KONIG_BASKEN_SUSPENSAO((byte) 12, ""), 
	KONIG_BASKEN_SUSPENSÃO_PLUS_5((byte) 13, ""), 
	KONIG_BRASKEN_PLUS_40((byte) 14, ""), 
	KONIG_CESTODAN_INJETAVEL((byte) 15, ""), 
	KONIG_MAXI_VERM((byte) 16, ""), 
	MEBENDAZOLE_VETNIL((byte) 17, ""),  
	NOVARTIS_MILBEMAX((byte) 18, ""), 
	PETZI_GATOS((byte) 19, ""), 
	PETZI_PLUS((byte) 20, ""), 
	PETZI_PLUS_SUSPENSAO((byte) 21, ""), 
	VERMIVET_COMPOSTO((byte) 22, ""), 
	VERMIVET_FILHOTE_VERMIFUGO_EM_SUSPENSAO((byte) 23, ""),  
	VERMIVET_GATOS((byte) 24, ""),  
	VERMIVET_IVER_330MG((byte) 25, ""), 
	VERMIVET_IVER660((byte) 26, ""),  
	VERMIVET_PLUS_2((byte) 27, ""),  
	VERMIVET_PLUS_660((byte) 28, ""),  
	VETMAX_PLUS((byte) 29, ""),  
	ZIPYRAN_PLUS((byte) 30, ""); 
	
	private byte code;
	private String description;
	
	private TipoVermifugo (byte code, String description) {
		this.code = code;
		this.description = description;
	}
	
	public byte getCode() {
		return code;
	}
	
	public String getDescription() {
		return description;
	}
	
	public TipoVermifugo  getByCode(byte code) {
		for(TipoVermifugo  t : values()) {
			if(t.code == code) return t; 
		}
		return null;
	}
	
	public TipoVermifugo  getByDescription(String description) {
		for(TipoVermifugo  t : values()) {
			if(t.description.equalsIgnoreCase(description)) return t;
		}
		return null;
	}
	
	

}
