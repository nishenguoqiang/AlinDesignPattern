package cn.xxan.observerpattern;

public class Client {
    /**
     * 获取天气情况的客户端
     */
    private String name;
    private WeatherInfo weatherInfo;

    public Client(String name, WeatherInfo weatherInfo) {
        this.name = name;
        this.weatherInfo = weatherInfo;
    }

    public void getWeather(WeatherInfo weatherInfo) {
        this.weatherInfo = weatherInfo;
        dealMsg();
    }

    private void dealMsg() {
            System.out.println(name + "收到天气信息时间：" + weatherInfo.getTime() + ",天气情况：" + weatherInfo.getWeather());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WeatherInfo getWeatherInfo() {
        return weatherInfo;
    }

    public void setWeatherInfo(WeatherInfo weatherInfo) {
        this.weatherInfo = weatherInfo;
    }
}
