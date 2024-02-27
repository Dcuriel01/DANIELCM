package unidad1.ejemplos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.SecureRandom;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import interfacesGraficas.radar.RadarTramo2;

public class Puebas{
	public static void main(String[]args) {
	SecureRandom random = new SecureRandom();
	int nAleatorio = random.nextInt(4);
	System.out.println(nAleatorio);
	}
}