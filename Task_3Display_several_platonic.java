package application;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.*;
import javafx.stage.Stage;
public class Task_3 extends Application {

    TriangleMesh makeDodecahedron(){
        double length = 100;
        float p0 = (float) (length*1.0/Math.sqrt(3.0f));
        float p1 = (float) (length*Math.sqrt((3.0-Math.sqrt(5.0))/6.0));
        float p2 = (float) (length*Math.sqrt((3.0+Math.sqrt(5.0))/6.0));
        float p3 = 0.0f;

        TriangleMesh dodecahedron = new TriangleMesh();
        dodecahedron.getPoints().addAll(
                p0,  p0,  p0,
                p0,  p0, -p0,
                p0, -p0,  p0,
                p0, -p0, -p0,
                -p0,  p0,  p0,
                -p0,  p0, -p0,
                -p0, -p0,  p0,
                -p0, -p0, -p0,
                p1,  p2,  p3,
                -p1,  p2,  p3,
                p1, -p2,  p3,
                -p1, -p2,  p3,
                p2,  p3,  p1,
                p2,  p3, -p1,
                -p2,  p3,  p1,
                -p2,  p3, -p1,
                p3,  p1,  p2,
                p3, -p1,  p2,
                p3,  p1, -p2,
                p3, -p1, -p2
        );

        dodecahedron.getTexCoords().addAll(
                0.50f, 1.00f,
                0.75f, (float) (1.0-Math.sqrt(3.0)/4.0f),
                0.25f, (float) (1.0-Math.sqrt(3.0)/4.0f),
                1.00f, 1.00f,
                0.50f, (float) (1.0-Math.sqrt(3.0)/2.0f),
                0.00f, 1.00f
        );

        dodecahedron.getFaces().addAll(
                0, 2,  8, 1,  9, 4,
                0, 2,  9, 1,  4, 4,
                0, 2,  4, 1, 16, 4,
                0, 2, 12, 1, 13, 4,
                0, 2, 13, 1,  1, 4,
                0, 2,  1, 1,  8, 4,
                0, 2, 16, 1, 17, 4,
                0, 2, 17, 1,  2, 4,
                0, 2,  2, 1, 12, 4,
                8, 2,  1, 1, 18, 4,
                8, 2, 18, 1,  5, 4,
                8, 2,  5, 1,  9, 4,
                12, 2,  2, 1, 10, 4,
                12, 2, 10, 1,  3, 4,
                12, 2,  3, 1, 13, 4,
                16, 2,  4, 1, 14, 4,
                16, 2, 14, 1,  6, 4,
                16, 2,  6, 1, 17, 4,
                9, 2,  5, 1, 15, 4,
                9, 2, 15, 1, 14, 4,
                9, 2, 14, 1,  4, 4,
                6, 2, 11, 1, 10, 4,
                6, 2, 10, 1,  2, 4,
                6, 2,  2, 1, 17, 4,
                3, 2, 19, 1, 18, 4,
                3, 2, 18, 1,  1, 4,
                3, 2,  1, 1, 13, 4,
                7, 2, 15, 1,  5, 4,
                7, 2,  5, 1, 18, 4,
                7, 2, 18, 1, 19, 4,
                7, 2, 11, 1,  6, 4,
                7, 2,  6, 1, 14, 4,
                7, 2, 14, 1, 15, 4,
                7, 2, 19, 1,  3, 4,
                7, 2,  3, 1, 10, 4,
                7, 2, 10, 1, 11, 4
        );

        dodecahedron.getFaceSmoothingGroups().addAll(
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
        );
       return dodecahedron;
    }

