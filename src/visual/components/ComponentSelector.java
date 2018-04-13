package visual.components;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class ComponentSelector extends BorderPane implements Selector {
	private Label title = new Label("Component Selector");
	private GridPane root;
	private VBox container = new VBox();
	
	public ComponentSelector(GridPane r){
		
		root = r;
		
	}

	@Override
	public void addToLayer() {
		this.setMinSize(150, 150);
		this.setTop(title);
		addAllSelectors();
		this.setCenter(container);
		root.add(this,1,1);
		
		
	}

	@Override
	public void addSelector(String text) {
		Button comp = new Button(text);
		
		container.getChildren().add(comp);
		
	}

	@Override
	public void addAllSelectors() {
		addSelector("Button");
		addSelector("Label");
		addSelector("Text Box");
		addSelector("List Box");
		addSelector("Multi Line Text Box");
		
	}

}
