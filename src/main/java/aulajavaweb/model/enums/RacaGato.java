package aulajavaweb.model.enums;

import javax.faces.bean.ManagedBean;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@ManagedBean
public enum RacaGato {

	
	ABYSSINIAN((byte) 1, "Abyssinian"),
	AMERICAN_BOBTAIL_LONGHAIR((byte) 2, "American Bobtail Longhair"), 
	AMERICAN_BOBTAIL_SHORTHAIR((byte) 3, "American Bobtail Shorthair"), 
	AMERICAN_SHORTHAIR((byte) 4, "American Shorthair"),
	AMERICAN_WIREHAIR((byte) 5, "American Wirehair"), 
	ARABIAN_MAU((byte) 6, "Arabian Mau"),
	ASIAN_SEMI_LONG_HAIR((byte) 7, "Asian Semi Long Hair"), 
	AUSTRALIAN_MIST((byte) 8, "Australian Mist"), 
	BENGAL((byte) 9, "Bengal"), 
	BOBTAIL_JAPONÊS((byte) 10, "Bobtail Japonês"), 
	BOMBAIM((byte) 11, "Bombaim"), 
	BRAZILIAN_SHORTHAIR((byte) 12, "Brazilian Shorthair"),
	BRITISH_LONGHAIR((byte) 13, "British Longhair"),
	BURMÊS((byte) 14, "Burmês"),
	CALIFORNIA_SPANGLED_CAT((byte) 15, "California Spangled Cat"),
	CHAUSIE((byte) 16, "Chausie"), 
	CORNISH_REX((byte) 17, "Cornish Rex"), 
	CURL_AMERICANO_PELO_CURTO((byte) 18, "Curl Americano Pelo Curto"), 
	CURL_AMERICANO_PELO_LONGO((byte) 19, "Curl Americano Pelo Longo"), 
	DEVON_REX((byte) 20, "Devon Rex"), 
	DOMESTIC_LONG_HAIRED((byte) 21, "Domestic Long Haired"), 
	DOMESTIC_SHORT_HAIRED((byte) 22, "Domestic Short Haired"), 
	DON_SPHYNX((byte) 23, " Don Sphynx"),
	EGYPTIAN_MAU((byte) 24, "Egyptian Mau"), 
	EUROPEAN_EXOTIC_SHORTHAIR((byte) 25, " European Exotic  Shorthair"), 
	GERMAN_REX((byte) 26, "German Rex"), 
	HAVANA((byte) 27, "Havana"), 
	HIMALAIO((byte) 28, "Himalaio"), 
	KHAO_MANEE((byte) 29, "Khao Manee"),
	KORAT((byte) 30, "Korat"), 
	KURILIAN_BOBTAIL_LONGHAIR((byte) 31, "Kurilian Bobtail Longhair"),
	KURILIAN_BOBTAIL_SHORTHAIR((byte) 32, " Kurilian Bobtail Shorthair"),
	LAPERM_LONGHAIR((byte) 33, "LaPerm Longhair"),
	LAPERM_SHORTHAIR((byte) 34, "LaPerm Shorthair"),
	MAINE_COON((byte) 35, "Maine Coon"),
	MANX((byte) 36, "Manx"), 
	MEKONG_BOBTAIL((byte) 37, "Mekong Bobtail"),
	MUNCHKIN_LONGHAIR((byte) 38, "Munchkin Longhair"), 
	MUNCHKIN_SHORTHAIR((byte) 39, "Munchkin Shorthair"),
	NEBELUNG((byte) 40, "Nebelung"), 
	NORWEGIAN_FOREST_CAT((byte) 41, "Norwegian Forest Cat"),
	OCICAT((byte) 42, "Ocicat"),
	OJOS_AZULES_SHORTHAIR((byte) 43, "Ojos Azules Shorthair"),
	ORIENTAL_LONGHAIR((byte) 44, "Oriental Longhair"),
	ORIENTAL_SHORTHAIR((byte) 45, "Oriental Shorthair"), 
	PERSA((byte) 46,"Persa"), 
	PETERBALD((byte) 47, "Peterbald"),
	PIXIEBOB_LONGHAIR((byte) 48, "Pixiebob Longhair"), 
	PIXIEBOB_SHORTHAIR(	(byte) 49, "Pixiebob Shorthair"),
	RAGAMUFFIN((byte) 50, "Ragamuffin"),
	RAGDOLL((byte) 51, "Ragdoll"), 
	RUSSO_AZUL(	(byte) 52, "Russo Azul"), 
	SAGRADO_DA_BIRMÂNIA((byte) 53, "Sagrado da Birmânia"),
	SAVANNAH_CAT((byte) 54, "Savannah Cat"), 
	SCOTTIS_FOLD((byte) 55, "Scottis  Fold"),
	SELKIRK_REX_LONGHAIR((byte) 56, "Selkirk Rex Longhair"),
	SELKIRK_REX_SHORTHAIR((byte) 57, "Selkirk Rex Shorthair"), 
	SERENGETI((byte) 58, "Serengeti"), 
	SIAMÊS((byte) 59, "Siamês"), 
	SIBERIAN((byte) 60, "Siberian"),
	SINGAPURA((byte) 61, "Singapura"),
	SNOWSHOE((byte) 62, "Snowshoe"), 
	SOKOKE((byte) 63, "Sokoke"), 
	SOMALI(	(byte) 64, "Somali"), 
	SPHYNX((byte) 65, "Sphynx"), 
	THAI((byte) 66, "Thai"),
	TONKINESE_SHORTHAIR((byte) 67, "Tonkinese Shorthair"), 
	TOYGER((byte) 68, "Toyer"), 
	TURKISH_ANGORÁ((byte) 69, "Turkish Angorá"),
	TURKISH_VAN((byte) 70, "Turkish Van"), 
	YORK_CHOCOLATE((byte) 71, " York Chocolate"),
	SRD((byte) 72, "Sem raça definida");

	private byte code;
	private String description;

	private RacaGato(byte code, String description) {
		this.code = code;
		this.description = description;
	}

	public byte getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

	public RacaGato getByCode(byte code) {
		for (RacaGato r : values()) {
			if (r.code == code)
				return r;
		}
		return null;
	}

	public RacaGato getByDescription(String description) {
		for (RacaGato r : values()) {
			if (r.description.equalsIgnoreCase(description))
				return r;
		}
		return null;
	}

}
