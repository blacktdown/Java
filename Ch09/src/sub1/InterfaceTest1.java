package sub1;

/**
 * date : 2020/11/12
 * name : 박준우
 * 내용 : 인터페이스 실습하기 교재 p228
 *
 */
public class InterfaceTest1 {
	public static void main(String[] args) {
		
		//인터페이스 - 클래스 설계의 표준 가이드를 제공
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
