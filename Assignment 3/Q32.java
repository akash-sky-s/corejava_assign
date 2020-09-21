class Student{
	static int noOfObject = 0;
	{
		noOfObject +=1;
	}

	public Student()
	{}
	public static void main(String args[])
	{
		Student s1 = new Student();
		System.out.println("No of objects are = "+Student.noOfObject);
	}
}