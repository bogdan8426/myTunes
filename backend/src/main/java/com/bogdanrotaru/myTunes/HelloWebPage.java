package com.bogdanrotaru.myTunes;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;

public class HelloWebPage {

    @EventListener(ApplicationStartedEvent.class)
    public void hello(){
        System.out.println("Hello web pagess!!");
    }

}
