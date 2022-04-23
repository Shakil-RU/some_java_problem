import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Example_11_11 {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("/home/israil/IdeaProjects/lab/input.txt");
        ArrayList<String>value=new ArrayList<String>();

        try(Scanner in=new Scanner(file)){
            while(in.hasNextLine()){
                String s=in.nextLine();
                value.add(s);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        File f=new File("/home/israil/IdeaProjects/lab/output.txt");
        try(PrintWriter out=new PrintWriter(f)){
            for(int i=value.size()-1;i>=0;i--){
                out.println(value.get(i));
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

}