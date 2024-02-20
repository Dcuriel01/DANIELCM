package unidad8Ejercicios.pizzas;

public class ActividadPizza {
	
	public static void main(String[] args) {
	
		Pizza p1 = new Pizza("Queso y jamon", 10);
		Pizza p2 = new Pizza("Barbacoa", 18);
		Pizza p3 = new EntregaPizza("Carbonara", 16 , "Calle victoria");
		Pizza p4 = new EntregaPizza("Crispy chicken",14, "Avenida las angustias");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
	}
	
}
