package com.senati.eti;
import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese numero........:");
		int n = sc.nextInt();

			
		String respuesta = "";
		//factorial es el acomulador 
		
		int i = 1,factorial = 1;
		if (n<=7)
		 while (i <=n) {
			factorial*= i; 
			respuesta = "El factorial es "+factorial;
			if (i<n)
				System.out.print(i +"x");
			else
				System.out.println(i + "=" + factorial);
			
			i++	;}
		else 
			respuesta=("El numero es superior a 7  ");
		
	
		
		System.out.println("" + respuesta);
		

	}

}
