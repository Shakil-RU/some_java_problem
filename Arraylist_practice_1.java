import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arraylist_practice_1 {
    public static void main(String[] args) {
        ArrayList<Integer> number=new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        for(int i=0;i<=9;i++) {
            number.add(input.nextInt());
        }
        System.out.println(number);
        Collections.sort(number);
        System.out.println(number);
        number.remove(0);
        System.out.println(number);
    }
}
