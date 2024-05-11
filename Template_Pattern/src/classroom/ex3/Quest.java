package classroom.ex3;

public abstract class Quest {

	public final void executeQuest(Character character) {
		assignObjectives();
		checkCompletion();
		provideRewards();

	}

	protected abstract void assignObjectives();

	protected void checkCompletion() {
		System.out.println("Completion doing complete !");
	}

	protected abstract void provideRewards();
}
