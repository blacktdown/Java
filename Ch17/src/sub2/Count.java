package sub2;

public class Count {
	
	private int num;
	
	public int getNum() {
		return num;
	}
	
	// synchronized : ����ȭ ��
	// ����ȭ�� �������� �����尣 ������ ���´�. ���� �̾߱��ؼ� ���� ����ٴ� �ǹ��̴�.
	public synchronized void setNum() {
		num++;
	}

}
