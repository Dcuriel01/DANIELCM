package unidad6.ejercicios.serigrafia;

public class Camisetas {
	/*identificador, descripción, material, color, precio y cantidad en stock*/
	private int id;
	private String descrip;
	private Materiales material;
	private String color;
	private double precio;
	private int stock;
	
	public Camisetas(int id, String descrip, Materiales material, String color, double precio, int stock) {
		this.id = id;
		this.descrip = descrip;
		this.material = material;
		this.color = color;
		this.precio = precio;
		this.stock = stock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescrip() {
		return descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	public Materiales getMaterial() {
		return material;
	}

	public void setMaterial(Materiales material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	/*identificador, descripción, material, color, precio y cantidad en stock*/
	public void imprimirDatos() {
		System.out.println("Id:" + id);
		System.out.println("Descripción: " + descrip);
		if (material==Materiales.TELA) {
			System.out.println("Material: tela");
		}else if (material==Materiales.ALGODON) {
			System.out.println("Material: algodón");
		}else if (material==Materiales.POLIESTER) {
			System.out.println("Material: poliester");
		}else if (material==Materiales.PLASTICO) {
			System.out.println("Material: plastico");
		}
		System.out.println("Color: "+ color);
		System.out.println("Precio: "+ precio);
		System.out.println("Stock: "+ stock);
	}
	
	
	
	
}
