package sub1;

/**
 * 날짜 : 2020/11/18
 * 이름 : 박준우
 * 내용 : 제네릭 실습 교재 p386
 */
public class GenericTest {
	public static void main(String[] args) {
		
		Apple apple = new Apple("한국",3000);
		Banana banana = new Banana("대만", 2000);
		
		//<> : 제네릭 타입 함수
		FruitBox<Apple> box1 = new FruitBox<>();
		box1.setFruit(apple);
		
		FruitBox<Banana> box2 = new FruitBox<>();
		box2.setFruit(banana);
		
		box1.getFruit().show();
		box2.getFruit().show();
	}
}
