package ejerciciosPropios.mundialF1;

import java.awt.Button;
import java.awt.FlowLayout;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class VentanaPrincipal extends JFrame {
	static int contadorCarreras=0;
	static Button bGenerar =  new Button("Simular carrera"); 
	static Button bGenerarMun =  new Button("Generar mundial"); 
	static boolean posibilidadGeneracion = true;
	private JList listaNombres; // Lista de personas
	private DefaultListModel modelo; // Objeto que modela la lista
	private JScrollPane scrollLista; // Barra de desplazamiento vertical

	public static void main(String[] args) {
		TablaPilotos.inicializarTabla();
		new VentanaPrincipal();
	}
	
	;
	public VentanaPrincipal(){
		 super("Mundial F1");//Al super le mandas el titulo de la ventana
	        setLayout(new FlowLayout());
	        
	        Button bTabla =  new Button("Mostrar tabla pilotos"); 
	        add(bTabla);
	        
	        add(bGenerar);
	        
	        add(bGenerarMun);
	        
	        bTabla.addActionListener(e -> TablaPilotos.crearTabla()); // Una forma mucho más rápida de gestionar los eventos
	        bGenerar.addActionListener(e -> simular());
	        bGenerarMun.addActionListener(e -> simularMundial());
	        
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        //pack();
	        bGenerar.setSize(300,200);
	        bTabla.setSize(300,200);
	        setVisible(true);
	        setSize(600,400);
	}


	private void simularMundial() {
		for (int i = 0; i < 5; i++) {
			simular();
		}
		bGenerarMun.disable();
		
	}

	private void simular() {
		ArrayList<Piloto> pilotos = TablaPilotos.getListaPilotos();
		pilotos = generarPuntos(pilotos);
		OrdenarCarrera ordenarCarrera = new OrdenarCarrera();
		Collections.sort(pilotos,ordenarCarrera);
		StringBuilder contenido = new StringBuilder();
		String linea;
		int i =1;
		for (Piloto piloto : pilotos) {
			linea =  " Posición: " + i +" Piloto: " + piloto.getAbreviatura() ;
			contenido.append(linea+"\n");
			i++;
		}
		JOptionPane.showMessageDialog(this, "Carrera simulada con exito\n" + contenido);
		pilotos = asignarPuntos(pilotos);
		TablaPilotos.setListaPilotos(pilotos);
		contadorCarreras++;
		if (contadorCarreras==5) {
			OrdenarMundial ordenarMundial = new OrdenarMundial();
			Collections.sort(pilotos,ordenarMundial);
			StringBuilder mensaje = new StringBuilder();
			String parrafo="";
			int j=1;
			for (Piloto piloto : pilotos) {
				if (j==1) {
					parrafo = "Campeon: " + piloto.getNombre()+" PTS: " + piloto.getPts();
					mensaje.append(parrafo+"\n");
				}else if (j==2) {
					parrafo = "Segundo: " + piloto.getNombre()+" PTS: " + piloto.getPts();
					mensaje.append(parrafo+"\n");
				}else if (j==3) {
					parrafo = "Tercero: " + piloto.getNombre()+" PTS: " + piloto.getPts();
					mensaje.append(parrafo+"\n");
					
				}
				j++;
			}
			JOptionPane.showMessageDialog(this, "Campeonato:\n"+mensaje);
			bGenerar.disable();
			bGenerarMun.disable();
		}
		
		
		
		
		
		
	}

	private ArrayList<Piloto> asignarPuntos(ArrayList<Piloto> pilotos) {
		int i =	1;
		for (Piloto piloto : pilotos) {
			switch (i) {
			case 1:
				piloto.setPts(25);
				break;
			case 2:
				piloto.setPts(18);
				break;
			case 3:
				piloto.setPts(15);
				break;
			case 4:
				piloto.setPts(12);
				break;
			case 5:
				piloto.setPts(10);
				break;
			case 6:
				piloto.setPts(8);
				break;
			case 7:
				piloto.setPts(6);
				break;
			case 8:
				piloto.setPts(4);
				break;
			case 9:
				piloto.setPts(2);
				break;
			case 10:
				piloto.setPts(1);
				break;

			default:
				break;
			}
			i++;
		}
		return pilotos;
	}

	private ArrayList<Piloto> generarPuntos(ArrayList<Piloto> pilotos) {
		for (Piloto piloto : pilotos) {
			int pts =0;
			piloto.setPtsEnCarrera(0);
			piloto.setnGeneradores();
			if (piloto.getnGeneradores()==3) {
				pts = generarRandom(10,8,5);
			}else if (piloto.getnGeneradores()==2) {
				pts = generarRandom(10, 5, 1);
			}else {
				pts = generarRandom(10, 1, 1);
			}
			piloto.setPtsEnCarrera(pts);
		}
		return pilotos;
	}

	private int generarRandom(int primer, int segun, int tercer) {
		int pts =0;
		SecureRandom random = new SecureRandom();
		pts = pts + random.nextInt(primer)+1;
		pts = pts + random.nextInt(segun)+1;
		pts = pts + random.nextInt(tercer)+1;
		return pts;
		
		
	}

}
