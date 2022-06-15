
import java.util.Scanner;
public class CeaserCipher {
    public static void main(String[] args) {     
    System.out.println("Please Chozose The Program");
    System.out.println("For Encryption: 1");
    System.out.println("For Decrypt: 2");
    Scanner scan =new Scanner (System.in,"ISO-8859-9");
    int programnumber =scan.nextInt();
    String next=" ";
switch(programnumber){
        case 1:
            System.out.println("Enter The Text You Want To Encrypt");
            Scanner scan1 =new Scanner (System.in,"ISO-8859-9");
            String text =scan1.nextLine();  
            text.toLowerCase();
            text.toUpperCase();       
            for (int i = 0; i < text.length(); i++) {
            int charValue = text.charAt(i);         
            next = String.valueOf( (char) (charValue + 1));          
            System.out.print(next);             
            }
            break;            
        case 2:
            System.out.println("Enter The Text You Want To Decrypt");
            Scanner scan2 =new Scanner (System.in);
            String textdec =scan2.next();
            textdec.toLowerCase();
            textdec.toUpperCase();
            for (int i = 0; i < textdec.length(); i++) {
            int charValue = textdec.charAt(i);
            next = String.valueOf( (char) (charValue - 1));    
            System.out.print(next);             
         }
        } 
       }
      }
        
      
       
        
        
    
    

