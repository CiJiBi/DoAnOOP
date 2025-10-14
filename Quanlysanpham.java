package doan;
import java.util.*;

public class Quanlysanpham {
    private final List<SanPham> dssanpham = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    public void menu(){
        int choice;
        do{
        System.out.println("\n-----MENU-----");
        System.out.println("1.Them san pham");
        System.out.println("2.Hien thi danh sach san pham");
        System.out.println("3.Tim kiem san pham theo ma");
        System.out.println("4.Thoat");
        System.out.println("--------------");
        System.out.println("Nhap lua chon cua ban: ");
        choice=sc.nextInt();
        sc.nextLine();
        switch(choice)
        {
            case 1:
                themsanpham();
                break;
            case 2:
                hienthids();
                break;
            case 3:
                timkiemtheoma();
                break;
            case 4:
                System.out.println("Thoat chuong trinh");
                break;
            default:
                System.out.println("Lua chon khong hop le. Vui long chon lai!");
        }
    }while(choice!=4);
}
public void themsanpham()
{
    SanPham sp=new SanPham();
    sp.nhap();
    dssanpham.add(sp);
    System.out.println("Them san pham thanh cong!");
}
public void hienthids()
{
    System.out.printf("%-15s %-15s %15s %15s\n","Ma SP","Ten SP","Don gia","Thanh tien");
    for(SanPham sp:dssanpham)
    {
        sp.xuat();
    }
}
public void timkiemtheoma()
{
    System.out.println("Nhap ma san pham can tim: ");
    String ma=sc.nextLine();
    boolean found=false;
    System.out.printf("%-15s %-15s %15s %15s\n","Ma SP","Ten SP","Don gia","Thanh tien");
    for(SanPham sp:dssanpham)
    {
        if(sp.getMasp().equalsIgnoreCase(ma))
        {
            sp.xuat();
            found=true;
        }
    }
    if(!found)
    {
        System.out.println("Khong tim thay san pham co ma: "+ma);
    }
}
public static void main(String[] args) {
    Quanlysanpham qlsp=new Quanlysanpham();
    qlsp.menu();
}
}