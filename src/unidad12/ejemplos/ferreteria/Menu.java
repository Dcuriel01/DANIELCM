package unidad12.ejemplos.ferreteria;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import ejerciciosPropios.mundialF1.TablaPilotos;

class Menu extends JFrame{
	JMenu menu, submenu;
	JMenuItem i1, i2, i3, i4, i5;
	public Menu() {
		setTitle("Ejemplo de menu");

		JMenuBar mb = new JMenuBar();

		menu = new JMenu("Menu");

		submenu = new JMenu("Sub Menu");
		i1 = new JMenuItem("Mostrar tabla");
		i2 = new JMenuItem("Eliminar producto");
		i3 = new JMenuItem("Actualizar producto");
		i4 = new JMenuItem("Buscar producto");
		i5 = new JMenuItem("Añadir producto");
		
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		menu.add(i4);
		menu.add(i5);
		mb.add(menu);
		
		i1.addActionListener(e -> mostrarTabla()); // Una forma mucho más rápida de gestionar los eventos
		i2.addActionListener(e -> eliminarProducto()); // Una forma mucho más rápida de gestionar los eventos
		i3.addActionListener(e -> actualizarProducto()); // Una forma mucho más rápida de gestionar los eventos
		i4.addActionListener(e -> buscarProducto()); // Una forma mucho más rápida de gestionar los eventos
		i5.addActionListener(e -> aniadirProducto()); // Una forma mucho más rápida de gestionar los eventos
		
		setJMenuBar(mb);
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
	}

	private void aniadirProducto() {
		String codigo = JOptionPane.showInputDialog(this,"Introduzca el codigo");
		String nombre = JOptionPane.showInputDialog(this,"Introduzca el  nombre");
		String descripcion = JOptionPane.showInputDialog(this,"Introduzca la  descripción");
		double precio = Double.parseDouble(JOptionPane.showInputDialog(this,"Introduzca el  precio"));
		Producto p = new Producto(codigo, nombre, descripcion, precio);
		Main.crearProducto(p);
		

	}

	private void buscarProducto() {
		String codigo = JOptionPane.showInputDialog(this,"Introduzca el codigo");
		Producto p = Main.buscarProducto(codigo);
		JOptionPane.showMessageDialog(this, "Codigo: " + p.getCodigo()
											+ " Nombre: " + p .getNombre()
											+ " Descripción: " + p.getDescripcion()
											+ " Precio: " + p.getPrecio());
	}

	private void actualizarProducto() {
		String codigo = JOptionPane.showInputDialog(this,"Introduzca el codigo");
		String nombre = JOptionPane.showInputDialog(this,"Introduzca el nuevo nombre");
		String descripcion = JOptionPane.showInputDialog(this,"Introduzca la nueva descripción");
		double precio = Double.parseDouble(JOptionPane.showInputDialog(this,"Introduzca el nuevo precio"));
		Producto p = new Producto(codigo, nombre, descripcion, precio);
		Main.actualizarProducto(p);
		
	}

	private void eliminarProducto() {
		String codigo = JOptionPane.showInputDialog(this,"Introduzca el codigo");
		Main.eliminarProducto(codigo);
	}

	private void mostrarTabla() {
		Main.crearTabla();
	}

	public static void main(String args[]){
		new Menu();
	}
}