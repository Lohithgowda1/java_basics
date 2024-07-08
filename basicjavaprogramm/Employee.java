package basicjavaprogramm;

public class Employee {
	private int id;
	private String name;
	private int salary;
	public Employee setId(int id){
		this.id=id;
		return this;
	}
	public Employee setName(String name) {
		this.name=name;
		return this;
	}
	public Employee setSalary(int salary) {
		this.salary=salary;
		return this;
	}
	public void detail() {
		System.out.println("The employee detail is\n");
		System.out.println("ID:"+id+"\nNAME:"+name+"\nSalary:"+salary);
	}
	public static void main(String args[]) {
		Employee em1=new Employee();
		Employee em2=new Employee();
		em1.setId(1).setName("Ayush").setSalary(25000).detail();
		em2.setId(2).setName("Anush").setSalary(27000).detail();
	}

}
