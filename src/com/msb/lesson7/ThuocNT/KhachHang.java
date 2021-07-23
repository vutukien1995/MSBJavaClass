package com.msb.lesson7.ThuocNT;

public class KhachHang {
	private String hotenchuho;
	private String diachi;
	private String macongto;
	
	public KhachHang(String hotenchuho, String diachi, String macongto) {
		super();
		this.hotenchuho = hotenchuho;
		this.diachi = diachi;
		this.macongto = macongto;
	}

	public String getHotenchuho() {
		return hotenchuho;
	}

	public void setHotenchuho(String hotenchuho) {
		this.hotenchuho = hotenchuho;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getMacongto() {
		return macongto;
	}

	public void setMacongto(String macongto) {
		this.macongto = macongto;
	}
	
	public void DeleteHotenchuho() {
		this.hotenchuho = "";
	}
	
	public void DeleteDiachi() {
		this.diachi = "";
	}
	
	public void DeleteMacongto() {
		this.macongto = "";
	}

}
