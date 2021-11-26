package a.object.clone;

import java.util.Arrays;

public class Member implements Cloneable{

	public String name;
	public int age;
	public int[] score;
	public Car car;
	
	public Member(String name, int age, int[] score, Car car) {
		this.name = name;
		this.age = age;
		this.score = score;
		this.car = car;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", score=" + Arrays.toString(score) + ", car=" + car + "]";
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			// cloned = (Member)super.clone();
			cloned = (Member)clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Member cloned = (Member)super.clone();
		int[] score = new int[this.score.length];
		for(int i=0; i<score.length; i++) {
			score[i] = this.score[i];
		}
		cloned.score = score;
		Car car = new Car(this.car.model);
		cloned.car = car;
		return cloned;
	}
	
	
	
	
}
