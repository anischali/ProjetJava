/*     */ package HMSDesign.Space;
/*     */ 
/*     */ import HMSDesign.Home.HomeController;
/*     */ import hospitalmanagementsystem.HospitalDB;
/*     */ import hospitalmanagementsystem.Main;
/*     */ import java.io.IOException;
/*     */ import java.io.PrintStream;
/*     */ import java.sql.SQLException;
/*     */ import javafx.fxml.FXML;
/*     */ import javafx.fxml.FXMLLoader;
/*     */ import javafx.scene.control.TextField;
/*     */ import javafx.scene.image.ImageView;
/*     */ import javafx.scene.input.MouseEvent;
/*     */ import javafx.scene.layout.AnchorPane;
/*     */ 
/*     */ public class AssistantSpaceController
/*     */ {
/*     */ 
/*     */   @FXML
/*     */   private TextField PnomAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField PprenomAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField PsexeAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField PnssAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField PspecAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField PadrAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField PcpAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField PvilleAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField PpaysAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField Ptel1Add;
/*     */ 
/*     */   @FXML
/*     */   private TextField PdateAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField PemailAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField PsituationAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField Pdate2Add;
/*     */ 
/*     */   @FXML
/*     */   private TextField PnomSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField PprenomSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField PsexeSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField PnssSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField PspecSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField PadrSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField PcpSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField PvilleSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField PpaysSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField Ptel1Srch;
/*     */ 
/*     */   @FXML
/*     */   private TextField PdateSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField PemailSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField PsituationSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField Pdate2Srch;
/*     */ 
/*     */   @FXML
/*     */   private AnchorPane assistantHome;
/*     */ 
/*     */   @FXML
/*     */   private ImageView assistantPatient;
/*     */ 
/*     */   @FXML
/*     */   private AnchorPane AssistantPatientPanel;
/*     */ 
/*     */   @FXML
/*     */   private ImageView assistantRdv;
/*     */ 
/*     */   @FXML
/*     */   private AnchorPane AssistantRDVPanel;
/*     */ 
/*     */   @FXML
/*     */   private ImageView assistantSetting;
/*     */ 
/*     */   @FXML
/*     */   private AnchorPane AssistantSettingPanel;
/*     */ 
/*     */   @FXML
/*     */   private void logOut()
/*     */     throws IOException, ClassNotFoundException
/*     */   {
/*  70 */     Main.home = (AnchorPane)FXMLLoader.load(Main.class.getResource("/HMSDesign/Home/Home.fxml"));
/*  71 */     Main.mainShow(Main.home);
/*     */   }
/*  74 */   @FXML
/*     */   private void goBack() { this.AssistantPatientPanel.setVisible(false);
/*  75 */     this.AssistantRDVPanel.setVisible(false);
/*  76 */     this.AssistantSettingPanel.setVisible(false);
/*     */ 
/*  78 */     this.assistantHome.setVisible(true); }
/*     */ 
/*     */   @FXML
/*     */   private void homeAssistantOnClick(MouseEvent event)
/*     */   {
/*  83 */     if (event.getTarget() == this.assistantPatient) {
/*  84 */       this.assistantHome.setVisible(false);
/*  85 */       this.AssistantPatientPanel.setVisible(true);
/*     */     }
/*  87 */     else if (event.getTarget() == this.assistantRdv) {
/*  88 */       this.assistantHome.setVisible(false);
/*  89 */       this.AssistantRDVPanel.setVisible(true);
/*     */     }
/*  91 */     else if (event.getTarget() == this.assistantSetting) {
/*  92 */       this.assistantHome.setVisible(false);
/*  93 */       this.AssistantSettingPanel.setVisible(true);
/*     */     }
/*     */   }
/*  97 */   @FXML
/*     */   private void addPatientToDB() throws ClassNotFoundException, SQLException { String n = this.PnomAdd.getText().isEmpty() ? "?" : this.PnomAdd.getText();
/*  98 */     String p = this.PprenomAdd.getText().isEmpty() ? "?" : this.PprenomAdd.getText();
/*  99 */     String sx = this.PsexeAdd.getText().isEmpty() ? "?" : this.PsexeAdd.getText();
/* 100 */     String st = this.PsituationAdd.getText().isEmpty() ? "?" : this.PsituationAdd.getText();
/* 101 */     String ns = this.PnssAdd.getText().isEmpty() ? "?" : this.PnssAdd.getText();
/* 102 */     String d1 = this.PdateAdd.getText().isEmpty() ? "?" : this.PdateAdd.getText();
/* 103 */     String adr = this.PadrAdd.getText().isEmpty() ? "?" : this.PadrAdd.getText();
/* 104 */     String cp = this.PcpAdd.getText().isEmpty() ? "?" : this.PcpAdd.getText();
/* 105 */     String v = this.PvilleAdd.getText().isEmpty() ? "?" : this.PvilleAdd.getText();
/* 106 */     String ps = this.PpaysAdd.getText().isEmpty() ? "?" : this.PpaysAdd.getText();
/* 107 */     String t1 = this.Ptel1Add.getText().isEmpty() ? "?" : this.Ptel1Add.getText();
/* 108 */     String d2 = this.Pdate2Add.getText().isEmpty() ? "?" : this.Pdate2Add.getText();
/* 109 */     String em = this.PemailAdd.getText().isEmpty() ? "?" : this.PemailAdd.getText();
/*     */ 
/* 111 */     String Adresse = adr + " " + cp + " " + v + " " + ps;
/* 112 */     String Tel = t1;
/* 113 */     String Date = "e:" + d1 + "s:" + d2;
/* 114 */     if (Adresse.contains("?")) {
/* 115 */       Adresse.replaceAll("?", "");
/* 116 */       Adresse.replace("'", " ");
/*     */     }
/* 118 */     if (Date.contains("?")) {
/* 119 */       Date.replaceAll("?", "");
/* 120 */       Date.replace("'", " ");
/*     */     }
/* 122 */     if (Tel.contains("?")) {
/* 123 */       Tel.replace("?", "");
/* 124 */       Tel.replace("'", " ");
/*     */     }
/* 126 */     if (Tel.isEmpty())
/*     */     {
/* 128 */       Tel = Tel + "?";
/*     */     }
/* 130 */     if (Adresse.isEmpty()) {
/* 131 */       Adresse = Adresse + "?";
/*     */     }
/* 133 */     if (em.equals("?")) {
/* 134 */       return;
/*     */     }
/* 136 */     String query = "INSERT INTO PATIENT VALUES (?,'" + n + "','" + p + "','" + sx + "','" + st + "','" + ns + "','" + Date + "','" + Adresse + "','" + Tel + "','" + em + "');";
/* 137 */     System.out.println(query);
/* 138 */     HomeController.DataBase.executeQry(query);
/*     */   }
/*     */ }

/* Location:           /home/pc-home/Bureau/HMS1.jar
 * Qualified Name:     HMSDesign.Space.AssistantSpaceController
 * JD-Core Version:    0.6.2
 */