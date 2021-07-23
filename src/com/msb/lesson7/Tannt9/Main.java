package com.msb.lesson7.Tannt9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	int n;
	KHvaBill KHvaBill;
	Scanner sc = new Scanner(System.in);
	ArrayList<KHvaBill> arrKHvaBill = new ArrayList<KHvaBill>();
	
	System.out.println("Bạn muốn thêm hay xóa hay sửa?" );
	while (true) {
		String inputString = sc.nextLine();
		//thêm thông tin khách hàng
        if ("thêm".equals(inputString)) {	
	
		System.out.println("Nhập vào số khách hàng sử dụng điện: ");
		n= sc.nextInt();

		for(int i = 0; i <n; i++)
		{
			 KHvaBill = new KHvaBill();
				System.out.println("Khách hàng thứ " + (i + 1) );
				KHvaBill.nhapThongTin();
				arrKHvaBill.add(KHvaBill);

		}
		for(int i = 0; i < arrKHvaBill.size(); i++) {
			System.out.println("Khách hàng thứ " + (i + 1) + ":"  );
			arrKHvaBill.get(i).hienThongTin();
			}

	}
        //xóa thông tin KH
        if("xóa".equals(inputString)) {
        	if(arrKHvaBill.size() != 0) {
        	System.out.println("Danh sách Khách hàng gồm " + arrKHvaBill.size() + " bản ghi. Bạn muốn xóa bản ghi thứ bao nhiêu?");
   		 		int k;
   		 		k= sc.nextInt(); 
   		 		if(k <= arrKHvaBill.size() && k>0 ) {
   		 			arrKHvaBill.remove(k-1);  
   		 			//in lại thông tin KH
   		 		for(int i = 0; i < arrKHvaBill.size(); i++) {					
   		 		System.out.println("Khách hàng thứ " + (i + 1) + ":"  );
   		 		arrKHvaBill.get(i).hienThongTin();
   		 		}
   		 				 
        	}
   		 		else {
   		 		System.out.println("Xóa không thành công do bạn đã nhập bản ghi không tồn tại");
   		 		}
   		 		
        	}
        	else {
        		System.out.println("Danh sách Khách hàng gồm 0 bản ghi. Vui lòng nhập từ 'thêm'");
        	}      
}
		if("sửa".equals(inputString)) {
			if(arrKHvaBill.size() != 0) {
			System.out.println("Danh sách Khách hàng gồm " + arrKHvaBill.size() + " bản ghi. Bạn muốn sửa bản ghi thứ bao nhiêu?");
				int k;
				k= sc.nextInt();
			 if(k <= arrKHvaBill.size() && k>0 ) {
				System.out.println("Bạn muốn sửa thông tin gì?");
				//em ko biết làm tiếp, đến đây em muốn khi mình chọn thông tin gì (VD: số nhà) thì nó chỉ sửa duy nhất thông tin đó (số nhà)
				 KHvaBill kHvaBill = arrKHvaBill.get(k-1);
				 kHvaBill.nhapThongTin();
			 }
			 }
			else {
				System.out.println("Danh sách Khách hàng gồm 0 bản ghi. Vui lòng nhập từ 'thêm'");
			}
		}
        
}
}
}


