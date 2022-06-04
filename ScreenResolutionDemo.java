import java.awt.Dimension;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ScreenResolutionDemo extends Application {

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth() / 3;
		double height = screenSize.getHeight() / 2;
		
		try {
			primaryStage.setScene(new Scene(new AnchorPane(), width, height));
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
