package visual.components;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;


public class LangSelector extends BorderPane implements Selector {
	
	private Label title = new Label("Language Selector");
	private HBox container = new HBox();
	private BorderPane root;
	
	
	
	public LangSelector(BorderPane r){
		this.setMinSize(600, 150);
		
		root = r;
		
		
	}
	
	@Override
	public void addToLayer(){
		this.setTop(title);
		addAllSelectors();
		this.setCenter(container);
		root.setTop(this);
	}

	@Override
	public void addSelector(String text) {
		 
		Button added = new Button(text);
		container.getChildren().add(added);
		
	}

	@Override
	public void addAllSelectors() {
		addSelector("Java");
		addSelector("Html");
		
		
	}

}
