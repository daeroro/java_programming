package studentEx;

public class Student {
	public String name;
	public int age;
	
	Student(){
		this.name = "이름 없음";
		this.age = 0;
	}
	
	public void showInfo(Student s1)
	{
		System.out.println(s1.name);
		System.out.println(s1.age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
