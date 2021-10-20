package creational.factory_method;

// The Concrete Creator
public class MyApplication extends Application {

	@Override
	public Document createDocument() {
		return new MyDocument();
	}

}
