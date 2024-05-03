package unidad13.ejercicios.listadosPersonas;

import java.awt.Button;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import unidad12.ConexionBD;
import unidad13.ejemplos.distribuciones.FlowLayoutDemo;

public class ListadoPersonas extends JFrame {

	
	 private JTextField nombre;
	 private JTextField apellido;
	 private JTextField ciudad;
	 private JList listaNombres; // Lista de personas
	 private DefaultListModel modelo; // Objeto que modela la lista
	 private JScrollPane scrollLista; // Barra de desplazamiento vertical
	 
	 
	 private JPanel panel;
	
		   public ListadoPersonas() {
		       super("Listar Personas");//Al super le mandas el titulo de la ventana
		       setLayout(new FlowLayout());
		       Button bAceptar =  new Button("aceptar"); 
		       add(bAceptar);
		       Button bListadoPersonas =  new Button("Listar Personas"); 
		       add(bListadoPersonas);
		       add(new JLabel("Nombre:"));
		        nombre =new JTextField(10); 
		        add(nombre);
		        add(new JLabel("Apellido:"));
		        apellido =new JTextField(10); 
		        add(apellido);
		        add(new JLabel("Ciudad:"));
		        ciudad =new JTextField(10); 
		        add(ciudad);
		       
		       /*bAceptar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						leerDatosFormulario();
					}
				});*/
		       
		       bListadoPersonas.addActionListener(e -> listarPersonas()); // Una forma mucho más rápida de gestionar los eventos
		       
		       bListadoPersonas.addActionListener(e -> leerDatosFormulario()); // Una forma mucho más rápida de gestionar los eventos
		       
		       panel = new JPanel();
		       add(panel);
		       
		       /**
		        * 
		        * PARA AÑADIR UN JList
		        */
		       // Establece la lista gráfica de personas
		       listaNombres = new JList();
		       //Establece que se pueda seleccionar solamente un elemento de la lista 
		       listaNombres.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		       
		       modelo = new DefaultListModel();
		       // Establece una barra de desplazamiento vertical
		       scrollLista = new JScrollPane();
		       // Establece la posición de la barra de desplazamiento vertical
		       scrollLista.setBounds(20, 190 ,220, 80);
		       // Asocia la barra de desplazamiento vertical a la lista de personas
		       scrollLista.setViewportView(listaNombres);
		       
		       add(scrollLista);
		       
		       
		       setLocationRelativeTo(null);
		       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		       //pack();
		       setVisible(true);
		       setSize(600,400);
		      
		   }
		

		public static void main(String[] args) {
		       new ListadoPersonas();
		   }
		   
		private void leerDatosFormulario() {
	    	
	    	System.out.println("Se están leyendo los datos del formulario");
	    	
	    	String name = nombre.getText();
	        String surname = apellido.getText();
	        String city = ciudad.getText();
	        Persona p1 = new Persona(name, surname, city);
	        PersonasDAO.insertarPersonas(p1);
	        
	        
		}
		   
		   private void listarPersonas() {
			   ArrayList<Persona> personas = PersonasDAO.devolverTablaCompleta();
			   for (Persona persona : personas) {
				   showDataInJList(persona.getNombre(),persona.getApellido(),persona.getCiudad());
			}
		   }
		       

			private void showDataInJList(String name, String surname, String city) {
		
		   	 String elemento = name + "-" + surname + "-" + city;
		        modelo.addElement(elemento); //Se agrega el texto con los datos de la persona al JList
		        listaNombres.setModel(modelo);
				
			}
		   
		}
