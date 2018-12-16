/*    */ package hospitalmanagementsystem;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import javafx.application.Application;
/*    */ import javafx.event.EventHandler;
/*    */ import javafx.fxml.FXMLLoader;
/*    */ import javafx.scene.Scene;
/*    */ import javafx.scene.input.MouseEvent;
/*    */ import javafx.scene.layout.AnchorPane;
/*    */ import javafx.scene.layout.BorderPane;
/*    */ import javafx.scene.paint.Color;
/*    */ import javafx.stage.Stage;
/*    */ import javafx.stage.StageStyle;
/*    */ 
/*    */ public class Main extends Application
/*    */ {
/* 18 */   private double setX = 0.0D;
/* 19 */   private double setY = 0.0D;
/*    */   private static Stage stage;
/*    */   private static Scene scene;
/*    */   public static BorderPane root;
/*    */   public static AnchorPane home;
/*    */   public static AnchorPane doctorSpace;
/*    */   public static AnchorPane assistantSpace;
/*    */   public static AnchorPane adminSpace;
/*    */ 
/*    */   public void start(Stage primaryStage)
/*    */     throws IOException
/*    */   {
/* 29 */     stage = primaryStage;
/* 30 */     stage.setTitle("HMS");
/* 31 */     AnchorPane main = (AnchorPane)FXMLLoader.load(Main.class.getResource("/HMSDesign/Home/Home.fxml"));
/* 32 */     root = new BorderPane();
/* 33 */     scene = new Scene(root);
/* 34 */     stage.setScene(scene);
/* 35 */     stage.initStyle(StageStyle.TRANSPARENT);
/* 36 */     scene.setFill(Color.TRANSPARENT);
/*    */     try
/*    */     {
/* 41 */       mainShow(main);
/*    */ 
/* 43 */       root.setOnMousePressed(new EventHandler()
/*    */       {
/*    */         public void handle(MouseEvent event) {
/* 46 */           Main.this.setX = event.getSceneX();
/* 47 */           Main.this.setY = event.getSceneY();
/*    */         }
/*    */       });
/* 50 */       root.setOnMouseDragged(new EventHandler()
/*    */       {
/*    */         public void handle(MouseEvent event) {
/* 53 */           Main.stage.setX(event.getScreenX() - Main.this.setX);
/* 54 */           Main.stage.setY(event.getScreenY() - Main.this.setY);
/*    */         }
/*    */       });
/*    */     }
/*    */     catch (Exception e)
/*    */     {
/* 60 */       e.printStackTrace();
/*    */     }
/*    */   }
/*    */ 
/*    */   public static void mainShow(AnchorPane main) throws IOException, ClassNotFoundException
/*    */   {
/* 66 */     root.setCenter(main);
/* 67 */     stage.show();
/*    */   }
/*    */   public static void main(String[] args) {
/* 70 */     launch(args);
/*    */   }
/*    */ }

/* Location:           /home/pc-home/Bureau/HMS1.jar
 * Qualified Name:     hospitalmanagementsystem.Main
 * JD-Core Version:    0.6.2
 */