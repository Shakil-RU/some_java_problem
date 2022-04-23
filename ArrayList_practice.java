import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_practice {
    public static void main(String[] args) {
        ArrayList<Integer> number= new ArrayList<Integer>();
        Scanner Array = new Scanner(System.in);
        for(int i=0; i<=9; i++)
        {
            number.add(Array.nextInt());
        }
        int sum=0;
        for(int j=0;j<=9;j++){
          if(number.get(j)%2==0) {
              sum = sum - number.get(j);
          }
              else{
                  sum=sum+number.get(j);
              }
          }
        System.out.println(sum);

    }
}
