package at.fhooe.sail.oos.ex04.html;

// TODO inherit from superclass with keyword extends
abstract class ContainerElement extends TaggedElement{
	// TODO add field(s)
	private final Element[] elements;

	ContainerElement(Element[] elements) {
		// TODO implement constructor
		this.elements = elements;
	}

	// TODO override inherited abstract method render()
	@Override
	String render(){
		String openTag = "<" + this.getTag() + ">" + System.lineSeparator();
		StringBuilder sb = new StringBuilder();
		for(Element elem: elements){
			sb.append(Utils.indentLines(elem.render()));
		}
		String closeTag = "</" + this.getTag() + ">" + System.lineSeparator();
		return openTag + sb + closeTag;
	}

}