package creational.abstract_factory;

// The Concrete Factory
public class MacFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public CheckBox createCheckBox() {
		return new MacCheckBox();
	}

}
