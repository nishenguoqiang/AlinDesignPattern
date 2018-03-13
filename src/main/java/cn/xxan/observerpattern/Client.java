package cn.xxan.observerpattern;

public class Client {
    /**
     * 获取天气情况的客户端
     */
    public void getWeather(WeatherInfo weatherInfo) {
        System.out.println("收到天气信息时间：" + weatherInfo.getTime() + ",天气情况：" + weatherInfo.getWeather());
    }
}
