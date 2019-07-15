package chapter2;

public class GuessGame {
	
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame() {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		int targetNumber = (int) (Math.random() * 10);
		System.out.println("0 �̻� 9 ������ ���ڸ� ���纸����.");
		log(" ");
		
		int loopCount = 0;
		
		while(true) {
			log("����� �� ���ڴ�" + targetNumber + "�Դϴ�.");
			
			p1.guess();
			p2.guess();
			p3.guess();
			
			guessp1 = p1.number;
			log("1�� ������ ���� ���� : " + guessp1);
			
			guessp2 = p2.number;
			log("2�� ������ ���� ���� : " + guessp2);
			
			guessp3 = p3.number;
			log("3�� ������ ���� ���� : " + guessp3);
			
			
			if (guessp1 == targetNumber) {
				p1isRight = true;
			}
			
			if (guessp2 == targetNumber) {
				p2isRight = true;
			}
			
			if (guessp3 == targetNumber) {
				p3isRight = true;
			}
			
			if (p1isRight || p2isRight || p3isRight) {
				log("���� ������ �ֽ��ϴ�.");
				log("1�� ������? " + p1isRight);
				log("2�� ������? " + p2isRight);
				log("3�� ������? " + p3isRight);
				log("������ " + loopCount +"ȸ ���� �������ϴ�.");
				break;
			} else {
				log("�ٽ� �ؾ� �մϴ�.");
				log(" ");
				loopCount++;
			}
			
		}

	}
	
public void log(String msg) {
	System.out.println(msg);
}

}
