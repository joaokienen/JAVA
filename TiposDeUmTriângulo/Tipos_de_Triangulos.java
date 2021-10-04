import java.util.Scanner;

public class Trianguloo { 
    public static void main (String[] args) {
       Scanner input = new Scanner(System.in);

       int ladoa, ladob, ladoc;

         System.out.print("Enter first integer: ");
        ladoa = input.nextInt();
          System.out.print("Enter first integer: ");
        ladob = input.nextInt();
          System.out.print("Enter first integer: ");
        ladoc = input.nextInt();

    if (((ladob - ladoc)<ladoa) && (ladoa < (ladob + ladoc))||((ladoa - ladoc)<ladob) && (ladob < (ladoa + ladoc))||((ladoa - ladob)<ladoc) && (ladoc < (ladoa + ladob))) {
        if ((ladoa == ladob) && (ladoa == ladoc)) {
		      System.out.printf( "EQUILaTERO  ladoa,ladob,ladoc");
        } else if (((ladoa == ladob) && (ladoa != ladoc)) || ((ladoa == ladoc) && (ladoa != ladob)) || ((ladob == ladoc) && (ladob != ladoa))) {
	        System.out.printf( "ISOSCELES  ladoa,ladob,ladoc");
        } else if ((ladoa != ladob) && (ladoa != ladoc) && (ladob != ladoc)) {
		      System.out.printf( "ESCALENO ladoa,ladob,ladoc");
        } 
    } else {
         System.out.printf(" ERRAdo");
    } 

  }
}   
