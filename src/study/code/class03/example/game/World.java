package study.code.class03.example.game;

import java.util.Scanner;

public class World {
	public static void main(String[] args) {
		System.out.println("빠빠빠~~게임시작");
		Player p1 = null;
		Monster m = null;
		String name =null;
		Scanner scan = new Scanner(System.in);
		int turn = 0;
		game:while(true) {
			if(p1==null) {
				System.out.print("이름을 입력하세요>");
				name = scan.nextLine();
				System.out.print("공격력을 입력하세요>");
				int str = scan.nextInt();
				
				System.out.println("이름 : "+name + " / 공격력 : "+str);
				System.out.print("위 정보로 생성하시겠습니까?(1:예 / 2:아니오)");
				int answer = scan.nextInt();
				if(answer==0) {
					continue;
				}else {
					p1 = new Player(name,str);
				}
			}else {
				if(m ==null) {
					m = new Monster("고블린",10);
					turn=1;
				}else {
					System.out.println("================= "+turn+"턴 ==================");
					System.out.println("행동을 선택하세요>");
					System.out.println("1: 공격 / 2: 도망 / 3:내정보");
					int answer = scan.nextInt();
					switch (answer) {
					case 1:
						int m_life = p1.attack(m);
						if(m_life==0) {
							m=null;
						}else {
							if(!m.attack(p1)) {
								break game;
							}
						}
						turn++;
						break;
					case 2:
						boolean run = p1.run();
						if(run) {
							turn = 0;
							m = null;
						}else {
							if(!m.attack(p1)) {
								break game;
							}
						}
						turn++;
						break;
					case 3:
						p1.status();
						break;
					}
				}
			}
		}
		scan.close();
	}
}
