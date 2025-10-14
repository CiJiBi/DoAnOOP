import java.util.Scanner;
package doan;
public class nhanvien {
private String manv;
private String tennv;
private String diachi;  
private String sdt;
private String chucvu;
private double luong;
public nhanvien()
 {
    manv="";
    tennv="";
    diachi="";
    sdt="";
    chucvu="";
    luong=0;
 }
    public nhanvien(String manv, String tennv, String diachi, String sdt, String chucvu, double luong)
    {
        this.manv=manv;
        this.tennv=tennv;
        this.diachi=diachi;
        this.sdt=sdt;
        this.chucvu=chucvu;
        this.luong=luong;   
    }
    public void nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma nhan vien: ");
        manv=sc.nextLine();
        System.out.println("Nhap ten nhan vien: ");
        tennv=sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diachi=sc.nextLine();
        System.out.println("Nhap so dien thoai: ");
        sdt=sc.nextLine();
    }   
	public void xuat()
    {
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15.3f\n",manv,tennv,diachi,sdt,chucvu,luong);
    }
    public String getManv() {
        return manv;
    }
}

