import java.util.Scanner;

class PersonalDetails{

    public static void main(String [] args){

        String name, address;
        int age, ph_number;

        Scanner Scan = new Scanner(System.in);


        System.out.println("Enter your name: ");
                name = Scan.nextLine();
        System.out.println("Enter your address: ");
                address = Scan.nextLine();
        System.out.println("Enter your age: ");
                age = Scan.nextInt();
        System.out.println("Enter your phone number: ");
                ph_number = Scan.nextInt();


       System.out.println("Name : " + name +"\nAddress: "+address+"\nAge: "+age+"\nPhone number: "+ ph_number);


    }
}