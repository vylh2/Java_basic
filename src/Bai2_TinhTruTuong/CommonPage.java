package Bai2_TinhTruTuong;

abstract public class CommonPage extends Person{
    public void clickElement(){
        System.out.println("Click on element.");
    }

    abstract public String getAttribute();
    abstract public String getCssValue();
}
