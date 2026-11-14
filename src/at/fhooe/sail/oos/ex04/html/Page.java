package at.fhooe.sail.oos.ex04.html;

public class Page {
	private final String title;
	private final Element[] elements;

	Page(String title, Element[] elements) {
		this.title = title;
		this.elements = elements;
	}

	public String render() {
		StringBuilder sb = new StringBuilder();

		// TODO add html, head, title and body tags to string builder
		String htmlOpen = "<html>" + System.lineSeparator();
		sb.append(htmlOpen);
		String headOpen = "<head>" + System.lineSeparator();
		sb.append(Utils.indentLines(headOpen));
		String titletag = "<title>" + title + "</title>" + System.lineSeparator();
		sb.append(Utils.indentLines(Utils.indentLines(titletag)));
		String headClose = "</head>" + System.lineSeparator();
		sb.append(Utils.indentLines(headClose));
		String bodyOpen = "<body>" + System.lineSeparator();
		sb.append(Utils.indentLines(bodyOpen));

		for (Element elem: elements) {
			sb.append(Utils.indentLines(Utils.indentLines(elem.render())));
		}

		String bodyClose = "</body>" + System.lineSeparator();
		sb.append(Utils.indentLines(bodyClose));
		String htmlClose = "</html>" + System.lineSeparator();
		sb.append(htmlClose);



		return sb.toString();
	}
}