package p4;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import p1.*;

/**
 * Created by Eric on 4/7/2017.
 */
public class App extends Application{
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        StudentStack studentStack = new StudentStack(5);
        StudentQueue studentQueue = new StudentQueue(5);
        TextArea stackArea = new TextArea("Students popped out from stack");
        TextArea queueArea = new TextArea("Students removed from queue");
        Button stackButton = new Button("Add to Stack");
        Button queueButton = new Button("Add to Queue");
        Button showButton = new Button("Show");
        Button resetButton = new Button("Reset");
        Student s1 = new Student("Eric",0,3.0,"Computer Science");
        Student s2 = new Student("Tim",1,2.5,"Engineering");
        Student s3 = new Student("Pete",2,1.0,"Math");
        Student s4 = new Student("Joe",3,4.0,"Marketing");
        Student s5 = new Student("Liam",4,2.0,"Political Science");
        ObservableList<String> options =
                FXCollections.observableArrayList(
                        "Eric","Tim","Pete","Joe","Liam"
                );
        ComboBox<String> comboBox = new ComboBox<>(options);
        HBox hbox = new HBox();
        VBox buttonBox = new VBox();
        VBox textBox = new VBox();
        buttonBox.getChildren().addAll(stackButton,queueButton,showButton,resetButton);
        textBox.getChildren().addAll(stackArea,queueArea);
        hbox.getChildren().addAll(comboBox,buttonBox,textBox);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setSpacing(50);
        textBox.setAlignment(Pos.CENTER);
        textBox.setSpacing(50);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(50);
        Scene scene = new Scene(hbox,800,800);
        stackButton.setOnAction(e->{
            if(comboBox.getSelectionModel().isEmpty()){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Please select a student from the comboBox");
                alert.showAndWait();
            }else{
                if(comboBox.getSelectionModel().getSelectedItem().equals("Eric")) {
                    studentStack.push(s1);
                    comboBox.getItems().remove("Eric");
                }
                else if(comboBox.getSelectionModel().getSelectedItem().equals("Tim")) {
                    studentStack.push(s2);
                    comboBox.getItems().remove("Tim");
                }
                else if(comboBox.getSelectionModel().getSelectedItem().equals("Pete")) {
                    studentStack.push(s3);
                    comboBox.getItems().remove("Pete");
                }
                else if(comboBox.getSelectionModel().getSelectedItem().equals("Joe")) {
                    studentStack.push(s4);
                    comboBox.getItems().remove("Joe");
                }
                else if(comboBox.getSelectionModel().getSelectedItem().equals("Liam")) {
                    studentStack.push(s5);
                    comboBox.getItems().remove("Liam");
                }
            }
        });
        resetButton.setOnAction(e->{
            comboBox.getItems().removeAll();
            comboBox.getItems().addAll(options);
            stackArea.clear();
            queueArea.clear();
            stackArea.appendText("Students popped out from stack");
            queueArea.appendText("Students removed from queue");
            studentQueue.reset();
            studentStack.reset();
        });
        showButton.setOnAction(e->{

        });
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
