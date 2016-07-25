import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DetailDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public DetailDisplay(Subject weatherData) {
	this.weatherData = weatherData;
	weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
	this.temperature = temp;
	this.humidity = humidity;
	this.pressure = pressure;
	display();
    }

    @Override
    public void display() {
	DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	Date date = new Date();
	System.out.println("DetailDisplay got new Data (" + dateFormat.format(date) + ")");
	System.out.println("  * Temperature: " + temperature + "\n  * Humidity: " + humidity + "\n  * Pressure: " + pressure + "\n");

    }

}
