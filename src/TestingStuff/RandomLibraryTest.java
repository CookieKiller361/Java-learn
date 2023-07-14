package TestingStuff;

import java.util.Random;
public class RandomLibraryTest {
    public static void main(String[] args) {
        Random random=new Random();
        int randomint=random.nextInt(20);
        System.out.println("Random int: "+randomint);
        double randomdouble=random.nextDouble(20);
        System.out.println("Random double: "+randomdouble);
        float randomfloat=random.nextFloat(20);
        System.out.println("Random float: "+randomfloat);
        boolean randomboolean=random.nextBoolean();
        System.out.println("Random boolean: "+randomboolean);
    }

}
