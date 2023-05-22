 package QuanLiPhongMay;

public class CauHinh extends PhongMay {
    private String tenCauHinh;
    private String maCauHinh;
    private String khoa;
    private String cpu;
    private int chuot, banPhim;
    
public CauHinh(){
        super();
}
public CauHinh(String tenCauHinh, String maCauHinh, String khoa, String cpu, int chuot, int banPhim){
    super();
    this.tenCauHinh = tenCauHinh;
    this.maCauHinh = maCauHinh;
    this.cpu = cpu;
    this.chuot = chuot;
    this.banPhim = banPhim;   
}
public String getMaCauHinh(){
    return maCauHinh;
}
public void setMaCauHinh(String maCauHinh){
    this.maCauHinh = maCauHinh;    
}
public String getTenCauHinh(){
    return tenCauHinh;

}
public void setTenCauHinh(String tenCauHinh){
    this.tenCauHinh = tenCauHinh;
}
public String getCpu(){
    return cpu;
}
public void setCpu(String cpu){
    this.cpu = cpu;

}
public int getChuot(){
    return chuot;
}
public void setChuot(int chuot){
    this.chuot = chuot;
}
public int getBanPhim(){
    return banPhim;
} 
public void setBanPhim(int banPhim){
    this.banPhim = banPhim;
}
}
