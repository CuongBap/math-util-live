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
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       long result = MathUtil.getFactorial(5); // hàm kiểm thử
       long result1= MathUtil.getFactorial(6);
       long result2= MathUtil.getFactorial(0);
        System.out.println("expected: 5! = 120; actual: " + result);
        System.out.println("expected: 6! = 720; actual: " + result1);
        System.out.println("expected: 0! = 720; actual: " + result2);
        //MathUtil.getFactorial(-5); -5 ngoại lệ
        
        // kĩ thuật kiểm thử phần mềm : ước lượng xem giá trị trả về của hàn là 
       // gì
       // expected value : 5! = 120
       // actual giả sử 5!= 120 ko
       // ì expected == actual, hàm ngon trong tình huống này
    }
    
}
