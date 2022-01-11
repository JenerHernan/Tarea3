package main;

public class Ejercicio5 {
	public static void main(String[] args) {
		int a = 1 , b = 2, c = 3, d = 4;
		b = c;
		c = a;
		a = d;
		d = b;
		System.out.println("El valor de a es " + a);
		System.out.println("El valor de b es " + b);
		System.out.println("El valor de c es " + c);
		System.out.println("El valor de d es " + d);
	}
}
