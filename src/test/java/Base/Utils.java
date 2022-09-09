package Base;

public class Utils extends Base{

    public static String url()
    {
        return driver.getCurrentUrl();
    }

    public static String title()
    {
        return driver.getTitle();
    }
}
