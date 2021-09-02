package com.msb.final_exam.AnhNTL19.bai2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    static ArrayList<Phongban> phongBanList = new ArrayList();
    static ArrayList<Nhanvien> nhanVienList = new ArrayList();
    static int sonhanvien;

    public Main() {
    }

    public static void main(String[] args) {
        Phongban PB1 = new Phongban("Phòng Công nghệ", "tầng 7, TNR 54 Nguyễn Chí Thanh");
        Phongban PB2 = new Phongban("Phòng Kinh doanh", "tấng 29, TNR 54 Nguyễn Chí Thanh");
        Phongban PB3 = new Phongban("Phòng Nhân sự", "tấng 30, TNR 54 Nguyễn Chí Thanh");
        phongBanList.add(PB1);
        phongBanList.add(PB2);
        phongBanList.add(PB3);
        Scanner sc = new Scanner(System.in);
        System.out.println("Số nhân viên: ");
        sonhanvien = sc.nextInt();
        if (sonhanvien == 0) {
            System.out.println("Vui lòng nhập số nhân viên hợp lệ");
            sonhanvien = sc.nextInt();
        }

        for(int i = 0; i < sonhanvien; ++i) {
            themNV();
        }

        boolean isExit = true;

        while(true) {
            while(isExit) {
                String var6;
                switch((var6 = menu()).hashCode()) {
                    case 49:
                        if (var6.equals("1")) {
                            showDS();
                            continue;
                        }
                        break;
                    case 50:
                        if (var6.equals("2")) {
                            themNV();
                            ++sonhanvien;
                            continue;
                        }
                        break;
                    case 51:
                        if (var6.equals("3")) {
                            suaNV();
                            continue;
                        }
                        break;
                    case 52:
                        if (var6.equals("4")) {
                            xoaNV();
                            continue;
                        }
                        break;
                    case 53:
                        if (var6.equals("5")) {
                            HienThiTheoPhong();
                            continue;
                        }
                        break;
                    case 54:
                        if (var6.equals("6")) {
                            showAverageKpi();
                            continue;
                        }
                        break;
                    case 55:
                        if (var6.equals("7")) {
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
        System.out.println("1. Show DS Nhân viên.");
        System.out.println("2. Thêm Nhân Viên.");
        System.out.println("3. Sửa Nhân Viên.");
        System.out.println("4. Xóa Nhân viên.");
        System.out.println("5. Show DS Nhân viên theo phòng ban.");
        System.out.println("6. Trung Bình KPI theo phòng ban.");
        System.out.println("7. Kết thúc.");
        return sc.nextLine();
    }

    public static String menuPhong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn phòng cho nhân viên, nhập từ 1 đến 3: ");
        int thutu = 1;

        for(Iterator var3 = phongBanList.iterator(); var3.hasNext(); ++thutu) {
            Phongban i = (Phongban)var3.next();
            System.out.println(thutu + ": " + i.getTenPB());
        }

        return sc.nextLine();
    }

    public static void showDS() {
        System.out.println("Danh sách nhân viên công ty: ");
        int index = 1;

        for(Iterator var2 = nhanVienList.iterator(); var2.hasNext(); ++index) {
            Nhanvien nv = (Nhanvien)var2.next();
            System.out.print("\n" + index + ".");
            nv.show();
        }

    }

    public static void themNV() {
        Nhanvien nv = new Nhanvien();
        nv.nhap();
        boolean isExit = true;

        while(true) {
            while(isExit) {
                String var2;
                switch((var2 = menuPhong()).hashCode()) {
                    case 49:
                        if (var2.equals("1")) {
                            nv.setPhongBan((Phongban)phongBanList.get(0));
                            isExit = false;
                            continue;
                        }
                        break;
                    case 50:
                        if (var2.equals("2")) {
                            nv.setPhongBan((Phongban)phongBanList.get(1));
                            isExit = false;
                            continue;
                        }
                        break;
                    case 51:
                        if (var2.equals("3")) {
                            nv.setPhongBan((Phongban)phongBanList.get(2));
                            isExit = false;
                            continue;
                        }
                }

                System.out.println("Chỉ được nhập giá trị phòng ban từ 1 đến 3");
            }

            nhanVienList.add(nv);
            return;
        }
    }

    public static void HienThiTheoPhong() {
        System.out.println("Danh sách nhân viên theo phòng: ");
        Iterator var1 = phongBanList.iterator();

        while(var1.hasNext()) {
            Phongban phong = (Phongban)var1.next();
            System.out.println("\n" + phong.getTenPB());
            Iterator var3 = nhanVienList.iterator();

            while(var3.hasNext()) {
                Nhanvien nv = (Nhanvien)var3.next();
                if (phong == nv.getPhongBan()) {
                    nv.show();
                }
            }
        }

    }

    public static void suaNV() {
        showDS();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nBạn muốn sửa nhân viên thứ: ");
        int nhanvienso = sc.nextInt();
        --nhanvienso;
        System.out.println("Nhập thông tin mới cho nhân viên bạn muốn sửa: ");
        Nhanvien nv = new Nhanvien();
        nv.nhap();
        boolean isExit = true;

        while(true) {
            while(isExit) {
                String var4;
                switch((var4 = menuPhong()).hashCode()) {
                    case 49:
                        if (var4.equals("1")) {
                            nv.setPhongBan((Phongban)phongBanList.get(0));
                            isExit = false;
                            continue;
                        }
                        break;
                    case 50:
                        if (var4.equals("2")) {
                            nv.setPhongBan((Phongban)phongBanList.get(1));
                            isExit = false;
                            continue;
                        }
                        break;
                    case 51:
                        if (var4.equals("3")) {
                            nv.setPhongBan((Phongban)phongBanList.get(2));
                            isExit = false;
                            continue;
                        }
                }

                System.out.println("Chỉ được nhập giá trị phòng ban từ 1 đến 3");
            }

            nhanVienList.set(nhanvienso, nv);
            return;
        }
    }

    public static void xoaNV() {
        showDS();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nBạn muốn xóa nhân viên thứ: ");
        int nhanvienso = sc.nextInt();
        --nhanvienso;
        nhanVienList.remove(nhanvienso);
        --sonhanvien;
    }

    public static void showAverageKpi() {
        Iterator var1 = phongBanList.iterator();

        while(var1.hasNext()) {
            Phongban phong = (Phongban)var1.next();
            float diemKpi = 0.0F;
            int soNV = 0;
            Iterator var5 = nhanVienList.iterator();

            while(var5.hasNext()) {
                Nhanvien nv = (Nhanvien)var5.next();
                if (phong == nv.getPhongBan()) {
                    diemKpi += (float)nv.getKpi();
                    ++soNV;
                }
            }

            if (soNV > 0) {
                float trungbinh = diemKpi / (float)soNV;
                System.out.println(phong.getTenPB() + " điểm trung bình KPI: " + trungbinh);
            } else {
                System.out.println(phong.getTenPB() + " chưa có nhân viên");
            }
        }

    }
}
