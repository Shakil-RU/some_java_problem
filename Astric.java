public class Astric {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,50,40,32};
        for(int i=0;i<num.length;i++){
            if(num[i]>=40){
                for(int j=1;j<=40;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
                for(int j=1;j<=num[i];j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
