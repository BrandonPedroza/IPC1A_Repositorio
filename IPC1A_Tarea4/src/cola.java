
import java.util.LinkedList;

public class cola {    
	 //pila con metodo de cola
	public static void main (String args []){ 

		LinkedList cola= new LinkedList ();
    
       cola.addFirst(5);
       cola.addFirst(6);
       cola.addFirst(4);
       cola.addFirst(9);
       
       System.out.println(cola);
       
  LinkedList cola2= new LinkedList();
  
  
        cola2.add(cola.removeLast());
        cola2.add(cola.removeLast());
        cola2.add(cola.removeLast());
        cola2.add(cola.removeLast());
        
        System.out.println(cola2);
        cola2.removeLast();
        System.out.println(cola2);
	}    
    
}

