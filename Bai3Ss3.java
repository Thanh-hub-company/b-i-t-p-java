import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class Bai3Ss3 {

        static List<Double> danhSachLuong = new ArrayList<>();
        static double tongLuong = 0;
        static double luongCaoNhat = Double.MIN_VALUE;
        static double luongThapNhat = Double.MAX_VALUE;
        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            int luaChon;
            do {
                hienThiMenu();
                System.out.print("Nhap lua chon cua ban: ");
                luaChon = docSoNguyen();
                switch (luaChon) {
                    case 1 -> nhapLuongNhanVien();
                    case 2 -> hienThiThongKe();
                    case 3 -> tinhTienThuong();
                    case 4 -> thoatChuongTrinh();
                    default -> System.out.println(">>> Lua chon khong hop le! Vui long chon lai.\n");
                }
            } while (luaChon != 4);
        }

        // ===================== MENU =====================
        static void hienThiMenu() {
            System.out.println("╔══════════════════════════════════════════╗");
            System.out.println("║     QUAN LY LUONG NHAN VIEN              ║");
            System.out.println("╠══════════════════════════════════════════╣");
            System.out.println("║  1. Nhap luong nhan vien                 ║");
            System.out.println("║  2. Hien thi thong ke                    ║");
            System.out.println("║  3. Tinh tong tien thuong                ║");
            System.out.println("║  4. Thoat chuong trinh                   ║");
            System.out.println("╚══════════════════════════════════════════╝");
        }

        // ===================== CHUC NANG 1: NHAP LUONG =====================
        static void nhapLuongNhanVien() {
            System.out.println("\n===== NHAP LUONG NHAN VIEN =====");
            System.out.println("(Nhap -1 de ket thuc qua trinh nhap)");
            System.out.println("Luong hop le: 0 den 500,000,000 dong\n");

            int soNhanVienMoi = 0;

            while (true) {
                System.out.print("Nhap luong nhan vien " + (danhSachLuong.size() + 1) + ": ");
                double luong = docSoThuc();

                if (luong == -1) {
                    System.out.println(">>> Ket thuc nhap lieu.");
                    break;
                }

                if (luong < 0 || luong > 500_000_000) {
                    System.out.println(">>> Luong khong hop le! Vui long nhap lai (0 - 500,000,000).");
                    continue;
                }

                danhSachLuong.add(luong);
                tongLuong += luong;
                soNhanVienMoi++;

                if (luong > luongCaoNhat) luongCaoNhat = luong;
                if (luong < luongThapNhat) luongThapNhat = luong;

                String phanLoai = phanLoaiLuong(luong);
                System.out.printf(">>> Phan loai: %s%n%n", phanLoai);
            }

            if (soNhanVienMoi > 0) {
                System.out.println("\n---- TONG KET NHAP LIEU ----");
                System.out.printf("Tong nhan vien da nhap: %d nguoi%n", danhSachLuong.size());
                System.out.printf("Tong luong          : %,.0f dong%n", tongLuong);
                System.out.printf("Luong cao nhat      : %,.0f dong%n", luongCaoNhat);
                System.out.printf("Luong thap nhat     : %,.0f dong%n", luongThapNhat);
            } else {
                System.out.println(">>> Khong co du lieu moi nao duoc nhap.");
            }
            System.out.println();
        }

        static String phanLoaiLuong(double luong) {
            if (luong < 5_000_000)        return "Thu nhap thap       (< 5 trieu)";
            else if (luong < 15_000_000)  return "Thu nhap trung binh  (5 - 15 trieu)";
            else if (luong <= 50_000_000) return "Thu nhap kha        (15 - 50 trieu)";
            else                          return "Thu nhap cao        (> 50 trieu)";
        }

        // ===================== CHUC NANG 2: THONG KE =====================
        static void hienThiThongKe() {
            System.out.println("\n===== THONG KE LUONG NHAN VIEN =====");

            if (danhSachLuong.isEmpty()) {
                System.out.println(">>> Chua co du lieu nhan vien nao!\n");
                return;
            }

            double luongTrungBinh = tongLuong / danhSachLuong.size();

            System.out.printf("So nhan vien       : %d nguoi%n",   danhSachLuong.size());
            System.out.printf("Luong trung binh   : %,.0f dong%n", luongTrungBinh);
            System.out.printf("Luong cao nhat     : %,.0f dong%n", luongCaoNhat);
            System.out.printf("Luong thap nhat    : %,.0f dong%n", luongThapNhat);
            System.out.printf("Tong tien luong    : %,.0f dong%n", tongLuong);
            System.out.println();
        }

        // ===================== CHUC NANG 3: TINH THUONG =====================
        static void tinhTienThuong() {
            System.out.println("\n===== TINH TONG TIEN THUONG NHAN VIEN =====");

            if (danhSachLuong.isEmpty()) {
                System.out.println(">>> Chua co du lieu nhan vien nao!\n");
                return;
            }

            System.out.println("Chinh sach thuong:");
            System.out.println("  0   - 5M       :  5%");
            System.out.println("  5M  - 15M      : 10%");
            System.out.println("  15M - 50M      : 15%");
            System.out.println("  50M - 100M     : 20%");
            System.out.println("  > 100M         : 25%");
            System.out.println();

            double tongThuong = 0;
            for (double luong : danhSachLuong) {
                tongThuong += luong * tiLeThuong(luong);
            }

            System.out.printf("Tong so nhan vien    : %d nguoi%n",    danhSachLuong.size());
            System.out.printf("Tong luong           : %,.0f dong%n",  tongLuong);
            System.out.printf("Tong tien thuong     : %,.0f dong%n",  tongThuong);
            System.out.printf("Trung binh thuong/NV : %,.0f dong%n",  tongThuong / danhSachLuong.size());
            System.out.println();
        }

        static double tiLeThuong(double luong) {
            if (luong <= 5_000_000)        return 0.05;
            else if (luong <= 15_000_000)  return 0.10;
            else if (luong <= 50_000_000)  return 0.15;
            else if (luong <= 100_000_000) return 0.20;
            else                           return 0.25;
        }

        // ===================== CHUC NANG 4: THOAT =====================
        static void thoatChuongTrinh() {
            System.out.println("\n========================================");
            System.out.println("  Cam on ban da su dung chuong trinh!");
            System.out.println("  Hen gap lai. Tam biet!");
            System.out.println("========================================\n");
            System.exit(0);
        }

        // ===================== UTILITY =====================
        static int docSoNguyen() {
            while (true) {
                try {
                    String line = sc.nextLine().trim();
                    return Integer.parseInt(line);
                } catch (NumberFormatException e) {
                    System.out.print(">>> Vui long nhap so nguyen hop le: ");
                }
            }
        }

        static double docSoThuc() {
            while (true) {
                try {
                    String line = sc.nextLine().trim();
                    return Double.parseDouble(line);
                } catch (NumberFormatException e) {
                    System.out.print(">>> Vui long nhap so hop le: ");
                }
            }
        }
    }
