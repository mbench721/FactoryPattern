package visual.components;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class ComponentSelector extends BorderPane implements Selector {
	private Label title = new Label("Component Selector");
	private BorderPane root;
	private VBox container = new VBox();
	
	public ComponentSelector(BorderPane r){
		
		root = r;
		
	}

	@Override
	public void addToLayer() {
		this.setMinSize(150, 150);
		this.setTop(title);
		addAllSelectors();
		this.setCenter(container);
		root.setLeft(this);
		
		
	}

	@Override
	public void addSelector(String text) {
		Button comp = new Button(text);
		
		container.getChildren().add(comp);
		
	}

	@Override
	public void addAllSelectors() {
		addSelector("Button");
		
	}

}
