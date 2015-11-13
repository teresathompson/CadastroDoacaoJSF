
package aulajavaweb.model.enums;

public enum FabricanteVermifugo {

	 KONIG((byte) 1, "Konig"), 
	 MERIAL((byte) 2, "Merial"), 
	 CEVA((byte) 3, "Ceva"), 
	 BAYER((byte) 4, "Bayer"), 
	 CEPAV((byte) 5, "Cepav"), 
	 AGENER((byte) 6, "Agener"), 
	 BIOVET((byte) 7, "Biovet"), 
	 COVELI((byte) 8, "Coveli"), 
	 VETNIL((byte) 9, "Vetnil"),
	 DUPRAT((byte) 10, "Duprat"),
	 SYNTEC((byte) 11, "Syntec"),
	 VANSIL((byte) 12, "Vansil"),
	 VETBRANDS((byte) 13, "Vetbrands");
	 
	 private byte codigo;
	 private String descricao;
	 
	 private FabricanteVermifugo(byte codigo, String descricao) {
		 this.codigo = codigo;
		 this.descricao = descricao;
	 }
	 
	 public FabricanteVermifugo getByCodigo(int codigo) {
		 return getByCodigo((byte) codigo);
	 }
	
	 public FabricanteVermifugo getByCodigo(byte codigo) {
		 for(FabricanteVermifugo f : values()) {
			 if(f.codigo == codigo) {
				 return f;
			 }
		 }
		 return null;
	 }
	 
	 public FabricanteVermifugo getByDescricao(String descricao) {
		 for(FabricanteVermifugo f : values()) {
			 if(f.descricao.equalsIgnoreCase(descricao)) {
				 return f;
			 }
 		 }
		 return null;
	 }
	 
}




