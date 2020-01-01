import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class n002 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> n00 = new ArrayList<Integer>();
        String cg = new String(); 
     //  cg = sc.nextLine();
     
        for(int i=101;i>0;i--)n00.add(i);  
      Collections.max(n00); 
        //n00.add(1);
        for(int number : n00) System.out.println(number+"\n==============");
        System.out.println("Hello World :: "+Collections.max(n00)); 





    }
}