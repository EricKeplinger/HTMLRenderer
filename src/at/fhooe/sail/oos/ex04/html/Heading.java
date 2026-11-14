package at.fhooe.sail.oos.ex04.html;

// TODO inherit from superclass with keyword extends
class Heading extends TaggedElement{
	// TODO add field(s)
	private final int level;
	private final String text;

	Heading(int level, String text) {
		// TODO implement constructor
		this.level = level;
		this.text = text;
	}



	// TODO override inherited abstract methods getTag() and render()
	@Override
	String getTag(){
		return "h" + level;
	}

	@Override
	String render(){
		String head = "<" + this.getTag() + ">" + text + "</" + this.getTag() + ">";
		Element headLine = new Text(head);
		return headLine.render();
	}

}