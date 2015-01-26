package warmUp;

import java.util.Scanner;
public class raryup {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);    
       String password = "c";
       System.out.println("How many teacher do we have in this class?");
       System.out.println("A. Four\nB. Ten\nC. One\nD. Three");
       System.out.println("Enter your answer:");
       String guess = input.nextLine();
       
       if (guess.equals(password)) {
           System.out.println("Correct!");
        } else {
           System.out.println("Wrong!!");
        }
    }    
}


