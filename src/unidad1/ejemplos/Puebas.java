package unidad1.ejemplos;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.security.SecureRandom;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Pattern;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import interfacesGraficas.radar.RadarTramo2;

public class Puebas{
	public static void main(String[]args) {

		SecureRandom random = new SecureRandom();
		int numAleatorio = random.nextInt(9999);
		String numS=" ";
		if (numAleatorio<1000) {
			numS="0"+ numAleatorio;
		}else {
			numS=""+numAleatorio;
		}
		System.out.println(numS);
		
		
	}
}