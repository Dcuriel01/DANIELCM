package unidad7.ejemplos.coche;

public class Coche {

	private String marca = "Desconocido";
	private String modelo = "Desconocido";
	private String matricula = "Desconocida";
	private double km = 0000;
	private double longitud = 00;
	private double altura = 00;
	private int nPuertas = 0;
	private int nAsientos = 0;
	private int id = 00;
	private String tipo = "Desconocido";
	private double peso = 0;
	private int cv;

	public Coche(String marca, String modelo, String matricula, double km, double longitud, double altura, int nPuertas,
			int nAsientos, int id, String tipo, double peso, int cv) {
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.km = km;
		this.longitud = longitud;
		this.altura = altura;
		this.nPuertas = nPuertas;
		this.nAsientos = nAsientos;
		this.id = id;
		this.tipo = tipo;
		this.peso = peso;
		this.cv = cv;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getnPuertas() {
		return nPuertas;
	}

	public void setnPuertas(int nPuertas) {
		this.nPuertas = nPuertas;
	}

	public int getnAsientos() {
		return nAsientos;
	}

	public void setnAsientos(int nAsientos) {
		this.nAsientos = nAsientos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getCv() {
		return cv;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	public String toString() {

		String informacion = "";
		informacion += "DATOS COCHE \n";
		informacion += "Marca: " + marca + "\n";
		informacion += "Modelo: " + modelo + "\n";
		informacion += "Matricula: " + matricula + "\n";
		informacion += "Kilometros: " + km + "\n";
		informacion += "Longitud: " + longitud + "\n";
		informacion += "Altura: " + altura + "\n";
		informacion += "Número de puertas: " + nPuertas + "\n";
		informacion += "Número de asientos: " + nAsientos + "\n";
		informacion += "ID: " + id + "\n";
		informacion += "Tipo: " + tipo + "\n";
		informacion += "Peso: " + peso + "\n";
		informacion += "Cv: " + cv + "\n";
		return informacion;

	}

}
