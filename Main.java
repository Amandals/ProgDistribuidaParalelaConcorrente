
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buffer buffer = new Buffer();
		Produtor produtor = new Produtor(buffer);
		Consumidor consumidor = new Consumidor(buffer);
		
		produtor.start();
		consumidor.start();
	}

}
