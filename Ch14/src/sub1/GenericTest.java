package sub1;

/**
 * ��¥ : 2020/11/18
 * �̸� : ���ؿ�
 * ���� : ���׸� �ǽ� ���� p386
 */
public class GenericTest {
	public static void main(String[] args) {
		
		Apple apple = new Apple("�ѱ�",3000);
		Banana banana = new Banana("�븸", 2000);
		
		//<> : ���׸� Ÿ�� �Լ�
		FruitBox<Apple> box1 = new FruitBox<>();
		box1.setFruit(apple);
		
		FruitBox<Banana> box2 = new FruitBox<>();
		box2.setFruit(banana);
		
		box1.getFruit().show();
		box2.getFruit().show();
	}
}
