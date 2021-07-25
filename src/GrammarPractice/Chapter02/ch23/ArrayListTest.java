package GrammarPractice.Chapter02.ch23;

import GrammarPractice.Chapter02.ch21.Book;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();
        library.add(new Book("책제목1", "작가1"));
        library.add(new Book("책제목2", "작가2"));
        library.add(new Book("책제목3", "작가3"));

        for(int i=0; i<library.size(); i++){
            library.get(i).showInfo();
        }

        Book book1 = library.get(0);
        book1.showInfo();
    }
}
