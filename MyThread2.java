package thread;

public class MyThread2 implements Runnable{

	@Override
	public void run() {//당연히 추상메서드 이므로 반드시 구현해야합니다.
		for(int i=0; i<30; i++) {
			System.out.println("MyThread02 : "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}//얘는 Thread클래스랑 다르게 start메서드가 없습니다.

}
