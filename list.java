
package code;

import java.util.ArrayList;


public class list {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> Number1 = new ArrayList<> ();
        ArrayList<Integer> Number2 = new ArrayList<> ();
        ArrayList<Integer> Number3 = new ArrayList<> ();
        
        Number1.add(10);
        Number1.add(20);
        Number1.add(30);
        Number1.add(40);
        Number1.add(50);
        
        System.out.println("Number1 "+Number1);
        
        
        Number2.add(1);
        Number2.add(2);
        Number2.add(3);
        Number2.add(4);
        Number2.add(5);
        
        
        System.out.println("Number2 "+Number2);
        
        Number3.addAll(Number1);
        
        System.out.println("Number3"+Number3);
        
      boolean result = Number1.equals(Number2);
        System.out.println("Cheek The Number1 and Number2 are same or Not same = :"+result);
        
           
       boolean b = Number1.equals(Number3);
        System.out.println("Cheek The Number1 and Number3 are same or Not same = :"+b);
    }
    
}
