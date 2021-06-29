package Chapter02.ch18;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {
        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println(company1);
        System.out.println(company2);
        /*
        참조 변수 주소값 같다
        Chapter02.ch18.Company@23fc625e
        Chapter02.ch18.Company@23fc625e
         */

        Calendar calendar = Calendar.getInstance();
    }
}
