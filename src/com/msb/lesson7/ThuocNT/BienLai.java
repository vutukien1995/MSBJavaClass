package com.msb.lesson7.ThuocNT;

public class BienLai {
	private KhachHang khachhang;
	private float sodiencu;
	private float sodienmoi;
	private float tiendien;
	public KhachHang getKhachhang() {
		return khachhang;
	}
	public void setKhachhang(KhachHang khachhang) {
		this.khachhang = khachhang;
	}
	public float getSodiencu() {
		return sodiencu;
	}
	public void setSodiencu(float sodiencu) {
		this.sodiencu = sodiencu;
	}
	public float getSodienmoi() {
		return sodienmoi;
	}
	public void setSodienmoi(float sodienmoi) {
		this.sodienmoi = sodienmoi;
	}
		
	public float getTiendien() {
		return tiendien;
	}
	public void setTiendien(float tiendien) {
		this.tiendien = tiendien;
	}
	public BienLai(KhachHang khachhang, float sodiencu, float sodienmoi) {
		super();
		this.khachhang = khachhang;
		this.sodiencu = sodiencu;
		this.sodienmoi = sodienmoi;
	}
	
	public float tinhTienDien() {
		this.tiendien = (this.sodienmoi - this.sodiencu)*5;
		return tiendien;
	}
	
	

}
