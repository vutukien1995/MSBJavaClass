package com.msb.final_exam.TanNT9.bai2;

import java.util.Scanner;

public class Main {
    static NhanVien[] nhanViens = new NhanVien[1000];
    static int soNV = 0;
    static PhongBan[] phongBans = new PhongBan[100];
    static int soPhongBan = 0;

    public Main() {
    }

    public static void main(String[] args) {
        PhongBan PhongCN = new PhongBan("Phòng Công nghệ", "tầng 7, TNR 54 Nguyễn Chí Thanh");
        PhongBan PhongKD = new PhongBan("Phòng Kinh doanh", "tầng 29, TNR 54 Nguyễn Chí Thanh");
        PhongBan PhongNS = new PhongBan("Phòng Nhân sự", "tầng 30, TNR 54 Nguyễn Chí Thanh");
        themPhongBan(PhongCN);
        themPhongBan(PhongKD);
        themPhongBan(PhongNS);
        NhanVien NV1 = new NhanVien("A", 23, "Chuyên viên Kiểm thử", 90);
        NhanVien NV2 = new NhanVien("B", 24, "Chuyên viên PTNV", 100);
        NhanVien NV3 = new NhanVien("C", 25, "Chuyên viên PTDL", 80);
        NhanVien NV4 = new NhanVien("D", 27, "Sale 1", 90);
        NhanVien NV5 = new NhanVien("E", 28, "Sale 2", 90);
        NhanVien NV6 = new NhanVien("F", 29, "Tuyển dụng NS", 70);
        NV1.setPhongBan(PhongCN);
        themNV(NV1);
        NV2.setPhongBan(PhongCN);
        themNV(NV2);
        NV3.setPhongBan(PhongCN);
        themNV(NV3);
        NV4.setPhongBan(PhongKD);
        themNV(NV4);
        NV5.setPhongBan(PhongKD);
        themNV(NV5);
        NV6.setPhongBan(PhongNS);
        themNV(NV6);
        boolean isExit = true;

        while(true) {
            while(isExit) {
                String var11;
                switch((var11 = menu()).hashCode()) {
                    case 49:
                        if (var11.equals("1")) {
                            showDanhSachNV();
                            continue;
                        }
                        break;
                    case 50:
                        if (var11.equals("2")) {
                            nhapNV();
                            continue;
                        }
                        break;
                    case 51:
                        if (var11.equals("3")) {
                            suaNV();
                            continue;
                        }
                        break;
                    case 52:
                        if (var11.equals("4")) {
                            xoaNV();
                            continue;
                        }
                        break;
                    case 53:
                        if (var11.equals("5")) {
                            showAverageKpi();
                            continue;
                        }
                        break;
                    case 54:
                        if (var11.equals("6")) {
                            isExit = false;
                            System.out.println("Kết thúc");
                            continue;
                        }
                }

                System.out.println("Nhập trong menu (1-6)");
            }

            return;
        }
    }

    public static String menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Menu: ");
        System.out.println("1. Hiển thị tất cả Nhân viên");
        System.out.println("2. Thêm Nhân viên");
        System.out.println("3. Sửa Nhân viên");
        System.out.println("4. Xóa Nhân viên");
        System.out.println("5. Hiển thị Nhân viên theo phòng ban");
        System.out.println("6. Kết thúc");
        return sc.nextLine();
    }

    public static void showDanhSachNV() {
        if (soNV == 0) {
            System.out.println("Danh sách nhân viên rỗng !");
        } else {
            for(int i = 0; i < soNV; ++i) {
                System.out.println("- Nhân viên " + (i + 1) + ": ");
                nhanViens[i].showNhanVien();
            }
        }

    }

    public static void themNV(NhanVien nhanVien) {
        nhanViens[soNV] = nhanVien;
        ++soNV;
    }

    public static void themPhongBan(PhongBan phongBan) {
        phongBans[soPhongBan] = phongBan;
        ++soPhongBan;
    }

    public static void showDanhSachPhongBan() {
        if (soPhongBan == 0) {
            System.out.println("Danh sách phòng ban rỗng !");
        } else {
            for(int i = 0; i < soPhongBan; ++i) {
                System.out.print("\t Phòng " + (i + 1) + ": ");
                phongBans[i].showPhongBan();
            }
        }

    }

    public static void nhapNV() {
        NhanVien nhanVien = new NhanVien();
        nhanVien.nhapNhanVien();
        showDanhSachPhongBan();
        Scanner sc = new Scanner(System.in);
        int inputInt = sc.nextInt();
        if (inputInt == 1) {
            nhanVien.setPhongBan(phongBans[0]);
            themNV(nhanVien);
            showDanhSachNV();
        }

        if (inputInt == 2) {
            nhanVien.setPhongBan(phongBans[1]);
            themNV(nhanVien);
            showDanhSachNV();
        }

        if (inputInt == 3) {
            nhanVien.setPhongBan(phongBans[2]);
            themNV(nhanVien);
            showDanhSachNV();
        }

    }

    public static void suaNV() {
        while(true) {
            System.out.println("Bạn muốn sửa thông tin Nhân viên số: ");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            if (input != 0 && input <= soNV) {
                nhanViens[input - 1].nhapNhanVien();
                showDanhSachPhongBan();
                Scanner scanner = new Scanner(System.in);
                int inputInt = scanner.nextInt();
                if (inputInt == 1) {
                    nhanViens[input - 1].setPhongBan(phongBans[0]);
                    showDanhSachNV();
                }

                if (inputInt == 2) {
                    nhanViens[input - 1].setPhongBan(phongBans[1]);
                    showDanhSachNV();
                }

                if (inputInt == 3) {
                    nhanViens[input - 1].setPhongBan(phongBans[2]);
                    showDanhSachNV();
                }

                return;
            }

            System.out.println("Không có nhân viên hợp lệ");
        }
    }

    public static void xoaNV() {
        while(true) {
            System.out.println("Bạn muốn xóa nhân viên số: ");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            if (input != 0 && input <= soNV) {
                --input;

                for(int i = 0; i < soNV; ++i) {
                    if (i >= input) {
                        nhanViens[i] = nhanViens[i + 1];
                    }
                }

                --soNV;
                return;
            }

            System.out.println("Không có Nhân viên hợp lệ");
        }
    }

    public static void showAverageKpi() {
        if (soNV == 0) {
            System.out.println("Danh sách nhân viên rỗng!");
        } else {
            for(int j = 0; j < soPhongBan; ++j) {
                float total = 0.0F;
                int demNV = 0;
                phongBans[j].showPhongBan();

                for(int i = 0; i < soNV; ++i) {
                    if (nhanViens[i].getPhongBan().equals(phongBans[j])) {
                        nhanViens[i].showNhanVien1();
                        System.out.print("\n");
                        total += (float)nhanViens[i].getKPI();
                        ++demNV;
                    }
                }

                float avg = total / (float)demNV;
                System.out.println("\t => Trung bình KPI: " + avg + "\n");
            }
        }

    }
}