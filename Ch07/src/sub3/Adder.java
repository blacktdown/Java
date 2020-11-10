package sub3;

public class Adder {
	
	//멤버변수
	private int x;
	
	//생성자
	public Adder(int x) {
		this.x = x;
	}
	
	//getter, setter 메서스 정의
	//	- 외부에서 클래스의 멤버변수의 참조를 위한 메서드
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	//멤버 메서드
	public void add(int x) {
		this.x = x+50;
	}
	
	public void add(int[] arr) {
		arr[0]++;
	} //배열변수
	
	public void add(Adder a1) {
		a1.x = a1.x + 40;
	} //참조변수
	
	public Adder addNew(Adder a2) {
		a2 = new Adder(1);
		return a2;
		
	}

}
