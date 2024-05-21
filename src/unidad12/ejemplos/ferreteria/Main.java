package unidad12.ejemplos.ferreteria;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;
import javax.xml.transform.sax.SAXSource;

import ejerciciosPropios.mundialF1.OrdenarMundial;
import ejerciciosPropios.mundialF1.Piloto;
import unidad12.ConexionBD;
import unidad13.ejemplos.menu.Tabla;

public class Main {
	static String url = ConexionBD.obtenerURLClase();
	static String usuario = ConexionBD.obtenerUsuario();
	static String password = ConexionBD.obtenerContraseña();
	public static void main(String[] args) {
		
		List<String> listaProductos = new ArrayList<String>();
		
		/*try {
			listaProductos = Files.readAllLines(
								Paths.get("ficheros//ferreteria//productos.csv")
									,StandardCharsets.UTF_8);
			int contador = 0;
			for (String lineaProducto : listaProductos) {
				if (contador > 0) {
					String[] datos = lineaProducto.split(",");
					Producto producto = new Producto(datos[0], datos[1], datos[2], Double.parseDouble(datos[3]));
					insertarProducto(producto);
				}
				contador++;
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		tratarProductos();
		
	}

	private static void tratarProductos() {
		ProductoDAO pD = new ProductoDAO(url, usuario, password);
		List<Producto> productos = pD.listarTodosLosProductos();
		for (Producto producto : productos) {
			System.out.println(producto);
		}
		//mostrarProductos(productos);
		Producto productoEliminar = new Producto("GWXDYH90","Martillo","Herramienta manual para golpear",31.65);
		pD.eliminarProducto(productoEliminar);
		Producto productoActualizar = new Producto("U5N74F0E","Motosierra","Herramienta para cortar madera",138.0);
		pD.actualizarProducto(productoActualizar);
		System.out.println(pD.obtenerProducto("MZOC8LXP"));
	}

	private static void insertarProducto(Producto producto) {
		
		ProductoDAO productoDao = new ProductoDAO(url, usuario, password);
		
		boolean insertado = productoDao.insertarProducto(producto);
		if (insertado) {
			System.out.println("Insertado correctamente");
		}else {
			System.out.println("Error en la inserción");
		}
	}

	public static void crearTabla() {
		ProductoDAO pD = new ProductoDAO(url, usuario, password);
		List<Producto> productos = pD.listarTodosLosProductos();
		String [] cabecera = new String[]{"Código","Nombre","Descripcion","Precio"};
		String[][] productosArray = new String[productos.size()][cabecera.length];
		productosArray=añadirProductos(productos,productosArray);
		new Tabla(productosArray,cabecera,"Ferreteria").setVisible(true);
	}

	
	public static String[][] añadirProductos(List<Producto> productos, String[][] productosArray) {
		int i=0;
		for (Producto producto : productos) {
			productosArray[i][0] = producto.getCodigo();
			productosArray[i][1] = producto.getNombre();
			productosArray[i][2] = producto.getDescripcion();
			productosArray[i][3] = String.valueOf(producto.getPrecio());
			i++;
		}
		return productosArray;
	}

	public static void eliminarProducto(String codigo) {
		ProductoDAO pD = new ProductoDAO(url, usuario, password);
		 Producto p  = comprobarExistencia(codigo);
		if (p.getCodigo().equals("0")) {
			JOptionPane.showMessageDialog(null, "Producto no encontrado");
		}else {
			pD.eliminarProducto(p);
			JOptionPane.showMessageDialog(null,"Producto eliminado");
		}
		
	}

	private static Producto comprobarExistencia(String codigo) {
		ProductoDAO pD = new ProductoDAO(url, usuario, password);
		List<Producto> productos = pD.listarTodosLosProductos();
		boolean encontrado=false;
		Producto p = null;
		for (Producto producto : productos) {
			if (codigo.equals(producto.getCodigo())) {
				p=producto;
				encontrado=true;
				break;
			}
		}
		if (!encontrado) {
			p= new Producto("0", "0", "0", 0);
		}
		return p;
	}

	public static void actualizarProducto(Producto producto) {
		ProductoDAO pD = new ProductoDAO(url, usuario, password);
		Producto p  = comprobarExistencia(producto.getCodigo());
		if (p.getCodigo().equals("0")) {
			JOptionPane.showMessageDialog(null, "Producto no encontrado");
		}else {
			pD.actualizarProducto(producto);
			JOptionPane.showMessageDialog(null,"Producto actualizado");
		}
		
	}

	public static Producto buscarProducto(String codigo) {
		ProductoDAO pD = new ProductoDAO(url, usuario, password);
		Producto p  = comprobarExistencia(codigo);
		if (p.getCodigo().equals("0")) {
			JOptionPane.showMessageDialog(null, "Producto no encontrado");
		}else {
			p=pD.obtenerProducto(codigo);
		}
		return p;
		
	}

	public static void crearProducto(Producto producto) {
		ProductoDAO pD = new ProductoDAO(url, usuario, password);
		Producto p  = comprobarExistencia(producto.getCodigo());
		if (p.getCodigo().equals("0")) {
			pD.insertarProducto(producto);
			JOptionPane.showMessageDialog(null,"Producto creado");
		}else {
			JOptionPane.showMessageDialog(null, "Codigo ya existente");
		}
		
	}
}
