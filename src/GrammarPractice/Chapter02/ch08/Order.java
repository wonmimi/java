package GrammarPractice.Chapter02.ch08;

public class Order {
    public String orderNumber;
    public String phoneNumber;
    public String address;
    public String orderDate;
    public String orderTime;
    public int price;
    public String menuId;

    public Order(String orderNumber, String phoneNumber, String address, String orderDate, String orderTime, int price, String menuId) {
        this.orderNumber = orderNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.price = price;
        this.menuId = menuId;
    }

    public void showOrder(){
        System.out.println("주문 접수 번호 :"+orderNumber);
        System.out.println("주문 핸드 번호 :"+phoneNumber);
        System.out.println("주문 집주 :"+address);
        System.out.println("주문 날짜 :"+orderDate);
        System.out.println("주문 시간 :"+orderTime);
        System.out.println("주문 가격 :"+price);
        System.out.println("메뉴 번호 :"+menuId);
    }
}