    TriangleMesh makeOctahedron(){
        TriangleMesh octahedron = new TriangleMesh();

// 設定頂點座標
        float length =100;
        octahedron.getPoints().addAll(
                length,    0.0f,    0.0f,
                -length,    0.0f,    0.0f,
                0.0f,  length,    0.0f,
                0.0f, -length,    0.0f,
                0.0f,    0.0f,  length,
                0.0f,    0.0f, -length
        );

        octahedron.getTexCoords().addAll(
                0.50f, 1.00f,
                0.75f, (float) (1.0-Math.sqrt(3.0)/4.0f),
                0.25f, (float) (1.0-Math.sqrt(3.0)/4.0f),
                1.00f, 1.00f,
                0.50f, (float) (1.0-Math.sqrt(3.0)/2.0f),
                0.00f, 1.00f
        );

        octahedron.getFaces().addAll(
                4, 0, 0, 1, 2, 2,
                4, 1, 2, 0, 1, 3,
                4, 2, 1, 1, 3, 4,
                4, 0, 3, 2, 0, 5,
                5, 0, 2, 2, 0, 5,
                5, 2, 1, 1, 2, 4,
                5, 1, 3, 0, 1, 3,
                5, 0, 0, 1, 3, 2
        );

        octahedron.getFaceSmoothingGroups().addAll(
                0, 2, 4, 8, 16, 32, 64, 128
        );

        return octahedron;
    }

    TriangleMesh  makeTriangleMesh (){
        float length = 100;
        float p0 = length*1.0f;
        float p1 = 0.0f;
        float p2 = (float) (length*Math.sqrt(2.0)/2.0f);
        TriangleMesh trianglemesh = new TriangleMesh();

        trianglemesh.getPoints().addAll(
                p0,  p1, -p2,
                -p0,  p1, -p2,
                p1,  p0,  p2,
                p1, -p0,  p2
        );

        trianglemesh.getTexCoords().addAll(
                0.50f, 1.00f,
                0.75f, (float) (1.0-Math.sqrt(3.0)/4.0f),
                0.25f, (float) (1.0-Math.sqrt(3.0)/4.0f),
                1.00f, 1.00f,
                0.50f, (float) (1.0-Math.sqrt(3.0)/2.0f),
                0.00f, 1.00f
        );

        trianglemesh.getFaces().addAll(
                0, 0, 1, 1, 2, 2,
                1, 1, 0, 0, 3, 3,
                2, 2, 1, 1, 3, 4,
                0, 0, 2, 2, 3, 5
        );
        trianglemesh.getFaceSmoothingGroups().addAll(0, 2, 4, 8);


       return trianglemesh;
    }

    Box makeBox() {
        Box box = new Box();
        box.setDepth(300);
        box.setWidth(300);
        box.setHeight(300);
        return box;

    }

    public void start(Stage primaryStage) throws Exception {
        // create a box
        Box box = makeBox();
        box.setTranslateX(300);
        box.setTranslateY(300);
        box.setTranslateZ(300);

        //change color and add material to the box
        PhongMaterial material = new PhongMaterial();
        material.setSpecularColor(Color.BLUE);
        material.setDiffuseColor(Color.BLACK);
        box.setMaterial(material);

        //make Tetrahedron
        TriangleMesh trianglemesh = makeTriangleMesh();
        MeshView meshView = new MeshView(trianglemesh);
        meshView.setTranslateX(650);
        meshView.setTranslateY(300);

        //make octahedron

       /* TriangleMesh octahedron = makeOctahedron();
        MeshView meshView1 = new MeshView(octahedron);
        meshView1.setTranslateX(900);
        meshView1.setTranslateY(300);*/

       // make dodecahedron

        TriangleMesh dodecahedron = makeDodecahedron();
        MeshView meshView3 = new MeshView(dodecahedron);
        meshView3.setTranslateX(900);
        meshView3.setTranslateY(300);

       //add all to the group to show it
        Group root = new Group();
        root.getChildren().addAll(box,meshView,meshView3);
        Scene scene = new Scene(root, 300, 250);


        primaryStage.setTitle("Task 3");
        primaryStage.setScene(scene);
        primaryStage.show();


        PerspectiveCamera camera = new PerspectiveCamera();
        scene.setCamera(camera);

    }

    public static void main(String[] args) {
        launch(args);
    }
}
