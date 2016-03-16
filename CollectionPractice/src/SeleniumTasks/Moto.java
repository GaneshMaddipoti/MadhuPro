package SeleniumTasks;

 class Moto {
	String mobileName;
	int price;
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMobileName() {
		return mobileName;
	}
	public int getPrice() {
		return price;
	}
	public void getMobileSpec(){
		System.out.println("*** Specifications ***");
		System.out.println("Mobile Name:"+mobileName+"\t"+"Mobile price:"+price);
	}
	
	public static void getName(){
		System.out.println("static method");
	}
}

/*public class Demo{
	public static void main(String[] args) {
		Moto m = new Moto();
		m.setMobileName("Moto G 2nd Gen");
		m.setPrice(4000);
		m.getMobileSpec();
	}
}
*/
