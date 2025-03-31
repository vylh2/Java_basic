package Bai2_TinhDaHinh;

public class DemoNapChong extends BaseTest{

    //Đa hình: giống tên hàm nhưng khác nhau về số lượng tham số

    //Đang ghi đè phương thức từ class cha BaseTest
    public void clickElement() {
        System.out.println("Click on element");
        //Để ghi logs
        //Để ghi mô tả vào report
        //Để thêm cơ chế waits tuỳ ý
        //...
        super.clickElement(); //Gọi từ class cha BaseTest
    }

    public void clickElement(String elementName) {
        System.out.println("Click on element " + elementName);
    }

    public void clickElement(String elementName, int timeout) {
        System.out.println("Click on element " + elementName + " with timeout " + timeout);
    }

    //Đa hình: giống tên hàm + giống số lượng tham số nhưng khác nhau về kiểu dữ liệu của tham số
    public void clickElement(String elementName, double timeout) {
        System.out.println("Click on element " + elementName + " with timeout " + timeout);
    }


    public static void main(String[] args) {
        DemoNapChong demoNapChong = new DemoNapChong();
        demoNapChong.clickElement();
        demoNapChong.clickElement("Login Button");
        demoNapChong.clickElement("Menu Customer", 10);

        BaseTest baseTest = new BaseTest();
        baseTest.clickElement();
    }
}
