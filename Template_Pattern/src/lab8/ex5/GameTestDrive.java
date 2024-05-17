package lab8.ex5;

public class GameTestDrive {

	public static void main(String[] args) {
		GameCharacter warrior = new Warrior();
		GameCharacter mage = new Mage();
		
		System.out.println("Create Character");
		warrior.createCharacter();
		
		System.out.println("\nCreate Character");
		mage.createCharacter();
	}
}
