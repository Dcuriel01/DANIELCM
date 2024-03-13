package unidad9.ejercicios.placasSolares;

import java.util.HashSet;
import java.util.Iterator;

public class Planta {
	
	private String id;
	private TipoPlanta tipo;
	HashSet<ProductorEnergia> productores;
	
	public Planta(String id,TipoPlanta tipo) {
		super();
		this.id = id;
		this.tipo=tipo;
		productores = new HashSet<ProductorEnergia>();
	}
	
	public void introducirProductor(ProductorEnergia p1) {
		productores.add(p1);
	}
	
	public void mostrarPlantas() {
		Iterator iteradorPlanta = productores.iterator();
		while (iteradorPlanta.hasNext()) {
			ProductorEnergia productor = (ProductorEnergia)iteradorPlanta.next();
			System.out.println(productor);
		}
	}
	
	public double calcularEnergia(){
		double energiaTotal=0;
		Iterator iteradorPlanta = productores.iterator();
		while (iteradorPlanta.hasNext()) {
			ProductorEnergia productor = (ProductorEnergia)iteradorPlanta.next();
			energiaTotal=energiaTotal+productor.cantidadGenerada;
		}
		return energiaTotal;
	}
	
}
