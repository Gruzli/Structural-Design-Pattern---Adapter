package Main;

import Model.ChargerB;
import Model.ChargerB_to_C_Adapter;
import Model.ChargerC;
import Model.HandphoneC;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
		HandphoneC handphoneC = new HandphoneC(100, "Simsung");
		ChargerC chargerC = new ChargerC();
		ChargerB chargerB = new ChargerB();
		ChargerB_to_C_Adapter adapter = new ChargerB_to_C_Adapter(chargerB);
		
		System.out.println(handphoneC.getBattery());
		handphoneC.play();
		System.out.println(handphoneC.getBattery());
		handphoneC.charge(new ChargerB_to_C_Adapter(chargerB));
		System.out.println(handphoneC.getBattery());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new main();
	}

}
