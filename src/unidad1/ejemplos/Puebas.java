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
	

	String lectura=null;
	double numero=0;
	System.out.println();
	lectura = sc.nextLine();
	if (lectura.matches("[1-9]\\d{0,100}+.[1-9]\\d{0,100}")) {
		lectura.replace(".", ",");
		numero = Double.parseDouble(lectura);
		System.out.println(numero);
	}else {
		System.out.println("Error en el numero");
	}
}
}