package final_MVC_Observer;

public interface ControllerInterface {

	void register(Observer o);

	void unregister(Observer o);

	void noti();
}
