package L_ConnectingMultipleClasses_Obj;

public class L4_HumanBody_Main {

	public static void main(String[] args) {
		L1_Head head = new L1_Head();
		L2_Body body = new L2_Body(); 
		L3_Bottom bottom = new L3_Bottom();
		
		head.Eye();
		head.Mouth();
		head.nose = 1;
		head.Nose();
		head.ears = 2;
		head.Ears();
		
		body.heart = 1;
		body.body();
		body.Heart();
		
		bottom.Legs();
		bottom.legs =2;
		bottom.Legs1();
		bottom.feet =2;
		bottom.Feet();
		bottom.Feet1();
		

	}


}
