package pruebas.evaluacion2.prueba1.ejercicio1;

public class ProgramaMacs {

	public static void main(String[] args) {

		String[] macs = declaraMacs();
		Marcas [] fabricantes = identificarFabricante(macs);
		String[] hosts = new String[macs.length];
		int nMacsDell=0;
		int nMacsCisco=0;
		int nMacsHp=0;
		nMacsDell=nMacsMarcas(Marcas.Dell,fabricantes);
		nMacsCisco=nMacsMarcas(Marcas.CISCO,fabricantes);
		nMacsHp=nMacsMarcas(Marcas.HP,fabricantes);
		System.out.println("MAC Y SUS FABRICANTES");
		mostraFabricantes(fabricantes,macs,nMacsCisco,nMacsDell,nMacsHp);
		hosts = frabicarHosts(macs);
		System.out.println(" ");
		System.out.println("MACS Y SUS HOSTS CREADOS");
		mostrarMacMasHost(macs,hosts);
		

	}

	private static void mostrarMacMasHost(String[] macs, String[] hosts) {
		for (int i = 0; i < hosts.length; i++) {
			System.out.println("Mac: " + macs[i] + " Host" + hosts[i]);
		}
	}

	private static String[] frabicarHosts(String[] macs) {
		String[] hosts = new String[macs.length];
		//Array que contiene las macs divididas en conjuntos de 2 digitos
		String [] macsPartidos = new String[7];
		for (int i = 0; i < macs.length; i++) {
			macsPartidos=macs[i].split("-");
			if (macsPartidos.length==6) {
				hosts[i]=macsPartidos[0]+"-"+macsPartidos[1]+"-"+macsPartidos[2]+"-FF"+"-FE-"+macsPartidos[3]+"-"+macsPartidos[4]+"-"+macsPartidos[5];
			}else {
				hosts[i]=macsPartidos[0]+"-"+macsPartidos[1]+"-"+macsPartidos[2]+"-FF"+"-FE-"+macsPartidos[3]+"-"+macsPartidos[4]+"-"+macsPartidos[5]+"-"+macsPartidos[6];
			}
		}
		
		return hosts;
	}

	private static String[] declaraMacs() {
		String[] macs = new String[] { "00-0C-29-DC-8E-F2", "00-14-22-D8-CF-DB-C5", "00-0B-0E-32-0E-81-72",
		"00-14-22-1C-BE-35-AE", "00-14-22-7F-D4-31-EA", "00-0B-0E-31-EA-4B-20", "00-14-22-15-D3-97-2C",
		"00-0C-29-BF-09-53-33", "00-0C-29-0A-FB-14-D7", "00-0C-29-49-C2-94-F9", "00-0B-0E-41-EA-BE-64",
		"00-14-22-8F-0F-14-BE", "00-14-22-10-83-A5-61", "00-0B-0E-D8-8D-65-5B", "00-0C-29-60-B5-FF-9E",
		"00-0C-29-A4-75-CC-12", "00-14-22-3E-0A-FF-FF", "00-14-22-48-E0-CE-08", "00-0B-0E-ED-BA-BE-0B",
		"00-0B-0E-7A-97-1C-D5", "00-0B-0E-90-E6-81-70", "00-14-22-09-24-80-07", "00-0C-29-42-FA-03-45",
		"00-0B-0E-32-E9-4D-19", "00-14-22-7D-6B-BE-5F", "00-0C-29-63-8A-50-BD", "00-14-22-D1-CE-6A-7C",
		"00-14-22-3C-CF-B4-17", "00-14-22-5A-BD-CB-57", "00-14-22-B2-D2-40-65" };

		return macs;
	}

	private static int nMacsMarcas(Marcas marca, Marcas[] fabricantes) {
		int contador=0;
		for (int i = 0; i < fabricantes.length; i++) {
			if (fabricantes[i]==marca) {
				contador++;
			}
		}
		return contador;
	}

	private static void mostraFabricantes(Marcas[] fabricantes, String[] macs, int nMacsCisco, int nMacsDell, int nMacsHp) {
		for (int i = 0; i < macs.length; i++) {
			System.out.println("Mac: " + macs[i] + " Fabricante: " + fabricantes[i]);
		}
		System.out.println("Macs totales de Dell: " + nMacsDell);
		System.out.println("Macs totales de Cisco: " + nMacsCisco);
		System.out.println("Macs totales de HP: " + nMacsHp);
	}

	private static Marcas[] identificarFabricante(String[] macs) {
		//Array que contiene las macs divididas en conjuntos de 2 digitos
		String [] macsFabricantes = new String[3];
		Marcas [] fabricantes = new Marcas[macs.length];
		for (int i = 0; i < macs.length; i++) {
			macsFabricantes=macs[i].split("-");
			if (macsFabricantes[0].equals("00")&macsFabricantes[1].equals("0C")&macsFabricantes[2].equals("29")) {
				fabricantes[i]=Marcas.Dell;
			}else if (macsFabricantes[0].equals("00")&macsFabricantes[1].equals("0B")&macsFabricantes[2].equals("0E")) {
				fabricantes[i]=Marcas.CISCO;
			}else if (macsFabricantes[0].equals("00")&macsFabricantes[1].equals("14")&macsFabricantes[2].equals("22")) {
				fabricantes[i]=Marcas.HP;
			}
			
		}
		return fabricantes;
	}

}
