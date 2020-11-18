package sub4;

/**
 * ��¥ : 2020/11/17
 * �̸� : ���ؿ�
 * ���� : ����ڽ�, �����ڽ� �ǽ��ϱ�
 */
public class AutoBoxingTest {
	public static void main(String[] args) {
		
		//Auto-boxing : �⺻Ÿ�� -> Wrapper ��ȯ
		Integer w1 = 1;
		Double w2 = 2.13;
		Boolean w3 = true;
		
		System.out.println("var1 : "+w1);
		System.out.println("var2 : "+w2);
		System.out.println("var3 : "+w3);
		
		//Auto-unboxing : Wrapper -> �⺻Ÿ�� ��ȯ
		
		int var1 = w1;
		double var2 = w2;
		boolean var3 = w3;
		
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		System.out.println("var3 : "+var3);
	}

}