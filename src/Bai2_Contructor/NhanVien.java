package Bai2_Contructor;

public class NhanVien {

    private String name;
    private int age;
    private String address;

    //Hàm xây dựng không tham số / mặc định
    public NhanVien() {
        name = "Hương Ly";
        age = 30;
        address = "Huế";
    }

    //Hàm xây dựng có tham số
    public NhanVien(String a, int b, String c){
        name = a;
        age = b;
        address = c;
    }

    public NhanVien(String a, int b, double c){
//        name = a;
//        age = b;
//        address = c;
    }

    public NhanVien(String name){
        this.name = name; //Dùng từ khoá "this" để nhân biệt thành phần trong class và bên ngoài (tham số/class khác)
        age = 30;
        address = "HCM";
        //Tính toán khác
    }

    public NhanVien(String name, int age, String address, String website){
        this.name = name;
        this.age = age;
        this.address = address;
        Customer.WEBSITE = website;
    }

    public void setData(String a, int b, String c){
        name = a;
        age = b;
        address = c;
    }

    public void getInfo() {
        System.out.println(name + " - " + age + " - " + address);
    }

    public static void main(String[] args) {

        NhanVien nhanVien1 = new NhanVien();
        nhanVien1.setData("Hoàng My", 45, "Mỹ Đình"); //Hàm phụ để set data thay cho hàm xây dựng có tham số
        nhanVien1.getInfo();

        NhanVien nhanVien2 = new NhanVien("Yến Nhi", 25, "Hà Nội");
        nhanVien2.getInfo();

        NhanVien nhanVien3 = new NhanVien("Thảo");
        nhanVien3.getInfo();

        NhanVien nhanVien4 = new NhanVien("Long", 40, "Đà Nẵng", "https://crm.anhtester.com/admin/clients/client");
        nhanVien4.getInfo();
        System.out.println(Customer.WEBSITE);
    }

}
