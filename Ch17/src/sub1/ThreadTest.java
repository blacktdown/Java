package sub1;

/**
 * ��¥ : 2020/11/19
 * �̸� : ���ؿ�
 * ���� : ������(Thread) �ǽ��ϱ� ���� p462
 * 
 * Thread
 * 	- �ϳ��� ���μ���(���α׷�) �ȿ��� ����Ǵ� ���� �帧
 * 	- Thread Ŭ������ ��ӹ޾� start()�� ���꽺���� ����
 * 	- 
 */
public class ThreadTest {
	public static void main(String[] args) {
		
		SubThread st1 = new SubThread("����1");
		SubThread st2 = new SubThread("����2");
		
		//�񵿱�(Asyncronize) ������� ����
		//start : �������(���� �����̵�), end : ���������� ����
		st1.start();
		st2.start();
		
		for(int i=1; i<=10; i++) {

			try {
				Thread.sleep(1000); //1�ʿ� �ѹ��� ����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("���� ������ �ǻ�...");
			
		}
		
		System.out.println("���� ������ ����...");
	}

}
