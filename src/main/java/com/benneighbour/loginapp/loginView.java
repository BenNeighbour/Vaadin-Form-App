// Relative path to the package/destination
package com.benneighbour.loginapp;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;


// Target URL extension
@Route("")

// The theme for the application is set to the lumo dark theme
@Theme(value = Lumo.class, variant = Lumo.LIGHT)

// Creation of the Java Class
public class loginView extends VerticalLayout {

    // Creating the main view of the application
    public loginView() {

        Tab mr = new Tab("Male");
        Tab mrs = new Tab("Female");
        Tab rathernotsay = new Tab("Other");
        Tabs tabs = new Tabs(mr, mrs, rathernotsay);

        TextField forename = new TextField();
        forename.setLabel("Forename");

        TextField surname = new TextField();
        surname.setLabel("Surname");

        EmailField emailField = new EmailField("Email");

        PasswordField password = new PasswordField();
        password.setLabel("Password");
        password.setPlaceholder("");

        DatePicker dateOfBirth = new DatePicker();
        dateOfBirth.setLabel("Date of Birth");

        Button submit = new Button("Create Account", event -> {
            Span thankYou = new Span("Thank you for giving " +
                    "Ben your information, he really does appreciate " +
                    "it!");

            forename.clear();
            surname.clear();
            emailField.clear();
            password.clear();
            dateOfBirth.clear();

            add(
                thankYou
            );

        });


        HorizontalLayout top = new HorizontalLayout(
            tabs
        );

        VerticalLayout app = new VerticalLayout(
            forename,
            surname,
            emailField,
            password,
            dateOfBirth,
            submit
        );


        add(
            top,
            app
        );

    }

}
