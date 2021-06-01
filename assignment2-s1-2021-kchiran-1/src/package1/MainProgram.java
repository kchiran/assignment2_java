/**
 * 
 */
package package1;

/**
 * @author chiran
 *
 */
import java.util.ArrayList;

public class MainProgram {
	public static void main(String[] args) {
		ArrayList<String> menu = new ArrayList<String>();
		menu.add("Press 1 to create a quote");
		//menu.add("2");
		//menu.add("2");
		System.out.println(menu.get(0));
		Menu h = new Menu();  
		h.show();
	}

}

