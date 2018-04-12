package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import visual.components.ComponentSelector;
import visual.components.LangSelector;
import visual.components.PropertySelector;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			BorderPane root = new BorderPane();
			LangSelector language = new LangSelector(root);
			language.addToLayer();
			PropertySelector properties = new PropertySelector(root);
			properties.addToLayer();
			ComponentSelector components = new ComponentSelector(root);
			components.addToLayer();
			Button submit = new Button("Submit");
			root.setBottom(submit);
			
			Scene scene = new Scene(root,600,600);
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
