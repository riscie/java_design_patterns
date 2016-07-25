import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable {

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    public void measurementsChanged() {
	setChanged();
	notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
	this.temperature = temp;
	this.humidity = humidity;
	this.pressure = pressure;
	measurementsChanged();
    }

    public float getTemperature() {
	return temperature;
    }

    public float getHumidity() {
	return humidity;
    }

    public float getPressure() {
	return pressure;
    }

}
