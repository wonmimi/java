package Chapter05.ch06;

public class PrinterDemo {
    public static void main(String[] args) {
        Powder powder = new Powder();
        /*
        // threeD
        ThreeDPrinter3 printer = new ThreeDPrinter3();

        printer.setMaterial(powder);

        Powder p = (Powder) printer.getMaterial(); // Powder로 형변환
         */

        //generic
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(powder);

        Powder p = powderPrinter.getMaterial(); // 형변환 하지 않아도 된다 T => Powder
        System.out.println(powderPrinter.toString());

    }
}
