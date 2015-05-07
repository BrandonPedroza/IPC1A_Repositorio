import java.util.Scanner;


public class menu{
	public static void menu() {
	 	System.out.println("Ingrese el numero del programa que desea ejecutar");
        System.out.println("\t1. Rombo");
        System.out.println("\t2. Promedio de notas");
        System.out.println("\t3. Convertir la Hora");
        System.out.println("\t4. Hacer medidas de circulo, triangulo o cuadrado");
        System.out.println("\t5. Diferencia entre fechas");
        System.out.println("\t6. Calculadora");
        System.out.println("\t7. Tablas de multiplicar");
        System.out.println("\t8. Numero aleatorio");
        System.out.println("\t9. Conversión de numeros de arabigos a romanos");
        System.out.println("\t10. Piramide de numeros");
        System.out.println("\t11. Numero mayor o menor de la lista");
        System.out.println("\t12. Cadena de asteriscos");
        System.out.println("\t13. Encontrar la letra del abecedario");
        System.out.println("\t14. Cuadrado de asteriscos");
        System.out.println("\t15. Total de numeros primos en un rango");

}

	
	
		public static void rombo (){
				for(int i=1;i<5;i++){
					for(int j=5-i;j>0;j--)
						System.out.print(" ");
					for(int k=0;k<i;k++)
						System.out.print("*");
					for(int l=6-i;l<5;l++)
						System.out.print("*");
					System.out.println();}
				for(int x=5;x>0;x--){
						for(int y=1+x;y<6;y++)
							System.out.print(" ");
						for(int z=x;z>0;z--)
							System.out.print("*");
						for (int w=x-1;w>0;w--)
							System.out.print("*");
						System.out.println();
						}
			}
				
		public static void promedio (){
			int a=0,b=0,c=0,d=0,e=0,f=0,pr=0;
			Scanner s=new Scanner(System.in);
			System.out.println("Ingrese 1ra. nota:");
			a=s.nextInt();
			if(a>=0&&a<=100)System.out.println("Ingrese 2ra. nota:");
			else System.out.println("esa no es la nota");
			b=s.nextInt();
			if(b>=0&&b<=100)System.out.println("Ingrese 3ra. nota:");
			else System.out.println("esa no es la nota");
			c=s.nextInt();
			if(c>=0&&c<=100)System.out.println("Ingrese 4ra. nota:");
			else System.out.println("esa no es la nota");
			d=s.nextInt();
			if(d>=0&&d<=100)System.out.println("Ingrese 5ra. nota:");
			else System.out.println("esa no es la nota");
			e=s.nextInt();
			if(e>=0&&e<=100)System.out.println("Ingrese 6ra. nota:");
			else System.out.println("esa no es la nota");
			f=s.nextInt();
			if(f>=0&&f<=100);
			if(f>=0&&f<=100)pr=(a+b+c+d+e+f)/6;
			else System.out.println("esa no es la nota");
			if (pr>=90&&pr<=100)System.out.println("Su puntuación es A");
			else if (pr>=80&&pr<=89)System.out.println("Su puntuación es B");
			else if (pr>=70&&pr<=79)System.out.println("Su puntuación es C");
			else if (pr>=60&&pr<=69)System.out.println("Su puntuación es D");
			else if (pr>=0&&pr<=59)System.out.println("Su puntuación es E");
			else System.out.println("Las notas son incorrectas");
		}	
	
