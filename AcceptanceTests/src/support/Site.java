package support;

public class Site {
    public static <T> T page(Class<T> c) throws InstantiationException, IllegalAccessException {
        return c.newInstance();
    }
}