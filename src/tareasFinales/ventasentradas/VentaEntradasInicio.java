package tareasFinales.ventasentradas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Tareas para los Alumnos
Calcular Precio:

Completar la lógica en el método calcularPrecio para determinar el precio de la entrada basada en si el usuario es abonado o no y si el tipo de precio es normal o reducido.
Comprar Entrada:

Completar la lógica en el método comprarEntrada para disminuir el número de localidades disponibles y actualizar las localidades restantes, además de mostrar mensajes apropiados al usuario.
Actualizar Localidades:

Completar la lógica en el método actualizarLocalidades para mostrar el número de localidades restantes basadas en la zona seleccionada.
Evaluación
Se evaluará la capacidad de los alumnos para completar la funcionalidad del programa, asegurar que el cálculo de precios y la actualización de localidades se realiza correctamente, y manejar adecuadamente los eventos de la interfaz gráfica.





 */
public class VentaEntradasInicio extends JFrame {
    private JComboBox<String> comboTipoEntrada;
    private JComboBox<String> comboTipoPrecio;
    private JCheckBox checkAbonado;
    private JTextField textPrecio;
    private JTextField textLocalidadesRestantes;
    private JTextField textNEntradas;
    
    private final int[] localidades = {200, 40, 400, 100};
    private final double[] preciosNormales = {25, 70, 20, 15.5};
    private final double[] preciosAbonados = {17.5, 40, 14, 10};
    private final String[] zonas = {"Principal", "Palco", "Central", "Lateral"};
    
