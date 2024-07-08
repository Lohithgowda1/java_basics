package functions;

public class Student {
		 int id;
	     String name;
		 int age;
		 int std;
		public Student setId(int id)   
		{  
		this.id = id;  
		return this; 
		}  
		public Student setName(String name)   
		{  
		this.name = name;  
		return this;  
		}  
		public Student setAge(int age)   
		{  
		this.age = age;  
		return this;  
		}                              
		public Student setStd(int std)   
		{  
		this.std = std;  
		return this;  
		}  
		public void detail()   
		{  
		System.out.println("Student Detail is:\n");  
		System.out.println("Id: "+id+ "\nName: "+name+"\nAge: "+age+ "\nStandard: "+std);  
		}  
		public static void main(String args[])   
		{  
		Student student = new Student();  
		student.setId(21).setName("yash").setAge(19).setStd(12).detail();  
		}  
}