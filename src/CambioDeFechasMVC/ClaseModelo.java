package CambioDeFechasMVC;

public class ClaseModelo
{
	public void Calcular (ClaseVista objVista)

	{	

		String txtFechaTransformada;


		txtFechaTransformada=objVista.txtFecha.getText();
		try
		{
			if (objVista.txtFecha.getText().length() >0)

			{
				String[] arrayFecha = objVista.txtFecha.getText().split("/");
				objVista.txtFechaTransformada.setText(arrayFecha[2]+"/"+arrayFecha[1]+"/"+arrayFecha[0]);

			}
			else 
			{
				String[] arrayFecha = objVista.txtFechaTransformada.getText().split("/");
				objVista.txtFecha.setText(arrayFecha[2]+"/"+arrayFecha[1]+"/"+arrayFecha[0]);

			}
		}
		catch (ArrayIndexOutOfBoundsException error)
		{
			objVista.txtFecha.setText("");
		}

	}
}

