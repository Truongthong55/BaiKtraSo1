package QuanLiPhongMay;
import java.util.Scanner;
public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private int soLuongMay;
    private String khoa;
    private String trangThai;
    private String ghiChu;
    Scanner scanner = new Scanner(System.in);
public PhongMay(){

}
public PhongMay(String maPhong, String tenPhong, String khoa, String trangThai, String ghiChu, int soLuongMay){
    this.maPhong = maPhong;
    this.tenPhong = tenPhong;
    this.soLuongMay = soLuongMay;
    this.khoa = khoa;
    this.trangThai = trangThai;
    this. ghiChu = ghiChu;
}
public String getMaPhong(){
    return maPhong;
}
public void setMaPhong(String maPhong){
    this.maPhong = maPhong;

}
public String getTenPhong(){
    return tenPhong;   
}
public void setTenPhong(String tenPhong){
    this.tenPhong = tenPhong;   
}
public String getKhoa(){
    return khoa;
}
public void setKhoa(String khoa){
    this.khoa = khoa;  
}
public String getTrangThai(){
    return trangThai;
}
public void setTrangThai(String trangThai){
    this.trangThai = trangThai;   
}
public  String getGhiChu(){
    return ghiChu;
}
public void setGhiChu(String ghiChu){
    this.ghiChu = ghiChu;
}
public int getSoLuongMay(){
    return soLuongMay;
}
public void setSoLuongMay(int soLuongMay){
    this.soLuongMay = soLuongMay;
}
public void nhap(){
 System.out.print("Nhap Ma Phong: ");
 maPhong = scanner.nextLine();
 System.out.print("Nhap Ten Phong: ");
 tenPhong = scanner.nextLine();
 System.out.print("Nhap So Luong May: ");
 soLuongMay = scanner.nextInt();
 System.out.print("Nhap Ten Khoa: ");
 khoa = scanner.nextLine();
 System.out.print("Nhap Trang Thai: ");
 trangThai = scanner.nextLine();
 System.out.print("Nhap Ghi Chu: ");
 ghiChu = scanner.nextLine();

}

@Override
public String toString(){
    return "maPhong{" + "tenPhong=" + tenPhong + ", khoa='" + khoa +", trangThai='" + trangThai + ",ghiChu='" + ghiChu +",soLuongMay='" + soLuongMay +'}';
}

}
