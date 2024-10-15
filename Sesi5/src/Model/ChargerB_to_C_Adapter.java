package Model;

public class ChargerB_to_C_Adapter extends ChargerC {
	private ChargerB chargerB;
	
	public ChargerB_to_C_Adapter() {
		// TODO Auto-generated constructor stub
	}

	public ChargerB_to_C_Adapter(ChargerB chargerB) {
		super();
		this.chargerB = chargerB;
	}
	
	public int getPower(){
	return chargerB.getPower();	
	}
}
