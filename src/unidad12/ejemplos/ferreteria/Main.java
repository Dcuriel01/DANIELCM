package unidad12.ejemplos.ferreteria;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.sax.SAXSource;

import unidad12.ConexionBD;

public class Main {
	static String url = ConexionBD.obtenerURLClase();
	static String usuario = ConexionBD.obtenerUsuario();
	static String password = ConexionBD.obtenerContraseña();
	public static void main(String[] args) {
		/*
		List<String> listaProductos = new ArrayList<String>();
		
		try {
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
		}
		*/
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
		pD.obtenerProducto("MZOC8LXP");
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

}
