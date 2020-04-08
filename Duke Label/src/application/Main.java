package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.geometry.Pos;
import javafx.scene.image.ImageView;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.control.ContentDisplay;
import javafx.scene.paint.Color;
import javafx.scene.layout.CornerRadii;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Pane root = new Pane();
			Scene scene = new Scene(root,400,400);
			Label lbl = new Label();
			lbl.setText("I think, therefore I program!");
			lbl.setFont(new Font("Arial", 12));
			lbl.setPrefSize(150, 30);
			lbl.setAlignment(Pos.CENTER);
			lbl.setLayoutX(scene.getWidth() / 2 - lbl.getPrefWidth() / 2);
			lbl.setLayoutY(50);
			lbl.setContentDisplay(ContentDisplay.BOTTOM);
			lbl.setGraphicTextGap(20);
			Image imgDuke = new Image("file:duke.png", 100, 100, false, false);
			lbl.setGraphic(new ImageView(imgDuke));
			root.getChildren().add(lbl);
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

