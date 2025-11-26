import java.util.Scanner;
import java.util.Random;

public class jhj{
    
    public static void main(String[] arg) {
        String[] choices = {"1", "2", "3"};


        
        Random rand = new Random();
        int random = rand.nextInt(choices.length);


        
        String g = choices[random];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter anything from snake ,gun,water: ");
        String f = sc.nextLine();
       
        int choice = 0; // default

if (f.equalsIgnoreCase("snake")) {
    choice = 0;
} else if (f.equalsIgnoreCase("gun")) {
    choice = 1;
} else if (f.equalsIgnoreCase("water")) {
    choice = 2;
}

if(choice-random ==1 || choice-random ==-2){
    System.out.println("You win! ");
}
else if(f==g){
    System.out.println("It's a tie! ");
}
    else {
    System.out.println("You lose! ");
    }
    }
}
