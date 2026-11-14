package at.fhooe.sail.oos.ex04.html;

/**
 * The HTML class provides static methods to create various HTML elements. These
 * methods return instances of different element classes that can be used to
 * build an HTML page.
 */
public class HTML {

	/**
	 * Creates a new Page with the specified title and elements.
	 *
	 * @param title    the title of the HTML page
	 * @param elements the elements to be included in the body of the page
	 * @return a new Page instance
	 */
	public static Page page(String title, Element... elements) {
		return new Page(title, elements);
	}

	/**
	 * Creates a new Text element with the specified text.
	 *
	 * @param text the text content
	 * @return a new Text instance
	 */
	public static Text text(String text) {
		return new Text(text);
	}

	/**
	 * Creates a new LineBreak element.
	 *
	 * @return a new LineBreak instance
	 */
	public static LineBreak br() {
		return new LineBreak();
	}

	/**
	 * Creates a new Heading element with level 1.
	 *
	 * @param h the heading text
	 * @return a new Heading instance with level 1
	 */
	public static Heading h1(String h) {
		return new Heading(1, h);
	}

	/**
	 * Creates a new Heading element with level 2.
	 *
	 * @param h the heading text
	 * @return a new Heading instance with level 2
	 */
	public static Heading h2(String h) {
		return new Heading(2, h);
	}

	/**
	 * Creates a new Heading element with level 3.
	 *
	 * @param h the heading text
	 * @return a new Heading instance with level 3
	 */
	public static Heading h3(String h) {
		return new Heading(3, h);
	}

	/**
	 * Creates a new Paragraph element with the specified elements.
	 *
	 * @param elements the elements to be included in the paragraph
	 * @return a new Paragraph instance
	 */
	public static Paragraph para(Element... elements) {
		return new Paragraph(elements);
	}

	/**
	 * Creates a new ordered List element with the specified items.
	 *
	 * @param items the list items
	 * @return a new List instance representing an ordered list
	 */
	public static List ol(ListItem... items) {
		return new List(true, items);
	}

	/**
	 * Creates a new unordered List element with the specified items.
	 *
	 * @param items the list items
	 * @return a new List instance representing an unordered list
	 */
	public static List ul(ListItem... items) {
		return new List(false, items);
	}

	/**
	 * Creates a new ListItem element with the specified elements.
	 *
	 * @param elements the elements to be included in the list item
	 * @return a new ListItem instance
	 */
	public static ListItem item(Element... elements) {
		return new ListItem(elements);
	}
}