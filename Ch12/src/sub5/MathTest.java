package sub5;

public class MathTest {
	public static void main(String[] args) {
		
		int num = 1;
		
		
		//random
		double num1 = Math.random();
		System.out.println("num1 : "+num1);	//0~1���̿� �Ǽ�
		
		double num2 = num1 * 10;
		System.out.println("num2 : "+num2);	// 0~10���̿� �Ǽ�
		
		double num3 = Math.ceil(num2);
		System.out.println("num3 : "+num3);	//1~10 ���̿� ����
		
		//1 ~ 45 ���� ���� ���ϱ�
		double rand = Math.ceil((Math.random() * 45));
		System.out.println("������ �� : "+rand);
	}

}
