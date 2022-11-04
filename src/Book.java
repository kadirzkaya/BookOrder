import java.util.Date;

public class Book implements Comparable<Book>{
    private String name;
    private int pageNumber;
    private String authorName;
    private Date publishDate;

    public Book(String name, int pageNumber, String authorName, Date publishDate) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
        this.publishDate = publishDate;
    }

    @Override
    public int compareTo(Book o) {
        return this.getName().compareTo(o.getName());
    }

    public String getName() {
        return name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

}
