package day02;

import java.util.Random;

/**
 * @ClassName test
 * @Description 作用描述
 * @Author 狮源信息-tang
 * @Date 2019/10/11 10:30
 * @Version 1.0
 */
public class test {

    public static final int MAX = 99;
    public static final int MIN = 1;

    public static void main(String[] args) {

        Random random = new Random();
        int nums[]= new int[20];
        for (int i=0;i<=20;i++){
            nums[i] = random.nextInt(999);
            if (nums[i]<MAX && nums[i]>MIN){
                System.out.println(nums[i]);
            }else {
                System.out.println("GG");
                break;
            }
        }
    }
}
