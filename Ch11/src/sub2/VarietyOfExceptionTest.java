package sub2;

/**
 * ��¥ : 2020/11/16
 * �̸� : ���ؿ�
 * ���� : �پ��� �������� �ǽ��ϱ� ���� p265
 */
public class VarietyOfExceptionTest {
	public static void main(String[] args) {
		
		// �迭 �ε�����ȣ ���� ����
		int arr[] = new int[3];
		for(int i=20; i<=3; i++) {
			try {
				arr[1]=i+1;
			}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		}
		
		for(int num : arr) {
			System.out.println("�� : "+num);
		}
		
		
		// NullPoint ����
		try {
			Tiger tiger = null;
			
			tiger.move();
			tiger.hunt();
		}catch(NullPointerException e) {
				e.printStackTrace();
			}
		
		
		// Casting ����
	
		try {
			Animal a1 = new Eagle();	//��ĳ����
			Animal a2 = new Shark();	//��ĳ����
			
			Eagle eagel = (Eagle) a2; //�ٿ�ĳ����
			
			}catch(ClassCastException e) {
				e.printStackTrace();
		}

		
		System.out.println("���α׷� ����...");
	
}
}
