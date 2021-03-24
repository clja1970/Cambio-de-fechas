package CambioDeFechasMVC;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JButton;

public class ClaseVista
{
	Frame ventana = new Frame();
	Label lblFecha = new Label(" Dame una fecha Europea");
	Label lblEuropea = new Label("dd/mm/yyyy:");
	TextField txtFecha = new TextField(8);
	JButton btnTransformacion = new JButton("Transformación");
	TextField txtFechaTransformada= new TextField(8);
	Label lblAmericana =new Label ("Fecha Americana");
	
	public ClaseVista()
	{
		ventana.setLayout(new FlowLayout());
		ventana.setBackground(Color.getHSBColor(73,210,77));
		ventana.add(lblFecha);
		ventana.add(lblEuropea);
		ventana.add(txtFecha);
		ventana.add(btnTransformacion);
		ventana.add(txtFechaTransformada);
		ventana.add(lblAmericana);
		
		ventana.setSize(200,190);

		ventana.setResizable(true);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
}
