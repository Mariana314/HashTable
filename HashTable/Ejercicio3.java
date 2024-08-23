import java.util.Hashtable;
public class Ejercicio3 {

	public static void main(String[] args) {
		  
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("A", 10);
        hashtable.put("B", 20);

        Integer value = hashtable.get("A");
        System.out.println("El valor para la clave 'A' es: " + value);
	}

}
