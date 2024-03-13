package org.example.lab3.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.example.lab3.MainApplication;
import org.example.lab3.Model.SingletonStudent;
import org.example.lab3.Model.Student;

import java.io.IOException;

public class InputController {

    private Student student;
    @FXML
    private TextField student_group;

    @FXML
    private TextField student_id;

    @FXML
    private TextField student_name;

    @FXML
    void sendStudentData(ActionEvent event) throws IOException {
//        student = new Student(student_name.getText(), student_id.getText(), student_group.getText());

        SingletonStudent singletonStudent = SingletonStudent.getInstance();
        student = singletonStudent.getStudent();
        student.setName(student_name.getText());
        student.setId(student_id.getText());
        student.setGroup(student_group.getText());
//        Node node = (Node) event.getSource();
//        Stage stage = (Stage) node.getScene().getWindow();
//        stage.setUserData(student);
//        stage.close();
//
//        // try catch
//        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("output-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
//
//        stage.setTitle("output");
//        stage.setScene(scene);
//        stage.show();

        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("output2-view.fxml"));

        OutputController outputController = new OutputController();
        outputController.setStudent(student);
        fxmlLoader.setController(outputController);

        Scene scene = new Scene(fxmlLoader.load(), 600, 600);

        stage.setTitle("output");
        stage.setScene(scene);
        stage.show();
    }

}
