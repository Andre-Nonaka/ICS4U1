package application;

import java.util.Optional;
import java.util.Arrays;
import java.util.HashSet;
import java.text.ParseException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.util.Set;
import javafx.stage.WindowEvent;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
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
// creating a pane and adding it to a scene
Pane root = new Pane();
Scene scene = new Scene(root,600,500); //setting the scene 
//"Enter your name" Label
 Label lbl = new Label(); //declaring lbl
 //Setting the label and its properties
lbl.setText("LOVE CALCULATOR"); // SETTING THE TEXT
lbl.setFont(new Font("Britannic Bold", 50)); // SETTING THE FONT AND FONT SIZE
lbl.setTextFill(Color.RED); // setting the label color of inside to red
lbl.setAlignment(Pos.CENTER); //setting the allignement of the label to the center
lbl.setLayoutX(scene.getWidth() / 5.9 - lbl.getPrefWidth() / 5); //setting the label to an appropriate place by setting the width
lbl.setLayoutY(50); // set the height (y-axis) of where to put the label
//"Enter your name" Label
Label lbl2 = new Label(); // declaring lbl2 (label to set your name)
lbl2.setText("Enter your name:");// Setting the text
lbl2.setFont(new Font("Britannic Bold", 18));//setting the font and putting its size
lbl2.setTextFill(Color.RED);//Setting the label inside color to red
lbl2.setAlignment(Pos.CENTER); //setting the allignement of the label to the center
lbl2.setLayoutX(scene.getWidth() / 14 - lbl2.getPrefWidth() / 5);//setting the label to an appropriate place by setting the width
lbl2.setLayoutY(350);//set the height (y-axis) of where to put the label
//"Enter his/her name:" Label
Label lbl3 = new Label(); //declaring lbl3
lbl3.setText("Enter his/her name:");// Setting the text
lbl3.setFont(new Font("Britannic Bold", 18));//setting the font and putting its size to 18
lbl3.setTextFill(Color.RED);//Setting the label inside color to red
lbl3.setAlignment(Pos.CENTER); //setting the alignment of the label to the center
lbl3.setLayoutX(scene.getWidth() / 1.5 - lbl3.getPrefWidth() / 5);//setting the label to an appropriate place by setting the width
lbl3.setLayoutY(350);//set the height (y-axis) of where to put the label
Label lbl4 = new Label();// declaring lbl2 (label to set your name)
lbl4.setFont(new Font("Britannic Bold", 80));//setting the font and putting its size to 80
lbl4.setTextFill(Color.RED);//Setting the label inside color to red
lbl4.setAlignment(Pos.CENTER);//setting the alignment of the label to the center
lbl4.setLayoutX(scene.getWidth() / 2.7 - lbl4.getPrefWidth() / 3);//setting the label to an appropriate place by setting the width
lbl4.setLayoutY(200);//set the height (y-axis) of where to put the label
//declaring the SUBMIT button
Button btnAnswer = new Button();
btnAnswer.setText("SUBMIT"); //setting the text of the button to SUBMIT
btnAnswer.setFont(new Font("Britannic Bold", 18)); //setting the font of the text and putting its size to 18
btnAnswer.setStyle("-fx-background-color:red");//setting the color of the button to RED
btnAnswer.setTextFill(Color.WHITE); //setting the color of the text to white
btnAnswer.setPrefSize(130, 40);//setting the value of the property prefHeight to (130,40)
btnAnswer.setLayoutX(root.getWidth() / 2 - btnAnswer.getPrefWidth() / 2);//setting the button layout position on the x axis
btnAnswer.setLayoutY(340);//setting the button layout position on the y axis 
//declaring the CLEAR button
Button btnAnswer2 = new Button();
btnAnswer2.setText("CLEAR");//setting the text of the button to CLEAR
btnAnswer2.setFont(new Font("Britannic Bold", 18));//setting the font of the text and putting its size to 18
btnAnswer2.setStyle("-fx-background-color:red");//setting the color of the button to RED
btnAnswer2.setTextFill(Color.WHITE);//setting the color of the text to white
btnAnswer2.setPrefSize(130, 40);//setting the value of the property prefHeight to (130,40)
btnAnswer2.setLayoutX(root.getWidth() / 2 - btnAnswer2.getPrefWidth() / 2);//setting the button layout position on the x axis
btnAnswer2.setLayoutY(396);//setting the button layout position on the y axis 
//declaring a textfield so that user can write response
TextField txtInput = new TextField();
txtInput.setAlignment(Pos.CENTER);//setting the alignment of the textfield to the center
txtInput.setPrefWidth(150);//setting the value of the width property of the textfield prefWidth
txtInput.setLayoutX(root.getWidth() / 9 - txtInput.getPrefWidth() / 5);//setting the textfield layout position on the x axis
txtInput.setLayoutY(400);//setting the textfield layout position on the y axis
//declaring a textfield so that user can write response
TextField txtInput2 = new TextField();
txtInput2.setAlignment(Pos.CENTER);//setting the alignment of the textfield to the center
txtInput2.setPrefWidth(200);//setting the value of the width property of the textfield prefWidth
txtInput2.setLayoutX(root.getWidth() / 1.4 - txtInput2.getPrefWidth() / 5);//setting the textfield layout position on the x axis
txtInput2.setLayoutY(400);//setting the textfield layout position on the y axis
//This is a button action which is invoked whenever the button is fired
btnAnswer.setOnAction(new EventHandler<ActionEvent>() {
public void handle(ActionEvent e) {
 Alert alert = new Alert(AlertType.NONE); //this alert does not set any default properties in the alert.
 alert.setHeaderText(null);
 String txt1 = txtInput.getText();//Storing txtInput value as a String
 String txt2 = txtInput2.getText();//Storing txtInput2 value as a String
 String loveString = txt1.toUpperCase(); ////Converting txt1 to uppercase and storing it in String loveString
 String loveString2 = txt2.toUpperCase();//Converting txt2 to uppercase and storing it in String loveString2
 char[] ch= loveString.toCharArray(); //converting loveString into a sequence of characters. 
 char[] ch2= loveString2.toCharArray();//converting loveString2 into a sequence of characters. 
 boolean[] found = new boolean[256];//keeping an array to see which chars have been used
 boolean[] found2 = new boolean[256];//keeping an array to see which chars have been used
 StringBuilder sb = new StringBuilder();// creates empty builder, capacity 16
 StringBuilder sb2 = new StringBuilder();// creates empty builder, capacity 16
 int sum=0;//declaring sum to be 0
 //this means that if the text from txtInput and txtInput2 have no text then execute the following commands
 if (txtInput.getText().equals("") && txtInput2.getText().equals(""))
 {
 txtInput.setStyle("-fx-control-inner-background: red");//turn the inside color of txtInput to red
 txtInput2.setStyle("-fx-control-inner-background: red");//turn the inside color of txtInput2 to red
 alert.setContentText("You must enter two names!");//Alert pop up that says the following
 alert.setTitle("Error!");// setting the title of the alert pop up to error
 alert.setAlertType(AlertType.ERROR);//setting the alert type to error
 alert.show();//show the alert
 }
 else if (txtInput.getText().equals(""))// else if the text in txtInput is blank then execute following commands
 {
 txtInput.setStyle("-fx-control-inner-background: red");//turn the inside color of txtInput2 to red
 alert.setContentText("You must enter two names!");//Alert pop up that says the following
 alert.setTitle("Error!");// setting the title of the alert pop up to error
 alert.setAlertType(AlertType.ERROR);//setting the alert type to error
 alert.show();//show the alert
 }
 else if (txtInput2.getText().equals(""))// else if the text in txtInput2 is blank then execute following commands
 {
 txtInput2.setStyle("-fx-control-inner-background: red");//turn the inside color of txtInput2 to red
 alert.setContentText("You must enter two names!");//Alert pop up that says the following
 alert.setTitle("Error!");// setting the title of the alert pop up to error
 alert.setAlertType(AlertType.ERROR);//setting the alert type to error
 alert.show();//show the alert
 }
 else //if txtInput and txtInput2 are filled then execute following command
 {
  txtInput.setStyle("-fx-control-inner-background: white");//turn the inside color of txtInput to white
  txtInput2.setStyle("-fx-control-inner-background: white");//turn the inside color of txtInput2 to white
 }
 if ((btnAnswer.getText().equals("SUBMIT")))//if btnAnswer is equal to Submit then execute following for loop
   {
 for(char c:ch)//for loop  to remove the duplicate letters from each name
 {
  if (!found[c]) {
      found[c] = true;
      sb.append(c);//removing duplicate letters 
    for(char c2:ch2)
   {
    if (!found2[c2]) {
        found2[c2] = true;
        sb2.append(c2);//removing duplicate letters 
    }
   }
    //concatenating the two String values into String Final
    String Final = sb.toString().concat(sb2.toString());
    //iterating over the string
    for(int i = 0; i < Final.length(); i++){   // while counting characters if less than the length add one       
           int character = Final.charAt(i); // start on the first character
           sum+=character; //adding sum to character
           System.out.println(sum);//printing out the sum 
           int perc = ((sum)/101);//dividing the sum by 100 
    lbl4.setText(perc + "%"); //setting int perc in the label
    }
  }
     
 }
   }}
});
//This is a button action which is invoked whenever the CLEAR button is fired
btnAnswer2.setOnAction(new EventHandler<ActionEvent>() {
public void handle(ActionEvent e) {
txtInput.setText("");// set the txtInput to empty
txtInput2.setText("");// set the txtInput2 to empty
lbl4.setText("");// set the label to empty
txtInput.setStyle("-fx-control-inner-background: white");//SET the inside of txtInput to white
txtInput2.setStyle("-fx-control-inner-background: white");//SET the inside of txtInput2 to white
}
});
 Image image = new Image("file:cupidLeft.png", 190, 180, false, false);//setting the cupid image to the left
 ImageView imageView = new ImageView(image);//FilInput stream is created which points to the image file of the image to display
 imageView.setX(20);//setting the x axis of the image
 imageView.setY(140);//setting the y axis of the image
 Image image2 = new Image("file:cupidRight.png", 190, 180, false, false);//setting the cupid image to the left
 ImageView imageView2 = new ImageView(image2);//FilInput stream is created which points to the image file of the image2 to display
 imageView2.setX(389);//setting the x axis of the image
 imageView2.setY(140);//setting the y axis of the image
 //adding these to the canvas
