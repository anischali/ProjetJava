/*     */ package HMSDesign.Home;
/*     */ 
/*     */ import hospitalmanagementsystem.HospitalDB;
/*     */ import hospitalmanagementsystem.Main;
/*     */ import java.io.IOException;
/*     */ import java.net.URL;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.SQLException;
/*     */ import java.util.ResourceBundle;
/*     */ import javafx.application.Platform;
/*     */ import javafx.fxml.FXML;
/*     */ import javafx.fxml.FXMLLoader;
/*     */ import javafx.fxml.Initializable;
/*     */ import javafx.scene.control.Button;
/*     */ import javafx.scene.control.Label;
/*     */ import javafx.scene.control.PasswordField;
/*     */ import javafx.scene.control.TextField;
/*     */ import javafx.scene.image.ImageView;
/*     */ import javafx.scene.input.MouseEvent;
/*     */ import javafx.scene.layout.AnchorPane;
/*     */ 
/*     */ public class HomeController
/*     */   implements Initializable
/*     */ {
/*     */   public static HospitalDB DataBase;
/*     */ 
/*     */   @FXML
/*     */   private ImageView exit;
/*     */ 
/*     */   @FXML
/*     */   private ImageView IDoctorLog;
/*     */ 
/*     */   @FXML
/*     */   private ImageView IAdminLog;
/*     */ 
/*     */   @FXML
/*     */   private ImageView IAssistantLog;
/*     */ 
/*     */   @FXML
/*     */   private Label LAdminLog;
/*     */ 
/*     */   @FXML
/*     */   private Label LDoctorLog;
/*     */ 
/*     */   @FXML
/*     */   private Label LAssistantLog;
/*     */ 
/*     */   @FXML
/*     */   private AnchorPane homePanel;
/*     */ 
/*     */   @FXML
/*     */   private AnchorPane adminPanel;
/*     */ 
/*     */   @FXML
/*     */   private AnchorPane doctorPanel;
/*     */ 
/*     */   @FXML
/*     */   private AnchorPane assistantPanel;
/*     */ 
/*     */   @FXML
/*     */   private Button cancel1;
/*     */ 
/*     */   @FXML
/*     */   private Button cancel2;
/*     */ 
/*     */   @FXML
/*     */   private Button cancel3;
/*     */ 
/*     */   @FXML
/*     */   private Button loginAdmin;
/*     */ 
/*     */   @FXML
/*     */   private Button loginDoctor;
/*     */ 
/*     */   @FXML
/*     */   private Button loginAssistant;
/*     */ 
/*     */   @FXML
/*     */   private TextField adminUser;
/*     */ 
/*     */   @FXML
/*     */   private PasswordField passwordAdmin;
/*     */ 
/*     */   @FXML
/*     */   private TextField doctorUser;
/*     */ 
/*     */   @FXML
/*     */   private PasswordField doctorPassword;
/*     */ 
/*     */   @FXML
/*     */   private TextField assistantUser;
/*     */ 
/*     */   @FXML
/*     */   private PasswordField assistantPassword;
/*     */ 
/*     */   @FXML
/*     */   private Label error;
/*     */ 
/*     */   @FXML
/*     */   private void loginAsAdmin()
/*     */     throws IOException, ClassNotFoundException, SQLException
/*     */   {
/*  65 */     String user = this.adminUser.getText();
/*  66 */     String password = this.passwordAdmin.getText();
/*     */ 
/*  68 */     ResultSet login = DataBase.getResult("SELECT login,password FROM admin where login='" + user + "' AND password='" + password + "';");
/*     */ 
/*  70 */     if (login.next()) {
/*  71 */       if ((login.getString(1).equals(user)) && (login.getString(2).equals(password))) {
/*  72 */         Main.adminSpace = (AnchorPane)FXMLLoader.load(Main.class.getResource("/HMSDesign/Space/AdminSpace.fxml"));
/*  73 */         Main.mainShow(Main.adminSpace);
/*     */       }
/*     */     }
/*     */     else
/*  77 */       this.error.setText("aucun compte ne correspond à ce login !!!");
/*     */   }
/*     */ 
/*     */   @FXML
/*     */   private void loginAsDoctor()
/*     */     throws IOException, ClassNotFoundException, SQLException
/*     */   {
/*  86 */     String user = this.doctorUser.getText();
/*  87 */     String password = this.doctorPassword.getText();
/*     */ 
/*  89 */     ResultSet login = DataBase.getResult("SELECT email,password FROM doctors where email='" + user + "' AND password='" + password + "';");
/*     */ 
/*  91 */     if (login.next()) {
/*  92 */       if ((login.getString(1).equals(user)) && (login.getString(2).equals(password))) {
/*  93 */         Main.doctorSpace = (AnchorPane)FXMLLoader.load(Main.class.getResource("/HMSDesign/Space/DoctorSpace.fxml"));
/*  94 */         Main.mainShow(Main.doctorSpace);
/*     */       }
/*     */     }
/*  97 */     else this.error.setText("aucun compte ne correspond à ce login !!!"); 
/*     */   }
/*     */ 
/*     */   @FXML
/*     */   private void loginAsAssistant() throws IOException, ClassNotFoundException, SQLException {
/* 102 */     String user = this.assistantUser.getText();
/* 103 */     String password = this.assistantPassword.getText();
/*     */ 
/* 105 */     ResultSet login = DataBase.getResult("SELECT email,password FROM assistant where email='" + user + "' AND password='" + password + "';");
/*     */ 
/* 107 */     if (login.next()) {
/* 108 */       if ((login.getString(1).equals(user)) && (login.getString(2).equals(password))) {
/* 109 */         Main.assistantSpace = (AnchorPane)FXMLLoader.load(Main.class.getResource("/HMSDesign/Space/AssistantSpace.fxml"));
/* 110 */         Main.mainShow(Main.assistantSpace);
/*     */       }
/*     */     }
/* 113 */     else this.error.setText("aucun compte ne correspond à ce login !!!");
/*     */   }
/*     */ 
/*     */   @FXML
/*     */   private void cancelBtn()
/*     */   {
/* 123 */     allHide();
/* 124 */     this.homePanel.setVisible(true);
/* 125 */     this.error.setText("");
/*     */   }
/*     */ 
/*     */   private void allHide()
/*     */   {
/* 130 */     this.adminPanel.setVisible(false);
/* 131 */     this.doctorPanel.setVisible(false);
/* 132 */     this.assistantPanel.setVisible(false);
/*     */   }
/*     */ 
/*     */   @FXML
/*     */   private void onClickHandle(MouseEvent event)
/*     */   {
/* 139 */     if (event.getTarget() == this.exit) {
/* 140 */       exitHMS();
/*     */     }
/* 142 */     else if ((event.getTarget() == this.IAdminLog) || (event.getTarget() == this.LAdminLog)) {
/* 143 */       this.homePanel.setVisible(false);
/* 144 */       this.adminPanel.setVisible(true);
/*     */     }
/* 146 */     else if ((event.getTarget() == this.IDoctorLog) || (event.getTarget() == this.LDoctorLog)) {
/* 147 */       this.homePanel.setVisible(false);
/* 148 */       this.doctorPanel.setVisible(true);
/*     */     }
/* 150 */     else if ((event.getTarget() == this.IAssistantLog) || (event.getTarget() == this.LAssistantLog)) {
/* 151 */       this.homePanel.setVisible(false);
/* 152 */       this.assistantPanel.setVisible(true);
/*     */     }
/*     */   }
/*     */ 
/*     */   private void exitHMS()
/*     */   {
/* 161 */     Platform.exit();
/*     */   }
/*     */ 
/*     */   public void initialize(URL location, ResourceBundle resources)
/*     */   {
/* 176 */     DataBase = new HospitalDB();
/*     */     try {
/* 178 */       DataBase.seConnecter();
/*     */     }
/*     */     catch (ClassNotFoundException|SQLException e)
/*     */     {
/* 182 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */ }

/* Location:           /home/pc-home/Bureau/HMS1.jar
 * Qualified Name:     HMSDesign.Home.HomeController
 * JD-Core Version:    0.6.2
 */