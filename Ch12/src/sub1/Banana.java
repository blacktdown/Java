package sub1;

public class Banana extends Object{
	
	private String country;
	private int price;
	
	public Banana(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void show() {
		System.out.println("������ : "+country);
		System.out.println("���� : "+price);
	}
	@Override
	public String toString() {
		show();
		return super.toString();
	}
}