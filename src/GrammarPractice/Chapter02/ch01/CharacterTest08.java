package GrammarPractice.Chapter02.ch01;

public class CharacterTest08 {
    public static void main(String[] args) {
        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int)ch1); // int형 casting

        char ch2 = 66;
        System.out.println(ch2);
//        System.out.println((char) ch2);


        int ch3 = 67;
        System.out.println(ch3);
        System.out.println((char) ch3);

//        char ch4 = -66; // Error

        char ch5 = '한';
        char ch6 = '\uD55C'; // UNICODE

        System.out.println(ch5);
        System.out.println(ch6);


    }
}
