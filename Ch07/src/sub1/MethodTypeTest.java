package sub1;


/**
 * date : 2020/11/05
 * name : ���ؿ�
 * ���� : �޼��� ����Ÿ�� �ǽ��ϱ� ���� p155
 */
public class MethodTypeTest {
	public static void main(String[] args) {
		
		double rs1 = type1(1.01);
		
		System.out.println("rs1 : " +rs1);
		
		type2(true);
		type2(false);
		
		boolean rs2 = type3();
		System.out.println("rs2 : "+rs2);
		
		type4();
		
		//��������
		for(int y=2; y<=9; y++) {
			gugudan(y);
		}
				
	} //main ��

	//Type1 : �Ű������� O, ���ϰ�O
	public static double type1(double a) {
		
		double result = a + 3.14;
		return result;
	}
	//Type2 : �Ű������� O, ���ϰ�X
	public static void type2(boolean isOk) {
		
		if(isOk) {
			System.out.println("�� �Դϴ�.");
		}else {
		System.out.println("�����Դϴ�.");
		}
	}
	//Type3 : �Ű������� X, ���ϰ�O
	public static boolean type3() {
		
		int num1 = 1;
		int num2 = 2;
		
		if(num1 > num2) {
			return true;
		}else {
			return false;
		}
		
	}
	//Type4 : �Ű������� X, ���ϰ�X
	public static void type4() {
		System.out.println("type4 �޼��� ��� : "+type1(0.12));	//type4���� type1�� �����Ѵ�.
	}
	
	//������ �޼���(��������)
	public static void gugudan(int x) {
		
		System.out.println(x+"��");
		for(int y=1; y<=9; y++) {
			int result = x * y;
			System.out.println(x + "X" + y + "=" + result);
		}
		
		
	}
}
