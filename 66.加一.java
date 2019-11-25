import java.util.HashMap;

public class Test {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            //根据题意给最后一位加1
            digits[i] += 1;
            //给最后一位取余数
            digits[i] = digits[i] % 10;

            //如果是0说明是10，要进位，然后循环倒着加1，否则位正常加1就结束
            if (digits[i] != 0) {
                return digits;
            }
        }

        //如果循环结束还没返回 说明数组是全为9的情况
        //这样只需要新建一个长度加1的新数组， 然后第一位为1就完成题目要求
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

}
