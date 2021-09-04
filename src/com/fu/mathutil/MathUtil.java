/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author ASUS
 */
//TA VIẾT CÁI CLASS ĐỂ CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI
//KHI TA CUNG CẤP TIỆN ÍCH CHO NỚI KHÁC XÀI, ĐÓ LÀ LÚC TA KHÔNG CẦN NHWOS CÁI GÌ 
//  CHO RIÊNG TA, HÀM STATI GIÚP LÀM ĐIỀU NÀY
public class MathUtil {
    
    //n!= 1.2.3.4.5.6...n
    //quy ước: 0! -1!- 1
    //ko tính giai thừa cho số âm
    //21! là vừa  khớp kiểu long, kiểu long tối đa 18 con sô 0
    //một cái ngoại lệ , chửi éo tinh đc
    
    public static long getFactorial(int n){
       if(n < 0 || n > 20)
           throw new IllegalArgumentException("Invalid argument n must be  between 0..20");
           // hàm dừng liền éo cần return
           
           //xuống đây là n- 0..20 rồi
           if(1 == n && n == 0) 
                   return 1; // dừng ngay khi n đặc biệt
            
           // xuống đến đây , n= 2..20 òi
           // chơi for hoặc đệ quy-recursion
           //kĩ tthuatj nhồi con heo đất
           // i=2, i=3, i=4, i=5, i=n nhồi liên tục i vào tích
           long product = 1; // tích khỏi đầu =1, nhồi 2 3 4 5 6 7 8...n
           for(int i = 2; i<= n; i++) {
               product *= i ; /* product = product đang có nhân con i, đập ngược
               trở lại nhồi liên tục product*/
           } // nhân từ 2 
           return product;
    }
    
}
