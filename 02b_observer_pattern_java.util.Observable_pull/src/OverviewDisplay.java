import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;

public class OverviewDisplay implements Observer, DisplayElement {
    private Observable observable;
    private float temperature;
    private float humidity;

    public OverviewDisplay(Observable observable) {
	this.observable = observable;
	observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
	if (obs instanceof WeatherData) {
	    WeatherData weatherData = (WeatherData) obs;
	    this.temperature = weatherData.getTemperature();
	    this.humidity = weatherData.getHumidity();
	    display();
	}
    }

    @Override
    public void display() {
	DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	Date date = new Date();
	System.out.println("OverviewDisplay got new Data (" + dateFormat.format(date) + ")");
	System.out.println("  * Temperature: " + temperature + "\n  * Humidity: " + humidity + "\n");

    }

}
