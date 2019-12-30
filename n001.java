import java.util.*;
class n001{

    public static void main(String[] args){

        char[] n = new char[10];
        n[0]='n';  

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.clear();
        System.out.println(cars.size());
        System.out.println(cars.get(0));
        cars.set(0, "AAAAAAAAAAA");
        cars.set(1, "BBBBBBBBBBB");
        cars.set(1, "BBBBBBBBBBB");
        cars.set(1, "BBBBBBBBBBB");
        for(String p :cars)System.out.println(p);

            




    }





}