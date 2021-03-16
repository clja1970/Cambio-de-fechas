package es.studium.CambioDeFechas;

import java.util.Scanner;

public class FechasCambiadas
{
	public static void main(String[] args)
	{
		String fecha ="";
		System.out.println("Introduce una fecha europea ");
		Scanner teclado = new Scanner(System.in);
		fecha=teclado.next();
		String[] arrayFecha = fecha.split("/");
		System.out.println("La fecha introducida en formato Americano es: "+arrayFecha[2]+"-"+arrayFecha[1]+"-"+arrayFecha[0]);
		teclado.close();
	}
}
