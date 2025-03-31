package Bai2_TinhTruTuong;

public interface PageActions {
    void click(String locator);
    void enterText(String locator, String text);
    String getText(String locator);

    //Interface không được phép xây dựng hàm bình thường
//    String getText(String locator){
//
//    }


}
