package interfacesGraficas.pruebas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ventana extends JFrame {
	private JTextArea areaTexto;
	private StringBuilder mensaje = new StringBuilder();
	File ficheroEscritura = new File("ficheros//ficheroUser");
	public Ventana(){
		 	setTitle("Paso a ficheros");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(700, 400);

	        // Crear un JTextArea
	        areaTexto = new JTextArea();
	        areaTexto.setLineWrap(true);
	        areaTexto.setWrapStyleWord(true);

	        // Crear un JScrollPane para el JTextArea
	        JScrollPane scrollPane = new JScrollPane(areaTexto);

	        // Crear un botón para obtener el texto ingresado
	        JButton botonObtenerTextoSobre = new JButton("Pasar a fichero borrando lo anterior");
	        botonObtenerTextoSobre.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	mensaje = new StringBuilder("Texto pasado al fichero: ficheroUser");
	                String textoIngresado = areaTexto.getText();
	                
	                escribirFichero(textoIngresado);
	                JOptionPane.showMessageDialog(Ventana.this, mensaje.toString());
	            }     

				private void escribirFichero(String texto) {
					try(PrintWriter escritor = new PrintWriter(ficheroEscritura)) {
						escritor.println("Texto introducido por un usuario");
						escritor.println(texto);
					} catch (FileNotFoundException e) {
				
						e.printStackTrace();
				
					}	
				}
	        });
	        JButton botonObtenerTextoNoSobre = new JButton("Pasar a fichero conservando lo anterior");
	        botonObtenerTextoNoSobre.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	mensaje = new StringBuilder("Texto pasado al fichero: ficheroUser");
	                String textoIngresado = areaTexto.getText();
	                
	                escribirFichero(textoIngresado,true);
	                JOptionPane.showMessageDialog(Ventana.this, mensaje.toString());
	            }     

				private void escribirFichero(String texto,boolean decision) {
					try(PrintWriter escritor = new PrintWriter(new FileWriter(ficheroEscritura,true))) {
						escritor.println(texto);
					} catch (FileNotFoundException e) {
				
						e.printStackTrace();
				
					} catch (IOException e1) {
	
						e1.printStackTrace();
					}	
				}
	        });
	        // Configurar el diseño de la ventana
	        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
	        add(scrollPane);
	        add(botonObtenerTextoSobre);
	        add(botonObtenerTextoNoSobre);

	        // Mostrar la ventana
	        setLocationRelativeTo(null);
	        setVisible(true);
	}
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Introduzca el texto que desea pasar a ficheros");
		new Ventana();
	}

}
