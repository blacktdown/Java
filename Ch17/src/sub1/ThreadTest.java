package sub1;

/**
 * 날짜 : 2020/11/19
 * 이름 : 박준우
 * 내용 : 스레드(Thread) 실습하기 교재 p462
 * 
 * Thread
 * 	- 하나의 프로세스(프로그램) 안에서 실행되는 실행 흐름
 * 	- Thread 클래스를 상속받아 start()로 서브스레드 실행
 * 	- 
 */
public class ThreadTest {
	public static void main(String[] args) {
		
		SubThread st1 = new SubThread("서브1");
		SubThread st2 = new SubThread("서브2");
		
		//비동기(Asyncronize) 방식으로 실행
		//start : 병행실행(같이 실행이됨), end : 순차적으로 실행
		st1.start();
		st2.start();
		
		for(int i=1; i<=10; i++) {

			try {
				Thread.sleep(1000); //1초에 한번씩 실행
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("메인 쓰레드 실생...");
			
		}
		
		System.out.println("메인 쓰레드 종료...");
	}

}
