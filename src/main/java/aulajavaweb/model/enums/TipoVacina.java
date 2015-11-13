package aulajavaweb.model.enums;

import javax.faces.bean.ManagedBean;
import javax.xml.bind.annotation.XmlRootElement;

@ManagedBean
@XmlRootElement
public enum TipoVacina {

	BRONCHIGUARD((byte) 1, "Bronchiguard"),
	BRONCHIMUNE((byte) 2, "Bronchimune"), 
	BRONCHI_SHIELD_III((byte) 3, "Bronchi Shield III"), 
	CANIGEN_L((byte) 4, "Canigen L"), 
	CANIGEN_CH_A2_P_L((byte) 5, "Canigen CH A2 P/L"), 
	CANIGEN_CH_A2_PPI_LR((byte) 6, "Canigen CH A2"), 
	CANIGEN_R((byte) 7, "Canigen R"), 
	CANIGEN_V8((byte) 8, "Canigen V8"), 
	DEFENSOR((byte) 9, "Defensor"), 
	DURAMUNE_MAX_5_CVK_4L((byte) 10, "Duramune Max 5 CVK 4L"), 
	FELIGEN_CRP_R((byte) 11, "Feligen CRP R"), 
	FELIGEN_CR_P((byte) 12, "Feligen CR P"), 
	FELOCELL_CVR_TRÍPLICE_FELINA((byte) 13, "Fellocell CVR Tríplice Felina"), 
	FELOCELL_CVR_C_QUÁDRUPLA_FELINA((byte) 14, "Fellocell CVR C Quádrupla Felina"), 
	FEL_O_VAX_LVK_IV_CALICIVAX_QUÍNTUPLA_FELINA((byte) 15, "Fel o vax LVK IV Calicivax Quíntupla Felina"), 
	GIARDIAVAX((byte) 16, "Giardiavax"), 
	GUARD_VAC_5_CVK((byte) 17, "Guard Vac 5 CVK"), 
	GUARD_VAC_LCI_GP((byte) 18, "Guard Vac LCI GP"),  
	HERTALIQ((byte) 19, "Hertaliq"), 
	IMUNO_VET((byte) 20, "Imunovet"),  
	IMUNO_VET_R((byte) 21, "Imunovet R"),  
	INFERVAC((byte) 22, "Infervac"), 
	INOMUNE((byte) 23, "Inomune"), 
	LEISH_TEC((byte) 24, "Leish-Tec"), 
	LEISHMUNE((byte) 25, "Leishmune"), 
	RABMUNE((byte) 26, "Rabmune"), 
	RAI_VAC((byte) 27, "Rai-vac"), 
	RONVAC((byte) 28, "Ronvac"), 
	VANGUARD_HTLP_5_CV_L_V8((byte) 29, "Vanguard HTPL 5 CV L V8"), 
	VANGUARD_PLUS_V10((byte) 30, "Vanguard Plus V10"), 
	VENCOMAX_11((byte) 31, "Vencomax 11"), 
	VENCOMAX_12((byte) 32, "Vencomax 12"), 
	VENCOMAX_8((byte) 33, "Vencomax 8"), 
	VENCORONA((byte) 34, "Vencorona"), 
	VENCOTHREE_PUPPY((byte) 35, "Vencothree Puppy");
	

	private byte code;
	private String description;

	private TipoVacina(byte code, String description) {
		this.code = code;
		this.description = description;
	}

	public byte getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

	public TipoVacina getByCode(byte code) {
		for (TipoVacina t : values()) {
			if (t.code == code)
				return t;
		}
		return null;
	}

	public TipoVacina getByDescription(String description) {
		for (TipoVacina t : values()) {
			if (t.description.equalsIgnoreCase(description))
				return t;
		}
		return null;
	}

}
