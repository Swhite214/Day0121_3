package thread;

public class MyThread extends Thread{

	@Override
	public void run() {//마치 main method처럼 동작합니다.
		// Thread를 실행하면 run메소드가 자동으로 동작하기에 다른 메서드처럼 사용하시면 안돼요
		for(int i=0; i<100; i++) {
			System.out.println("MyThread :" + i);//
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//0.1초입니다.
		}
	}

	

}
