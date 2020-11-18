package sub5;

public class MathTest {
	public static void main(String[] args) {
		
		int num = 1;
		
		
		//random
		double num1 = Math.random();
		System.out.println("num1 : "+num1);	//0~1사이에 실수
		
		double num2 = num1 * 10;
		System.out.println("num2 : "+num2);	// 0~10사이에 실수
		
		double num3 = Math.ceil(num2);
		System.out.println("num3 : "+num3);	//1~10 사이에 정수
		
		//1 ~ 45 사이 정수 구하기
		double rand = Math.ceil((Math.random() * 45));
		System.out.println("임의의 수 : "+rand);
	}

}
