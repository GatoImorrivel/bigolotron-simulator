module com.usguri.reigns {
    requires javafx.controls;
    requires javafx.fxml;
	requires java.base;

    opens com.usguri.reigns to javafx.fxml;
    exports com.usguri.reigns;
}
