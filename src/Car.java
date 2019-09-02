public class Car {
    public String color;
    private int speed;
    private int maxSpeed;


    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void getColor() {
        return color;

    }

    public void setColor(String color) {
        this.color = color;
    }

    public void downSpeed() {
        if (speed <= 0) System.out.println("현재 최고 속도");
        else speed--;
    }

    public void upSpeed() {
        if (speed >= maxSpeed) System.out.println("현재 최저 속도");
        else speed++;
    }
}
