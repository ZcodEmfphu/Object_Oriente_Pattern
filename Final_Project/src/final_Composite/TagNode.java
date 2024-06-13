package final_Composite;

import java.util.HashMap;
import java.util.Map;

public class TagNode extends XmlComponent {

	private String tagName;
	private String tagValue;
	private Map<String, String> attribute;

	public TagNode(String tagName, String tagValue) {
		super();
		this.tagName = tagName;
		this.tagValue = tagValue;
		this.attribute = new HashMap<String, String>();
	}

	@Override
	public String toXml() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("<").append(tagName); 
		for (Map.Entry<String, String> entry : attribute.entrySet()) {
			sb.append(" ").append(entry.getKey()).append("='").append(entry.getValue()).append("'");
		}
		sb.append(">");
		sb.append(tagValue);
		sb.append("</").append(tagName).append(">");
		return sb.toString();
	}

	@Override
	public void addChild(XmlComponent component) {
		throw new UnsupportedOperationException("Cannot add child to TagNode");
	}

	@Override
	public void removeChild(XmlComponent component) {
		throw new UnsupportedOperationException("Cannot remove child from TagNode");
	}

	public void addAttribute(String name, String value) {
		attribute.put(name, value);
	}
}
