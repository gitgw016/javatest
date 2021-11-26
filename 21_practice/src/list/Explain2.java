package list;

import java.util.ArrayList;
import java.util.Scanner;

class Nation{
	
	private String country;
	private String capital;
	
	public Nation(String country, String capital) {
		this.country = country;
		this.capital = capital;
	}

	public String getCountry() {
		return country;
	}

	public String getCapital() {
		return capital;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Nation) {
			Nation n = (Nation)obj;
			if(n.getCountry().equals(this.country)) {
				return true;
			}
		}
		return false;
	}
	
}

public class Explain2 {

	private ArrayList<Nation> store = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	
	public Explain2() {
		store.add(new Nation("한국","서울"));
		store.add(new Nation("프랑스","파리"));
		store.add(new Nation("그리스","아테네"));
		store.add(new Nation("중국","베이징"));
		store.add(new Nation("스페인","마드리드"));
		store.add(new Nation("영국","런던"));
		store.add(new Nation("독일","베를린"));
		store.add(new Nation("러시아","모스크바"));
	}
	
	public void run() {
		System.out.println("*** 수도 맞추기 게임을 시작합니다 ***");
		while(true) {
			System.out.print("입력 : 1, 퀴즈 : 2, 종료 : 3 >>");
			int menu = sc.nextInt();
			switch(menu) {
				case 1:
					input();
					break;
				case 2:
					quiz();
					break;
				case 3:
					System.out.println("게임을 종료합니다.");
					return;
				default :
					System.out.println("제대로 입력하라");
			}
		}
	}
	
	public void input() {
		int n = store.size();
		System.out.println("현재 "+n+"개의 나라와 수도가 입력되어 있습니다.");
		a : while(true) {
			System.out.printf("국가 입력(현재:%d번째 국가 등록 / q는 종료) >>",store.size()+1);
			String country = sc.next();
			if(country.equals("q")) {
				System.out.println("종료");
				break;
			}
			System.out.println("수도 입력 >>");
			String capital = sc.next();
			Nation nation = new Nation(country,capital);
			if(store.contains(nation)) {
				System.out.println(country+"는 이미 있다.");
				continue;
			}
			/*
			for(int i=0; i<store.size(); i++) {
				Nation na = store.get(i);
				if(na.getCountry().equals(nation.getCountry())) {
					System.out.println(country+"는 이미 있다.");
					continue a;
				}
			}
			*/
			store.add(nation);
		}
		
	}
	
	public void quiz() {
		if(store.isEmpty()) {
			System.out.println("다풀었다.");
			return;
		}
		int index = (int)(Math.random()*store.size());
		Nation nation = store.get(index);
		String question = nation.getCountry();
		String answer = nation.getCapital();
		System.out.println(question+"의 수도는?");
		String capitalFromUser = sc.next();
		if(answer.equals(capitalFromUser)) {
			System.out.println("정답!!");
			store.remove(index);
		}else {
			System.out.printf("땡!!%n");
			System.out.printf("%s의 수도는 %s 다.%n",question,answer);
		}
	}
	
	public static void main(String[] args) {
		new Explain2().run();
	}

}
