import java.util.Scanner;

public class LoginFrom {
    private String actualName="";
    private String actualPassword="";
    private String enteredName="";
    private String enteredPassword="";
    private  boolean loggedIn=false;

    public LoginFrom(String userName,String Password){
        actualName=userName;
        actualPassword=Password;
    }
    public void input(String userName,String Password){
        enteredName=userName;
        enteredPassword=Password;

    }
    public void click(String button){
        if(button.equals("Submit")){
            if(enteredName.equals(actualName) && enteredPassword.equals(actualPassword)){
                loggedIn=true;
            }
            else{
                loggedIn=false;
            }
        }
    }

    public boolean loggedIn(){
        return loggedIn;
    }

    public static void main(String[] args) {
        LoginFrom l=new LoginFrom("Shakil445","667");
        Scanner in=new Scanner(System.in);

        System.out.print("enter user name: ");
        String userName=in.next();

        System.out.print("enter password: ");
        String Password=in.next();

        l.input(userName,Password);

        l.click("Submit");

        boolean ok= l.loggedIn();
        if(ok==true){
            System.out.println("Succesfully log in ");
        }
        else{
            System.out.println("something went wrong ");
        }





    }

}
