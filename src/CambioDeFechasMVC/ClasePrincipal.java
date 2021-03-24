package CambioDeFechasMVC;

public class ClasePrincipal
{

	public static void main(String[] args)
	{
		//Se inician la clase modelo y la clase controlador
		/*Primero se crean los objetos*/
		ClaseVista Vista= new ClaseVista();
		ClaseModelo Modelo = new ClaseModelo();
		/*Ahora instanciamos un objeto de la clase controlador*/
		new ClaseControlador(Vista, Modelo);
	}

}
