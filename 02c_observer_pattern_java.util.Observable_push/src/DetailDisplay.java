import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;

public class DetailDisplay implements Observer, DisplayElement {
    private Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;

    public DetailDisplay(Observable observable) {
	this.observable = observable;
	observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object pushedData) {
	if (obs instanceof WeatherData) {
	    if (pushedData instanceof WeatherData) {
		WeatherData pushedWeatherData = (WeatherData) pushedData;
		this.temperature = pushedWeatherData.temperature;
		this.humidity = pushedWeatherData.humidity;
		this.pressure = pushedWeatherData.pressure;
		display();
	    }
	}
    }

    @Override
    public void display() {
	DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	Date date = new Date();
	System.out.println("DetailDisplay got new Data (" + dateFormat.format(date) + ")");
	System.out.println("  * Temperature: " + temperature + "\n  * Humidity: " + humidity + "\n  * Pressure: " + pressure + "\n");

    }

}
