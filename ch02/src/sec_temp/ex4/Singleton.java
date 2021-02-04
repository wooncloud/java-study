package sec_temp.ex4;

import sec_temp.ex02.enumExample.state;

public class Singleton {
	private static Singleton singleton = new Singleton();

	private Singleton() {
		System.out.println("싱글톤 객체 생성");
	}

	static Singleton getInstance() {
		return singleton;
	}
}