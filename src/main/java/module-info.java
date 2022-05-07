module com.team15.bookstoremanager {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.team15.bookstoremanager to javafx.fxml;
    exports com.team15.bookstoremanager;
}
