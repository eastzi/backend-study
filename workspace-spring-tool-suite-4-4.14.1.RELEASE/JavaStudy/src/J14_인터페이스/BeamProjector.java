package J14_인터페이스;

public class BeamProjector implements Hdmi {

	@Override
	public void connect() {
		System.out.println("빔프로젝터 연결");
	}

	@Override
	public void disconnect() {
		System.out.println("빔프로젝터 연결해제");
	}

	
}
