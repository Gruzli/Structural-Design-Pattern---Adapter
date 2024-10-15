package Model;

public class HandphoneC {
	private int battery;
	private String brand;
	
	public HandphoneC() {
		// TODO Auto-generated constructor stub
	}

	public HandphoneC(int battery, String brand) {
		super();
		this.setBattery(battery);
		this.setBrand(brand);
	}
	
	public void play() {
		System.out.println(brand + " is Playing!");
		while(battery > 0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(".");
			battery -= 20;
		}
		System.out.println();
	}

	public void charge(ChargerC chargerC) {
		System.out.println(brand + " is Charging!");
		while(battery < 100) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(".");
			battery += chargerC.getPower();
		}
		System.out.println();
	}
	
	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}
