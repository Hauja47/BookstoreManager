module com.team15.bookstoremanager {
    requires javafx.controls;
    requires javafx.fxml;

    requires java.naming;

    requires org.hibernate.orm.core;
    requires jakarta.persistence;

    opens com.team15.bookstoremanager to javafx.fxml;
    opens com.team15.bookstoremanager.controllers to javafx.fxml;
//    opens com.team15.bookstoremanager.entities to javafx.base, org.hibernate.orm.core;

    exports com.team15.bookstoremanager;
    exports com.team15.bookstoremanager.controllers;
}
