package explain2;


public class Util {
	/*
		getValue() 작성	
	*/
	
	public static<K,V> V getValue(Pair<K, V> pair, K string) {
		if(pair.getKey().equals(string)) {
			return pair.getValue();
		}else {
			return null;
		}
	}
	
}
