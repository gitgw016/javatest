package list;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

class Location{
	
	private double longitude;
	private double latitude;
	
	public Location(double longitude, double latitude) {
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	@Override
	public String toString() {
		return "Location [경도=" + longitude + ", 위도=" + latitude + "]";
	}

	
	
}

public class Explain3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,Location> manage = new HashMap<>();
		System.out.println("도시, 경도, 위도를 한번에 입력하세요.(q는 입력완료)");
		while(true) {
		System.out.print(">>");
		String strs = sc.nextLine();
		if(strs.equals("q")) {
			System.out.println("입력완료");
			break;
		}
		String[] st =  strs.split(",");
		StringTokenizer stoken = new StringTokenizer(strs,",");
		System.out.println(stoken.countTokens());
		String city = stoken.nextToken().trim();
		double longitude = Double.valueOf(stoken.nextToken().trim());
		double latitude = Double.valueOf(stoken.nextToken().trim());
		String keys = st[0].trim();
		double lon = Double.parseDouble(st[1].trim());
		double lat = Double.parseDouble(st[2].trim());
		manage.put(keys,new Location(lon, lat));
		}
		System.out.println("------------------------------");
		Set<String> key = manage.keySet();
		for(String k : key) {
			Location l = manage.get(k);
			System.out.println(k+" "+l.getLongitude()+" "+l.getLatitude());
		}
		System.out.println("------------------------------");
		while(true) {
			System.out.print("도시이름 (q는 종료)>>");
			String city = sc.next();
			if(city.equals("q")) {
			break;
			}
			if(manage.containsKey(city)) {
				System.out.println(city+" "+manage.get(city));
			}else {
				System.out.println(city+"는 없다.");
			}
		}
		System.out.println("시스템 종료");
	}

}
