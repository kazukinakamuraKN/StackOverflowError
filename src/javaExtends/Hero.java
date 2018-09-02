package javaExtends;

public class Hero {
	int hp = 10;
	String name = "Hero";
	int mp = 20;
	void greed() {
		System.out.println("hpは" + hp + "mpは" + mp + "名前は" + this.name);
		this.greed();
	}
}
