package com.example.learnfx;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;
import java.io.IOException;

public class ShapeTrans extends Application {
    @Override
    public void start(Stage stage ) throws IOException {
        Rectangle rect1 = new Rectangle(100,100,200,200);
        Rectangle rect2 = new Rectangle(65,20,100,100);
        Rectangle rect3 = new Rectangle(100,100,200,200);



        //setting rectangle properties
        rect1.setFill(Color.RED);
        rect1.setStroke(Color.BLACK);
        rect1.setStrokeWidth(5);
        rect2.setFill(Color.GREEN);
        rect2.setStroke(Color.BLACK);
        rect2.setStrokeWidth(5);
        rect3.setFill(Color.YELLOW);
        rect3.setStroke(Color.BLACK);
        rect3.setStrokeWidth(5);


        Scale scale = new Scale();
        scale.setX(1.2);
        scale.setY(1.2);

        Rotate rotate = new Rotate();
        rotate.setAngle(30);
        rotate.setPivotY(100);
        rotate.setPivotX(20);


        rect2.getTransforms().add(scale);
        rect3.getTransforms().add(rotate);



        Group group = new Group();
        group.getChildren().addAll(rect1,rect2,rect3);

        Scene scene = new Scene(group, 500, 500);


        stage.setTitle("Shape ");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}