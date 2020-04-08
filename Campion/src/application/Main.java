package application;
	

import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
public class Main extends Application
{
 public static void main(String[] args)
 {
 launch(args);
 }
 @Override
 public void start(Stage primaryStage) throws Exception
 {
Group root = new Group();
Scene scene = new Scene(root,400,400, Color.rgb(0,0,81));
 Canvas canvas = new Canvas(400, 400);
 GraphicsContext gc = canvas.getGraphicsContext2D();
 gc.setLineWidth(10);
 gc.setStroke(Color.GOLD);
 gc.strokeOval(80, 50, 240, 230);
 gc.setFill(Color.WHITE);
 gc.fillOval(80, 50, 240, 230); 
 gc.stroke();
 gc.setFill(Color.GOLD);
 gc.setFont(Font.font("Britannic Bold", FontWeight.BOLD, 
		 FontPosture.REGULAR, 30));
 gc.fillText("NAMED, CALLED, CHOSEN", 40, 320);

 Image image = new Image("file:BearsLogo.gif");
 gc.drawImage(image, 100, 80);

 root.getChildren().add(canvas);
 primaryStage.setScene(scene);
 primaryStage.centerOnScreen();
 primaryStage.show();
 }
}