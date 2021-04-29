package edu.xcdq.demo02;

/**
 * @author 王艺博
 * @date 2021/4/29 11:13
 */
public class KeypadDoor implements Door{
    @Override
    public void open() {
        System.out.println("键盘门打开");
        System.out.println(des);
    }

    @Override
    public void close() {
        System.out.println("键盘门关闭");
        System.out.println(des);
    }


}