    public VentaEntradasInicio() {
        setTitle("Venta de Entradas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2));
        
        panel.add(new JLabel("Tipo de Entrada:"));
        comboTipoEntrada = new JComboBox<>(zonas);
        panel.add(comboTipoEntrada);
        comboTipoEntrada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String zona = (String) comboTipoEntrada.getSelectedItem();
               calcularLocalizaciones(zona);
            }
        });
        
        panel.add(new JLabel("Tipo de Precio:"));
        comboTipoPrecio = new JComboBox<>(new String[]{"Normal", "Reducido"});
        panel.add(comboTipoPrecio);
        
        panel.add(new JLabel("Numero de entradas:"));
        textNEntradas = new JTextField();
        panel.add(textNEntradas);
        textNEntradas.setText("1");
        
        panel.add(new JLabel("Abonado:"));
        checkAbonado = new JCheckBox();
        panel.add(checkAbonado);
        
        panel.add(new JLabel("Precio:"));
        textPrecio = new JTextField();
        textPrecio.setEditable(false);
        panel.add(textPrecio);
        
        panel.add(new JLabel("Localidades Restantes:"));
        textLocalidadesRestantes = new JTextField();
        textLocalidadesRestantes.setEditable(false);
        panel.add(textLocalidadesRestantes);
        
        JButton calcularPrecioButton = new JButton("Calcular Precio");
        calcularPrecioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               calcularPrecio();
            }
        });
        panel.add(calcularPrecioButton);
        
        JButton comprarButton = new JButton("Comprar");
        comprarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comprarEntrada();
            }
        });
        panel.add(comprarButton);
        
        add(panel);
        
        calcularLocalizaciones("Principal");
    }
    
    private double calcularPrecio() {
     
    	String tipoEntrada = (String) comboTipoEntrada.getSelectedItem();
    	boolean abonado = checkAbonado.isSelected();
    	double precio = precioTipoEntrada(tipoEntrada,abonado);
    	int nEntradas = Integer.parseInt(textNEntradas.getText());
    	String reducido = (String) comboTipoPrecio.getSelectedItem();	
    	if (reducido.equals("Reducido")) {
			precio = precio - (precio*0.2);
		}
    	precio = precio*nEntradas;
    	textPrecio.setText(String.valueOf(precio)+"€");
    	calcularLocalizaciones(tipoEntrada);
    	return precio;
    }
    
    private double precioTipoEntrada(String tipoEntrada, boolean abonado) {
    	double precio;
    	String primeraZona = zonas[0];
    	String segundaZona = zonas[1];
    	String terceraZona = zonas[2];
    	if (primeraZona.equals(tipoEntrada)) {
    		if (abonado) {
				precio = preciosAbonados[0];
			}else {
				precio = preciosNormales[0];
			}
			
		}else if (segundaZona.equals(tipoEntrada)) {
			if (abonado) {
				precio = preciosAbonados[1];
			}else {
				precio = preciosNormales[1];
			}
			
		}else if (terceraZona.equals(tipoEntrada)) {
			if (abonado) {
				precio = preciosAbonados[1];
			}else {
				precio = preciosNormales[1];
			}
			
		}else {
			if (abonado) {
				precio = preciosAbonados[1];
			}else {
				precio = preciosNormales[1];
			}
		}
    	
		return precio;
	}

	private void comprarEntrada() {
		String tipoEntrada = (String) comboTipoEntrada.getSelectedItem();
    	boolean abonado = checkAbonado.isSelected();
    	int nEntradas = Integer.parseInt(textNEntradas.getText());
    	double precio = calcularPrecio();
    	String reducido = (String) comboTipoPrecio.getSelectedItem();
    	if (!calcularLocalidadesVacias(tipoEntrada,nEntradas)) {
    		JOptionPane.showMessageDialog(this, "Has comprado " + nEntradas +" entradas del tipo: " + tipoEntrada + " con un total de: " + precio + "€");
        	actualizarLocalidades(tipoEntrada,nEntradas);
        	calcularLocalizaciones(tipoEntrada);
		} else {
			JOptionPane.showMessageDialog(this, "Esa zona no tiene entradas disponibles");
		}
    	
	}
    
    private boolean calcularLocalidadesVacias(String tipoEntrada, int nEntradas) {
    	String primeraZona = zonas[0];
    	String segundaZona = zonas[1];
    	String terceraZona = zonas[2];
    	boolean aCero= false;
    	if (primeraZona.equals(tipoEntrada)) {
    		if (localidades[0]-nEntradas<=0) {
    			aCero= true;
			}
		}else if (segundaZona.equals(tipoEntrada)) {
			if (localidades[1]-nEntradas<=0) {
    			aCero= true;
			}
		}else if (terceraZona.equals(tipoEntrada)) {
			if (localidades[2]-nEntradas<=0) {
    			aCero= true;
			}
		}else {
			if (localidades[3]-nEntradas<=0) {
    			aCero= true;
			}
		}
    	return aCero;
    }

	private void calcularLocalizaciones(String tipoEntrada) {
    	String primeraZona = zonas[0];
    	String segundaZona = zonas[1];
    	String terceraZona = zonas[2];
    	if (primeraZona.equals(tipoEntrada)) {
    		textLocalidadesRestantes.setText(String.valueOf(localidades[0]));
		}else if (segundaZona.equals(tipoEntrada)) {
			textLocalidadesRestantes.setText(String.valueOf(localidades[1]));
		}else if (terceraZona.equals(tipoEntrada)) {
			textLocalidadesRestantes.setText(String.valueOf(localidades[2]));
		}else {
			textLocalidadesRestantes.setText(String.valueOf(localidades[3]));
		}
	}

	private void actualizarLocalidades(String tipoEntrada, int nEntradas) {
		String primeraZona = zonas[0];
    	String segundaZona = zonas[1];
    	String terceraZona = zonas[2];
    	if (primeraZona.equals(tipoEntrada)) {
    		localidades[0] = localidades[0]-nEntradas;
		}else if (segundaZona.equals(tipoEntrada)) {
			localidades[1] = localidades[1]-nEntradas;
		}else if (terceraZona.equals(tipoEntrada)) {
			localidades[2] = localidades[2]-nEntradas;
		}else {
			localidades[3] = localidades[3]-nEntradas;
		}
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentaEntradasInicio().setVisible(true);
            }
        });
    }
}
