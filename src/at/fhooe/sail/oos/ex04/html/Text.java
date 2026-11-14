package at.fhooe.sail.oos.ex04.html;

class Text extends Element {
	private final String text;

	Text(String text) {
		this.text = text;
	}

	String render() {
		return text + System.lineSeparator();
	}
}