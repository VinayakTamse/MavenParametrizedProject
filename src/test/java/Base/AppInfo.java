package Base;

public class AppInfo {

    private String url;
    private String username;
    private String password;

    private String browser;

    public AppInfo(String url, String username, String password, String browser)
    {
        this.url = url;
        this.username = username;
        this.password = password;
        this.browser = browser;
    }

    public String getUrl()
    {
        return url;
    }

    public String getUsername()
    {
        return username;
    }

    public  String getPassword()
    {
        return password;
    }

    public  String getBrowser()
    {
        return browser;
    }

}
