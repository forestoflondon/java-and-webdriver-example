package support;

import org.openqa.selenium.support.PageFactory;

public class Site {
    public static <T> T page(Class<T> c) throws InstantiationException, IllegalAccessException {
        T page = c.newInstance();
        PageFactory.initElements(Browser.Driver, page);

        return page;
    }
}