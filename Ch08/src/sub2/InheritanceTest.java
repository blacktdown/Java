package sub2;

/**
 * date : 2020/11/10
 * name : ���ؿ�
 * ���� : Ŭ���� ��� �ǽ��ϱ� ���� p196 
 *
 */
public class InheritanceTest {
	public static void main(String[] args) {
		
		Student std = new Student("������", 23, "�ΰ��", "��ǻ�Ͱ���");
		std.hello();
		
		SalaryStudent sstd = new SalaryStudent("�̼���", 32, "�λ��", "������", "�Ｚ");
		sstd.hello();
	}

}
