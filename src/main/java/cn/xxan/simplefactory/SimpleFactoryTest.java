package cn.xxan.simplefactory;

public class SimpleFactoryTest {
    public static void main(String[] args) throws Exception {
        PhoneFactory phoneFactory = new PhoneFactory();
        Iphone iphone = phoneFactory.produce("huawei");
        iphone.run();
    }



}
