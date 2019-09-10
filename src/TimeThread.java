// Thread 실습
// Thread란? 멀티태스킹을 수행하기 위해 사용하는 작업 단위
// Thread를 여러 개 생성하여 여러 작업 동시 수행 가능
// Thread 클래스를 '상속'받아 스레드 클래스 작성

public class TimeThread extends Thread {

    static int n = 0;
    // 정적 변수 (필드) = 스레드간 공유함

    // Thread 클래스는 run()이라는 메소드
    // run() 메소드는 스레드 생성 외의 (사용자 측면의)
    // 아무 작업도 수행하지 않음


    @Override
    public void run() {
        while (true) {
            System.out.println(this.getName());
            try {
                Thread.sleep(2000);
                // 2000ms = 2초 동안 대기
            } catch (InterruptedException e) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        TimeThread th1 = new TimeThread();
        th1.start();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            return;
        }

        TimeThread th2 = new TimeThread();
        th2.start();
    }
}
