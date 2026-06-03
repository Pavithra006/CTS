import java.lang.reflect.*;

class Test {

    public void show() {
        System.out.println("Reflection Method");
    }
}

public class ReflectionDemo {

    public static void main(String[] args)
            throws Exception {

        Class<?> cls =
                Class.forName("Test");

        Method[] methods =
                cls.getDeclaredMethods();

        for(Method m : methods) {
            System.out.println(
                    "Method: " + m.getName());
        }

        Object obj =
                cls.getDeclaredConstructor()
                        .newInstance();

        Method method =
                cls.getDeclaredMethod("show");

        method.invoke(obj);
    }
}