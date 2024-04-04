package interfacesGraficas.ficheros;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ventana extends JFrame {
	private static JTextArea areaTexto;
	private static StringBuilder mensaje = new StringBuilder();
	private static LocalDateTime fecha = LocalDateTime.now();
	private static DateTimeFormatter formato = DateTimeFormatter.ofPattern(" HH:mm dd/MM/yyyy");
	private static String fechaFormat = fecha.format(formato);
    private static String nombre;

	


	File ficheroEscritura = new File("ficheros//ficheroUser");
	public Ventana(){
		 	setTitle("Paso a ficheros");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(800, 400);

	        // Crear un JTextArea
	        areaTexto = new JTextArea();
	        areaTexto.setLineWrap(true);
	        areaTexto.setWrapStyleWord(true);

	        // Crear un JScrollPane para el JTextArea
	        JScrollPane scrollPane = new JScrollPane(areaTexto);

	        // Crear un botón para obtener el texto ingresado
	        JButton bBorrarTexto = new JButton("Pasar a fichero borrando lo anterior");
	        bBorrarTexto.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	mensaje = new StringBuilder("Texto pasado al fichero: ficheroUser");
	                String textoIngresado = areaTexto.getText();
	                
	                escribirFichero(textoIngresado);
	                JOptionPane.showMessageDialog(Ventana.this, mensaje.toString());
	                dispose();
	            }     

				private void escribirFichero(String texto) {
					try(PrintWriter escritor = new PrintWriter(ficheroEscritura)) {
						escritor.println(texto);
						if (nombre.equals("")|nombre.equals(null)) {
							escritor.println("Escrito por: anonimo en el momento:"+fechaFormat);
						}else {
							escritor.println("Escrito por: " + nombre + " en el momento:"+fechaFormat);
						}
					} catch (FileNotFoundException e) {
				
						e.printStackTrace();
				
					}	
				}
	        });
	        JButton bNoBorrarTexto = new JButton("Pasar a fichero conservando lo anterior");
	        bNoBorrarTexto.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	mensaje = new StringBuilder("Texto pasado al fichero: ficheroUser");
	                String textoIngresado = areaTexto.getText();
	                
	                escribirFichero(textoIngresado,true);
	                JOptionPane.showMessageDialog(Ventana.this, mensaje.toString());
	                dispose();
	            }     

				private void escribirFichero(String texto,boolean decision) {
					try(PrintWriter escritor = new PrintWriter(new FileWriter(ficheroEscritura,true))) {
						escritor.println(texto);
						if (nombre.equals("")|nombre.equals(null)) {
							escritor.println("Escrito por: anonimo en el momento:"+fechaFormat);
						}else {
							escritor.println("Escrito por: " + nombre + " en el momento:"+fechaFormat);
						}
						
					} catch (FileNotFoundException e) {
				
						e.printStackTrace();
				
					} catch (IOException e1) {
	
						e1.printStackTrace();
					}	
				}
	        });
	        JButton abrirTxt = new JButton("Abrir fichero");
	        abrirTxt.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	try {
                     Desktop.getDesktop().open(ficheroEscritura);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    
	            }
	           }
	        });
	        
	        
	        // Configurar el diseño de la ventana
	        setLayout(null);
	        add(scrollPane);
	        areaTexto.setBounds(0, 0, 800, 330);
	        bNoBorrarTexto.setBounds(470, 332, 340, 30);
	        bBorrarTexto.setBounds(0, 332, 290, 30);
	        bNoBorrarTexto.setBackground(Color.GREEN);
	        bBorrarTexto.setBackground(Color.GREEN);
	        abrirTxt.setBackground(Color.GREEN);
	        abrirTxt.setBounds(290, 332, 180, 30);
	        add(areaTexto);
	        add(bBorrarTexto);
	        add(bNoBorrarTexto);
	        add(abrirTxt);

	        // Mostrar la ventana
	        setLocationRelativeTo(null);
	        setResizable(false);
	        setVisible(true);
	}
	public static void main(String[] args) {
		nombre = JOptionPane.showInputDialog("Dime tu nombre");
		JOptionPane.showMessageDialog(null, nombre + " introduzca el texto que desea pasar a ficheros");
		new Ventana();
	}

}
