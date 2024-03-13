import java.util.*;
public class Setithbit {
    public static int Setithbit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        System.out.println(Setithbit(10, 02));
    }
}
