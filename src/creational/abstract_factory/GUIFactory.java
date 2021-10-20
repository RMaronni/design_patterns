package creational.abstract_factory;

// The Abstract Factory
public abstract interface GUIFactory {
	
	public Button createButton();
	
	public CheckBox createCheckBox();

}
