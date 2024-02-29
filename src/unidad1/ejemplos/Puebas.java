package unidad1.ejemplos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import interfacesGraficas.radar.RadarTramo2;
import unidad8Ejercicios.campoFutbol.ConstantesFutbol;

public class Puebas{
	public static String[][] relleno = new String[7][7];
	public static void main(String[]args) {

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				relleno[i][j]="-";
			}
		}
		int x=0;
		for (int y = 6; y > 0; y--) {
			for (x = 0; x < y; x++) {
				if (x==0) {
					for (int i = 0; i < 6-y; i++) {
						System.out.print(" ");
					}
				}
				
				if (x==y-1) {
					System.out.println(relleno[x][y]);
				}else {
					System.out.print(relleno[x][y]);
				}
				
			}
		}
	}
}