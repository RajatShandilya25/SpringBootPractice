package com.SpringBootDemo.HelloWorld;

import org.springframework.stereotype.Component;

/**
 * @author Rajat Shandilya
 * @time 22/04/21 5:26 PM
 */

@Component
public class Greeting_POJO
{
    private long id;
    private String content;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

}
