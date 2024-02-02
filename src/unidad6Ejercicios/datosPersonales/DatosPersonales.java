package unidad6Ejercicios.datosPersonales;

public class DatosPersonales {

		private String nombre = null;
		private String direccion = null;
		private int edad = 0;
		private String telefono = null;
		
		
		public DatosPersonales(String nombre, String direccion, int edad, String telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		if (edad<0) {
			System.out.println("Error en la edad");
		}else {
			this.edad = edad;
		}
		if (telefono.length()!=9) {
			System.out.println("Error en el número de teléfono");
		}else {
			this.telefono = telefono;
		}
		
	}
		
		 
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		
		public String toString() {
			String texto = "DatosPersonales\n"
					+ "nombre=" + nombre + ", direccion=" + direccion + ", edad=" + edad + ", telefono=" + telefono;
			
			return texto;
		}
		 
		

}
