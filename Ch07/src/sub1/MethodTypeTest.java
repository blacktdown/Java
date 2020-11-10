package sub1;


/**
 * date : 2020/11/05
 * name : 박준우
 * 내용 : 메서드 리턴타입 실습하기 교재 p155
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
		
		//연습문제
		for(int y=2; y<=9; y++) {
			gugudan(y);
		}
				
	} //main 끝

	//Type1 : 매개변수가 O, 리턴값O
	public static double type1(double a) {
		
		double result = a + 3.14;
		return result;
	}
	//Type2 : 매개변수가 O, 리턴값X
	public static void type2(boolean isOk) {
		
		if(isOk) {
			System.out.println("참 입니다.");
		}else {
		System.out.println("거짓입니다.");
		}
	}
	//Type3 : 매개변수가 X, 리턴값O
	public static boolean type3() {
		
		int num1 = 1;
		int num2 = 2;
		
		if(num1 > num2) {
			return true;
		}else {
			return false;
		}
		
	}
	//Type4 : 매개변수가 X, 리턴값X
	public static void type4() {
		System.out.println("type4 메서드 결과 : "+type1(0.12));	//type4에서 type1을 실행한다.
	}
	
	//구구단 메서드(연습문제)
	public static void gugudan(int x) {
		
		System.out.println(x+"단");
		for(int y=1; y<=9; y++) {
			int result = x * y;
			System.out.println(x + "X" + y + "=" + result);
		}
		
		
	}
}
