package review_oops_practice;

public class TVclass_intrfc implements SmartTVremote_Interface
{

	@Override
	public void volumeup() {
          System.out.println("voulme up");		
	}

	@Override
	public void volumedown() {
System.out.println("volume down");		
	}

	@Override
	public void channelup() {
System.out.println("channel up");		
	}

	@Override
	public void channeldown() {
System.out.println("channel down");		
	}

	@Override
	public void autovoulumeup() {
System.out.println("auto volume up");		
	}

	@Override
	public void autochnlup() {
System.out.println("auto chnnl up");		
	}

}
