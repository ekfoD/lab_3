package org.example.lab3.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.example.lab3.Model.Student;

public class OutputController {

    private Student student;
    @FXML
    private TextField student_group;

    @FXML
    private TextField student_id;

    @FXML
    private TextField student_name;

    @FXML
    void getData(ActionEvent event) {
//        Node node = (Node) event.getSource();
//        Stage stage = (Stage) node.getScene().getWindow();
//
//        student = (Student) stage.getUserData();
        student_name.setText(student.getName());
        student_id.setText(student.getId());
        student_group.setText(student.getGroup());



    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
