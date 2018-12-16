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
/*     */ public class DoctorSpaceController
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
/*     */   private TextField PnomEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField PprenomEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField PsexeEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField PnssEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField PspecEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField PadrEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField PcpEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField PvilleEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField PpaysEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField Ptel1Edt;
/*     */ 
/*     */   @FXML
/*     */   private TextField PdateEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField PemailEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField PsituationEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField Pdate2Edt;
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
/*     */   private AnchorPane doctorHome;
/*     */ 
/*     */   @FXML
/*     */   private ImageView doctorPatient;
/*     */ 
/*     */   @FXML
/*     */   private AnchorPane DoctorPatientPanel;
/*     */ 
/*     */   @FXML
/*     */   private ImageView doctorRdv;
/*     */ 
/*     */   @FXML
/*     */   private AnchorPane DoctorRDVPanel;
/*     */ 
/*     */   @FXML
/*     */   private ImageView doctorSetting;
/*     */ 
/*     */   @FXML
/*     */   private AnchorPane DoctorSettingPanel;
/*     */ 
/*     */   @FXML
/*     */   private void logOut()
/*     */     throws IOException, ClassNotFoundException
/*     */   {
/*  77 */     Main.home = (AnchorPane)FXMLLoader.load(Main.class.getResource("/HMSDesign/Home/Home.fxml"));
/*  78 */     Main.mainShow(Main.home);
/*     */   }
/*  81 */   @FXML
/*     */   private void goBack() { this.DoctorPatientPanel.setVisible(false);
/*  82 */     this.DoctorRDVPanel.setVisible(false);
/*  83 */     this.DoctorSettingPanel.setVisible(false);
/*     */ 
/*  85 */     this.doctorHome.setVisible(true); }
/*     */ 
/*     */   @FXML
/*     */   private void homeDoctorOnClick(MouseEvent event)
/*     */   {
/*  90 */     if (event.getTarget() == this.doctorPatient) {
/*  91 */       this.doctorHome.setVisible(false);
/*  92 */       this.DoctorPatientPanel.setVisible(true);
/*     */     }
/*  94 */     else if (event.getTarget() == this.doctorRdv) {
/*  95 */       this.doctorHome.setVisible(false);
/*  96 */       this.DoctorRDVPanel.setVisible(true);
/*     */     }
/*  98 */     else if (event.getTarget() == this.doctorSetting) {
/*  99 */       this.doctorHome.setVisible(false);
/* 100 */       this.DoctorSettingPanel.setVisible(true);
/*     */     }
/*     */   }
/* 104 */   @FXML
/*     */   private void addPatientToDB() throws ClassNotFoundException, SQLException { String n = this.PnomAdd.getText().isEmpty() ? "?" : this.PnomAdd.getText();
/* 105 */     String p = this.PprenomAdd.getText().isEmpty() ? "?" : this.PprenomAdd.getText();
/* 106 */     String sx = this.PsexeAdd.getText().isEmpty() ? "?" : this.PsexeAdd.getText();
/* 107 */     String st = this.PsituationAdd.getText().isEmpty() ? "?" : this.PsituationAdd.getText();
/* 108 */     String ns = this.PnssAdd.getText().isEmpty() ? "?" : this.PnssAdd.getText();
/* 109 */     String d1 = this.PdateAdd.getText().isEmpty() ? "?" : this.PdateAdd.getText();
/* 110 */     String adr = this.PadrAdd.getText().isEmpty() ? "?" : this.PadrAdd.getText();
/* 111 */     String cp = this.PcpAdd.getText().isEmpty() ? "?" : this.PcpAdd.getText();
/* 112 */     String v = this.PvilleAdd.getText().isEmpty() ? "?" : this.PvilleAdd.getText();
/* 113 */     String ps = this.PpaysAdd.getText().isEmpty() ? "?" : this.PpaysAdd.getText();
/* 114 */     String t1 = this.Ptel1Add.getText().isEmpty() ? "?" : this.Ptel1Add.getText();
/* 115 */     String d2 = this.Pdate2Add.getText().isEmpty() ? "?" : this.Pdate2Add.getText();
/* 116 */     String em = this.PemailAdd.getText().isEmpty() ? "?" : this.PemailAdd.getText();
/*     */ 
/* 118 */     String Adresse = adr + " " + cp + " " + v + " " + ps;
/* 119 */     String Tel = t1;
/* 120 */     String Date = "e:" + d1 + "s:" + d2;
/* 121 */     if (Adresse.contains("?")) {
/* 122 */       Adresse.replaceAll("?", "");
/* 123 */       Adresse.replace("'", " ");
/*     */     }
/* 125 */     if (Date.contains("?")) {
/* 126 */       Date.replaceAll("?", "");
/* 127 */       Date.replace("'", " ");
/*     */     }
/* 129 */     if (Tel.contains("?")) {
/* 130 */       Tel.replace("?", "");
/* 131 */       Tel.replace("'", " ");
/*     */     }
/* 133 */     if (Tel.isEmpty())
/*     */     {
/* 135 */       Tel = Tel + "?";
/*     */     }
/* 137 */     if (Adresse.isEmpty()) {
/* 138 */       Adresse = Adresse + "?";
/*     */     }
/* 140 */     if (em.equals("?")) {
/* 141 */       return;
/*     */     }
/* 143 */     String query = "INSERT INTO PATIENT VALUES (?,'" + n + "','" + p + "','" + sx + "','" + st + "','" + ns + "','" + Date + "','" + Adresse + "','" + Tel + "','" + em + "');";
/* 144 */     System.out.println(query);
/* 145 */     HomeController.DataBase.executeQry(query);
/*     */   }
/*     */ }

/* Location:           /home/pc-home/Bureau/HMS1.jar
 * Qualified Name:     HMSDesign.Space.DoctorSpaceController
 * JD-Core Version:    0.6.2
 */