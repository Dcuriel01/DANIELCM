package tareasFinales.certificadosEnergias;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import ejerciciosPropios.biblioteca.LibroDAO;
import unidad12.ConexionBD;


public class FormularioMain extends JFrame {
	    private JTextField textDireccion;
	    private JTextField textNombreEdificio;
	    private JTextField textMunicipio;
	    private JTextField textCPostal;
	    private JTextField textProvincia;
	    private JTextField textComunidadAutonoma;
	    private JTextField textZonaClimatica;
	    private JTextField textAñoConstruccion;
	    private JTextField textNormativa;
	    private JTextField textReferencias;
		static String url = ConexionBD.obtenerURLClase();
		static String usuario = ConexionBD.obtenerUsuario();
		static String password = ConexionBD.obtenerContraseña();
	  public FormularioMain() {
	        setTitle("Formulario energía");
	        setSize(500, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);
	        
	        JPanel panel = new JPanel();
	        panel.setLayout(new GridLayout(8, 2));
	        
	        panel.add(new JLabel("Nombre del edificio:"));
	        textNombreEdificio = new JTextField();
	        panel.add(textNombreEdificio);

	        panel.add(new JLabel("Direccion:"));
	        textDireccion = new JTextField();
	        panel.add(textDireccion);
	        
	        JPanel panelMunicipios = new JPanel();
	        panelMunicipios.setLayout(new GridLayout(1, 2));
	        
	        panelMunicipios.add(new JLabel("Municipio:"));
	        textMunicipio = new JTextField();
	        panelMunicipios.add(textMunicipio);
	        
	        panel.add(panelMunicipios);
	        
	        JPanel panelPostal = new JPanel();
	        panelPostal.setLayout(new GridLayout(1, 2));
	        
	        panelPostal.add(new JLabel("Codigo postal:"));
	        textCPostal= new JTextField();
	        panelPostal.add(textCPostal);
	        
	        panel.add(panelPostal);
	        
	        JPanel panelProvincia = new JPanel();
	        panelProvincia.setLayout(new GridLayout(1, 2));
	        
	        panelProvincia.add(new JLabel("Provincia:"));
	        textProvincia = new JTextField();
	        panelProvincia.add(textProvincia);
	        
	        panel.add(panelProvincia);
	        
	        JPanel panelComunidad = new JPanel();
	        panelComunidad.setLayout(new GridLayout(1, 2));
	        
	        panelComunidad.add(new JLabel("Comunidad autónoma:"));
	        textComunidadAutonoma= new JTextField();
	        panelComunidad.add(textComunidadAutonoma);
	        
	        panel.add(panelComunidad);
	        
	        JPanel panelZonaClimatica = new JPanel();
	        panelZonaClimatica.setLayout(new GridLayout(1, 2));
	        
	        panelZonaClimatica.add(new JLabel("Zona climatica:"));
	        textZonaClimatica = new JTextField();
	        panelZonaClimatica.add(textZonaClimatica);
	        
	        panel.add(panelZonaClimatica);
	        
	        JPanel panelAnioConstruccion = new JPanel();
	        panelAnioConstruccion.setLayout(new GridLayout(1, 2));
	        
	        panelAnioConstruccion.add(new JLabel("Año construcción:"));
	        textAñoConstruccion= new JTextField();
	        panelAnioConstruccion.add(textAñoConstruccion);
	        
	        panel.add(panelAnioConstruccion);
	        
	        panel.add(new JLabel("Normativa vigente:"));
	        textNormativa= new JTextField();
	        panel.add(textNormativa);
	        
	        panel.add(new JLabel("Referencia catastral:"));
	        textReferencias= new JTextField();
	        panel.add(textReferencias);
	        
	        JButton guardarDatosButton = new JButton("Enviar Formulario");
	        guardarDatosButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	registrarDatos();
	            	
	            	
	            }
	        });
	        
	        JButton reiniciarButton = new JButton("Reiniciar Formulario");
	        reiniciarButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	reiniciar();
	            }
	        });
	        
	        
	        panel.add(guardarDatosButton);
	        panel.add(reiniciarButton);
	        
	        add(panel);
	        
	    }
	
	
	
	
	
	
	protected void reiniciar() {
		textNombreEdificio.setText("");
		textDireccion.setText("");
		textMunicipio.setText("");
		textCPostal.setText("");
		textProvincia.setText("");
		textComunidadAutonoma.setText("");
		textZonaClimatica.setText("");
		textAñoConstruccion.setText("");
		textNormativa.setText(""); 
		textReferencias.setText("");
	}






	protected void registrarDatos() {
		
		boolean vacios = textNombreEdificio.getText().equals("")|textDireccion.getText().equals("")|textMunicipio.getText().equals("")
				|textCPostal.getText().equals("")|textProvincia.getText().equals("")|textComunidadAutonoma.getText().equals("")
				|textZonaClimatica.getText().equals("")|textAñoConstruccion.getText().equals("")|textNormativa.getText().equals("")|textReferencias.getText().equals("");
		if (vacios) {
			JOptionPane.showMessageDialog(this, "Algunos de los campos estan vacios");
		}else {
			boolean error = validaciones(textNombreEdificio.getText(),textDireccion.getText(),textMunicipio.getText(),
				textCPostal.getText(),textProvincia.getText(),textComunidadAutonoma.getText(),textAñoConstruccion.getText());
			if (error) {
				JOptionPane.showMessageDialog(this, "Error en algunos campos");
			}else {
				Edificio edificio = new Edificio(textNombreEdificio.getText(),textDireccion.getText(),textMunicipio.getText(), 
						textCPostal.getText(), textProvincia.getText(), textComunidadAutonoma.getText(),
						textZonaClimatica.getText(), textAñoConstruccion.getText(), textNormativa.getText(), textReferencias.getText());
				EdificioDao eD = new EdificioDao(url, usuario, password);
				eD.insertarProducto(edificio);
			}
			
		}
		
		
		
		
	}






	private boolean validaciones(String nombre, String direccion, String municipio, String cPostal, String provincia, String comunidad,String año) {
		boolean valNombre = nombre.matches("[A-Z].*");
		boolean valDireccion = direccion.matches("[A-Z].*");
		boolean valMunicipio = municipio.matches("[A-Z].*");
		boolean valCPostal = cPostal.matches("\\d{5}");
		boolean valProvincia = provincia.matches("[A-Z].*");
		boolean valComunidad = comunidad.matches("[A-Z].*");
		boolean valAnio = año.matches("\\d{4}");
		
		boolean error = !valNombre|!valDireccion|!valMunicipio|!valCPostal|!valProvincia|!valComunidad|valAnio;
		
		return error;
		
	}






	public static void main(String[] args) {
		 SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                new FormularioMain().setVisible(true);
	            }
	        });
	}

}
