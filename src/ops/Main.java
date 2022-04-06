package ops;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int opt = 0;
		
		do {
			mostrarMenu();
			opt = sc.nextInt();
			switch(opt) {
				case 1:
					int num1 = 0;
					int num2 = 0;
					
					System.out.println("Introduce un número: ");
					num1 = sc.nextInt();
					System.out.println("Introduce otro número: ");
					num2 = sc.nextInt();
					
					sumar2(num1, num2);
					break;
				case 2:
					System.out.println("Introduce un número: ");
					num1 = sc.nextInt();
					System.out.println("Introduce otro número: ");
					num2 = sc.nextInt();
					
					multiplicar2(num1, num2);
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
	
	public static void sumar2(int num1, int num2) {
		int resultado = num1 + num2;
		System.out.println("El resultado es " + resultado);
	}
	
	public static void multiplicar2(int num1, int num2) {
		int resultado = num1 * num2;
		System.out.println("El resultado es " + resultado);
	}
	
	public static void restar2(int num1, int num2) {
		int resultado = num1 - num2;
		System.out.println("El resultado es " + resultado);
	}
	
	public static void dividir2(int num1, int num2) {
		int resultado = num1 / num2;
		System.out.println("El resultado es " + resultado);
	}
}
