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
		System.out.println("채널은 "+ channel + "이고 볼륨은 "+ volume + "입니다.");
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
