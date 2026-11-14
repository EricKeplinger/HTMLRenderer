package at.fhooe.sail.oos.ex04.html;

/**
 * The Utils class provides utility methods for HTML rendering. Currently, it
 * includes a method to indent lines of text.
 */
public class Utils {
	private static final String BLANKS = "  ";

	/**
	 * Indents each line of the given string by a fixed number of spaces. The number
	 * of spaces is defined by the BLANKS constant.
	 *
	 * @param lines the string containing lines to be indented
	 * @return a new string with each line indented
	 */
	public static String indentLines(String lines) {
		StringBuilder b = new StringBuilder(lines);
		String sep = System.lineSeparator();
		int idx = 0;
		while (idx >= 0 && idx < b.length()) {
			b.insert(idx, BLANKS);
			int nextIdx = b.indexOf(sep, idx + BLANKS.length());
			if (nextIdx == -1) {
				break;
			}
			idx = nextIdx + sep.length();
		}
		return b.toString();
	}
}