import java.util.Scanner;

public class Bai1Ss3 {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //nhập dữ liệu
        System.out.println("nhập tên khách hang");
        String tenKhachHang = sc.nextLine();
        System.out.println("nhập tên sản phâm ");
        String tenSanPham = sc.nextLine();
        System.out.println("nhập giá sản phẩm ");
        double giaSanPham = sc.nextInt();
        System.out.println(" nhap so luong mua");
        int soLuongMua = sc.nextInt();
        System.out.print(" khach co the thanh vien hay khong");
        boolean laThanhVien = sc.nextBoolean();

        // tinh san pham
        double thanhTien = giaSanPham * soLuongMua;
        double giamGia = laThanhVien ? thanhTien * 0.1 : 0;
        double vat = thanhTien * 0.08;
        double sumThanhToan = thanhTien - giamGia + vat;

        //in ra ket qua
        System.out.println("\n Khach hang :  " + tenKhachHang);
        System.out.println(" \n Ten san pham : " + tenSanPham);
        System.out.println("\n So luong san pham : " + soLuongMua);
        System.out.println("\n Don gia : " + giaSanPham);
        System.out.println("\n Thanh Tien : " + thanhTien);
        System.out.println("\n Giam Gia : " + giamGia);
        System.out.println("\n Thanh Toan Vat : " + vat);
        System.out.println("\n Tong so tien thanh toan : " + sumThanhToan);

    }
}
