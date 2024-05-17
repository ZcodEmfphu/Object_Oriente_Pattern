package lab8.ex5;

public abstract class GameCharacter {

	final void createCharacter() {
		selectName();
		selectAbilities();
	}

	abstract void selectName();

	abstract void selectAbilities();
}
