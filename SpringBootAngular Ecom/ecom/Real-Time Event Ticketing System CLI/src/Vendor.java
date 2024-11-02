import java.util.InputMismatchException;
import java.util.Scanner;

public class Vendor {
    private static String vendorName;
    private static String vendorEmail;
    private static String vendorPassword;

    private String name;
    private String email;
    private String password;
    public Vendor(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public static String venderRegister(){
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("////////////////======================/////////////////");
            System.out.println("//////////////// Vendor Registration  /////////////////");
            System.out.println("");
            while (true){
                System.out.print("Name: ");
                vendorName = input.nextLine();
                if(vendorName.trim().isEmpty()){
                    System.out.println("Name cannot be empty");
                } else if (!vendorName.matches("[a-zA-Z\\s]+")) {
                    System.out.println("Name contains a letter");
                }else if(vendorName.length()<3){
                    System.out.println("Not a Valid Vendor Name");
                }else {
                    break;
                }
            }
            while(true){
                System.out.print("Email: ");
                vendorEmail = input.nextLine();
                if(vendorEmail.trim().isEmpty()){
                    System.out.println("Email cannot be empty");
                }else if(vendorEmail.length()<13){
                    System.out.println("Not a Valid Vendor Email");
                }else {
                    break;
                }
            }
            while(true){
                System.out.print("Password: ");
                vendorPassword = input.nextLine();
                if(vendorPassword.trim().isEmpty()){
                    System.out.println("Password cannot be empty");
                }
                else if(vendorPassword.length()<6){
                    System.out.println("Not a Valid Vendor Password");
                }
                else {
                    break;
                }
            }
        }catch(InputMismatchException e){

        }
        return vendorName;


    }


}
