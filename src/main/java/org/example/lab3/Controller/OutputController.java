package org.example.lab3.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
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
        student_name.setText(student.getName());
        student_id.setText(student.getId());
        student_group.setText(student.getGroup());

        // tiesiog i tuos laukus ideda student info
    }

    public void setStudent(Student student) {
        // kai sukuriamas ir perduoda veikima sitam controlleriui jis jau turi sita student
        this.student = student;
    }
}
