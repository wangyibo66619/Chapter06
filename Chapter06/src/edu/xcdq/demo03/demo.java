package edu.xcdq.demo03;

/**
 * @author 王艺博
 * @date 2021/4/29 15:37
 */
interface Base{
    int k = 0;
}
public class demo implements Base{
    public static void main(String[] args) {
        int i;
        demo d = new demo();
        i = d.k;
        i = demo.k;
        i = Base.k;
        System.out.println(i);
    }
}
