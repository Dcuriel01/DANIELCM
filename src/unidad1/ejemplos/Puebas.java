package unidad1.ejemplos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import interfacesGraficas.RadarTramo2;

public class Puebas extends JFrame {
public static Scanner sc = new Scanner(System.in);	
public static void main(String[] args) {
	String datosIntro=null;
	int datosIntroN=0;
	System.out.println(" ");
	datosIntro = sc.nextLine();
	if (datosIntro.matches("[1-9]\\d{0,100}")) {
		System.out.println("Hola");
	}else {
		System.out.println("Adios");
	}
	}
}
