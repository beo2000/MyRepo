/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beo2000.mathutil;

/**
 *
 * @author BeoBell
 */
public class MathUtility {

    //Class nay chứa 1 nhóm hàm toán học , Fake từ class chuẩn
    //java.util.Math của JDK
    //vì là đồ xài chung cho nên sẽ là STATIC
    public static final double PI = 3.1415;

    //hàm tính n!
    //vì giai thừa tăng rất nhanh, 21! chạm kiểu long
    //kiểu long chỉ chịu được 10^18 18 con số 0. Lớn hơn là thua
    //âm giai thừa không tính được
    //hầm chỉ chấp nhận từ 0 tới 20! -> long
    //0! = 1! = 1
    public static long getFactorial(int n) {
        if (0 > n || n > 20) {
            throw new IllegalArgumentException("Must be in boundaries 0..20");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        //sống sót cho đến đoạn này, sure n = 2...20
        long result = 1; //có tình để value này

        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        //n! = 1.2.3.4.5....n
        return result;
    }

    public static void main(String[] args) {
        //tui muốn test 5! có đúng 120 hem???
        int n = 5; //n!
        long expected = 120; //hy vọng 120 trả về 
        long actual = getFactorial(n);//thực tế hàm chạy là mấy vậy???
        //mình so sáng để biết đúng sai???
        System.out.println("5! expected: " + expected + "; actual: " + actual);

        //tui muốn test 0! có đúng là 1 hem?
        n = 0; //n!
        expected = 1; //hy vọng 120 trả về 
        actual = getFactorial(n);//thực tế hàm chạy là mấy vậy???
        //mình so sáng để biết đúng sai???
//        System.out.println(getFactorial(1));
//        System.out.println(getFactorial(2));
//        System.out.println(getFactorial(3));
//        System.out.println(getFactorial(4));
//        System.out.println(getFactorial(5));
//        System.out.println(getFactorial(6));
//        System.out.println(getFactorial(7));

        System.out.println("5! expected: " + expected + "; actual: " + actual);
    }
}

//VIẾT CODE XONG THÌ PHẢI TEST CODE - NGUYÊN TẮC PHẢI THEO
//TEST NGAY TỪNG HÀM TỪNG CLASS TRƯỚC KHI RÁP CHÚNG VỚI CÁC CLASS KHÁC
//Test ngay khi xong hàm, xong class được gọi là test mức độ 1, Unit Test
//Làm sao để test
//1, Cách 1: sout(gọi hàm) để xem in ra kết quả xử lí của hàm(OOP)
//2, Cách 2: JOptionPane để popup lên kết quả xử lú của hàm(J Desktop)
//3, Cách 3: Ghi ra LOG file(JW)
//3 cách này thì đều phải dùng mắt để xem kết quả, và tự kết luận đúng sai
//* đúng: tức là hàm chạy ra 1 giá trị - ACTUAL VALUE
//và ta thấy ACTUAL VALUE khớp, bằng với cái giá
//trị mà ta mong đợi, ta tính trước bằng tay, gọi là EXPECTED VALUE
//Ví du 5! thfi ta hy vong expected hàm trả về 120
//nhưng khốn nạn thay, hàm trả về đúng 120 - actual
//hàm chạy đúng cho 5!
//* sai: tui test 6!, expected = 720, khốn nạn thay, chạy ra actual = 120
//hàm xử lí sai
//CÁCH 4L MÁY ƠI SO SÁNH GIÙM VÀ KẾT LUẬN GIÙM TAO LUÔN VÌ MÀY CÓ
//CÁC PHÉP TOÁN SO SÁNH MÀ
//CON NGƯỜI KHÔNG CẦN NHÌN TỪNG DÒNG KẾT QUẢ TRẢ VỀ ĐỂ LUẬN ĐÚNG SAO
//MÁY SẼ LO CHO
//NẾU TẤT CẢ TÌNH HUỐNG CHẠY HÀM ĐỀU ĐÚNG -> HÀM ĐÚNG -> MÀU XANH
//HẦU HẾT TÌNH HUỐNG CHẠY HÀM ĐỀU ĐÚNG, CÓ 1 CÁI SAI -> HÀM SAI
//                                                   -> MÀU ĐỎ
//ĐỎ: CHỈ CẦN 1 THẰNG ĐỎ
//XANH: TẤT CẢ PHẢI ĐỀU ĐÚNG
//MUỐN LÀM ĐƯỢC NÀY TA CẦN THƯ VIỆN PHỤ TRỢ GIÚP CHO JAVA XANH ĐỎ
//ĐIỀU NÀY CŨNG CÓ BÊN C#, PHP, JS. RUBY,...
//JAVA: JUNIT,  xUNIT, MSTEST
//PHP: PHPUnit
//...
//com.microsoft.sqlSever.jdbc => cách đặt tên để không bị nhầm lẫn giữa các project
//cách đặt tên phải có lớp lang phân tầng
//Shift f6 là chạy tại class mày đang ở class có hàm main
//@Test mặc định là main(annotation)
//f6 sẽ chạy vào class chứa hàm main
