package lab4.weatherStation2;

public interface Subject {

	public void registerObseever(Observer observer);

	public void removeObseever(Observer observer);

	public void notifyObseever();

}
