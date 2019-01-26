/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendecoreano;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

/**
 *
 * @author Laura M
 */
public class AprendeCoreano extends AnimationTimer{
    
    private GraphicsContext gc;
    
    private Image fondo;
    private Image flag;
    
    private String[][] profesiones= {{"Ingeniero", "엔지니어"},
        {"Medico", "의사"},
        {"Cantante", "가수"}, 
        {"Cocinero", "요리사"}, 
        {"Mesero", "웨이터"}, 
        {"Policia", "경찰서"}, 
        {"Bombero", "소방서"}, 
        {"Oficinista", "위사원"}, 
        {"Actor", "영화배우"},
        {"Estudiante", "학생"},
        {"Empleado de banco", "은행원"},
        {"Ama de casa", "주부"}
    };
    
    private String[][] paisesYciudades= {
        {"Argentina", "아르헨티나"}, 
        {"Australia", "호주"}, 
        {"Bogota", "보고타"},
        {"Canada", "캐나다"}, 
        {"China", "주국"},
        {"Colombia", "콜롬비아"}, 
        {"Corea", "한국"}, 
        {"Estados Unidos", "미국"}, 
        {"Francia", "브랑세"}, 
        {"Inglaterra", "영국"}, 
        {"Italia", "이탈리아"}, 
        {"Japon", "일본"}, 
        {"Mexico", "멕시코"}, 
        {"Mongolia", "몬골"},
        {"Rusia", "러시아"}, 
        {"Seul", "서울"},
        {"Tailandia", "태국"},
        {"Turquía", "터키"}, 
        {"Vietnam", "베트남"},
    };
    
    private String[][] verbosYadjetivos={
        {"Aburrido", "재미없다"},
        {"Barato", "싸다"},
        {"Beber", "마시다"}, 
        {"Cantar", "노래"},
        {"Caro", "비싸다"},
        {"Comer", "먹다"}, 
        {"Delicioso", "마싰다"},
        {"Descansar", "쉬다"},
        {"Dormir", "자다"}, 
        //{"Escribir", ""}, 
        {"Escuchar", "듣다"}, 
        {"Estudiar", "공부하다"},
        {"Hacer ejercicio", "운동하다"},
        {"Interesante", "재미있다"},
        {"Ir", "가다"}, 
        {"Largo", "길다"},
        {"Leer", "읽다"},
        {"Llamar", "전화하다"},
        //{"Montarse/Subirse", ""},
        {"Mucho", "많다"},
        {"Observar", "보다"},
        {"Pequeño", "작다"},
        {"Ser", "이다"}, 
        {"Venir", "오다"}, 
        {"Vivir", "살다"}
    };
    
    private String[][] animales={
        {"Zorro", "여우"}, 
        {"Leon", "사자"}, 
        {"Perro", "개"}, 
        {"Cerdo", "돼지"}, 
        {"Conejo", "토끼"}, 
        {"Elefante", "코끼리"}, 
        {"Caballo", "말"}
    };
    
    private String[][] comida={
        {"Arroz", "밥"},
        {"Banano", "바나나"},
        {"Cafe (bebida)", "커피"}, 
        {"Leche", "우유"}, 
        {"Manzana", "사과"}, 
        {"Pan", "빵"},
        {"Pepino", "우이"}, 
        {"Sopa", "찌개"}, 
    };
    
    private String[][] idiomas={
        {"Coreano", "한국어"},
        {"Español", "스페인어"},
        {"Ingles", "영어"},
        {"Japones", "일본어"}
    };
    
