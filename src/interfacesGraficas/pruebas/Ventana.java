package interfacesGraficas.pruebas;

import java.awt.Color;
import java.awt.Desktop;
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
import javax.swing.border.Border;

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
						escritor.println("Texto introducido por un usuario");
						escritor.println(texto);
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
	        areaTexto.setBounds(0, 0, 680, 330);
	        areaTexto.setBackground(Color.CYAN);
	        bNoBorrarTexto.setBounds(420, 332, 270, 30);
	        bBorrarTexto.setBounds(0, 332, 250, 30);
	        bNoBorrarTexto.setBackground(Color.orange);
	        bBorrarTexto.setBackground(Color.orange);
	        abrirTxt.setBackground(Color.orange);
	        abrirTxt.setBounds(250, 332, 180, 30);
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
		//JOptionPane.showMessageDialog(null, "Introduzca el texto que desea pasar a ficheros");
		new Ventana();
	}

}
