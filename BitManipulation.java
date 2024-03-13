// check if a number is odd or even
import java.util.*;
public class BitManipulation {
    public static void oddorEven(int n){
        int bitMask = 1;
        if((n & bitMask)== 0){
        
            // even number
        System.out.println("even number");
       } else{
        System.out.println("odd number");
       }
    }
       public static void main(String args[]){
        oddorEven(3);
    }
}

