package unidad7Ejemplos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class LeerDatosRadar extends JFrame {

    private JTextArea areaTexto;
    private String[] lineasTexto; // Array para almacenar las líneas de texto

    public LeerDatosRadar() {
        // Configurar la ventana
        setTitle("Radar de tramo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        // Crear un JTextArea
        areaTexto = new JTextArea();
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);

        // Crear un JScrollPane para el JTextArea
        JScrollPane scrollPane = new JScrollPane(areaTexto);

        // Crear un botón para obtener el texto ingresado
        JButton botonObtenerTexto = new JButton("Obtener resultado");
        botonObtenerTexto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener el texto ingresado y almacenarlo en el array
                String textoIngresado = areaTexto.getText();
                lineasTexto = textoIngresado.split("\n");

                // Mostrar el texto ingresado en un cuadro de diálogo
                StringBuilder mensaje = new StringBuilder("Texto ingresado:\n");
                for (String linea : lineasTexto) {
                    mensaje.append(linea).append("\n");
                }
                JOptionPane.showMessageDialog(LeerDatosRadar.this, mensaje.toString());
            }
        });

        // Configurar el diseño de la ventana
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(scrollPane);
        add(botonObtenerTexto);

        // Mostrar la ventana
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Crear la interfaz gráfica de usuario en el hilo de despacho de eventos
    	 new LeerDatosRadar();
    }
}