    private String[][] sustantivosVarios={
        {"Afuera", "밖"},
        {"Amable", "예삐다"}, 
        {"Amigo", "친구"},
        {"Arbol", "나무"},
        {"Cabeza", "머이"},
        {"Casa", "집"},
        {"Celular (comun)", "핸느폰"},
        {"Celular (examen)", "휴대선화"},
        {"Cintura", "허리"},
        {"Cocina", "부엌"},
        {"Cola", "꼬리"},
        {"Computador", "컴퓨터"},
        {"Cuaderno", "공첵"},
        {"Cuerpo", "몸"},
        {"Diccionario", "사전"},
        {"Dia", "낮"},
        {"Direccion", "주소"},
        {"Email", "에마일"},
        {"Empresa", "시과"},
        {"Escritorio", "책상"}, 
        {"Escuela", "하겨"},
        {"Estudio", "공부"},
        {"Final", "끝"}, 
        {"Flor", "꽃"}, 
        {"Frente (parte delantera)", "앞"}, 
        {"Frio", "추워요"},
        {"Futbolista", "축구선수"},
        {"Habitacion", "방"},
        {"Helado", "아이스크림"},
        {"Hombre", "남자"},
        {"Isla", "섬"}, 
        {"Jabon", "비누"},
        {"Kimchi", "김치"},
        {"Lapiz", "연필"}, 
        {"Libro", "책"},  
        {"Maleta", "가방"}, 
        {"Montaña", "산"}, 
        {"Mujer", "여자"},
        {"Musica", "음악"},
        {"Nieve", "눈"},
        {"Niño", "아이"},  
        {"Nombre", "이름"},
        {"Oficina", "사무실"},
        {"Oreja", "귀"},  
        {"Pantalones", "바지"}, 
        {"Patada", "차다"}, 
        {"Pelicula", "영화"},
        {"Pelota", "공"},
        {"Periodico", "신문"},
        {"Persona", "사람"},
        {"Profesion", "직업"},
        {"Que", "무엇"},
        {"Quien", "누구"},
        {"Radio", "라디오"},
        {"Reloj", "시계"},
        {"Ropa", "옷"},
        {"Saludos", "인사 나누기"},
        {"Silla", "의자"}, 
        {"Sombrero", "모자"},
        {"Sombrilla", "우산"},
        {"Telefono", "전화"},
        {"Television", "텔레비전"},
        {"Tijeras", "사위"}, 
        {"Trenza", "짜다"}, 
        {"Ultima vocal", "받침"},
        {"Universidad", "데하겨"},
        {"Zapatos", "구두"},  
    };
    
    public AprendeCoreano(GraphicsContext gc){
        this.gc=gc;
        this.fondo=new Image("Image/wood1.jpg");
        this.flag=new Image("Image/flag.jpg");
    }
    
    public String menuPrincipal(){
        
        gc.setFont(Font.font("Britannic Bold", FontWeight.LIGHT, FontPosture.ITALIC, 100.0));
        gc.setFill(Color.BLUE);
        gc.fillText("Aprende Coreano", 275, 220, 1000);
        gc.setFont(Font.font("Cambria", FontWeight.LIGHT, FontPosture.ITALIC, 46.0));
        gc.setFill(Color.RED);
        gc.fillText("한국어를 배우십시오!", 460, 270, 400);
        gc.setFont(Font.font("Britannic Bold", FontWeight.LIGHT, FontPosture.REGULAR, 48.0));
        gc.setFill(Color.BLACK);
        gc.fillText("Vocabulario", 260, 410, 400);
        gc.fillText("Oraciones", 830, 410, 400);
        gc.setFont(Font.font("Britannic Bold", FontWeight.LIGHT, FontPosture.REGULAR, 40.0));
        gc.fillText("어휘", 335, 450, 400);
        gc.fillText("기도", 890, 450, 400);
        gc.setFont(Font.font("Verdana", FontWeight.LIGHT, FontPosture.REGULAR, 16.0));
        gc.setFill(Color.BROWN);
        gc.fillText("Presione la tecla V", 310, 485, 400);
        gc.fillText("Presione la tecla O", 865, 485, 400);
        
        Scanner teclado = new Scanner(System.in);
        String letra = teclado.nextLine();

        
        return letra;
    }
    
    @Override
    public void handle(long l){
        
        
        gc.drawImage(fondo, 0, 0, 1900, 650);
        gc.drawImage(flag, 32, 48, 140, 100);

        if(menuPrincipal()=="V"){
            
        }else if(menuPrincipal()=="O"){
            
        }
       
        
        
    }
    
}
