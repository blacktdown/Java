package sub2;

/**
 * date : 2020/11/09
 * name : ���ؿ�
 * ���� : �ڹ� Ŭ���� �ǽ��ϱ� ���� p140
 */
public class ClassTest {
	public static void main(String[] args) {
		
		//�������� ��ü(Instance) ���� �� �ʱ�ȭ
		Account kb = new Account("��������", "121-12-1231", "������", 10000);

		//�������� ��ü Ȱ���ϱ�
		kb.deposit(15000);
		//ĸ��ȭ �������� ����ڵ� ����
		//kb.money++;
		kb.withdraw(5000);
		kb.show();
		
		//�츮���� ��ü(Instance) ����
		Account wr = new Account("�츮����", "1234-12-121", "������", 5000);
		
		//�츮���� ��ü Ȱ���ϱ�
		wr.deposit(10000);
		wr.withdraw(7000);
		//wr.money--;
		wr.show();
				
	}

}
