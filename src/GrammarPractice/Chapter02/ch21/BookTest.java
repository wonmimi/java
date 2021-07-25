package GrammarPractice.Chapter02.ch21;

public class BookTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];

        library[0] = new Book("책1","작가1");
        library[1] = new Book("책2","작가2");
        library[2] = new Book("책3","작가3");
        library[3] = new Book("책4","작가4");
        library[4] = new Book("책5","작가5");

//        for (int i =0 ; i<library.length; i++){
//            System.out.println(library[i]);
//            library[i].showInfo();
//        }

        for (Book book : library){
            System.out.println(book);
            book.showInfo();
        }
    }
}
