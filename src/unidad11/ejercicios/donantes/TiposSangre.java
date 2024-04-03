package unidad11.ejercicios.donantes;

public enum TiposSangre {

	ABNEG("AB-"),ABPOS("AB+"),APOS("A+"),ANEG("A-"),BPOS("B+"),BNEG("B-"),OPOS("0+"),ONEG("0-");
	

	private final String sangre;
	
	TiposSangre(String sangre) {
		this.sangre = sangre;
		
	}

	public String getSangre() {
		return sangre;
	}
}
