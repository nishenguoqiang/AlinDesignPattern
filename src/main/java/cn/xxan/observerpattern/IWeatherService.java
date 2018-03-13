package cn.xxan.observerpattern;

public interface IWeatherService {
    /**
     * 天气服务的接口
     */
    void add(Client client);  //新增客户端

    void delete(Client client);  //删除客户端

    void notify(Client client); //通知客户端

    void updateWeather(Client client);  //更新天气

}
