package Bai2_TinhDongGoi;

public class DemoTinhDongGoi {

    private String browser = "Chrome";
    private String url = "https://crm.anhtester.com/admin/authentication"; //Production
    private String email;
    private String password;
    private String customer;

//    public DemoTinhDongGoi(String browser, String url, String email, String password) {
//        this.browser = browser;
//        this.url = url;
//        this.email = email;
//        this.password = password;
//    }

//    public DemoTinhDongGoi(String email, String password) {
//        this.email = email;
//        this.password = password;
//    }

    public String getCustomerName(){
        return customer;
    }

    public String getBrowser(){
        return browser;
    }

    public void setBrowser(String browserName){
        browserName = browserName.toLowerCase(); //Chuyển về chữ thường
        browser = browserName;
    }

    public String getUrl(){
        return url;
    }

    public void setUrl(String url){
        this.url = url;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
