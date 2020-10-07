import java.util.concurrent.Semaphore;
import java.util.*;

public class Buffer {
	private ArrayList<String> carros; 
	
	private Semaphore Contents;
	private Semaphore Space;
	
	public Buffer() {
		this.Contents = new Semaphore(0);
		this.Space = new Semaphore(10);
		this.carros = new ArrayList<String>();
	}
	
	public void inserir(String item) {
		try {
			Space.acquire();
			carros.add(item);
			Contents.release();
			
		}
		catch(InterruptedException error) {
			System.out.print("Não foi possível inserir! ");
		}
	}
	
	public String retirar() {
		
		String takeout = " x ";
		try {
			Contents.acquire();
			takeout = carros.remove(0);
			Space.release();
		}
		catch(InterruptedException error) {
			System.out.println("Não foi possível retirar! ");
		}
		return takeout;
	}
}
