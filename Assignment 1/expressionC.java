class expressionC{
	public static void main(String args[]){
	int x = 1;
	int y = 2;
	int z = x++ - --y - --x + x++;
	System.out.println("x= " +x);
	System.out.println("y= " +y);
	System.out.println("z= " +z);
	}
}