package sub1;

public class RemoteSamgsung implements RemoteControl {

	@Override
	public void powerOn() {
		System.out.println("Samsung powerOn...");
	}

	@Override
	public void powerOff() {
		System.out.println("Samsung powerOff...");
	}

	@Override
	public void chUp() {
		System.out.println("Samsung chUp...");
	}

	@Override
	public void chDown() {
		System.out.println("Samsung Down...");
	}

}
