package sub6;

/**
 * date : 2020/11/11
 * name : 박준우
 * 내용 : 추상클래스 실습하기 교재 p216
 *
 */
public class AbstractClassTest {
	public static void main(String[] args) {
		
		// 추상클래스는 직접 객체생성을 할 수 없다.
		
		Unit u1 = new Marine();
		Unit u2 = new Zealot();
		
		u1.move();
		u1.attack();
		
		u2.move();
		u2.attack();
		
	}

}
