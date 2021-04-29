package edu.xcdq.demo01;

import edu.xcdq.demo01.Door;

/**
 * @author 王艺博
 * @date 2021/4/29 10:17
 */
public class KeypadDoor extends Door {
    public void open(){
        System.out.println("按键盘输入密码开门");
    }

    public void close() {
        System.out.println("拉上即可自动锁门");
    }
}
