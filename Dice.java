import java.util.Random;
 class Dice {

    public  int[]  fa =  new int[7];

    public int roll(){
    Random r = new Random();
    int ff =  r.nextInt(6)+1;
    fa[ff]+=1;
    return ff;
    }
    
}