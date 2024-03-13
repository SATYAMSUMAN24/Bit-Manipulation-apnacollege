// Count Set Bits in a Number
import java.util.*;
public class countSetBits {
    public static int CountsetBits(int n) {
       int count=0;
       while(n>0) {  //check our lsb
        if((n&1)!=0) {
            count++;
        }
        return count;
       }
    }
    public static void main(String[] args) {
        System.out.println(CountsetBits(5));
    }
}
