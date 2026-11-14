package at.fhooe.sail.oos.ex04.html;

// TODO inherit from superclass with keyword extends
class List extends ContainerElement{
	// TODO add field(s)
	private final boolean ordered;

	List(boolean ordered, ListItem[] elements) {
		// TODO implement constructor
		this.ordered = ordered;
		super(elements);
	}

	// TODO override inherited abstract method getTag()
	@Override
	String getTag(){
		if(ordered){
			return "ol";
		}
		return "ul";
	}

}