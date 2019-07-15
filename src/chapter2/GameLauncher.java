package chapter2;

public class GameLauncher {
	
	public static void main(String[] args) {
		
		// 게스게임 클래스의 객체 인스턴스를 생성해서 게임 변수에 할당한다
		GuessGame game = new GuessGame(); 
		
		// 게스게임의 스타트게임 메소드를 호출한다
		game.startGame();
		
	}

}