		public static void hora (){
			String c;
			int a=0,b=0;
			Scanner s=new Scanner(System.in);
			System.out.println("Ingrese hora");
			c=s.nextLine();
			a=Integer.parseInt( 
					c.substring(0, c.indexOf(":"))); 
					b=Integer.parseInt( 
					c.substring 
					(c.indexOf(":")+1,c.length() )); 
					
			if(b>=10&&b<59){
				    if (a==12) System.out.println("La hora es:"+a+": "+b+"PM");
					else if(a>=0&&a<10) System.out.println("La hora es: "+0+a+":"+b+"AM");
					else if(a>=10&&a<12) System.out.println("La hora es: "+a+":"+b+"AM");
					else if(a>12&&a<22) System.out.println("La hora es: "+0+(a-12)+":"+b+"PM");
					else if(a>=22&&a<=23) System.out.println("La hora es: "+(a-12)+":"+b+"PM");
					else if (a>24||b>59) System.out.println("Hora invalida");	
			}
			else{
				String d = null;
			
			if (b>=0&&b<10) {d="0"+b;
			if (a==12) System.out.println("La hora es: "+a+":"+d+"PM");
			else if(a>=0&&a<10) System.out.println("La hora es: "+0+a+":"+d+"AM");
			else if(a>=10&&a<12) System.out.println("La hora es: "+a+":"+d+"AM");
			else if(a>12&&a<22) System.out.println("La hora es: "+0+(a-12)+":"+d+"PM");
			else if(a>=22&&a<=23) System.out.println("La hora es: "+(a-12)+":"+d+"PM");
			else if (a>24||b>59) System.out.println("Hora invalida");
				}

			}
		}
	
		public static void figura(){
			double x=0;
			double PI = 3.141592654;
			try
			{ System.out.println("Escoja una opción");
			System.out.println("C. Círculo");
			System.out.println("U. Cuadrado");
			System.out.println("T. Triángulo");
			char forma=(char)System.in.read();
			System.in.skip(System.in.available());
			switch (forma)
			{
			case 'C': case 'c':
				Scanner s=new Scanner(System.in);
				System.out.println("Escriba un numero");
				x=s.nextDouble();
				System.out.println("El radio del circulo es:"+x+"m");
				System.out.println("El área del circulo es:"+(x*x*PI)+"m");
				System.out.println("El perimetro del circulo es:"+(2*x*PI)+"m");
				break;
			case 'U': case 'u':
				Scanner v=new Scanner(System.in);
				System.out.println("Escriba un numero");
				x=v.nextDouble();
				System.out.println("El lado del cuadrado es:"+x+"m");
				System.out.println("El área del  es:"+(x*x)+"m");
				System.out.println("El perimetro del cuadrado es:"+(6*x)+"m");
				break;
			case 'T': case 't':
				Scanner w=new Scanner(System.in);
				System.out.println("Escriba un numero");
				x=w.nextDouble();
				System.out.println("La altura del tringulo es:"+(((5^(1/2))/2)*x)+"m");
				System.out.println("El área del  es:"+(0.5*x*(((5^(1/2))/2)*x))+"m");
				System.out.println("El perimetro del triangulo es:"+(3*x)+"m^2");
				break;
				default:
					System.out.println("Opcion no valida");
					}
			}
			catch(Exception e)
			{}
		}
		
	
			public static void fecha (){
				String w;
				String x;
				int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0;
				Scanner s=new Scanner(System.in);
				System.out.println("Ingrese fecha 1:");
				w=s.nextLine();
				a=Integer.parseInt( 
						w.substring(0, w.indexOf("/"))); 
						b=Integer.parseInt( 
						w.substring(w.indexOf("/")+1,5)); 
						c=Integer.parseInt( 
						w.substring(w.indexOf("/")+4,w.length() )); 
				System.out.println("Ingrese fecha 2:");
				x=s.nextLine();
						d=Integer.parseInt( 
								x.substring(0, x.indexOf("/"))); 
								e=Integer.parseInt( 
								x.substring(x.indexOf("/")+1,5)); 
								f=Integer.parseInt( 
										x.substring 
										(x.indexOf("/")+4,x.length() ));
							
								if(a>0&&a<31&&b>0&&b<13&&c>0&&d>0&&d<31&&e>0&&e<13&&f>0) {
									if(a!=d&&a>d) g=a-d;
									else if(a!=d&&a<d) g=d-a;
									else if (a==d) g=a-d;
									if(b!=e&&b>e) h=b-e;
									else if(b!=e&&b<e) h=e-b;
									else if (b==e) h=b-e;
									if(c!=f&&c>f) i=c-f;
									else if(c!=f&&c<f) i=f-c;
									else if (c==f) i=f-c;
									
									System.out.println("La diferencia es:"+(g+30*h+365*i));
								}
										
								else
									System.out.println("Fechas incorrectas");	
			}
		
