/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javafx.geometry.Pos;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * abdulfatah R Obaid
 */
public class AboutPane extends VBox
{
    private static final String PAGE_LINK = "https://github.com/abdulfatah1996/Advince_encryption_project";

    private final Stage primaryStage;

    public AboutPane(Stage primaryStage)
    {
        super();
        this.primaryStage = primaryStage;
        createWindow();

    }

    private void createWindow()
    {
        HBox contactHBox = new HBox();
        contactHBox.setAlignment(Pos.CENTER);
        Hyperlink website = new Hyperlink(PAGE_LINK);
        website.setOnAction(event -> new HtmlPage(PAGE_LINK).show());
        contactHBox.getChildren().addAll(new Label("Please visit us at"), website);
        getChildren().addAll(new Label("Version 1.0"), contactHBox);
        setAlignment(Pos.CENTER);
        setSpacing(0);
    }

}
