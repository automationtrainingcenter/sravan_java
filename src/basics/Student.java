package basics;

public class Student {
	
	int id;
	String name;
	static String collegeName;
	
	public void dispaly() {
		System.out.println("id "+id+"\nname "+name+"\ncollege name "+collegeName);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "sravan";
		s1.id = 111;
		Student.collegeName = "JNTU";
		s1.dispaly();
		Student s2 = new Student();
		s2.name = "surya";
		s2.id = 112;
//		s2.collegeName = "OU";
		
		Student s3 = new Student();
		s3.name = "prakash";
		s3.id = 113;
		
		s1.dispaly();
		s2.dispaly();
		s3.dispaly();
		
	}

}
