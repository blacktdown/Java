package sub2;

/**
 * ��¥ : 2020/11/16
 * �̸� : ���ؿ�
 * ���� : �͸�ü �ǽ��ϱ�
 */
public class AnonyObjectTest {
	public static void main(String[] args) {
		
		//�͸�ü - �������̽��� Ŭ���� �������� �ٷ� new �������� ������ ��ü
		Person p = new Person() {
			
			@Override
			public void show() {
				System.out.println("person show...");
			}
			
			@Override
			public void hello() {
				System.out.println("person show...");
			}
		};
		p.show();
		p.hello();
	}

}
