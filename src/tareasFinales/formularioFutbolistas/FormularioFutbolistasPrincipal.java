package tareasFinales.formularioFutbolistas;

import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import unidad9.ejemplos.comparaciones.comparator.Jugador;

public class FormularioFutbolistasPrincipal extends JFrame implements ActionListener {
		    private JTextField campoNombre;
		    private JTextField campoApellido;
		    private JTextField campoEquipoFav;
		    private JCheckBox edadCheck;
		    private JRadioButton masculinoRadio;
		    private JRadioButton femeninoRadio;
		    private JRadioButton noBinarioRadio;
		    private JRadioButton diestroRadio;
		    private JRadioButton zurdoRadio;
		    private JRadioButton ambiRadio;
		    private JComboBox<String> posicionSelect;
		    private JButton botonAceptar;
		    private JButton botonFichero;
		    private JButton botonTabla;
		    private JButton botonAbrirF;
		    private ButtonGroup grupoGenero;
		    private ButtonGroup grupoPierna;
		    private JTextField campoJugador;

		    public FormularioFutbolistasPrincipal() {
		        super("Inscripción de futbolista");
		        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        
		        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

		        JPanel panelNombre = new JPanel();
		        panelNombre.setLayout(new FlowLayout(FlowLayout.LEFT));
		        panelNombre.add(new JLabel("Nombre:"));
		        campoNombre = new JTextField(10);
		        panelNombre.add(campoNombre);
		        add(panelNombre);
		        
		        JPanel panelApellido = new JPanel();
		        panelApellido.setLayout(new FlowLayout(FlowLayout.LEFT));
		        panelApellido.add(new JLabel("Apellido:"));
		        campoApellido = new JTextField(10);
		        panelApellido.add(campoApellido);
		        add(panelApellido);
		        
		        JPanel panelEquipoFav = new JPanel();
		        panelEquipoFav.setLayout(new FlowLayout(FlowLayout.LEFT));
		        panelEquipoFav.add(new JLabel("Equipo favorito:"));
		        campoEquipoFav = new JTextField(10);
		        panelEquipoFav.add(campoEquipoFav);
		        add(panelEquipoFav);

		        JPanel mayoriaEdadPanel = new JPanel();
		        mayoriaEdadPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		        edadCheck = new JCheckBox("Mayoría de edad");
		        mayoriaEdadPanel.add(edadCheck);
		        add(mayoriaEdadPanel);

		        JPanel panelGenero = new JPanel();
		        panelGenero.setLayout(new FlowLayout(FlowLayout.LEFT));
		        masculinoRadio = new JRadioButton("Masculino");
		        femeninoRadio = new JRadioButton("Femenino");
		        noBinarioRadio = new JRadioButton("No binario");
		        grupoGenero = new ButtonGroup();
		        grupoGenero.add(masculinoRadio);
		        grupoGenero.add(femeninoRadio);
		        grupoGenero.add(noBinarioRadio);
		        panelGenero.add(masculinoRadio);
		        panelGenero.add(femeninoRadio);
		        panelGenero.add(noBinarioRadio);
		        add(panelGenero);
		        
		        JPanel panelPierna = new JPanel();
		        panelPierna.setLayout(new FlowLayout(FlowLayout.LEFT));
		        diestroRadio = new JRadioButton("Diestro");
		        zurdoRadio = new JRadioButton("Zurdo");
		        ambiRadio = new JRadioButton("Ambidiestro");
		        grupoPierna = new ButtonGroup();
		        grupoPierna.add(diestroRadio);
		        grupoPierna.add(zurdoRadio);
		        grupoPierna.add(ambiRadio);
		        panelPierna.add(diestroRadio);
		        panelPierna.add(zurdoRadio);
		        panelPierna.add(ambiRadio);
		        add(panelPierna);
		        
		        JPanel posicionPanel = new JPanel();
		        posicionPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		        posicionPanel.add(new JLabel("Posición"));
		        posicionSelect = new JComboBox<>(new String[]{"Delantero", "Extremo", "Centrocampista", "Pivote", "Central", "Lateral", "Portero"});
		        posicionPanel.add(posicionSelect);
		        add(posicionPanel);
		        
		        JPanel panelJugador = new JPanel();
		        panelJugador.setLayout(new FlowLayout(FlowLayout.LEFT));
		        panelJugador.add(new JLabel("Jugador favorito:"));
		        campoJugador = new JTextField(10);
		        panelJugador.add(campoJugador);
		        add(panelJugador);
		        
		        botonAceptar = new JButton("Inscribir");
		        botonAceptar.addActionListener(this);
		        botonFichero = new JButton("Escribir fichero");
		        botonFichero.addActionListener(e -> escribirFichero());
		        botonTabla = new JButton("Tabla");
		        botonTabla.addActionListener(e -> crearTabla()); 
		        botonAbrirF = new JButton("Abrir fichero");
		        botonAbrirF.addActionListener(e -> abrirFichero());
		        JPanel botonPanel = new JPanel();
		        botonPanel.add(botonAceptar);
		        botonPanel.add(botonFichero);
		        botonPanel.add(botonTabla);
		        botonPanel.add(botonAbrirF);
		        add(botonPanel);
		        
		        

		        pack();
		        setLocationRelativeTo(null);
		        setVisible(true);
		    }

		    private void abrirFichero() {
		    	FicherosFutbolista.abrirFichero();
			}

			private void crearTabla() {
		    	BaseDatosFutbolista.mostrarTabla();
			}

			private void escribirFichero() {
				ArrayList<Futbolista> futbolistas = BaseDatosFutbolista.extraerInformacion();
				FicherosFutbolista.escribirFutbolistas(futbolistas);
				JOptionPane.showMessageDialog(this, "Fichero escrito correctamente");
		    }

			@Override
		    public void actionPerformed(ActionEvent e) {
		        String nombre = campoNombre.getText();
		        String apellido = campoApellido.getText();
		        String equipo = campoEquipoFav.getText();
		        boolean anios18 = edadCheck.isSelected();
		        String jugadorFav = campoJugador.getText();
		        
		        String genero = "No especificado";
		        if (masculinoRadio.isSelected()) {
		        	genero = "Masculino";
		        } else if (femeninoRadio.isSelected()) {
		        	genero = "Femenino";
		        } else if (noBinarioRadio.isSelected()) {
		        	genero = "No binario";
		        }
		        
		        String pierna = "";
		        if (diestroRadio.isSelected()) {
		        	pierna = "Diestro";
		        } else if (zurdoRadio.isSelected()) {
		        	pierna = "Zurdo";
		        } else if (ambiRadio.isSelected()) {
		        	pierna = "Ambidiestro";
		        }
		        
		        String Posicion = (String) posicionSelect.getSelectedItem();
		        
		        if (nombre.equals("")|pierna.equals("")) {
					JOptionPane.showMessageDialog(this, "Error el campo nombre y pierna buena"
							+ " deben ser especificados");
				}else {
					Futbolista futbolista = new Futbolista(nombre, apellido, equipo, anios18, jugadorFav, genero, pierna, Posicion);
					BaseDatosFutbolista.inscribirJugador(futbolista);
					JOptionPane.showMessageDialog(this, "Futbolista inscrito con exito");
				}
		    }



			public static void main(String[] args) {
		        new FormularioFutbolistasPrincipal();
		  }
}
	


