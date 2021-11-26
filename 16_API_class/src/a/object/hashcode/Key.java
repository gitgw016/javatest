package a.object.hashcode;

public class Key {

	public int number;

	public Key(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("확인");
		if(obj instanceof Key) {
			if(this.number == ((Key)obj).number) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.number;
	}
	
}
