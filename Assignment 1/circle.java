import java.util.Scanner;
class circle{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter radius of Circle");
	int r = sc.nextInt();
	double a = 3.142857142857143*r*r;
	double p = 2*3.142857142857143*r;
	System.out.println("Area of Circle= " +a);
	System.out.println("Perimeter of Circle= " +p);
	}
}