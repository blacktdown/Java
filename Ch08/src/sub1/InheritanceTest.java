package sub1;

/**
 * date : 2020/11/10
 * name : ���ؿ�
 * ���� : Ŭ���� ��� �ǽ��ϱ� ���� p196
 *
 */

public class InheritanceTest {
	public static void main(String[] args) {
		
		StockAccount kb = new StockAccount("KB����", "123-11-1234", "������", 1000000, "�Ｚ����", 10, 53000);
		
		kb.sell(5, 51000);
		kb.buy(10, 50100);
		
		kb.show();
			
		
	}

}
