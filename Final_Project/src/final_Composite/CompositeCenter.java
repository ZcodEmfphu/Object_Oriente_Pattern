package final_Composite;

public class CompositeCenter {

	public static void main(String[] args) {

		TagParentNode parentNode = new TagParentNode("root");

		TagNode node = new TagNode("order", "number");
		node.addAttribute("123", "123");
		node.addAttribute("456", "456");

		parentNode.addChild(node);

		System.out.println(parentNode.toXml());
	}

}
