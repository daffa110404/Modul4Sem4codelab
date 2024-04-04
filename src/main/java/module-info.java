module com.example.modul4codelab {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.modul4codelab to javafx.fxml;
    exports com.example.modul4codelab;
}