package final_Composite;

import java.util.ArrayList;
import java.util.List;

public class TagParentNode extends XmlComponent {
	private String tagName;
	private List<XmlComponent> children;

	   public TagParentNode(String tagName) {
	        this.tagName = tagName;
	        this.children = new ArrayList<>();
	    }
	@Override
	public String toXml() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("<").append(tagName).append(">");
		for (XmlComponent child : children) {
			sb.append(child.toXml());
		}
		sb.append("</").append(tagName).append(">");
		return sb.toString();
	}

	@Override
	public void addChild(XmlComponent component) {
		children.add(component);
	}

	@Override
	public void removeChild(XmlComponent component) {
		children.remove(component);
	}

}
