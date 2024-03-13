package org.example;

public class QueryLoggerDecorator implements Repo {

    private final Repo myService;

    public QueryLoggerDecorator(Repo myService) {
        this.myService = myService;
    }

    @Override
    public void doSomething() {
        System.out.println("Did something else before!");
        myService.doSomething();
        System.out.println("Did something else after!");
    }
}
