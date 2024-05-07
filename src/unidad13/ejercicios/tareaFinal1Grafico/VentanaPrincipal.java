package unidad13.ejercicios.tareaFinal1Grafico;

import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
	
    public VentanaPrincipal() {
        super("Parque Movil");
        setLayout(new FlowLayout());
        Button bAlta =  new Button("Dar de alta"); 
        Button bTabla =  new Button("Mostrar tabla de los coches"); 
        Button bActualizar =  new Button("Actualizar base de datos"); 
        add(bAlta);
        add(bTabla);
        add(bActualizar);
        
        bAlta.addActionListener(e -> DarAlta.main(null)); // Una forma mucho más rápida de gestionar los eventos
        
        bTabla.addActionListener(e -> CrearTabla.main(null)); // Una forma mucho más rápida de gestionar los eventos
        
        bActualizar.addActionListener(e -> TareaFinal1Programa.actualizarBD()); // Una forma mucho más rápida de gestionar los eventos
        
        bAlta.setSize(100,100);
        bTabla.setSize(100,100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500,500);
       
    }

    public static void main(String[] args) {
        new VentanaPrincipal();
    }
    
}
