package Unidad7Ejercicios;

import java.util.Scanner;

public class Reloj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String horaUsuario="0";
		int horas=0;
		int minutos=0;
		String horasCadena;
		String minutosCadena;
		String []horaDividida = new String[2];
		boolean salir = false;
		do {
			System.out.print("Indique la hora que desea transformar(formato HH:mm): ");
			horaUsuario = sc.nextLine();
			salir=Validador.validarHora(horaUsuario);
			if (!salir) {
				System.err.println("Error pruebe de nuevo");
			}else {
				horaDividida=horaUsuario.split(":");
				horas=Integer.parseInt(horaDividida[0]);
				minutos=Integer.parseInt(horaDividida[1]);
				if (horas<1|horas>12|minutos<0|minutos>59) {
					System.err.println("Error pruebe de nuevo");
					salir = false;
				}
			}
		} while (!salir);
		if (minutos==00) {
			if (horas==12) {
			}else {
				horas=12-horas;
			}
		}else {
			if (horas==12) {
				horas=horas-11;
			}else if (horas==11) {
				horas=12;
			}else {
				horas=11-horas;
			}
			minutos = 60-minutos;
		}
		if (horas<10) {
			horasCadena="0"+horas;
		}else {
			horasCadena=""+horas;
		}
		if (minutos<10) {
			minutosCadena="0"+minutos;
		}else {
			minutosCadena=""+minutos;
		}
		
		System.out.println(horasCadena+":"+minutosCadena);
		

	}

}
