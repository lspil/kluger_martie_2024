package org.delivery.handlers;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProductHandler implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        String query = createNativeQuery(methodName);
        return null;
    }

    private String createNativeQuery(String methodName) {
        return null;
    }
}
