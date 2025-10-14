package doan;
import java.util.Scanner;
class SanPham
{
    private String masp;
    private String tensp;
    private double dongia;
    private double Soluong;
public SanPham()
{
    masp="";
    tensp="";
    dongia=0;
    Soluong=0;
}
public SanPham(String masp, String tensp, double dongia, double Soluong)
{
    this.masp=masp;
    this.tensp=tensp;
    this.dongia=dongia;
    this.Soluong=Soluong;
}
public void nhap()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Nhap ma san pham: ");
    masp=sc.nextLine();
    System.out.println("Nhap ten san pham: ");
    tensp=sc.nextLine();
    System.out.println("Nhap don gia: ");
    dongia=sc.nextDouble();
    System.out.println("Nhap so luong: ");
    Soluong=sc.nextDouble();
    sc.nextLine();
}
public double getThanhTien()
{
    return dongia*Soluong;
}
public void xuat()
{
    System.out.printf("%-15s %-15s %15.3f %15.3f\n",masp,tensp,dongia,getThanhTien());
}
public String getMasp() {
    return masp;
}
}
