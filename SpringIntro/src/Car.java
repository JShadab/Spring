
public class Car {

	public Car() {

	}

	public Car(Engine engine) {
		this.engine = engine;
	}

	private String name;
	private Engine engine;

	void start() {
		engine.start();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
