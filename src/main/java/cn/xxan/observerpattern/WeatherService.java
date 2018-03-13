package cn.xxan.observerpattern;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class WeatherService implements IWeatherService {
    LinkedList<WeatherInfo> weatherInfos = new LinkedList<WeatherInfo>();
    LinkedHashSet<Client> clients = new LinkedHashSet<Client>();

    public void add(Client client) {
        clients.add(client);
    }

    public void delete(Client client) {
        clients.remove(client);
    }

    public void notifyClient() {
        Iterator<Client> iterator = clients.iterator();
        while (iterator.hasNext()) {
            iterator.next().getWeather(weatherInfos.getFirst());
        }
    }

    public void updateWeather(WeatherInfo weatherInfo) {
        if (weatherInfos.size() > 0){
            if (weatherInfos.iterator().next().equals(weatherInfo)) return;
        }
        weatherInfos.add(weatherInfo);
        notifyClient();
    }
}
