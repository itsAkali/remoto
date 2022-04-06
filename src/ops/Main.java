package ops;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int opt = 0;
		int oper = 0;
		
		do {
			mostrarMenu();
			opt = sn.nextInt();
			switch(opt) {
				case 1:
					System.out.println("¿Con cuántos números vas a operar?");
					oper = sn.nextInt();
					int numeros[] = new int[oper];
					
					for (int i = 0; i < numeros.length; i++) {
						System.out.println("Introduce un número: ");
						numeros[i] = sn.nextInt();
					}
					sumar2(numeros);
					break;
				case 2:
					System.out.println("¿Con cuántos números vas a operar?");
					oper = sn.nextInt();
					int numerosMult[] = new int[oper];
					
					for (int i = 0; i < numerosMult.length; i++) {
						System.out.println("Introduce un número: ");
						numerosMult[i] = sn.nextInt();
					} 
					multiplicar2(numerosMult);
					break;
				case 3:
					System.out.println("Se saldrá del programa.");
					break;
			}
		} while(opt != 3);
	}

	public static void mostrarMenu() {
		System.out.println("------------------------------------");
		System.out.println("1. Método sumar2.");
		System.out.println("2. Método multiplicar2.");
		System.out.println("3. Salir.");
		System.out.println("------------------------------------");
	}
	
	public static void sumar2(int[] num) {
		int resultado = 0;
		for (int i = 0; i < num.length; i++) {
			resultado += num[i];
		}
		System.out.println("El resultado es " + resultado);
	}
	
	public static void multiplicar2(int[] num) {
		int resultado = 1;
		for (int i = 0; i < num.length; i++) {
			resultado *= num[i];
		}
		System.out.println("El resultado es " + resultado);
	}
}
