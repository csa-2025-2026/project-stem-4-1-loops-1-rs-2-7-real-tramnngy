import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Problem 1 
    Scanner number = new Scanner (System.in);
   
    int N = 0; 
    int sum = 0; 
    while (N != -1)
    {
       System.out.print("Type a non-negative number:");
       N =  number.nextInt();
       sum += N ; 
    }
    sum++; 
    System.out.println ( "The sum is: " + sum ); 
    


    // Problem 2
    Scanner spots = new Scanner (System.in);
    System.out.println("How many numbers do you want to input? ");
    int amount = spots.nextInt();
    int count = 0 ; 
    int max = 0 ; 
    int userInput = 0; 
    while ( count <= amount)
    {
      Scanner input = new Scanner (System.in);
      System.out.println("Type in your number:");
      userInput = input.nextInt(); 

       if ( userInput > max)
       {
        max = userInput;
       }
       count++; 
    }
    System.out.println("The largest score is: " + max );


  }
}
