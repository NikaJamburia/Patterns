package nika.proxy.virtual;

public class HtmlParser implements Parser { // A object, initializing which is very heavy
    private String html;

    public HtmlParser(String html) {
        this.html = html;
        parse();
    }

    public void parse() {
        System.out.println("Initializing bookParser with heavy parsing operation");
    }

    @Override
    public Integer getNumberOfElements() {
        return html.length();
    }

    @Override
    public String getHeadings() {
        System.out.println("getting html headings");
        return "Headings";
    }

    @Override
    public Integer getNumberOfDivs() {
        System.out.println("getting number of html divs");
        return 1;
    }
}
