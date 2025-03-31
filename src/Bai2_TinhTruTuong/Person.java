package Bai2_TinhTruTuong;

abstract public class Person {

    public String name = "Anh Tester";

    public String getName(){
        return name;
    }

    abstract protected void getInfo(); //Đã thể hiện tính trừu tượng

    abstract public void clickElement();
    abstract public void setText();

}
