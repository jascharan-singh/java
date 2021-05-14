import java.util.Scanner;

public class Television {
	
	
	private static String MANUFACTURER="sony";
	private static int SCREEN_SIZE=52;
	private static int channel=2;
	private static boolean powerOn = true;
	private static int volume=20;
	public Television(String brand, int size) {
		this.MANUFACTURER=brand;
		this.SCREEN_SIZE=size;
		
	
		
		
	}
	
	public int getVolume(){
		return volume;
	}
	public int getChannel() {
		return channel;
	}
	public String getManufacturer() {
		return MANUFACTURER;
	}
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
	public void setChannel(int channel) {
		this.channel=channel;
	}
	public  boolean power() {
		this.powerOn=powerOn;
		if(powerOn==true) {
			return powerOn==false;
		}
		if(powerOn!=true) {
			return powerOn==true;
		}
		return powerOn;
	}
	public int increaseVolume() {
		this.volume=volume;
		volume++;
		return volume;
	}
	public int decreaseVolume() {
		this.volume=volume;
		volume=volume-1;
		return volume;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//television myobj=new television(MANUFACTURER, SCREEN_SIZE);
	}

}
