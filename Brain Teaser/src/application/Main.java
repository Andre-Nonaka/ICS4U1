package application;

import javafx.scene.text.FontWeight;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import java.util.Optional;
import javafx.stage.WindowEvent;




public class Main extends Application {
public void start(Stage primaryStage) {
try
{
Pane root = new Pane();
Scene scene = new Scene(root, 400, 220);
scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
Label lblQuestion = new Label();
lblQuestion.setPrefSize(350, 50);
lblQuestion.setText("How many kinds of people are there in the world?");
lblQuestion.setLayoutX(root.getWidth() /2 - lblQuestion.getPrefWidth() / 2);
lblQuestion.setAlignment(Pos.CENTER);
lblQuestion.setLayoutY(20);

Label lblAnswer = new Label();
lblAnswer.setPrefSize(350,50);
lblAnswer.setAlignment(Pos.CENTER);
lblAnswer.setLayoutX(root.getWidth() / 2 - lblAnswer.getPrefWidth() / 2);
lblAnswer.setLayoutY(140);
lblAnswer.setFont(Font.font("Arial", FontWeight.BOLD, 14));
lblAnswer.setStyle("-fx-background-color:yellow");

Button btnAnswer = new Button();
btnAnswer.setText("ANSWER");
btnAnswer.setPrefSize(100, 30);
btnAnswer.setLayoutX(root.getWidth() / 2 - btnAnswer.getPrefWidth() / 2);
btnAnswer.setLayoutY(90);
btnAnswer.setOnAction(new EventHandler<ActionEvent>()  {
	public void handle(ActionEvent e) {
		if(btnAnswer.getText().equals("ANSWER")) {
			lblAnswer.setText("10 - Those who know binary and those who don't!");
			btnAnswer.setText("QUIT");
	}
		else {
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setContentText("Are you sure you want to exit?");
			alert.setHeaderText(null);
			alert.getButtonTypes().clear();
			alert.getButtonTypes().addAll(ButtonType.YES, ButtonType.NO);
			alert.setTitle("Quit");
			Optional<ButtonType> result = alert.showAndWait();
			
			if(result.get() == ButtonType.YES) {
				Platform.exit();
			}
		}
	}
});

root.getChildren().addAll(lblQuestion, btnAnswer, lblAnswer);
primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
	
	public void handle(WindowEvent e) {
	Alert alert = new Alert(AlertType.CONFIRMATION);
	alert.setContentText("Are you sure you want to exit?");
	alert.setHeaderText(null);
	alert.getButtonTypes().clear();
	alert.getButtonTypes().addAll(ButtonType.YES, ButtonType.NO);
	alert.setTitle("Quit");
	Optional<ButtonType> result = alert.showAndWait();
	
	if(result.get() == ButtonType.NO) {
		e.consume();
	}
}
});

primaryStage.setTitle("Brain Teaser");
primaryStage.setScene(scene);
primaryStage.show();
}
catch(Exception e) {
e.printStackTrace();
}
}
public static void main(String[] args) {
launch(args);
}
}