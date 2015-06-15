package hello;


import java.util.concurrent.atomic.AtomicLong;
import java.util.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
   // private final AtomicLong counter = new AtomicLong();

    private List<Greeting> l = Greeting.fill();
    
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="id", defaultValue="0") int id) {
        return new Greeting(/*counter.incrementAndGet()*/ id,
                            String.format(template, l.get(id-1).getContent()));
    }
}
