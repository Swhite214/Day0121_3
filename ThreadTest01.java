package thread;

public class ThreadTest01 {

	public static void main(String[] args) {//main thread가 동작하고있습니다.
		// TODO Auto-generated method stub
		MyThread thread = new MyThread();
		//스레드를 적용시키려면 이렇게 하면 안돼요
		//thread.run();//원래다른 메서드라면 이렇게 겠지만.
		thread.start();//이게 바로 스레드를 동작시키는 방법입니다.
		for(int i=0; i<100; i++) {//스레드를 적용시키지 않는다면 스레드부터 100번까지찍고나서야 main이 출력되지만
			System.out.println("main :" + i);
			try {
				Thread.sleep(100);//지연시간을 설정하는 static메서드입니다
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//스레드를 적용하면 main이먼저하기도하고 스레드가 찍히기도하고 섞이게됩니다 (동시에처리가된다는 증거네요)
	}//시분할기법입니다. CPU가 두개인게 아니라 이거처리하다 저거처리하고 등등 왔다갔다하는겁니다.
//병렬성으로 실행합니다 ---> 코어8---->
}
