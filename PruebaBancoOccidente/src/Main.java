import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Principal principal = new Principal();
		
		String entrada;
		
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Por favor ingrese un request de ejemplo (valores separados por ,):");  
        System.out.println("Request {\"groups\" :\" ______________\"}");  
        
        System.out.println("");  
        String name = reader.readLine();
 
        System.out.println(principal.ValidarBus(name));  

	}

}
