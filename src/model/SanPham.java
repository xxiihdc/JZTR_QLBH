/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ductr
 */
public class SanPham {
    private int maHang;
    private int loHang;
    private int maLoai;
    private String tenHang;
    private double giaNhap;
    private double giaBan;
    private int soLuong;
    private String NSX;
    private String HSD;
    private int HSDMin;
    private int soLuongMin;

    public SanPham() {
    }

    public SanPham(int maHang, int loHang, int maLoai, String tenHang, double giaNhap, 
            double giaBan, int soLuong, String NSX, String HSD, int HSDMin, int soLuongMin) {
        this.maHang = maHang;
        this.loHang = loHang;
        this.maLoai = maLoai;
        this.tenHang = tenHang;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.NSX = NSX;
        this.HSD = HSD;
        this.HSDMin = HSDMin;
        this.soLuongMin = soLuongMin;
    }

    /**
     * @return the maHang
     */
    public int getMaHang() {
        return maHang;
    }

    /**
     * @param maHang the maHang to set
     */
    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    /**
     * @return the loHang
     */
    public int getLoHang() {
        return loHang;
    }

    /**
     * @param loHang the loHang to set
     */
    public void setLoHang(int loHang) {
        this.loHang = loHang;
    }

    /**
     * @return the maLoai
     */
    public int getMaLoai() {
        return maLoai;
    }

    /**
     * @param maLoai the maLoai to set
     */
    public void setMaLoai(int maLoai) {
        this.maLoai = maLoai;
    }

    /**
     * @return the tenHang
     */
    public String getTenHang() {
        return tenHang;
    }

    /**
     * @param tenHang the tenHang to set
     */
    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    /**
     * @return the giaNhap
     */
    public double getGiaNhap() {
        return giaNhap;
    }

    /**
     * @param giaNhap the giaNhap to set
     */
    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    /**
     * @return the giaBan
     */
    public double getGiaBan() {
        return giaBan;
    }

    /**
     * @param giaBan the giaBan to set
     */
    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    /**
     * @return the soLuong
     */
    public int getSoLuong() {
        return soLuong;
    }

    /**
     * @param soLuong the soLuong to set
     */
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    /**
     * @return the NSX
     */
    public String getNSX() {
        return NSX;
    }

    /**
     * @param NSX the NSX to set
     */
    public void setNSX(String NSX) {
        this.NSX = NSX;
    }

    /**
     * @return the HSD
     */
    public String getHSD() {
        return HSD;
    }

    /**
     * @param HSD the HSD to set
     */
    public void setHSD(String HSD) {
        this.HSD = HSD;
    }

    /**
     * @return the HSDMin
     */
    public int getHSDMin() {
        return HSDMin;
    }

    /**
     * @param HSDMin the HSDMin to set
     */
    public void setHSDMin(int HSDMin) {
        this.HSDMin = HSDMin;
    }

    /**
     * @return the soLuongMin
     */
    public int getSoLuongMin() {
        return soLuongMin;
    }

    /**
     * @param soLuongMin the soLuongMin to set
     */
    public void setSoLuongMin(int soLuongMin) {
        this.soLuongMin = soLuongMin;
    }
    public boolean isOutOfDate() throws ParseException{
        Date NSXd= new SimpleDateFormat("yyyyMMdd").parse(this.NSX);
        Date HSDd =new SimpleDateFormat("yyyyMMdd").parse(this.HSD);
        int diff=HSDd.getDay()-NSXd.getDay();
        
        return diff<HSDMin;
        
    }
    public boolean isLowAmout(){
        return soLuong<=soLuongMin;
    }
}
