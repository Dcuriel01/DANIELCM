package interfacesGraficas.Banca;

import java.awt.BorderLayout;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.SecureRandom;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AplicacionBancaria extends JFrame {
	public static String [] nSecretoVisual = new String[3];
	private JTextField campoNumerico;
	private JButton[] botonesNumeros;
	private JButton aceptarButton;
	public boolean errorGrafico;
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String dni;
		String fechaNac;
		boolean noErrorDni;
		boolean noErrorFecha;
		boolean error;
		int n1;
		int n2;
		int n3;
		String [] numeroSecreto = {"1","2","3","4","5","6"};
		String [] numeroSecretoCambiar = {"0","0","0","0","0","0"};
		JOptionPane mensajeError = new JOptionPane();
		do {
		dni = JOptionPane.showInputDialog("Dni:");
		fechaNac = JOptionPane.showInputDialog("Fecha nacimiento (dd-mm-yyyy)");
		mensajeError.setMessage("Error");
		noErrorDni = validarDni(dni);
		noErrorFecha = validarFecha(fechaNac);
		if (!noErrorDni|!noErrorFecha) {
			JOptionPane.showMessageDialog(null, "No coinciden los datos","Error", JOptionPane.ERROR_MESSAGE);
		}
		} while (!noErrorDni|!noErrorFecha);
		n1=generarNumeroRandom();
		n2=generarNumeroRandom();
		while (n1==n2) {
			if (n1==n2) {
				n2=generarNumeroRandom();
			}
		}
		n3=generarNumeroRandom();
		while (n1==n3|n2==n3) {
			n3=generarNumeroRandom();
		}
		do {
		new AplicacionBancaria(n1,n2,n3,numeroSecretoCambiar);
		error = codigoSecreto(n1,n2,n3,numeroSecretoCambiar,numeroSecreto);
		} while (error);
		System.out.println("Ha accedido a su cuenta");
		SolicitudBancaria cuenta1 = new SolicitudBancaria(dni, fechaNac, "1,2,3,4,5,6");
		
		
	}

	private static boolean codigoSecreto(int n1, int n2, int n3, String[] numeroSecreto, String[] numeroBuscado) {
		String numUsuario;
		String [] numUsuarioSplit = new String [3];
		boolean error = true;
		int contador = 0;
		int [] huecos = new int [3];
		numeroSecreto[n1]="*";
		numeroSecreto[n2]="*";
		numeroSecreto[n3]="*";
		for (String x : numeroSecreto) {
			System.out.print(x);
		}
		JOptionPane.showMessageDialog(null, "Introduzca los numeros a 0","Información", JOptionPane.INFORMATION_MESSAGE);
		numUsuario = sc.nextLine();
		numUsuarioSplit=numUsuario.split(" ");
		for (int i = 0; i < numeroSecreto.length; i++) {
			 if (!numeroSecreto[i].equals("*")) {
				huecos[contador]=i;
				contador++;
			}
			
		}
		if (numeroBuscado[huecos[0]].equals(numUsuarioSplit[0])) {
			if (numeroBuscado[huecos[1]].equals(numUsuarioSplit[1])) {
				if (numeroBuscado[huecos[2]].equals(numUsuarioSplit[2])) {
					error=false;
				}else {
					System.out.println("Error en el numero secreto");
				}
			}else {
				System.out.println("Error en el numero secreto");
			}
		}else {
			System.out.println("Error en el numero secreto");
		}
		return error;
	}

	private static int generarNumeroRandom() {
		SecureRandom random = new SecureRandom();
		int numAleatorio = random.nextInt(6);
		return numAleatorio;
	}

	private static boolean validarFecha(String fechaNac) {
		boolean noError;
		noError = ValidadorBancario.validarFecha(fechaNac);
		return noError;
	}

	private static boolean validarDni(String dni) {
		boolean noError;
		noError = ValidadorBancario.validarDni(dni);
		return noError;
	}
	
	public AplicacionBancaria(int n1, int n2, int n3, String[] numeroSecretoCambiar) {
        // Configuración de la ventana principal
        setTitle("Ventana de Números");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Crear componentes
        campoNumerico = new JTextField(10); // Un solo campo de texto
        botonesNumeros = new JButton[10];
        aceptarButton = new JButton("Aceptar");

        // Configurar el diseño de la ventana principal
        setLayout(new BorderLayout());

        // Panel para el campo de texto (FlowLayout, centrado)
        JPanel panelCampoNumerico = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelCampoNumerico.add(campoNumerico);
        add(panelCampoNumerico, BorderLayout.NORTH);

        // Panel para los botones (GridLayout con dos filas)
        JPanel panelBotones = new JPanel(new GridLayout(2, 5, 10, 10));

        // Botones del 0 al 9
        for (int i = 1; i < 7; i++) {
            final int numero = i;
            botonesNumeros[i] = new JButton(Integer.toString(i));
            botonesNumeros[i].setFont(new Font("Arial", Font.PLAIN, 12));
            botonesNumeros[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Agregar el número al campo de texto
                	int contador=0;
                    campoNumerico.setText(campoNumerico.getText() + numero);
                    nSecretoVisual[contador] = ""+numero; 
                    contador++;
                }
            });
            panelBotones.add(botonesNumeros[i]);
        }

        add(panelBotones, BorderLayout.CENTER);

        // Panel para el botón Aceptar (FlowLayout, centrado)
        JPanel panelAceptar = new JPanel(new FlowLayout(FlowLayout.CENTER));
        aceptarButton.setFont(new Font("Arial", Font.PLAIN, 14));
        panelAceptar.add(aceptarButton);
        add(panelAceptar, BorderLayout.SOUTH);

        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	errorGrafico = codigoSecreto(n1,n2,n3,numeroSecretoCambiar,nSecretoVisual);
            	if (errorGrafico) {
        			System.out.println("pruebe de nuevo");
        		}
        		if (errorGrafico) {
        			System.out.println("pruebe de nuevo");
        		}
                JOptionPane.showMessageDialog(AplicacionBancaria.this, "¡Botón Aceptar presionado!");
            }
        });
        
        // Mostrar la ventana
        setLocationRelativeTo(null);
        setVisible(true);
    }
	
}
