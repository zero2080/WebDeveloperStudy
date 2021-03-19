package study.code.class03.example.game;

public class Monster {
	private String name;
	private int hp=100;
	private int str;
	
	public Monster(String name, int str) {
		this.name=name;
		this.str=str;
		System.out.println(name+"이 나타났다.");
	}
	
	public boolean attack(Player target) {
		System.out.println(name + " : 뒤져랏!");
		System.out.println("퍽!");
		return target.damage(str);
	}
	
	public int damage(int dmg) {
		hp -= dmg;
		System.out.println(name+"가 "+dmg+"의 피해를 입었습니다.");
		if(hp<=0) {
			hp=0;
			die();
		}
		return hp;
	}
	
	private void die() {
		System.out.println("뒤짐");
	}
}
