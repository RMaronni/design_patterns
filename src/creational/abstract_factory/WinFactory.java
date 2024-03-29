package creational.abstract_factory;

// The Concrete Factory
public class WinFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new WinButton();
	}

	@Override
	public CheckBox createCheckBox() {
		return new WinCheckBox();
	}

}
