package es.studium.CambioDeFechas;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Scanner;

public class Fechas_Cambiadas2  implements ActionListener, WindowListener
{
	Frame ventana = new Frame();
	Label lblFecha = new Label("Introduce una fecha Europea dd/mm/yyyy:");
	TextField txtFecha = new TextField(8);
	Button btnTransformacion = new Button("Transformación");
	TextField txtFechaTransformada= new TextField(8);
	Label lblAmericana =new Label ("Fecha Americana");
	
	public Fechas_Cambiadas2()
	{
		ventana.setLayout(new FlowLayout());
		ventana.setBackground(Color.getHSBColor(73,210,77));
		ventana.add(lblFecha);
		ventana.add(txtFecha);
		ventana.add(btnTransformacion);
		ventana.add(txtFechaTransformada);
		ventana.add(lblAmericana);
		ventana.setSize(250,150);
		ventana.setResizable(true);
		ventana.setLocationRelativeTo(null);
		ventana.addWindowListener(this);
		ventana.requestFocus();
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		
		//Frame ventana = new Frame();
		//Label lblFecha = new Label("Introduce una fecha Europea dd/mm/yyyy:");
		//TextField txtFecha = new TextField(8);
		//Button btnTransformacion = new Button("Transformación");
		
		//String fecha ="";
		//System.out.println("Introduce una fecha europea ");
		//Scanner teclado = new Scanner(System.in);
		//fecha=teclado.next();
		//String[] arrayFecha = fecha.split("/");
		//System.out.println("La fecha introducida en formato Americano es: "+arrayFecha[2]+"-"+arrayFecha[1]+"-"+arrayFecha[0]);
		//teclado.close();
		new Fechas_Cambiadas2();
	}

	@Override
	public void windowActivated(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}
}