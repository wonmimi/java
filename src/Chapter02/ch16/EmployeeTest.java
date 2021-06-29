package Chapter02.ch16;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employeeJung = new Employee();
        employeeJung.setEmployeeName("정씨사람");

        System.out.println(Employee.getSerialNum());

        Employee employeePark = new Employee();
        employeePark.setEmployeeName("박씨사람");

        System.out.println(employeeJung.getEmployeeName()+"님의 사번은 "+ employeeJung.getEmployeeId());
        System.out.println(employeePark.getEmployeeName()+"님의 사번은 "+ employeePark.getEmployeeId());
    }
}
