import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable {

    private List<Observer> observers;
    public float temperature;
    public float humidity;
    public float pressure;

    public WeatherData() {
    }

    public void measurementsChanged() {
	setChanged();
	notifyObservers(this);
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
	this.temperature = temp;
	this.humidity = humidity;
	this.pressure = pressure;
	measurementsChanged();
    }

}
