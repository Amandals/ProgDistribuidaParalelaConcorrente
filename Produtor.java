import java.util.concurrent.Semaphore;
import java.util.*;

public class Produtor extends Thread {
	private Buffer buffer;
	private String[] modelos = {"Celta", "Corsa", "Onix", "Camaro"};
	private Random aleatorio = new Random();
	
	public Produtor(Buffer buffer) {
		this.buffer = buffer;
	}
	
	public void run() {
		int i = 0;
		while(i < 50) {
			int k = aleatorio.nextInt(4);
			buffer.inserir(modelos[k]);
			System.out.println("produzido: " + modelos[k]);
			i ++;
		}
	}
}
