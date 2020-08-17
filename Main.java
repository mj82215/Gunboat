import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner reader = new Scanner(System.in);
		System.out.println("Enter distance to target.\n");
	/****	\n means new line****/
		double d = reader.nextDouble();
	/***    Double means a value that does not have to be an integer, d can be any number***/
	    System.out.println("Enter the height of the battery relative to the water line");
	    double h = reader.nextDouble();
	    System.out.println("Enter the initial velocity of the shell.\n");
	    double v = reader.nextDouble();
	/*      System.in means that message comes from user, System.out means message goes to user*/
	    
	    double a = -4.9*(d/v)*(d/v);
	    double b = d;
	    double c = a + h;
	 /*     values come from physics video linked in GC */   
	 
	    double tanTheta = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
	 /*     only finding positive value*/
	    double angle = Math.atan(tanTheta)*180/3.1415926536;
	 /*     how to find arctangent in java (this is in radians), if you use pi once, put #, if you use multiple time, define pi*/
	    System.out.println("The angle is " + angle);
	 /*     need a + sign to connect a statement and a value*/
	}  
}
