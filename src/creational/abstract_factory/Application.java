package creational.abstract_factory;

// The client
public class Application {
	
	GUIFactory factory;
	Button button;
	CheckBox checkbox;
	
	public Application(GUIFactory factory) {
		this.factory = factory;
	}
	
	public void createGUI() {
		this.button = factory.createButton();
		this.checkbox = factory.createCheckBox();
	}
}
