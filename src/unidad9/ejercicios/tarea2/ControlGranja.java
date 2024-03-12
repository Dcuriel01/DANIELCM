package unidad9.ejercicios.tarea2;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class ControlGranja {

	public static void main(String[] args) {

		Carne cerdo1 = new Carne(3, "2017", "Paco", Sexo.MACHO, "Vietnamita", LocalDate.of(2023, 6, 23), Tipo.PORCINO, 100, 0, 0, 3000);
		Lechero vaca1 = new Lechero(2, "2020", "Pepa", Sexo.HEMBRA, "Cacereña", LocalDate.of(2022, 12, 25), Tipo.VACUNO, 300, 4);
		Crianza oveja1 = new Crianza(1, "2015", "Paquita", Sexo.HEMBRA, "Turca", LocalDate.of(2024, 1, 10), Tipo.BOVINO);
		Revision rev1 = new Revision("La clinica de Walid", LocalDate.of(2023, 12, 5), false);
		Revision rev2 = new Revision("Sergio y sus amigos", LocalDate.of(2021, 6, 5), true);
		Map<Integer, Animal> animales = new HashMap<Integer, Animal>();
		animales.put(cerdo1.getId(), cerdo1);
		animales.put(vaca1.getId(), vaca1);
		animales.put(oveja1.getId(), oveja1);
		
		
		animales.get(1).introducirRevision(rev1);
		animales.get(1).informacionRevision();
		System.out.println(animales.get(1));
		animales.get(3).introducirRevision(rev2);
		animales.get(3).informacionRevision();
		System.out.println(animales.get(2));
		((Crianza)animales.get(1)).añadirCrianza("2017", 14);
		((Crianza)animales.get(1)).añadirCrianza("2018", 12);
		((Crianza)animales.get(1)).mostrarCrianza();
	}

}
