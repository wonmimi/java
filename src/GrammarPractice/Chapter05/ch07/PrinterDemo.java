package GrammarPractice.Chapter05.ch07;


public class PrinterDemo {
    public static void main(String[] args) {
        Powder powder = new Powder();
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(powder);

        Powder p = powderPrinter.getMaterial(); // 형변환 하지 않아도 된다 T => Powder
        System.out.println(powderPrinter.toString());



    }
}
