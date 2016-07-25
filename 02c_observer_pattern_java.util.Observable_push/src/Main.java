public class Main {
    public static void main(String[] args) throws InterruptedException {
	WeatherData weatherData = new WeatherData();
	OverviewDisplay overviewDisplay = new OverviewDisplay(weatherData);
	DetailDisplay detailDisplay = new DetailDisplay(weatherData);

	weatherData.setMeasurements(25, 80, 60);
	Thread.sleep(1000);
	weatherData.setMeasurements(29, 82, 55);
	Thread.sleep(2000);
	weatherData.setMeasurements(26, 83, 58);
	weatherData.deleteObserver(overviewDisplay);
	weatherData.setMeasurements(52, 99, 99); // will not be displayed by the overviewDisplay

    }
}
