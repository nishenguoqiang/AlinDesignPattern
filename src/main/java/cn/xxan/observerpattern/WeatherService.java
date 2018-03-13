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

    public void notify(Client client) {
        Iterator<WeatherInfo> iterator = weatherInfos.iterator();
        while (iterator.hasNext()) {
            for (Client c : clients) {
                c.getWeather(iterator.next());
            }
        }
    }

    public void updateWeather(Client client) {
        if (weatherInfos.iterator().next().equals(client)) return;
        notify(client);
    }
}
