package doan;
import java.util.Scanner;
import java.util.*;
public class main {
    public static void main(String[] args) {
        Quanlysanpham qlsp=new Quanlysanpham();
        Quanlynhanvien qlnv=new Quanlynhanvien();
        Quanlyhoadon qlhd=new Quanlyhoadon(qlsp,qlnv);

    }
    int choice;
    Scanner sc=new Scanner(System.in);
    do{ 
        System.out.println("\n-----Quan ly cua hang quan ao-----");
        System.out.println("1.Quan ly san pham");
        System.out.println("2.Quan ly nhan vien");
        System.out.println("3.Quan ly hoa don");
        System.out.println("4.Thoat");
        System.out.println("Nhap lua chon cua ban: ");
        choice=sc.nextInt();
        sc.nextLine();
        switch(choice)
        {
            case 1:
                qlsp.menu();
                break;
            case 2:
                qlnv.menu();
                break;
            case 3:
                qlhd.menu();
                break;
            case 4:
                System.out.println("Thoat chuong trinh");
                break;
            default:
                System.out.println("Lua chon khong hop le. Vui long chon lai!");
        }
    } while(choice!=4);
    
}
