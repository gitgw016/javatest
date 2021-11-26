package a.base;

public class RemoteControlExam {

	public static void main(String[] args) {
		RemoteControl tvRemote = new TVRemoteControl();	// new RemoteControl();
		tvRemote.turnOn();
		tvRemote.setValue(11);
		tvRemote.turnOff();
		
		RemoteControl airRemot = new AirRemoteControl();
		airRemot.turnOn();
		airRemot.setValue(20);
		airRemot.turnOff();
		
		RemoteControl smartTVRemote = new SmartTVRemoteControl();
		smartTVRemote.turnOn();
		smartTVRemote.setValue(9);
		Searchable searchRemote = (Searchable)smartTVRemote;
		searchRemote.search("배민구 안선다");
		smartTVRemote.turnOff();
		
		if(searchRemote instanceof SmartTVRemoteControl) {
			SmartTVRemoteControl stc = (SmartTVRemoteControl)searchRemote;
			stc.turnOn();
			stc.setValue(5);
			stc.search("배민구 아직도 안선다");
			stc.turnOff();
		}
		
	}

}
