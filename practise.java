// package JAVA2;
// public class practise{
// public static void main(String[]arg){
//  int a = 15;
//  int b = 20;

//     int sum = a + b;
//     System.out.println("The sum of a and b is: " + sum);


// }
// }
import java.util.Scanner;
import java.util.Random;

public class practise {
    
    public static void main(String[] arg) {
        String[] choices = {"Snake", "Gun", "Water"};

        
        Random rand = new Random();
        int random = rand.nextInt(choices.length);


        
        String g = choices[random];
        
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter anything from snake ,gun,water: ");
        String f = sc.nextLine();
       
        boolean b = (f.equalsIgnoreCase("snake")) ;
        boolean c =(f.equalsIgnoreCase("gun") );
        boolean d =   (f.equalsIgnoreCase("water"));
        if(b && g.equalsIgnoreCase("water") || c && g.equalsIgnoreCase("water") || d && g.equalsIgnoreCase("gun")){
            System.out.println("You win! ");
            System.out.println("Computer chose: " + g);
        }
        else if(f.equalsIgnoreCase(g)){
            System.out.println("It's a tie! ");
            System.out.println("Computer chose: " + g);
        }
        else {
            System.out.println("You lose! ");
            System.out.println("Computer chose: " + g);        }
        
    }
}
