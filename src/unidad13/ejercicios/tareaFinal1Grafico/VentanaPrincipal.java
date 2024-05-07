package unidad13.ejercicios.tareaFinal1Grafico;

import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
	
    public VentanaPrincipal() {
        super("Parque Movil");
        Gestion.recuperarLista();
        setLayout(new FlowLayout());
        Button bAlta =  new Button("Dar de alta"); 
        Button bTabla =  new Button("Mostrar tabla de los coches");
        Button bBaja =  new Button("Dar de baja"); 
        Button bKm =  new Button("Actualizar kilometraje"); 
        Button bInf =  new Button("Informacion de un coche"); 
        add(bAlta);
        add(bTabla);
        add(bBaja);
        add(bKm);
        add(bInf);
        
        bAlta.addActionListener(e -> DarAlta.main(null)); // Una forma mucho más rápida de gestionar los eventos
        
        bTabla.addActionListener(e -> CrearTabla.main(null)); // Una forma mucho más rápida de gestionar los eventos
        
        bBaja.addActionListener(e -> DarBaja.main(null)); // Una forma mucho más rápida de gestionar los eventos
        
        bKm.addActionListener(e -> CambiarKm.main(null)); // Una forma mucho más rápida de gestionar los eventos
        
        bInf.addActionListener(e -> BuscarInformacion.main(null)); // Una forma mucho más rápida de gestionar los eventos
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500,500);
       
    }

    public static void main(String[] args) {
        new VentanaPrincipal();
    }
    
}
