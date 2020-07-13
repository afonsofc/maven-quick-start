package example.afonso.training;

import java.util.ArrayList;

public class Application {
    
	private ArrayList<String> messages;
	
    public Application() {
        System.out.println ("Inside Application");
		messages = new ArrayList<>();
		messages.add("Hello Maven");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		for(String str: app.messages){
			System.out.println (str);
		}
    }
}