import java.util.Scanner;
class SimpleInterest{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Principle:");
	double p = sc.nextDouble();
	System.out.println("Enter Time:");
	double n = sc.nextDouble();
	System.out.println("Enter Rate:");
	double r = sc.nextDouble();
	double si = (p*n*r)/100;
	System.out.println("Simple Interest: " +si);
	}
}