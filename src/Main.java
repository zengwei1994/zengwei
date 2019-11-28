import com.zengwei.weather.WeatherInterface;
import com.zengwei.weather.WeatherInterfaceImpl;

import javax.xml.ws.Endpoint;

public class Main {

    public static void main(String[] args) {
        WeatherInterface ws = new WeatherInterfaceImpl();
        Endpoint.publish("http://localhost:8888/weather",ws);
        System.out.println("server启动成功");


    }
}
