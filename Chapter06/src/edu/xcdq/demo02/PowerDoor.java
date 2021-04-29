package edu.xcdq.demo02;

/**
 * @author 王艺博
 * @date 2021/4/29 11:15
 */
public class PowerDoor implements Door{
    @Override
    public void open() {
        System.out.println("电动门开门");
    }

    @Override
    public void close() {
        System.out.println("电动门关门");
    }
}