root.getChildren().add(imageView);
root.getChildren().add(imageView2);
 root.getChildren().add(lbl);
 root.getChildren().add(lbl2);
 root.getChildren().add(lbl3);
 root.getChildren().add(lbl4);
 root.getChildren().add(btnAnswer);
 root.getChildren().add(btnAnswer2);
 root.getChildren().add(txtInput);
 root.getChildren().add(txtInput2);
 
 primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
public void handle(WindowEvent e) {
Alert alert = new Alert(AlertType.CONFIRMATION);//declaring alert and setting it to CONFIRMATION alert
alert.setContentText("Are you sure you want to exit?");//Alert pop up that says the following
alert.setHeaderText(null);//Alert pop up with no headertext
alert.getButtonTypes().clear();
alert.getButtonTypes().addAll(ButtonType.YES, ButtonType.NO);//adding the yes or no button when asked to quit
alert.setTitle("Love Calculator");//set the title of the alert to the following
Optional<ButtonType> result = alert.showAndWait();//gets results returned and compares it
if(result.get() == ButtonType.NO) { //if user presses no then do following
e.consume();//do noting resume program
}
}
});
 primaryStage.setTitle("Love Calculator");//set the title of program to the following
 primaryStage.setScene(scene);//setting scene
 primaryStage.centerOnScreen();
 primaryStage.show();
 }
}
