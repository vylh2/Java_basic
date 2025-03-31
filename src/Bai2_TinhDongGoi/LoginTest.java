package Bai2_TinhDongGoi;

public class LoginTest extends DemoTinhDongGoi{

    public void loginCRM() {
        setEmail("");
        setPassword("");
        System.out.println("Nhập email: " + getEmail());
        System.out.println("Nhập password: " + getPassword());
    }

    public void loginCRM(String email, String password) {
        System.out.println("Nhập email: " + email);
        System.out.println("Nhập password: " + password);
    }

    public static void main(String[] args) {

        LoginTest loginTest = new LoginTest();

        DemoTinhDongGoi demoTinhDongGoi = new DemoTinhDongGoi();
        demoTinhDongGoi.setBrowser("EDGE");
        demoTinhDongGoi.setUrl("https://cms.anhtester.com/login"); //Staging

        System.out.println(demoTinhDongGoi.getBrowser());
        System.out.println(demoTinhDongGoi.getUrl());
        System.out.println(demoTinhDongGoi.getEmail());
        System.out.println(demoTinhDongGoi.getPassword());

        //Truyền data từ class khác vào một hàm bất kì tại vị trí nào đó
        loginTest.loginCRM(demoTinhDongGoi.getEmail(), demoTinhDongGoi.getPassword());

    }

}
