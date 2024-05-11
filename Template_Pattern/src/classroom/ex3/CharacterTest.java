package classroom.ex3;

public class CharacterTest {

	public static void main(String[] args) {
		Character warrior = new Warrior();
		Character mage = new Mage();
		Character rogue = new Rogue();

		Quest defeatEnemiesQuest = new DefeatEnemiesQuest();
		Quest collectItemsQuest = new CollectItemsQuest();
		Quest exploreDungeonQuest = new ExploreDungeonQuest();

		System.out.println("Performing quests:");

		System.out.println("\nWarior quests:");
		warrior.performQuest(defeatEnemiesQuest);

		System.out.println("\nMage quests:");
		mage.performQuest(collectItemsQuest);

		System.out.println("\nRogue quests:");
		rogue.performQuest(exploreDungeonQuest);

		System.out.println("\nWarior quests:");
		defeatEnemiesQuest.executeQuest(warrior);

		System.out.println("\nMage quests:");
		defeatEnemiesQuest.executeQuest(mage);

		System.out.println("\nRogue quests:");
		defeatEnemiesQuest.executeQuest(rogue);
	}
}
