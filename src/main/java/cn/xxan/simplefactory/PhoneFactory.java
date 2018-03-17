package cn.xxan.simplefactory;

public class PhoneFactory{

    public Iphone produce(String type) throws Exception {
        if ("huawei".equals(type)){
            return new HuaWei();
        } else if ("xiaomi".equals(type)){
            return new XiaoMi();
        }

        throw new Exception("不能生产这样的产品");
    }

}
