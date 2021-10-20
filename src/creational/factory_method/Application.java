package creational.factory_method;

import java.util.ArrayList;
import java.util.List;

// The Creator
public abstract class Application {
	
	private List<Document> docs;
	
	public Application() {
		this.docs = new ArrayList<Document>();
	}
	
	public abstract Document createDocument();
	
	
	public void newDocument() {
		Document doc = createDocument();
		docs.add(doc);
		doc.open();
	}
	

}
