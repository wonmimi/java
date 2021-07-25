package GrammarPractice.Chapter02.ch21;

public class ObjectCopyTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];


        library[0] = new Book("책1","작가1");
        library[1] = new Book("책2","작가2");
        library[2] = new Book("책3","작가3");
        library[3] = new Book("책4","작가4");
        library[4] = new Book("책5","작가5");


        // 얕은 복사
//        System.arraycopy(library,0,copyLibrary,0,5);


        // 깊은 복사
        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();

        for(int i = 0 ; i < library.length; i++){
            copyLibrary[i].setTitle(library[i].getTitle());
            copyLibrary[i].setAuthor(library[i].getAuthor());
        }


        for (Book book : library){
            System.out.println(book);
            book.showInfo();
        }

        // 값 변경
        library[0].setAuthor("작가1 변경");
        library[0].setTitle(("책1 변경"));

        System.out.println("- - - - - - - - - - ");
        for (Book book : copyLibrary){
            System.out.println(book);
            book.showInfo();
        }

        System.out.println("- - - - - CHANGE- - - - - ");

        for (Book book : library){
            System.out.println(book);
            book.showInfo();
        }


    }
}
