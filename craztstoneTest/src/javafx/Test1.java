//package javafx;
//
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.Pane;
//import javafx.scene.layout.StackPane;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Circle;
//import javafx.stage.Stage;
//
///**
// * Created by crazystone on 2016/1/24.
// */
//public class Test1 extends Application {
//
//    public Test1() {
//        System.out.println(" Test1  construstor");
//    }
//
//
//    @Override
//    public void start(Stage stage) throws Exception {
//        System.out.println("application start");
//        Pane pane = new Pane();
//        pane.getChildren().add(new Button("click"));
////        Scene scene = new Scene(new Button("hello"), 500, 500);
//        Scene scene = new Scene(pane, 200, 200);
//        Circle circle = new Circle(50, 100, 20);
//        circle.setStroke(Color.RED);
//        circle.setFill(Color.CYAN);
//        pane.getChildren().add(circle);
//
//
//        stage.setTitle("java fx test1");
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    public static void main(String[] args) {
//        System.out.println("main");
//        Application.launch(args);
//
//    }
//
//}
