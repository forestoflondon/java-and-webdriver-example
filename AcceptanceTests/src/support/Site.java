package support;

public class Site {
    public static <T> T page(Class<T> c) throws InstantiationException, IllegalAccessException {
        T page = c.newInstance();

        return page;
    }
}