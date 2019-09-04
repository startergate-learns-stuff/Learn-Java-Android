public class Car {
    // 정적 필드 (변수), 정적 메소드
    // 동적 -> 그때그때 ( Car car1 = new Car(); )
    // 인스턴스 (객체) 를 생성하지 않고 클래스 자체에서 사용할 수 있다.
    protected static int carCount;

    public String color;
    protected int speed = 0;
    protected int maxSpeed = 200;
    // private, public, protected
    // 접근에 대한 범위

    // Getter, Setter

    // 생성자 + 오버로딩이라는 개념
    // 객체를 생성할 당시에 호출되는 메소드
    // 정의 방식은 클래스 명과 똑같게
    // 입력 인자를 다르게 줄 수 있다. (오버로딩)
    Car() { // 기본 생성자
        // 이 안에 아무 코드가 없더라도 ...
        // 자바 컴파일러는 메모리 할당 등의 객체 생성에 필요한 역할들을 수행
        // 우리가 사용자 코드를 추가하여 +@를 할 수 있다.
        carCount++;
    }

    Car(String color) {
        this.color = color;
        carCount++;
    }

    Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
        carCount++;
    }

    public void setMaxSpeed(int maxSpeed) { this.maxSpeed = maxSpeed; }

    public String getColor() { return color; }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) { this.speed = speed; }

    public int getSpeed() { return speed; }

    public void downSpeed(int minus) {
        if (speed - minus <= 0) speed = 0;
        else speed -= minus;
    }

    public void upSpeed(int add) {
        if (speed + add >= maxSpeed) speed = maxSpeed;
        else speed += add ;
    }

    // 정적 메소드 - 클래스 자체에서 사용 가능한 메소드
    // mycar.@@@@() 형태로 호출할 필요가 없음
    // 인스턴스 (객체) 없이 클래스명.메소드명() 으로도 호출 가능
    static public void howManyCar() {
        System.out.println("생성된 객체의 갯수: " + carCount);
    }
}
