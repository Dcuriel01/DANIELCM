package unidad1.ejemplos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Pattern;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import interfacesGraficas.radar.RadarTramo2;
import unidad8Ejercicios.campoFutbol.ConstantesFutbol;

public class Puebas{
	public static void main(String[]args) {

		String hola = "1232 HJG";
		if (hola.matches("[0-9]{4}\\s[A-Z]{3}")) {
			System.out.println("hola");
		}else {
			System.out.println("Adios");
		}
		
		
	}
}