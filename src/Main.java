import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Book> bookList=new HashSet<>();
        bookList.add(new Book("Gülün Adı",123,"Umberto Eco",new Date("12/08/1977")));
        bookList.add(new Book("Duman",235,"Ivan Turgenyev",new Date("12/08/1967")));
        bookList.add(new Book("Beş Şehir",473,"Ahmet Hamdi Tanpınar",new Date("10/08/1966")));
        bookList.add(new Book("Kar",344,"Orhan Pamuk",new Date("12/10/2000")));
        bookList.add(new Book("Hayvan Çiftliği",112,"George Orwell",new Date("02/08/1937")));

        TreeSet<Book> orderBooks=new TreeSet<>(bookList);

        for(Book b:orderBooks){
            System.out.println(b.getName());
        }
        System.out.println("------------------");
        TreeSet<Book> pageOrderBooks=new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber()-o2.getPageNumber();
            }
        });
        pageOrderBooks.addAll(orderBooks);

        for(Book b:pageOrderBooks){
            System.out.println(b.getName()+" "+b.getPageNumber());
        }
    }
}
