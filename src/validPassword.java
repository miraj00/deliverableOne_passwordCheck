import java.util.Scanner;

public class validPassword {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);

	    System.out.println(" ****  Please create the password !! ");
	    System.out.println("It should contain : \r\n"
	    		+ "1) At least one lowercase letter\r\n"
	    		+ "2) At least one uppercase letter\r\n"
	    		+ "3) At least minimum 7 characters\r\n"
	    		+ "4) At least maximum 12 characters\r\n"
	    		+ "5) An exclamation point: ! ****** \r\n\n ");
	    
	    System.out.print(" Enter Your Password : ");
	    String pwd = sc.nextLine();

	      
        if (checkPass(pwd)== true) {
        	
            System.out.println("Password valid and accepted");
     
         } else {
         	System.out.println(" Error ");
         }
	  }
   
       
   public static boolean checkPass(String password){
       
//        	boolean hasNum =false; 
            boolean hasCap =false; 
            boolean hasLow =false; 
            boolean minLength = false;
            boolean maxLength = false;
            boolean hasSpecial = false;
            char c; 
            String specialCharacters="!";
            String name=password;
            String str2[]=name.split("");
            int count=0;

     // check if password contains specialCharacter ! -------------------------  
            for (int i=0;i<str2.length;i++) {
            	if (specialCharacters.contains(str2[i]))  {
             //     System.out.println("true");
                  count++;
             //     System.out.println(count);
                }
             }
            if (count>0) {
            	hasSpecial = true;
            //	System.out.println("contains special char !");
            } else {
            	hasSpecial = false;
            	System.out.println("No special char ! found ");
            }
            
               
     // Check if password length >=7 and <= 12 -------------------------        
                     
            if (password.length()>=7){
                minLength = true;
                } else {
            	System.out.println("Password must be atleast 7 Characters Long");
                minLength = false;
            };

            
            if (password.length()<=12){
                maxLength = true;
               } else {
            	System.out.println("Password can be maximum 12 Characters Long");
                maxLength = false;
            };         
            

      // Check if password had uppercase and lowercase letter --------------------            

            //loop for every single character in a string
            for (int i =0; i<password.length(); i++ ){
              
            	//assign c to the character we are looking for
                c = password.charAt(i);
 
//                if (Character.isDigit(c)){
//                    hasNum = true;
//                } else 
                	
                if (Character.isUpperCase(c)) {
                    hasCap = true;
                  }                            
                if (Character.isLowerCase(c)) {
                    hasLow = true;
                }                       
             }
            
          if (hasCap == false ) {
        	  System.out.println("password require atleast one Uppercase letter");
          }
          if (hasLow == false) {
        	  System.out.println("password require atleast one lowercase letter"); 
          }
            
   // check if all the three boolean variables are true  --------------------
            if (minLength && maxLength /* && hasNum  */ && hasCap && hasLow && hasSpecial){
                    return true;
            } else {
            
           return  false;
            }
        }       
}
		
		
		
	

/*  Requirements : 
Via the console, ask the user to create a password with the following requirements.
The password must contain:
○ At least one lowercase letter
○ At least one uppercase letter
○ At least minimum 7 characters
○ At least maximum 12 characters
○ An exclamation point: !
● If the user meets all the requirements, print the string "Password valid and
accepted" to the console
● If the password fails any of the requirements, print the string "Error ".
Point Breakdown:
Each of these requirements are worth 1 or 2 points with a total of 10. You need to:
1) Print a message asking the user to input a password via the console (1 point)
2) Receive the input via the console (1 point)
3) Check if there is at least one lowercase letter (1 point)
4) Check if there is at least one uppercase letter (Hint: Google Java check if string
contains lowercase/uppercase) (1 point)
5) Check if there are at least 7 characters (1 point)
6) Check if there are no more than 12 characters (1 point)
7) Check if there is a ! (1 point)
8) If the password is valid, print "Password valid and accepted" (2 points)
9) If the password isn’t valid, print "Error" (1 point)
*/

