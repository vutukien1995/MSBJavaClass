package com.msb.learn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Employee[] array = new Employee[100];
        int index = 0;

        System.out.println("Start: ");

        while (true) {
            String inputString = scanner.nextLine();
            if ("add_new".equals(inputString)) {
                Employee newEmployee = new Employee();

                // Nhap ten
                System.out.println("Nhập tên: ");
                String name = scanner.nextLine();
                newEmployee.setName(name);

                // Nhap tuoi
                while (true) {
                    try {
                        System.out.println("Nhập tuổi: ");
                        String age = scanner.nextLine();
                        newEmployee.setAge(Integer.parseInt(age));
                        break;
                    } catch (Exception e) {
                        System.out.println("Tuổi không đúng!");
                    }
                }

                // Nhap que quan
                System.out.println("Nhập quê quán: ");
                String country = scanner.nextLine();
                newEmployee.setCountry(country);

                System.out.println("Nhập thành công !");

                array[index] = newEmployee;
                index++;
            }

            if ("report".equals(inputString)) {
                for(int i = 0; i<index; i++) {
                    System.out.println((i+1) + ": " + array[i].getName() + " - " + array[i].getAge() + " - " + array[i].getCountry());
                }
            }
        }
    }
}
