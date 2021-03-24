/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beo2000.mathutil.test;

import static com.beo2000.mathutil.MathUtility.*;//tau muốn các hàm, biến trong
//import java.sql.SQLException;
//class này gõ trực tiếp luôn, gõ trực tiếp không cần chấm
//chỉ static mới có điều này
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author BeoBell
 */
public class MathUtilityTest {
    
    @Test
    public void testFactorialGivenRightArgumentReturnsGoodResult() {
        int n = 5;          //tui muốn test 5! có đúng là 
        long expected = 120;//120 hay không
        long actual = getFactorial(n);
        assertEquals(expected, actual);
    
    //mình test tiếp các trường hợp khác đúng đầu vào, đúng đầu ra
    //khỏi cần biến trung gian, chơi luôn trong lệnh
        assertEquals(720, getFactorial(6));
        assertEquals(24, getFactorial(4));
        assertEquals(6, getFactorial(3));
        assertEquals(1, getFactorial(5));
        assertEquals(1, getFactorial(0));
    }
    
    //điều gì xảy ra nếu ta đưa vào tham số cà chớn, âm, hoặc > 2
    //theo thiết kế của hàm, đưa vào cà chớn sẽ ném ra ngoại lệ
    //và ta CẦN TEST XEM, NGOẠI LỆ CÓ ĐƯỢC NÉM RA KHÔNG NẾU TA CÀ CHỚN
    //TỨC LÀ THẤY XUẤT HIỆN NGOẠI LỆ NẾU CÓ CÀ CHỚN ĐƯA VÀO --> HÀM ĐÚNG
    //THẤY NGOẠI LỆ KHI CÓ CÀ CHỚN MÌNH LẠI MỪNG VÌ HÀM ĐÃ CHẠY ĐÚNG
    
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialWrongArgumentThrowException() {
        //mình test tình huống hàm phải ném ra ngoại lệ nếu tham số cà chớn
        //ngoại lệ không phải là value để so sánh
        // ta phải dùng chiêu khác. JUnit 4 khác JUnit 5 ở chỗ bắt ngoại lệ
        //Kì 5 đi dự thính môn SWT301 của tui: DI, Lambda Expression liên quan
        //JUnit 5, Dependency Injection / SOLID
        getFactorial(-5);
        getFactorial(40);
        getFactorial(21);
        //có đúng khi chạy hàm này thì ném ra ngoại lệ nên tên là IllegalArg...
        //nếu đúng nó ném ra ngoại lệ cùng teenm code đúng rồi, XANH THOY
    }
    
}