	public static void calculadora(){
				int a=0,b=0;
				Scanner s=new Scanner(System.in);
				System.out.println("ingrese 1er. valor:");
				a=s.nextInt();
				System.out.println("ingrese 2da. valor:");
				b=s.nextInt();
				try{
					System.out.println("Escoja la opción");
					System.out.println("S. suma");
					System.out.println("R. resta");
					System.out.println("M. multiplicacion");
					System.out.println("D. Division");
					char c=(char)System.in.read();
					System.in.skip(System.in.available());
				switch (c)
				{
				case 'S': case 's':
					System.out.println("La suma es:"+(a+b));
					break;
				case 'R': case 'r':
					System.out.println("La resta es:"+(a-b));
					break;
				case 'M': case 'm':
					System.out.println("La multiplicación es:"+(a*b));
					break;
				case 'D': case 'd':
					System.out.println("La división es:"+(a/b));
					break;
					default:
						System.out.println("Opcion no valida");
						}
				}
				catch(Exception e)
				{}
				}
	
			public static void tablas (){
				int a=0;
				Scanner s=new Scanner(System.in);
				System.out.println("ingrese un numero:");
				a=s.nextInt();
				if(a>=0&&a<11) 
					for(int i=10;i>=0;i--)
					System.out.println(a+"X"+i+"="+(a*i));
				else 	
					System.out.println("Número incorrecto");	
				
			}

