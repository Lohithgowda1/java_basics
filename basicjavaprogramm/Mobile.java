package basicjavaprogramm;

public class Mobile {
	String brand;
	int cost;
	public Mobile setBrand(String brand) {
		this.brand=brand;
		return this;
	}
	public Mobile setCost(int cost) {
		this.cost=cost;
		return this;
	}
	public void info() {
		System.out.println("The brand and cost is\n");
		System.out.println("Brand:"+brand+"\n Cost:"+cost);
	}
	public static void main(String args[]) {
		Mobile mob=new Mobile();
		mob.setBrand("iphone").setCost(500000).info();
	}
}
