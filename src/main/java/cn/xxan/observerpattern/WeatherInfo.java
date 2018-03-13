package cn.xxan.observerpattern;

import java.util.Date;
import java.util.Objects;

/**
 * 天气的消息实体
 */
public class WeatherInfo {
    private Date time;
    private String weather;

    public WeatherInfo(Date time, String weather) {
        this.time = time;
        this.weather = weather;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }


    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "WeatherInfo{" +
                "time=" + time +
                ", weather='" + weather + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeatherInfo that = (WeatherInfo) o;
        return that.getTime()==this.getTime() && that.getWeather().equals(this.getWeather());
    }
}
