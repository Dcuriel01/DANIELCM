package unidad12.ejemplos.ferreteria;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

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
		i2 = new JMenuItem("Item 2");
		i3 = new JMenuItem("Item 3");
		i4 = new JMenuItem("Item 4");
		i5 = new JMenuItem("Item 5");
		
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		
		submenu.add(i4);
		submenu.add(i5);
		
		menu.add(submenu);
		mb.add(menu);
		
		i1.addActionListener(e -> mostrarTabla()); // Una forma mucho más rápida de gestionar los eventos
		
		setJMenuBar(mb);
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
	}

	private void mostrarTabla() {
		Main.crearTabla();
	}

	public static void main(String args[]){
		new Menu();
	}
}