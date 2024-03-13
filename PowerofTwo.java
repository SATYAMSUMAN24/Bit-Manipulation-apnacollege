// check if a number is a power of 2 or not
import java.util.*;
public class PowerofTwo {
    public static boolean isPowerofTwo(int n){
        return(n&(n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(isPowerofTwo(8));
    }
}
