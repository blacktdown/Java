package sub1;

/**
 * date : 2020/11/12
 * name : ���ؿ�
 * ���� : �������̽� �ǽ��ϱ� ���� p228
 *
 */
public class InterfaceTest1 {
	public static void main(String[] args) {
		
		//�������̽� - Ŭ���� ������ ǥ�� ���̵带 ����
		RemoteControl lg = new RemoteLg();
		lg.powerOn();
		lg.chUp();
		lg.powerOff();
		
		RemoteControl samsung = new RemoteSamgsung();
		samsung.powerOn();
		samsung.chUp();
		samsung.powerOff();
		
	}
}
