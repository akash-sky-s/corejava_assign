import java.util.Scanner;
class InputUsername{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter User Name");
	String name = sc.next();
	System.out.println("Welcome " +name);
	}
}