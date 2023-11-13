import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Construct and add actions to our controls
        Label label1 = new Label("JavaFX app");
        Label label2 = new Label("Button not pressed");
        Label label3 = new Label("Name:");
        Label label5 = new Label("Grade:");
        Label label4 = new Label("Human?");
        Text text1 = new Text("Complete in order");
        ProgressBar progressBar1 = new ProgressBar(0);
        progressBar1.setProgress(0);
        Tooltip tooltip1 = new Tooltip("Delete 'Your name'");
        Tooltip tooltip2 = new Tooltip("%" + progressBar1.getProgress());
        label1.setFont(new Font("Arial", 24));
        Button retryButton = new Button ("Retry");
        Button pressMe = new Button("Button");
        progressBar1.setTooltip(tooltip2);
        pressMe.setOnAction(actionEvent -> {
            label2.setText("Button pressed");
            progressBar1.setProgress(progressBar1.getProgress()+.25);
            pressMe.setDisable(true);
        });

        TextField typeHere = new TextField("Your name");
        typeHere.setTooltip(tooltip1);
        typeHere.setOnAction(actionEvent -> {
            label3.setText("Name: " + typeHere.getText());
            progressBar1.setProgress(progressBar1.getProgress()+.25);
            typeHere.setDisable(true);
        });
        typeHere.getOnAction();
        MenuItem menuItem1 = new MenuItem("9");
        MenuItem menuItem2 = new MenuItem("10");
        MenuItem menuItem3 = new MenuItem("11");
        MenuItem menuItem4 = new MenuItem("12");

        MenuButton menuButton = new MenuButton("Grade", null, menuItem1, menuItem2, menuItem3, menuItem4);

        menuItem1.setOnAction(event -> {
            menuButton.setText(menuItem1.getText());
            label5.setText("Grade:" + menuItem1.getText());
            progressBar1.setProgress(progressBar1.getProgress()+.25);
            menuButton.setDisable(true);
        });
        menuItem2.setOnAction(event -> {
            menuButton.setText(menuItem2.getText());
            label5.setText("Grade:" + menuItem2.getText());
            progressBar1.setProgress(progressBar1.getProgress()+.25);
            menuButton.setDisable(true);
        });
        menuItem3.setOnAction(event -> {
            menuButton.setText(menuItem3.getText());
            label5.setText("Grade:" + menuItem3.getText());
            progressBar1.setProgress(progressBar1.getProgress()+.25);
            menuButton.setDisable(true);

        });
        menuItem4.setOnAction(event -> {
            menuButton.setText(menuItem4.getText());
            label5.setText("Grade:" + menuItem4.getText());
            progressBar1.setProgress(progressBar1.getProgress()+.25);
            menuButton.setDisable(true);
        });
        CheckBox checkBox1 = new CheckBox("are you human");
        checkBox1.setOnAction(actionEvent -> {
            label4.setText("Is human");
            progressBar1.setProgress(progressBar1.getProgress()+.25);
            checkBox1.setDisable(true);
        });
        retryButton.setOnAction(actionEvent -> {
            progressBar1.setProgress(0);
            pressMe.setDisable(false);
            typeHere.setDisable(false);
            menuButton.setDisable(false);
            checkBox1.setDisable(false);
        });


        // Layout our scene
        VBox vBox1 = new VBox(text1, label2, label3, label5, label4);
        vBox1.setAlignment(Pos.BASELINE_CENTER);
        vBox1.setSpacing(22);
        VBox vBox2 = new VBox(label1, progressBar1, pressMe, typeHere, menuButton, checkBox1,retryButton);
        HBox myHbox = new HBox(40, vBox2, vBox1);
        Scene scene = new Scene(myHbox, 800, 600);

        // Display our stage
        primaryStage.setTitle("JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args) {

        Application.launch(args);
    }
}