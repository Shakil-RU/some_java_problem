import java.util.Scanner;

public class StaticMethod {

    public static double cubeVolume(double h){
        double result=h*h*h;
        return result;

    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double h=in.nextDouble();
        double ans=cubeVolume(h);
        System.out.println(ans);

    }
}
