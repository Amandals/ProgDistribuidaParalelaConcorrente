
public class Consumidor extends Thread{

	private Buffer buffer;
	
	public Consumidor(Buffer buffer) {
		this.buffer = buffer;
	}
	public void run() {
		while(true) {
			String retirado = buffer.retirar();
			System.out.println("Consumido: " + retirado);
		}
	}
}
