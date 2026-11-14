package at.fhooe.sail.oos.ex04.html;

// TODO inherit from superclass with keyword extends
public class ListItem extends ContainerElement{
	ListItem(Element[] elements) {
		// TODO implement constructor
		super(elements);
	}

	// TODO override inherited abstract method getTag()
	@Override
	String getTag(){
		return "li";
	}

}
