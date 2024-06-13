package final_Composite;

public abstract class XmlComponent {

	public abstract String toXml();

	public void addChild(XmlComponent component) {
		throw new UnsupportedOperationException("add un suported !");
	}

	public void removeChild(XmlComponent component) {
		throw new UnsupportedOperationException("remove un suported !");
	}

}
