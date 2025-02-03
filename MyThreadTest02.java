package thread;

public class MyThreadTest02 {
	
	public static void main(String[] args) throws InterruptedException {
		Runnable runnable = new MyThread2();
		Thread thread = new Thread(runnable); //Runnable타입의 객체라면 스레드 생성자 안에 접근이 가능합니다
		thread.start();
		for(int i=0; i<30; i++) {
			System.out.println("MainThread : "+i);
			Thread.sleep(100);
		}//독립스레드:메인이 종료되도 나는 독립해서 실행한다
		//데몬 스레드:메인이 종료되면 같이 종료되는거
	}

}
