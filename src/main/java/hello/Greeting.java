package hello;
import java.util.*;
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
    
    public static ArrayList<Greeting> fill(){
    	 ArrayList<Greeting> l = new ArrayList <Greeting> ();
    	Greeting g1 = new Greeting(0,"odo");
    	Greeting g2 = new Greeting (1,"boing");
    	Greeting g3 = new Greeting (2,"Dr.Prof. Schenk");
    	Greeting g4 = new Greeting (3,"Richard Loewenherz");
    	l.add(g1);
    	l.add(g2);
    	l.add(g3);
    	l.add(g4);
    	return l;
    }
}
