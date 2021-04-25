package com.SpringBootDemo.HelloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Rajat Shandilya
 * @time 22/04/21 4:52 PM
 */

/**
 * All the implementations of the rest calls will be inside the
 * class which is marked with @RestController
 */
@RestController
public class GreetingController
{

    @Autowired // Will
    Greeting_POJO greeting_pojo;

    AtomicLong idCount = new AtomicLong(); //Remembers the id count


    /**
     * @GetMapping Get call
     * "/greeting": Resource path
     * @RequestParam Value of "name" will be stored in Name
     */
    @GetMapping("/greeting")
    public Greeting_POJO greeting(@RequestParam(value="name")String Name)
    {
        greeting_pojo.setId(idCount.incrementAndGet()); //incrementAndGet: Increments count everytime
         greeting_pojo.setContent("Hey!, I am learning spring boot from " +Name);

        return greeting_pojo;
    }


}
