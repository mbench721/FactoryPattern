package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import visual.components.ComponentSelector;
import visual.components.LangSelector;
import visual.components.PropertySelector;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			GridPane root = new GridPane();
			root.setHgap(50); //horizontal gap in pixels => that's what you are asking for
			root.setVgap(20);
			root.setPadding(new Insets(10, 10, 10, 10));
			
			LangSelector language = new LangSelector(root);
			language.addToLayer();
			BorderPane.setAlignment(language, Pos.CENTER);
			PropertySelector properties = new PropertySelector(root);
			properties.addToLayer();
			ComponentSelector components = new ComponentSelector(root);
			components.addToLayer();
			Button submit = new Button("Submit");
			root.add(submit,2,3);
			
			Scene scene = new Scene(root,600,500);
			primaryStage.setTitle("Factory Pattern WYSIWYG");
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
