package study.code.class03.example.game;

public class Player {
	private String name;
	private int fullHp =100; 
	private int hp = 100;
	private int str;
	
	public Player(String name, int str) {
		this.name=name;
		this.str=str;
		System.out.println("이름 : "+name +" 플레이어가 생성되었습니다.");
	}
	
	public int attack(Monster target) {
		System.out.println(name+": 공격!");
		int m_life = target.damage(str);
		return m_life;
	}
	
	public boolean damage(int dmg) {
		hp -= dmg;
		if(hp<=0) {
			die();
			System.out.println("============= GAME OVER ============");
			return false;
		}
		return true;
	}
	
	public boolean run() {
		int ran = (int)(Math.random()*2);
		if(ran%2==0) {
			System.out.println("잘 도망쳤다!");
			System.out.println();
			return true;
		}else {
			System.out.println("도망 실패!");
			return false;
		}
	}
	
	private void die() {
		System.out.println("으앙 쥬금!");
	}
	
	public void status() {
		System.out.println("=================== my info =====================");
		System.out.println("\t 이  름 : "+name);
		System.out.println("\t 생명력 : "+hp +" / " +fullHp);
		System.out.println("\t 공격력 : "+str);
		System.out.println("=================================================");
	}
}
