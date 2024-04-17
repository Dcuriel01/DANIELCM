package unidad11.ejemplos.json.Gson.leer;

public class Usuario2 {

	private String name;
	private String email;
	private int age;
	private long phone;
	private String city;
	private boolean hasCreditCard;
	@Override
	public String toString() {
		return "name=" + name + ", email=" + email + ", age=" + age + ", phone=" + phone + ", city=" + city
				+ ", hasCreditCard=" + hasCreditCard;
	}
	public Usuario2(String name, String email, int age, long phone, String city, boolean hasCreditCard) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.phone = phone;
		this.city = city;
		this.hasCreditCard = hasCreditCard;
	}

	
	
	
}
