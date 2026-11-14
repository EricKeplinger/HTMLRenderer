package at.fhooe.sail.oos.ex04.app;

import at.fhooe.sail.oos.ex04.html.Page;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static at.fhooe.sail.oos.ex04.html.HTML.*;

public class HTMLApp {

    static void main() {
        // Create a new HTML page with title and elements
        Page page = page("The rendering tool description page", h1("The HTML Renderer Tool"), h2("Description:"),
                para(text("Hi everybody!"),
                        text("This is a test of the HTML renderer, which is a fantastic tool for creating web pages.")),
                h2("Operations:"),
                para(text("A class HTML is provided to create an HTML page. You can create: "),
                        ul(item(text("pages with title and body: use method page")),
                                item(text("paragraphs: use method para")), item(text("lists: use method list")),
                                item(text("items in lists: use method item")),
                                item(text("text elements: use method text")), item(text("line breaks: use method br"))),
                        h2("Implementation:"), text("Proceed as follows: "),
                        ol(item(text("First create the classes")),
                                item(text("Then implement the methods render, getTag etc.")),
                                item(text("Finally, test your program with the HTMLApp main class"))),
                        br(), text("Good luck!")));

        // TODO for testing your final implementation, use the commented-out code above
//        Page page = page("HTML renderer", text("Hi!"));

        // Render the page to HTML
        String html = page.render();

        // Print the HTML to the console
        IO.print(html);

        // Write the HTML to the file page.html
        try {
            Files.writeString(Path.of("page.html"), html);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}