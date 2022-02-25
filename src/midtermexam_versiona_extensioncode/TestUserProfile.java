package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author nakamurasayaka
 */
public class TestUserProfile {

    public static void main(String[] args) {
       
       Scanner in = new Scanner(System.in);
       
       UserProfile[] profiles = new UserProfile[50]; 
       int numOfUser = 0;
       
       
       System.out.print("Enter your name :");
       String userName = in.next();
       System.out.println("Which genre do you like? Type the number 1 to 4");
       
       System.out.println("1. Comedy");
       System.out.println("2. Drama");
       System.out.println("3. Action");
       System.out.println("4. Mystery");
      
           
       int favoriteGenre = in.nextInt();
       
       System.out.println("the profile is created");
       
       
     
        
    }
    
}
