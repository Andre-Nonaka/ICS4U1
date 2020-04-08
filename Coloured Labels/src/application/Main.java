package application;
	
import javafx.application.Application;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;




public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Pane root = new Pane();
			Scene scene = new Scene(root,400,400);
			Label lbl = new Label();
			lbl.setText("Red label");
			lbl.setStyle("-fx-background-color: red; -fx-font-size: 20px; -fx-font-weight: bold");
			lbl.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, null)));
			lbl.setPrefSize(150, 30);
			lbl.setAlignment(Pos.CENTER);
			lbl.setLayoutX(scene.getWidth() / 7 - lbl.getPrefWidth() / 7);
			lbl.setLayoutY(50);
			Label lbl2= new Label();
			lbl2.setText("Blue Label");
			lbl2.setStyle("-fx-background-color: blue; -fx-font-size: 20px; -fx-font-weight: bold");
			lbl2.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.DOTTED, null, null)));
			lbl2.setPrefSize(150, 30);
			lbl2.setAlignment(Pos.CENTER);
			lbl2.setLayoutX(scene.getWidth() / 1.2 - lbl2.getPrefWidth() / 1.2);
			lbl2.setLayoutY(50);
			Label lbl3= new Label();
			lbl3.setText("Orange Label");
			lbl3.setStyle("-fx-background-color: orange; -fx-font-size: 20px; -fx-font-weight: bold");
			lbl3.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.DASHED, null, null)));
			lbl3.setPrefSize(150, 30);
			lbl3.setAlignment(Pos.CENTER);
			lbl3.setLayoutX(scene.getWidth() / 7 - lbl3.getPrefWidth() / 7);
			lbl3.setLayoutY(100);
			Label lbl4= new Label();
			lbl4.setText("Magenta Label");
			lbl4.setStyle("-fx-background-color: magenta; -fx-font-size: 20px; -fx-font-weight: bold");
			lbl4.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.NONE, null, null)));
			lbl4.setPrefSize(150, 30);
			lbl4.setAlignment(Pos.CENTER);
			lbl4.setLayoutX(scene.getWidth() / 1.2 - lbl4.getPrefWidth() / 1.2);
			lbl4.setLayoutY(100);
			root.getChildren().add(lbl);
			root.getChildren().add(lbl2);
			root.getChildren().add(lbl3);
			root.getChildren().add(lbl4);
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
