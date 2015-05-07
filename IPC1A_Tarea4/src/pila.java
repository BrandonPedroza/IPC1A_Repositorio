import java.util.Stack;

public class pila { 
     //cola con metodo de pila
public static void main (String args []){ 

Stack<Integer> pila= new Stack<Integer> (); 
int []k={8,2,3,4,5};

pila.push(k[0]); 
pila.push(k[1]); 
pila.push(k[2]); 
pila.push(k[3]); 
pila.push(k[4]); 
System.out.println(pila); 



pila.push(8); 
pila.push(2); 
pila.push(3); 
pila.push(4); 
pila.push(5); 
System.out.println(pila); 

Stack pila2= new Stack ();

pila2.push(pila.pop());
pila2.push(pila.pop());
pila2.push(pila.pop());
pila2.push(pila.pop());
pila2.push(pila.pop());

System.out.println(pila2); 
} 
} 
