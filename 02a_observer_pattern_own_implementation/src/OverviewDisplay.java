import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OverviewDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public OverviewDisplay(Subject weatherData) {
	this.weatherData = weatherData;
	weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
	this.temperature = temp;
	this.humidity = humidity;
	display();
    }

    @Override
    public void display() {
	DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	Date date = new Date();
	System.out.println("OverviewDisplay got new Data (" + dateFormat.format(date) + ")");
	System.out.println("  * Temperature: " + temperature + "\n  * Humidity: " + humidity + "\n");

    }

}
