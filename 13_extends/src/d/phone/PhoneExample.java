package d.phone;

public class PhoneExample {

	public static void main(String[] args) {
		Phone phone = new Phone("배밍","pink");
		phone.powerOn();
		phone.bell();
		phone.take();
		phone.sendVoice("민구는?");
		phone.receiveVoice("안선다");
		phone.sendVoice("고렇취");
		phone.hangUp();
		phone.powerOff();
		System.out.println("=================================");
		DmbPhone dmbphone = new DmbPhone("민구본능","Hotpink",3);
		System.out.println(dmbphone.color);
		System.out.println(dmbphone.model);
		System.out.println(dmbphone.channel);
		dmbphone.powerOn();
		dmbphone.turnOnDmb();
		dmbphone.changeChannel(6);
		dmbphone.turnOffDmb();
		dmbphone.powerOff();
	}

}
