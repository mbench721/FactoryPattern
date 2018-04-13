package visual.components;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;


public class LangSelector extends BorderPane implements Selector {
	
	private Label title = new Label("Language Selector");
	private HBox container = new HBox();
	private GridPane root;
	public List<Button> langButtons = new ArrayList<>();
	
	
	
	public LangSelector(GridPane root2){
		this.setMinSize(600, 150);
		
		root = root2;
		
		
	}
	
	@Override
	public void addToLayer(){
		this.setTop(title);
		addAllSelectors();
		this.setCenter(container);
		root.add(this,2,0);
	}

	@Override
	public void addSelector(String text) {
		 
		Button added = new Button(text);
		langButtons.add(added);
		container.getChildren().add(added);
		
	}

	@Override
	public void addAllSelectors() {
		addSelector("Java");
		addSelector("Html");
		
		
	}

	@Override
	public void addListeners() {
		// TODO Auto-generated method stub
		
	}

}
