package com.borovyk.homework.methodLoggingProxy;

public class GreetingService {
    public void hello() {
        System.out.println("Hello");
    }

    @LogInvocation
    public void gloryToUkraine() {
        System.out.println("Slava Ukraini!");
    }
}
