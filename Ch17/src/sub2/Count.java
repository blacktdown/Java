package sub2;

public class Count {
	
	private int num;
	
	public int getNum() {
		return num;
	}
	
	// synchronized : 동기화 블럭
	// 동기화블럭 선언으로 스레드간 경합을 막는다. 쉽게 이야기해서 줄을 세운다는 의미이다.
	public synchronized void setNum() {
		num++;
	}

}
