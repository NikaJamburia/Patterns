package nika.proxy.virtual;

public class LazyHtmlParser implements Parser {
    private HtmlParser htmlParser = null;
    private String html;

    public LazyHtmlParser(String html) {
        this.html = html;
    }

    @Override
    public Integer getNumberOfElements() {
        if (htmlParser == null) {
            htmlParser = new HtmlParser(html);
            return htmlParser.getNumberOfElements();
        }
        return  htmlParser.getNumberOfElements();
    }

    @Override
    public String getHeadings() {
        if (htmlParser == null) {
            htmlParser = new HtmlParser(html);
            return htmlParser.getHeadings();
        }
        return  htmlParser.getHeadings();
    }

    @Override
    public Integer getNumberOfDivs() {
        if (htmlParser == null) {
            htmlParser = new HtmlParser(html);
            return htmlParser.getNumberOfDivs();
        }
        return  htmlParser.getNumberOfDivs();
    }
}
