package Chapter02.ch19;

public class Car {
    private static int serialNum = 10000; // 공용 값
    int carNum;

    public Car(){
        serialNum++;
//        System.out.println("car Create : "+serialNum);
        setCarNum(serialNum); //  carNum = serialNum;
    }

    public int getCarNum() {
        return carNum;
    }

    private void setCarNum(int carNum) {
        this.carNum = carNum;
    }
}