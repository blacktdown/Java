package sub6;

/**
 * date : 2020/11/11
 * name : ���ؿ�
 * ���� : �߻�Ŭ���� �ǽ��ϱ� ���� p216
 *
 */
public class AbstractClassTest {
	public static void main(String[] args) {
		
		// �߻�Ŭ������ ���� ��ü������ �� �� ����.
		
		Unit u1 = new Marine();
		Unit u2 = new Zealot();
		
		u1.move();
		u1.attack();
		
		u2.move();
		u2.attack();
		
	}

}
