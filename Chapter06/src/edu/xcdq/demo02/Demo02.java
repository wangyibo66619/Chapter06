package edu.xcdq.demo02;

/**
 * @author 王艺博
 * @date 2021/4/29 11:16
 */
public class Demo02 {
    public static void main(String[] args) {
        KeypadDoor keypadDoor = new KeypadDoor();
        keypadDoor.open();
        keypadDoor.close();
        keypadDoor.test01();
        //keypadDoor.test02();
        //Door.test01();
        Door.test02();
        PowerDoor powerDoor = new PowerDoor();
        powerDoor.open();
        powerDoor.close();

        /*Door door = new Door() {
            @Override
            public void open() {
                System.out.println("临时的实现类开门");
            }

            @Override
            public void close() {
                System.out.println("临时的实现类关门");
            }
        };
        door.open();
        door.close();*/
    }
}
