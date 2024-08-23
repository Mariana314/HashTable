import java.util.Hashtable;
public class Ejercicio2 {

	public static void main(String[] args) {
		  Hashtable<String, Integer> hashtable = new Hashtable<>();

	        hashtable.put("Manzana", 3);
	        hashtable.put("Banana", 2);
	        hashtable.put("Cereza", 5);

	        System.out.println("Contenido del Hashtable:");
	        for (String key : hashtable.keySet()) {
	            System.out.println(key + " => " + hashtable.get(key));
	        }

	}

}
