package GrammarPractice.Chapter02.ch19;

//유일. 싱글톤
public class CarFactory {

    private static CarFactory instance = new CarFactory();
    private CarFactory() {}

    // 인스턴스 외부 접근
    public static CarFactory getInstance(){
        if(instance == null){
            instance = new CarFactory();
        }
        return  instance;
    }

    public Car createCar(){
         return new Car();
    }


}
