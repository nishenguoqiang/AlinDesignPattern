package cn.xxan;

import cn.xxan.observerpattern.Client;
import cn.xxan.observerpattern.WeatherInfo;
import cn.xxan.observerpattern.WeatherService;

import java.util.Date;

public class ObserverTest {

    public static void main(String[] args) {
        WeatherInfo weatherInfo = new WeatherInfo(new Date(),"晴天");
        Client client1 = new Client("安卓客户端",weatherInfo);
        Client client2 = new Client("苹果客户端",weatherInfo);
        WeatherService weatherService = new WeatherService();
        weatherService.add(client1);
        weatherService.add(client2);
        weatherService.updateWeather(weatherInfo);

    }
}
