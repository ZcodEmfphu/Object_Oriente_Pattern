package lab4.clockProgram;

public interface Subject {

	public void addObservers(Observer observer);

	public void removeObservers(Observer observer);

	public void notifyObservers();

}
