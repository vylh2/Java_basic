package Bai2_TinhTruTuong;

public class SinhVien extends Person {

    //Triển khai tính trừu tượng
    @Override
    protected void getInfo() {
        System.out.println("Get info in SinhVien class");
    }

    @Override
    public void clickElement() {

    }

    @Override
    public void setText() {

    }

    public static void main(String[] args) {
        SinhVien sinhVien = new SinhVien();
        System.out.println(sinhVien.getName());

        sinhVien.getInfo();
    }
}
