package CambioDeFechasMVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ClaseControlador implements ActionListener, WindowListener
{/*Objetos a declarar*/
	 ClaseVista objVista = null;
	 ClaseModelo objModelo = null;
	 
	 /*Creaión de la función o método*/
	 public ClaseControlador(ClaseVista objVista,ClaseModelo objModelo) 
	 {
		 this.objVista= objVista;
		 this.objModelo= objModelo;
		 
		 /*Ahora los listener o escuchadores*/
		 objVista.btnTransformacion.addActionListener(this);
		 objVista.ventana.addWindowListener(this);
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
		System.exit(0);
		
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
		objModelo.Calcular(objVista);
		
	}
	 

}
