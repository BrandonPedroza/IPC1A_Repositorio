import java.util.Scanner;


public class Tarea3 {
	public static void main(String[]args){
		int n=0;
		Scanner s= new Scanner(System.in);
		System.out.println("Ingrese un número:");
		n=s.nextInt();
		if(n%2==0)
			System.out.println("El número es par");
		else 
			System.out.println("El número es impar");
	}

}
