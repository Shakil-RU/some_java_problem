import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList_practice_2_reverseOrder {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        for(int i= 0; i<=10;i++){
            number.add(input.nextInt());
        }
        System.out.println(number);
        Collections.reverse(number);
        System.out.println(number);
    }
}
