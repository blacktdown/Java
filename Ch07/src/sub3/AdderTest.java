package sub3;

/**
 * date : 2020/11/09
 * name : ���ؿ�
 * ���� : ��ü�� �޸� ������ �������
 */
public class AdderTest {
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30};
		
		Adder a = new Adder(100);
		
		a.add(100);
		System.out.println("��ü a�� ������� x : "+a.getX());
		
		a.add(a);
		System.out.println("��ü a�� ������� x : "+a.getX());
		
		a.add(arr);
		System.out.println("��ü arr�� 1��° ���� : "+arr[0]);
		
		a = a.addNew(a);
		
		System.out.println("��ü a�� ������� x : "+a.getX());
		
	}

}
