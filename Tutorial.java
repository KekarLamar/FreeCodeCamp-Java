import java.util.Scanner;

public class Tutorial {

    
public static String hello ()
{
System.out.println("What's your name?");
    Scanner scan = new Scanner(System.in);
    String name1 = scan.nextLine();
return name1;
}

    public static void main(String[] args) 
    {
        String name = hello();
      System.out.println("Hola " + name);
    }   
  }