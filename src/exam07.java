public class exam07 {
    public static void main(String[] args) {
        // Car 클래스를 가지고 인스턴스 (객체) 생성
        Car hiCarDirect = new Car();
        hiCarDirect.setColor("빨강");
        hiCarDirect.setSpeed(50);
        hiCarDirect.setMaxSpeed(100);

        Car mkCar_TeslaMS = new Car("흰색");
        mkCar_TeslaMS.setMaxSpeed(250);

        System.out.println("hiCarDirect의 속도:" +
                hiCarDirect.getSpeed());
        hiCarDirect.upSpeed(30);
        System.out.println("hiCarDirect의 속도:" +
                hiCarDirect.getSpeed());
        hiCarDirect.upSpeed(30);
        System.out.println("hiCarDirect의 속도:" +
                hiCarDirect.getSpeed());

        Car.howManyCar();
    }
}
