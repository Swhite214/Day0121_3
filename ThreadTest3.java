package thread;

public class ThreadTest3 {

	public static void main(String[] args) {
		
		Thread thread = new Thread(()->{
			while(true) {
				System.out.println("자동저장 처리");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});//Runnable만들고 implements하고 해야함
		//근데 Runnable은 function어쩌구인 추상메서드가 하나인데.... anonymous타입으로 만들수잇을까?
		thread.setDaemon(true);//demon 스레드로할꺼니? 매개변수로는 boolean형 true or false
		thread.start();//main이 종료되면 같이 종료되는 데몬스레드 와우
		
		for(int i=0; i<100; i++) {
			System.out.println("문서작업중~~");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("프로그램 종료");
	}

}
