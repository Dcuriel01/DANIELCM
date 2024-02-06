package unidad6Ejercicios.tarea2;

public class Motor {

	private int lAceite;
	private int cv;
	public Motor(int cv) {
		this.lAceite = 0;
		this.cv = cv;
	}
	public int getlAceite() {
		return lAceite;
	}
	public void setlAceite(int lAceite) {
		this.lAceite = this.lAceite + lAceite;
	}
	public int getCv() {
		return cv;
	}

	
}
