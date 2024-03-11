package org.example;

import org.example.annotations.FieldValue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        try {
            Class c = Class.forName("org.example.model.Product"); // classpath

            Constructor constr = c.getDeclaredConstructor();
            constr.setAccessible(true);

            Object o = constr.newInstance();

            Field [] fields = c.getDeclaredFields();
            for (Field f : fields) {
                f.setAccessible(true);
                if (f.isAnnotationPresent(FieldValue.class)) {
                    FieldValue a = f.getDeclaredAnnotation(FieldValue.class);
                    String name = a.name();
                    f.set(o, name);
                }
            }

            Method m = c.getDeclaredMethod("showName");
            m.setAccessible(true);
            m.invoke(o);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}