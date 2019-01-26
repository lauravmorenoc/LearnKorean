/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendecoreano;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.io.*;
/**
 *
 * @author Laura M
 */
public class Tablero extends Application {
    @Override
    public void start(Stage stage) throws Exception{
        //Layout
        Pane pane1=new Pane();
        Canvas canvas; //Creacion del tablero de 600px por 600px
        canvas = new Canvas(1900, 650);
        pane1.getChildren().add(canvas);
        
        Scene scene1= new Scene(pane1, 1900, 650, Color.WHITESMOKE);
        
        GraphicsContext gc= canvas.getGraphicsContext2D();
        
        AprendeCoreano loop=new AprendeCoreano(gc);
        loop.start();
        
        stage.setTitle("Aprende Coreano (한국어를 배우십시오)"); //aparece en la parte superior de la ventana
        stage.setScene(scene1);
        stage.show();
    
    }
    
    public static void main(String[] args) {
        Application.launch(args);
        
        
    }
}
