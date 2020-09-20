package studentEx;

public class StudentEx {
	public static void main(String args[])
	{
		Student s1 = new Student();
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		
		s1.setName("이대로");
		s1.setAge(29);
		
		System.out.println(s1.name);
		System.out.println(s1.age);
	}
}
