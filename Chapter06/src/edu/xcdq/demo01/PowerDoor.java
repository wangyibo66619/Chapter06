package edu.xcdq.demo01;

import edu.xcdq.demo01.Door;

/**
 * @author 王艺博
 * @date 2021/4/29 10:19
 */
public class PowerDoor extends Door {
    public void open(){
        System.out.println("按遥控器开门");
    }

    public void close() {
        System.out.println("按遥控器关门");
    }
}
