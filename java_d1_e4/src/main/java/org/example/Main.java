package org.delivery;

import org.delivery.handlers.ProductHandler;
import org.delivery.services.ProductService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {

        ProductService ps = (ProductService)
            Proxy.newProxyInstance(Main.class.getClassLoader(),
                    new Class[]{ProductService.class},
                    getHandler()
                    );

        ps.createProduct();
    }

    static InvocationHandler getHandler() {
        return new ProductHandler();
    }
}