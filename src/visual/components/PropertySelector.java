package visual.components;



import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;


public class PropertySelector extends BorderPane implements Selector {

	private BorderPane root;
	private GridPane contain = new GridPane();
	private int rowCount = 0;
	private int colCount = 1;
	ColumnConstraints colCons;
	RowConstraints rowCons;


	public PropertySelector(BorderPane r){
		colCons = new ColumnConstraints(2);
		root = r;
		this.setMinSize(150, 150);


	}


	@Override
	public void addToLayer() {
		addAllSelectors();
		this.setCenter(contain);
		root.setRight(this);

	}

	@Override
	public void addSelector(String text) {
		if(colCount != 1){
			colCount++;
		}
	
		Label propLabel = new Label(text);
		TextField input = new TextField();
		input.setMaxWidth(70);
		contain.add(propLabel, colCount, rowCount);
		// column=1 row=0
		contain.add(input,colCount + 1, rowCount);  // column=2 row=0 
		colCount++;
		if(colCount == 4){
			colCount = 1;
			rowCount += 1;
		}

	}


	@Override
	public void addAllSelectors() {
		contain.setHgap(10); //horizontal gap in pixels => that's what you are asking for
		contain.setVgap(10);
		contain.setPadding(new Insets(10, 10, 10, 10));
		addSelector("Width");
		addSelector("Height");
		addSelector("Y Position");
		addSelector("X Position");

	}

}
