package visual.components;



import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

public class PropertySelector extends BorderPane implements Selector {
	
	private BorderPane root;
	private HBox contain = new HBox();
	
	
	public PropertySelector(BorderPane r){
		
		root = r;
		
		
	}


	@Override
	public void addToLayer() {
		addAllSelectors();
		this.setCenter(contain);
		root.setRight(this);
		
	}


	@Override
	public void addSelector(String text) {
		
		//(text), height, width, top, and left attributes.
		 Label propLabel = new Label(text);
		 TextField input = new TextField();
		 input.setMaxWidth(75);
		
		 contain.getChildren().addAll(propLabel,input);
		
		
		// TODO Auto-generated method stub
		
	}


	@Override
	public void addAllSelectors() {
		addSelector("Width");
		addSelector("Height");
		addSelector("Top");
		addSelector("left");
		
		
	}

}
