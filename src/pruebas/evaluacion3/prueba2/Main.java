package pruebas.evaluacion3.prueba2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


import unidad12.ConexionBD;
import unidad13.ejemplos.menu.Tabla;

public class Main {
	static String url = ConexionBD.obtenerURLClase();
	static String usuario = ConexionBD.obtenerUsuario();
	static String password = ConexionBD.obtenerContraseña();
	static ArrayList<Certificado> listaCertificados = new ArrayList<Certificado>();
	public static void main(String[] args) {
		leerFichero();
		contrastarBD();
		baseOJ();
		//empresasCertificadorasTabla();
		tablaBaseRelacional();
		tablaBaseOJ();
		
	}

	private static void tablaBaseOJ() {
		ArrayList<Certificado> residenciales = ODBResidencial.extraerCertificados();
		String [] cabecera = new String[]{"Id certificado","Propietario","Direccion","Tipo de propiedad"
				,"Clasificacion energetica","Fecha de expedición","Empresa certificadora","Codigo Tecnico"};
		String[][] certificadosArray = new String[residenciales.size()][cabecera.length];
		certificadosArray=añadirCertificado(residenciales,certificadosArray);
		new Tabla(certificadosArray,cabecera,"Certificados Energeticos Residenciales").setVisible(true);
	}

	private static void tablaBaseRelacional() {
		CertificadosDAO CD = new CertificadosDAO(url, usuario, password);
		ArrayList<Certificado> certificados = CD.extraerLista();
		String [] cabecera = new String[]{"Id certificado","Propietario","Direccion","Tipo de propiedad"
				,"Clasificacion energetica","Fecha de expedición","Empresa certificadora","Codigo Tecnico"};
		String[][] certificadosArray = new String[certificados.size()][cabecera.length];
		certificadosArray=añadirCertificado(certificados,certificadosArray);
		new Tabla(certificadosArray,cabecera,"Certificados Energeticos").setVisible(true);
	}
	
	public static String[][] añadirCertificado(List<Certificado> certificados, String[][] certificadosArray) {
		int i=0;
		for (Certificado certificado : certificados) {
			certificadosArray[i][0] = certificado.getIdCertificado();
			certificadosArray[i][1] = certificado.getPropietario();
			certificadosArray[i][2] = certificado.getDireccion();
			certificadosArray[i][3] = certificado.getTipoDePropiedad();
			certificadosArray[i][4] = String.valueOf(certificado.getClasificacionEnergetica());
			certificadosArray[i][5] = certificado.getFechaExpedicion();
			certificadosArray[i][6] = certificado.getEmpresaCertificadora();
			certificadosArray[i][7] = certificado.getCodigoTecnico();
			i++;
		}
		return certificadosArray;
	}

	private static void empresasCertificadorasTabla() {
		CertificadosDAO CD = new CertificadosDAO(url, usuario, password);
		CD.crearTablaEmpresas();
		HashSet<String> empresas = new HashSet<String>();
		for (Certificado certificado : listaCertificados) {
			empresas.add(certificado.getEmpresaCertificadora());
		}
		for (String empresa : empresas) {
			CD.aniadirATablaEmpresa(empresa);
		}
		
	}

	private static void baseOJ() {
		ArrayList<Certificado> residenciales = new ArrayList<Certificado>();
		for (Certificado certificado : listaCertificados) {
			if (certificado.getTipoDePropiedad().equals("Residencial")) {
				residenciales.add(certificado);
			}
		}
		ODBResidencial.crearBDOJ(residenciales);
	}

	private static void leerFichero() {
		ArrayList<String> lineasCertificados = new ArrayList<String>();
		try {
			lineasCertificados = (ArrayList<String>) Files.readAllLines(
								Paths.get("ficheros/pruebas/certificados/certificadosEnergeticos.txt")
									,StandardCharsets.UTF_8);
			int contador = 0;
			for (String lineaCertificado : lineasCertificados) {
				if (contador > 0) {
					String[] datos = lineaCertificado.split(";");
					char clasificacion = datos[4].charAt(0);
					Certificado certificado = new Certificado(datos[0],datos[1],datos[2],datos[3],clasificacion,datos[5],datos[6],datos[7]);
					listaCertificados.add(certificado);
				}
				contador++;
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void contrastarBD() {
		CertificadosDAO CD = new CertificadosDAO(url, usuario, password);
		ArrayList<Certificado> certificados = CD.extraerLista();
		for (Certificado certificadoB : certificados) {
			boolean encontrado = false;
			for (Certificado certificadoF : listaCertificados) {
				if (certificadoB.getIdCertificado().equals(certificadoF.getIdCertificado())) {
					encontrado = true;
					if (!certificadoB.getPropietario().equals(certificadoF.getPropietario())) {
						CD.update(certificadoB.getIdCertificado(),"propietario",certificadoF.getPropietario());
					}
					if (!certificadoB.getDireccion().equals(certificadoF.getDireccion())) {
						CD.update(certificadoB.getIdCertificado(),"direccion",certificadoF.getDireccion());
					}
					if (!certificadoB.getTipoDePropiedad().equals(certificadoF.getTipoDePropiedad())) {
						CD.update(certificadoB.getIdCertificado(),"tipo_de_propiedad",certificadoF.getTipoDePropiedad());
					}
					if (certificadoB.getClasificacionEnergetica()!=certificadoF.getClasificacionEnergetica()) {
						CD.update(certificadoB.getIdCertificado(),"clasificacion_energetica",String.valueOf(certificadoF.getClasificacionEnergetica()));
					}
					if (certificadoB.getFechaExpedicion()!=certificadoF.getFechaExpedicion()) {
						CD.updateF(certificadoB.getIdCertificado(),"fecha_de_expedicion",Date.valueOf(certificadoF.getFechaExpedicion()));
					}
					if (certificadoB.getEmpresaCertificadora()!=certificadoF.getEmpresaCertificadora()) {
						CD.update(certificadoB.getIdCertificado(),"empresa_certificadora",certificadoF.getEmpresaCertificadora());
					}
					if (certificadoB.getCodigoTecnico()!=certificadoF.getCodigoTecnico()) {
						CD.update(certificadoB.getIdCertificado(),"codigo_tecnico",certificadoF.getCodigoTecnico());
					}
				}
			}
			if (!encontrado) {
				CD.borrar(certificadoB);
				
			}
		}
		
		for (Certificado certificadoF : listaCertificados) {
			boolean encontrado = false;
			for (Certificado certificadoB : certificados) {
				if (certificadoF.getIdCertificado().equals(certificadoB.getIdCertificado())) {
					encontrado=true;
					break;
				}
			}
			if (!encontrado) {
				System.out.println("Creado");
				CD.crearCertificado(certificadoF);
			}
		}
		
		
	}
	
}