			public static void aleatorio() {  
		          
				 String unidades[] =   
				        {"cero", "uno", "dos" ,"tres" ,"cuatro" ,"cinco" ,  
				            "seis" ,"siete" ,"ocho" ,"nueve","diez"};  
				        String dieces[] =   
				        {"once", "doce","trece","catorce", "quince",   
				            "dieciseis", "diecisiete", "dieciocho", "diecinueve"};  
				        String veintes[] =   
				            {"veintiuno", "veintidos", "veintitres","veinticuatro","veinticinco", "veintiseis",   
				                "veintisiete", "veintiocho", "veintinueve"};
				        String decenas[] =   
				        {"veinte", "treinta","cuarenta","cincuenta", "sesenta",  
				            "setenta", "ochenta", "noventa"};  
				                               
				        int a=0,b=0,c=0,uni=0,dec=0;
						Scanner s=new Scanner(System.in);
						System.out.println("Ingrese 2 numeros:");
						a=s.nextInt();
						b=s.nextInt();
						
						if(a>=0&&a<100) {
						if (b>0&&b<=100);
						}
							else 
							System.out.println("Limite incorrecto");
								
						c=(int)(Math.random()*(b-a)+a); 
						System.out.println("numero al azar: "+c); 
				          
				        if(c>=0 && c<11)  
				             System.out.print('\n'+unidades[c]);           
				        else if(c>10&&c<20)  
				            System.out.print('\n'+dieces[c-11]); 
				        else if(c>20&&c<30)  
				            System.out.print('\n'+veintes[c-21]);  
				         else if(c>29&&c<101){  
				            uni = c % 10;  
				            dec = c/10;  
				            if(uni == 0)  
				                System.out.print('\n'+decenas[dec-2]);                  
				            else  
				                System.out.print('\n'+decenas[dec-2]+ " y "+unidades[uni]);  
				        }  
				        else              
				            System.out.print("Numero incorrecto");
		  }      	
		
		
			public static void romanos(){
				int a=0,b=0,c=0,d=0,e=0;
				Scanner s=new Scanner(System.in);
				System.out.println("Ingrese numero a convertir: ");
				a=s.nextInt();
				System.out.println();
				
				b=(a/1000)%10;
				switch(b){
				case 1: System.out.print("M");
					break;
				case 2: System.out.print("MM");
					break;
				case 3: System.out.print("MMM");
					break;
				case 4: System.out.print("__\nIV");
					break;
				case 5: System.out.print("_\nV");
					break;
				case 6: System.out.print("__\nVI");
					break;
				case 7: System.out.print("__\nVII");
					break;
				case 8: System.out.print("__\nVIII");
					break;
				case 9: System.out.print("__\nIX");
					break;
			
				}
				c=(a/100)%10;
				switch (c){
				case 1: System.out.print("C");
					break;
				case 2: System.out.print("CC");
					break;
				case 3: System.out.print("CCC");
					break;
				case 4: System.out.print("CD");
					break;
				case 5: System.out.print("D");
					break;
				case 6: System.out.print("DC");
					break;
				case 7: System.out.print("DCC");
					break;
				case 8: System.out.print("DCCC");
					break;
				case 9: System.out.print("CM");
					break;
			
				}
				d=(a/10)%10;
				switch (d){
				case 1: System.out.print("X");
					break;
				case 2: System.out.print("XX");
					break;
				case 3: System.out.print("XXX");
					break;
				case 4: System.out.print("XL");
					break;
				case 5: System.out.print("L");
					break;
				case 6: System.out.print("LX");
					break;
				case 7: System.out.print("LXX");
					break;
				case 8: System.out.print("LXXX");
					break;
				case 9: System.out.print("XC");
					break;
				
					}
				e=(a)%10;
				switch (e){
				case 1: System.out.print("I");
					break;
				case 2: System.out.print("II");
					break;
				case 3: System.out.print("III");
					break;
				case 4: System.out.print("IV");
					break;
				case 5: System.out.print("V");
					break;
				case 6: System.out.print("VI");
					break;
				case 7: System.out.print("VII");
					break;
				case 8: System.out.print("VIII");
					break;
				case 9: System.out.print("IX");
					break;
				
				}System.out.print('\n');
			}
	
			
			public static void piramide (){
				int a=0;
				Scanner s=new Scanner(System.in);
				System.out.println("Ingrese numero: ");
				a=s.nextInt();
					for(int i=a;i>0;i--){
							for(int j=1+i;j<a+1;j++)
								System.out.print(" ");
							for(int k=i;k>0;k--){
								if (a>=0&&a<10) System.out.print((a-i+1)+" ");
							else if ((a-i+1)>0&&(a-i+1<10))
									System.out.print((a-i+1)+"   ");						
							else 
									System.out.print((a-i+1)+"  ");
							}
							System.out.println();		
			}
		}	
			
			
			public static void cadena(){
				 String oracion;
			     Scanner s=new Scanner(System.in);
			     System.out.println("Ingrese una palabra o oracion:");
			     oracion=s.nextLine();
			  
			     	String[] asteriscos = oracion.split("");
			     	for(int i = 0; i < asteriscos.length; i++) 
			     		System.out.print("*");
			     	System.out.println(" ");
			     	System.out.println(oracion);
			     	}
		
		public static void cuadrado (){
			int a=0;
			Scanner s=new Scanner(System.in);
			System.out.println("Ingrese un numero: ");
			a=s.nextInt();
				for(int i=0;i<a;i++){
			
				for(int j=0;j<a;j++){
					if(j==0||j==a-1||i==0||i==a-1){
					System.out.print("* ");
					}
					else					
					System.out.print("  ");
				}
				System.out.println();
			}
		}
		
		public static void sin(){
			System.out.println("No hay programa");
		}
		
		
		public static void main(String[] args) {
			menu();
			int selec=0;
			Scanner s=new Scanner(System.in);
			selec=s.nextInt();
				switch(selec){
				case 1: rombo();break;
				case 2: promedio();break;
				case 3: hora();break;
				case 4: figura();break;
				case 5: fecha();break;
				case 6: calculadora();break;
				case 7: tablas();break;
				case 8: aleatorio();break;
				case 9: romanos();break;
				case 10: piramide();break;
				case 11: sin();break;
				case 12: cadena();break;
				case 13: sin();break;
				case 14: cuadrado();break;
				case 15: sin();break;
				}
		}
}