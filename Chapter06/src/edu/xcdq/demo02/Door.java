package edu.xcdq.demo02;

/**
 * @author 王艺博
 * @date 2021/4/29 11:10
 */
public interface Door {
    // 接口中的静态常量
    String des = "是个门，注意安全";

    // 方法的声明（签名）
    void open();
    void close();

    public default void test01() {
        System.out.println("接口中的默认测试方法");
    }
    public static void test02() {
        System.out.println("接口中的静态方法");
    }
}
