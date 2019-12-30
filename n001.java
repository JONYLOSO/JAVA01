import java.util.*;

enum Level {
    LOW,
    MEDIUM,
    HIGH
  }

class n001{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] pp ={11,25,63,454,5,88,9,6,555};
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
    //  cars.add(sc.nextLine());
    //  cars.clear();
        System.out.println("===========================\n"+cars.size());
        System.out.println(cars.get(0));
        cars.set(0, "AAAAAAAAAAA");
        cars.set(1, "BBBBBBBBBBB");
        for(String p :cars)System.out.println(p);
        System.out.println("===========================");
        for(String ppp :cars)System.out.println(ppp);
        System.out.println("===========================");

        System.out.println(Level.LOW);
       
       
        /*
        try{
            int oo =10;
        }catch(Exception e){
            System.out.println("XXXXXX");
        }
        */


    }

}