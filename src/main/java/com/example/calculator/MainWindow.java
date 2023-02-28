package com.example.calculator;

import javafx.application.Application;
import javafx.beans.property.ObjectProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainWindow extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    String displayContent = "";

    char operation = 'x';

    @Override
    public void start(Stage primaryStage) {
        Group group = new Group();
        Scene calculatorView = new Scene(group);
        Canvas viewDrawer = new Canvas(400,600);

        group.getChildren().add(viewDrawer);

        Button num7 = new Button();
        num7.setText("7");
        num7.setTranslateX(0);
        num7.setTranslateY(200);
        num7.setPrefSize(100,100);
        num7.setFont(new Font("Arial",40));
        group.getChildren().add(num7);



        Button num8 = new Button();
        num8.setText("8");
        num8.setTranslateX(100);
        num8.setTranslateY(200);
        num8.setPrefSize(100,100);
        num8.setFont(new Font("Arial",40));
        group.getChildren().add(num8);

        Button num9 = new Button();
        num9.setText("9");
        num9.setTranslateX(200);
        num9.setTranslateY(200);
        num9.setPrefSize(100,100);
        num9.setFont(new Font("Arial",40));
        group.getChildren().add(num9);

        Button num4 = new Button();
        num4.setText("4");
        num4.setTranslateX(0);
        num4.setTranslateY(300);
        num4.setPrefSize(100,100);
        num4.setFont(new Font("Arial",40));
        group.getChildren().add(num4);

        Button num5 = new Button();
        num5.setText("5");
        num5.setTranslateX(100);
        num5.setTranslateY(300);
        num5.setPrefSize(100,100);
        num5.setFont(new Font("Arial",40));
        group.getChildren().add(num5);

        Button num6 = new Button();
        num6.setText("6");
        num6.setTranslateX(200);
        num6.setTranslateY(300);
        num6.setPrefSize(100,100);
        num6.setFont(new Font("Arial",40));
        group.getChildren().add(num6);

        Button num1 = new Button();
        num1.setText("1");
        num1.setTranslateX(0);
        num1.setTranslateY(400);
        num1.setPrefSize(100,100);
        num1.setFont(new Font("Arial",40));
        group.getChildren().add(num1);

        Button num2 = new Button();
        num2.setText("2");
        num2.setTranslateX(100);
        num2.setTranslateY(400);
        num2.setPrefSize(100,100);
        num2.setFont(new Font("Arial",40));
        group.getChildren().add(num2);

        Button num3 = new Button();
        num3.setText("3");
        num3.setTranslateX(200);
        num3.setTranslateY(400);
        num3.setPrefSize(100,100);
        num3.setFont(new Font("Arial",40));
        group.getChildren().add(num3);

        Button num0 = new Button();
        num0.setText("0");
        num0.setTranslateX(0);
        num0.setTranslateY(500);
        num0.setPrefSize(200,100);
        num0.setFont(new Font("Arial",40));
        group.getChildren().add(num0);

        Button comma = new Button();
        comma.setText(",");
        comma.setTranslateX(200);
        comma.setTranslateY(500);
        comma.setPrefSize(100,100);
        comma.setFont(new Font("Arial",40));
        group.getChildren().add(comma);

        Button delete = new Button();
        delete.setText("del");
        delete.setTranslateX(0);
        delete.setTranslateY(100);
        delete.setPrefSize(100,100);
        delete.setFont(new Font("Arial",35));
        group.getChildren().add(delete);

        //Operator Buttons
        Button divide = new Button();
        divide.setText("/");
        divide.setTranslateX(100);
        divide.setTranslateY(100);
        divide.setPrefSize(100,100);
        divide.setFont(new Font("Arial",40));
        group.getChildren().add(divide);

        Button multiplicate = new Button();
        multiplicate.setText("*");
        multiplicate.setTranslateX(200);
        multiplicate.setTranslateY(100);
        multiplicate.setPrefSize(100,100);
        multiplicate.setFont(new Font("Arial",40));
        group.getChildren().add(multiplicate);

        Button addition = new Button();
        addition.setText("+");
        addition.setTranslateX(300);
        addition.setTranslateY(200);
        addition.setPrefSize(100,200);
        addition.setFont(new Font("Arial",40));
        group.getChildren().add(addition);

        Button substraction = new Button();
        substraction.setText("-");
        substraction.setTranslateX(300);
        substraction.setTranslateY(100);
        substraction.setPrefSize(100,100);
        substraction.setFont(new Font("Arial",40));
        group.getChildren().add(substraction);

        Button equals = new Button();
        equals.setText("=");
        equals.setTranslateX(300);
        equals.setTranslateY(400);
        equals.setPrefSize(100,200);
        equals.setFont(new Font("Arial",40));
        group.getChildren().add(equals);

        TextField display = new TextField();
        display.setText("");
        display.setTranslateX(0);
        display.setTranslateY(0);
        display.setPrefSize(400,100);
        display.setFont(new Font("Arial",40));
        group.getChildren().add(display);

        num1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                displayContent = display.getText();
                displayContent += "1";
                display.setText(displayContent);

            }
        });
        num2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                displayContent = display.getText();
                displayContent += "2";
                display.setText(displayContent);

            }
        });
        num3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                displayContent = display.getText();
                displayContent += "3";
                display.setText(displayContent);

            }
        });
        num4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                displayContent = display.getText();
                displayContent += "4";
                display.setText(displayContent);

            }
        });
        num5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                displayContent = display.getText();
                displayContent += "5";
                display.setText(displayContent);

            }
        });
        num6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                displayContent = display.getText();
                displayContent += "6";
                display.setText(displayContent);

            }
        });

        num7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                displayContent = display.getText();
            displayContent += "7";
            display.setText(displayContent);

            }
        });
        num8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                displayContent = display.getText();
                displayContent += "8";
                display.setText(displayContent);

            }
        });

        num9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                displayContent = display.getText();
                displayContent += "9";
                display.setText(displayContent);

            }
        });
        num0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                displayContent = display.getText();
                displayContent += "0";
                display.setText(displayContent);

            }
        });

        comma.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                displayContent = display.getText();
                displayContent += ".";
                display.setText(displayContent);

            }
        });

        addition.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                Functions.number1 += Double.parseDouble(displayContent);

                displayContent = "";
                display.setText(displayContent);
                operation = '+';

            }
        });

        substraction.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                Functions.number1 += Double.parseDouble(displayContent);

                displayContent = "";
                display.setText(displayContent);
                operation = '-';

            }
        });

        multiplicate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                Functions.number1 += Double.parseDouble(displayContent);

                displayContent = "";
                display.setText(displayContent);
                operation = '*';

            }
        });
        divide.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                Functions.number1 += Double.parseDouble(displayContent);

                displayContent = "";
                display.setText(displayContent);
                operation = '/';

            }
        });

        delete.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                Functions.number1 = 0;

                displayContent = "";
                display.setText(displayContent);
                operation = 'x';

            }
        });
        equals.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                switch (operation) {
                    case '+':
                        Functions.number1 += Double.parseDouble(displayContent);
                        break;
                    case '-':
                        Functions.number1 -= Double.parseDouble(displayContent);
                        break;
                    case '*':
                        Functions.number1 *= Double.parseDouble(displayContent);
                        break;
                    case '/':
                        Functions.number1 /= Double.parseDouble(displayContent);
                        break;
                    case 'x':
                        Functions.number2 = Double.parseDouble(displayContent);
                        break;

                }



                Functions.number2 = Functions.number1;
                Functions.number1 = 0;
                displayContent = String.valueOf(Functions.number2);
                display.setText(displayContent);



            }
        });



        primaryStage.setScene(calculatorView);
        primaryStage.setTitle("Calculator");
        primaryStage.show();

    }




}
