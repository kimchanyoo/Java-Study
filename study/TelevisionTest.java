class Television {
	private int channel;
	private int volume;
	private boolean onoff;
	
	Television(int c, int v, boolean o){
		channel = c;
		volume = v;
		onoff = o;
	}
	
	void print() {
		System.out.println("ä���� "+ channel + "�̰� ������ "+ volume + "�Դϴ�.");
	}
}

public class TelevisionTest {
	public static void main(String[] args) {
		Television myTv = new Television(7,10,true);
		myTv.print();
		Television yourTv = new Television(11,20,true);
		yourTv.print();
	}

}
