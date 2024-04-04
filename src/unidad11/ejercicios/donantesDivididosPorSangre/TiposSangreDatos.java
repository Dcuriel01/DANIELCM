package unidad11.ejercicios.donantesDivididosPorSangre;

public enum TiposSangreDatos {

	ABNEG("AB-"),ABPOS("AB+"),APOS("A+"),ANEG("A-"),BPOS("B+"),BNEG("B-"),OPOS("0+"),ONEG("0-");
	

	private final String sangre;
	
	TiposSangreDatos(String sangre) {
		this.sangre = sangre;
		
	}

	public String getSangre() {
		return sangre;
	}
}
