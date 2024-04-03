package interfacesGraficas.radar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class RadarTramo2 extends JFrame {
	
	public static Scanner sc = new Scanner(System.in);
	public static final int MAXIMO_VALORES = 6; //Aquí se declara el numero maximo de datos que queremos recoger
	public static String [] datos = new String[MAXIMO_VALORES];
	public static int rellenos=0; //Son los huecos que han sido rellenados con datos
	private JTextArea areaTexto;
    private static String[] lineasTexto;
    private static StringBuilder mensaje = new StringBuilder("Resultado :\n");
    private static String nombre;
    private static String apellidos;
    
    
	public static void main(String[] args) {
		nombre = JOptionPane.showInputDialog("Dime tu nombre");
		apellidos = JOptionPane.showInputDialog("Apellidos");
		String mensaje = String.format("Bienvenido, %s %s, va a probar un programa sobre los radares de tramo!", nombre,apellidos);
		JOptionPane.showMessageDialog(null, mensaje);
		new RadarTramo2();
	}
	
	
	
	public RadarTramo2() {
        // Configurar la ventana
        setTitle("Radares de tramo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        // Crear un JTextArea
        areaTexto = new JTextArea();
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);

        // Crear un JScrollPane para el JTextArea
        JScrollPane scrollPane = new JScrollPane(areaTexto);

        // Crear un botón para obtener el texto ingresado
        JButton botonObtenerTexto = new JButton("Obtener resultado");
        botonObtenerTexto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	mensaje = new StringBuilder("Resultado :\n");
                String textoIngresado = areaTexto.getText();
                lineasTexto = textoIngresado.split("\n");
                comprobarDatos();
           
                JOptionPane.showMessageDialog(RadarTramo2.this, mensaje.toString());
            }
        });

        // Configurar el diseño de la ventana
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(scrollPane);
        add(botonObtenerTexto);

        // Mostrar la ventana
        setLocationRelativeTo(null);
        setVisible(true);
    }

	private static void comprobarDatos() {
		String texto;
		for (int j = 0; j < 3; j++) {
			texto = comprobarResultado(lineasTexto[j]);//recorro este bucle com el metodo tantas veces como datos tenemos introducidos
			mensaje.append(texto).append("\n");
		}
		mensaje.append("Muchas gracias por probar mi programa " + nombre + " " + apellidos);
	}

	private static String comprobarResultado(String datos) {
		double[] datosNum = declararDatos(datos);
		double vmu; //Velocidad media del usuario
		double vm; //Velocidad de la multa
		String texto;
		if (datosNum[0]<0 | datosNum[1]<0 | datosNum[2]<=0) {
			texto="Error";
		}else {
			datosNum[1] = datosNum[1]/3.6; //Pasamos a m/s
			vmu = datosNum[0]/datosNum[2]; //Calculo la velocidad media
			vm = (datosNum[1]*0.2)+datosNum[1]; //Calculo velociadad a la cuál pasa a ser puntos
			if (vmu<=datosNum[1]) { //Si la velocidad es menor no hay nigun problema
				texto="Ok";
			}else {
				if (vmu>=vm) { // si es mayor a la vm(velocidad maxima de multa) ya pasa a ser puntos
					texto="Puntos";
				}else { //al ser menor que la vm perono no que la vmp solo es multa
					texto="Multa";
				}
			}
			
		}
		return texto;
	}

	private static double[] declararDatos(String datos) {
		String [] datosSplit = new String[3];
		double[] datosNum = new double[3];
		datosSplit = datos.split(" ");//Separamos los datos para trabajar con ellos en diferentes variables
		datosNum[0]= Double.parseDouble(datosSplit[0]);//distancia recorrida en el tramo en m
		datosNum[1] = Double.parseDouble(datosSplit[1]);//velocidad maxima permitida en ese tramo en km/h
		datosNum[2] = Double.parseDouble(datosSplit[2]);//tiempo tardado en segundos
		return datosNum;
		
	}

}
