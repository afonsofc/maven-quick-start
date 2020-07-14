package example.afonso.training;

import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

public class Application {
    
	private ArrayList<String> messages;
	
	public int countWords(String words){
		String [] separateWords = StringUtils.split(words, ' ');
		return (separateWords == null) ? 0 : separateWords.length;
	}	
	
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
		int count = app.countWords("I have four words");
		System.out.println("Word count: " + count);
		
    }
}