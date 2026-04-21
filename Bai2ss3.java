
import java.util.ArrayList;
import java.util.Scanner;

    public class Bai2ss3 {

        static ArrayList<Double> danhSachDiem = new ArrayList<>();
        static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            while (true) {
                hienThiMenu();
                System.out.print("Nhap lua chon cua ban: ");
                String input = scanner.nextLine().trim();

                switch (input) {
                    case "1":
                        nhapDiem();
                        break;
                    case "2":
                        hienThiThongKe();
                        break;
                    case "3":
                        thoat();
                        break;
                    default:
                        System.out.println(">>> Lua chon khong hop le! Vui long chon lai (1-3).\n");
                }
            }
        }

        // ─── Hiển thị menu ───────────────────────────────────────────────────────────
        static void hienThiMenu() {
            System.out.println("╔══════════════════════════════════════╗");
            System.out.println("║    QUAN LY DIEM SO HOC VIEN          ║");
            System.out.println("╠══════════════════════════════════════╣");
            System.out.println("║  1. Nhap diem hoc vien               ║");
            System.out.println("║  2. Hien thi thong ke                ║");
            System.out.println("║  3. Thoat chuong trinh               ║");
            System.out.println("╚══════════════════════════════════════╝");
        }

        // ─── Xếp loại học lực ────────────────────────────────────────────────────────
        static String xepLoai(double diem) {
            if (diem < 5.0)       return "Yeu";
            else if (diem < 7.0)  return "Trung Binh";
            else if (diem < 8.0)  return "Kha";
            else if (diem < 9.0)  return "Gioi";
            else                  return "Xuat Sac";
        }

        // ─── Chức năng 1: Nhập điểm ──────────────────────────────────────────────────
        static void nhapDiem() {
            System.out.println("\n===== NHAP DIEM HOC VIEN =====");
            System.out.println("(Nhap -1 de ket thuc nhap diem)");

            int soHocVienNhapMoi = 0;

            while (true) {
                System.out.print("Nhap diem: ");
                String line = scanner.nextLine().trim();

                double diem;
                try {
                    diem = Double.parseDouble(line);
                } catch (NumberFormatException e) {
                    System.out.println(">>> Canh bao: Gia tri khong hop le! Vui long nhap so trong khoang 0-10 hoac -1 de ket thuc.\n");
                    continue;
                }

                // Kết thúc nhập
                if (diem == -1) {
                    if (soHocVienNhapMoi == 0) {
                        System.out.println(">>> Khong co diem nao duoc nhap.\n");
                    } else {
                        System.out.println(">>> Da ket thuc nhap diem.");
                        System.out.println(">>> Tong so hoc vien da nhap them: " + soHocVienNhapMoi);
                        System.out.println(">>> Tong so hoc vien hien tai    : " + danhSachDiem.size());

                        double tongDiem = 0, max = danhSachDiem.get(0), min = danhSachDiem.get(0);
                        for (double d : danhSachDiem) {
                            tongDiem += d;
                            if (d > max) max = d;
                            if (d < min) min = d;
                        }
                        System.out.printf(">>> Tong diem                     : %.2f%n", tongDiem);
                        System.out.printf(">>> Diem cao nhat                 : %.2f%n", max);
                        System.out.printf(">>> Diem thap nhat                : %.2f%n%n", min);
                    }
                    break;
                }

                // Kiểm tra khoảng hợp lệ
                if (diem < 0 || diem > 10) {
                    System.out.println(">>> Canh bao: Diem phai trong khoang 0-10! Vui long nhap lai.\n");
                    continue;
                }

                // Lưu và in xếp loại
                danhSachDiem.add(diem);
                soHocVienNhapMoi++;
                System.out.printf(">>> Hoc vien #%d | Diem: %.2f | Xep loai: %s%n%n",
                        danhSachDiem.size(), diem, xepLoai(diem));
            }
        }

        // ─── Chức năng 2: Hiển thị thống kê ─────────────────────────────────────────
        static void hienThiThongKe() {
            System.out.println("\n===== THONG KE DIEM SO =====");

            if (danhSachDiem.isEmpty()) {
                System.out.println(">>> Chua co du lieu.\n");
                return;
            }

            double tongDiem = 0, max = danhSachDiem.get(0), min = danhSachDiem.get(0);
            for (double d : danhSachDiem) {
                tongDiem += d;
                if (d > max) max = d;
                if (d < min) min = d;
            }

            double trungBinh = tongDiem / danhSachDiem.size();

            System.out.println("------------------------------------");
            System.out.printf("  So hoc vien da nhap : %d%n",       danhSachDiem.size());
            System.out.printf("  Diem trung binh      : %.2f%n",    trungBinh);
            System.out.printf("  Diem cao nhat        : %.2f (%s)%n", max, xepLoai(max));
            System.out.printf("  Diem thap nhat       : %.2f (%s)%n", min, xepLoai(min));
            System.out.println("------------------------------------\n");
        }

        // ─── Chức năng 3: Thoát ──────────────────────────────────────────────────────
        static void thoat() {
            System.out.println("\n>>> Cam on ban da su dung chuong trinh!");
            System.out.println(">>> Tam biet! Hen gap lai.\n");
            System.exit(0);
        }
    }

