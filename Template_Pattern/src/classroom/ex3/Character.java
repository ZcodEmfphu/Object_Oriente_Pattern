package classroom.ex3;

public abstract class Character {

	public final void performQuest(Quest quest) {
		acceptQuest();
		completeObjectives();
		claimRewards();
	}

	protected void acceptQuest() {
		System.out.println("\nCharacter MinhPhu Accept Quest !");
	}

	protected abstract void completeObjectives();

	protected abstract void claimRewards();
}
