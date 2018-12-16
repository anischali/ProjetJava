/*     */ package HMSDesign.Space;
/*     */ 
/*     */ import HMSDesign.Home.HomeController;
/*     */ import hospitalmanagementsystem.HospitalDB;
/*     */ import hospitalmanagementsystem.Main;
/*     */ import java.io.IOException;
/*     */ import java.io.PrintStream;
/*     */ import java.net.URL;
/*     */ import java.sql.SQLException;
/*     */ import java.util.ResourceBundle;
/*     */ import javafx.fxml.FXML;
/*     */ import javafx.fxml.FXMLLoader;
/*     */ import javafx.fxml.Initializable;
/*     */ import javafx.scene.control.TextField;
/*     */ import javafx.scene.image.ImageView;
/*     */ import javafx.scene.input.MouseEvent;
/*     */ import javafx.scene.layout.AnchorPane;
/*     */ 
/*     */ public class AdminSpaceController
/*     */   implements Initializable
/*     */ {
/*     */ 
/*     */   @FXML
/*     */   private AnchorPane adminHome;
/*     */ 
/*     */   @FXML
/*     */   private ImageView adminDoctors;
/*     */ 
/*     */   @FXML
/*     */   private AnchorPane AdminMedcinPanel;
/*     */ 
/*     */   @FXML
/*     */   private ImageView adminNurse;
/*     */ 
/*     */   @FXML
/*     */   private AnchorPane AdminNursePanel;
/*     */ 
/*     */   @FXML
/*     */   private ImageView adminReceipt;
/*     */ 
/*     */   @FXML
/*     */   private AnchorPane AdminRecepPanel;
/*     */ 
/*     */   @FXML
/*     */   private ImageView adminPatient;
/*     */ 
/*     */   @FXML
/*     */   private AnchorPane AdminPatientPanel;
/*     */ 
/*     */   @FXML
/*     */   private ImageView adminRdv;
/*     */ 
/*     */   @FXML
/*     */   private AnchorPane AdminRDVPanel;
/*     */ 
/*     */   @FXML
/*     */   private ImageView adminSetting;
/*     */ 
/*     */   @FXML
/*     */   private AnchorPane adminSettingPanel;
/*     */ 
/*     */   @FXML
/*     */   private TextField MnomAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField MprenomAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField MsexeAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField MnssAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField MspecAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField MadrAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField McpAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField MvilleAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField MpaysAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField Mtel1Add;
/*     */ 
/*     */   @FXML
/*     */   private TextField Mtel2Add;
/*     */ 
/*     */   @FXML
/*     */   private TextField MemailAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField MsituationAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField MnomDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField MprenomDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField MsexeDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField MnssDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField MspecDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField MadrDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField McpDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField MvilleDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField MpaysDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField Mtel1Del;
/*     */ 
/*     */   @FXML
/*     */   private TextField Mtel2Del;
/*     */ 
/*     */   @FXML
/*     */   private TextField MemailDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField MsituationDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField MnomEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField MprenomEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField MsexeEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField MnssEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField MspecEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField MadrEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField McpEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField MvilleEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField MpaysEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField Mtel1Edt;
/*     */ 
/*     */   @FXML
/*     */   private TextField Mtel2Edt;
/*     */ 
/*     */   @FXML
/*     */   private TextField MemailEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField MsituationEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField MnomSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField MprenomSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField MsexeSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField MnssSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField MspecSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField MadrSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField McpSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField MvilleSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField MpaysSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField Mtel1Srch;
/*     */ 
/*     */   @FXML
/*     */   private TextField Mtel2Srch;
/*     */ 
/*     */   @FXML
/*     */   private TextField MemailSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField MsituationSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField AssnomAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField AssprenomAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField AsssexeAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField AssnssAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField AssspecAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField AssadrAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField AsscpAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField AssvilleAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField AsspaysAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField Asstel1Add;
/*     */ 
/*     */   @FXML
/*     */   private TextField Asstel2Add;
/*     */ 
/*     */   @FXML
/*     */   private TextField AssemailAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField AsssituationAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField AssnomDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField AssprenomDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField AsssexeDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField AssnssDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField AssspecDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField AssadrDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField AsscpDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField AssvilleDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField AsspaysDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField Asstel1Del;
/*     */ 
/*     */   @FXML
/*     */   private TextField Asstel2Del;
/*     */ 
/*     */   @FXML
/*     */   private TextField AssemailDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField AsssituationDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField AssnomEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField AssprenomEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField AsssexeEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField AssnssEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField AssspecEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField AssadrEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField AsscpEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField AssvilleEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField AsspaysEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField Asstel1Edt;
/*     */ 
/*     */   @FXML
/*     */   private TextField Asstel2Edt;
/*     */ 
/*     */   @FXML
/*     */   private TextField AssemailEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField AsssituationEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField AssnomSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField AssprenomSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField AsssexeSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField AssnssSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField AssspecSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField AssadrSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField AsscpSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField AssvilleSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField AsspaysSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField Asstel1Srch;
/*     */ 
/*     */   @FXML
/*     */   private TextField Asstel2Srch;
/*     */ 
/*     */   @FXML
/*     */   private TextField AssemailSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField AsssituationSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrsnomAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrsprenomAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrssexeAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrsnssAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrsspecAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrsadrAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrscpAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrsvilleAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrspaysAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField Nrstel1Add;
/*     */ 
/*     */   @FXML
/*     */   private TextField Nrstel2Add;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrsemailAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrssituationAdd;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrsnomDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrsprenomDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrssexeDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrsnssDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrsspecDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrsadrDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrscpDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrsvilleDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrspaysDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField Nrstel1Del;
/*     */ 
/*     */   @FXML
/*     */   private TextField Nrstel2Del;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrsemailDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrssituationDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrsnomEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrsprenomEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrssexeEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrsnssEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrsspecEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrsadrEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrscpEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrsvilleEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrspaysEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField Nrstel1Edt;
/*     */ 
/*     */   @FXML
/*     */   private TextField Nrstel2Edt;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrsemailEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrssituationEdt;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrsnomSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrsprenomSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrssexeSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrsnssSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrsspecSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrsadrSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrscpSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrsvilleSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrspaysSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField Nrstel1Srch;
/*     */ 
/*     */   @FXML
/*     */   private TextField Nrstel2Srch;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrsemailSrch;
/*     */ 
/*     */   @FXML
/*     */   private TextField NrssituationSrch;
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
/*     */   private TextField PnomDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField PprenomDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField PsexeDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField PnssDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField PspecDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField PadrDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField PcpDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField PvilleDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField PpaysDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField Ptel1Del;
/*     */ 
/*     */   @FXML
/*     */   private TextField PdateDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField PemailDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField PsituationDel;
/*     */ 
/*     */   @FXML
/*     */   private TextField Pdate2Del;
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
/*     */   private void logOut()
/*     */     throws IOException, ClassNotFoundException
/*     */   {
/* 276 */     Main.home = (AnchorPane)FXMLLoader.load(Main.class.getResource("/HMSDesign/Home/Home.fxml"));
/* 277 */     Main.mainShow(Main.home);
/*     */   }
/* 280 */   @FXML
/*     */   private void goBack() { this.AdminMedcinPanel.setVisible(false);
/* 281 */     this.AdminNursePanel.setVisible(false);
/* 282 */     this.AdminRecepPanel.setVisible(false);
/* 283 */     this.AdminPatientPanel.setVisible(false);
/* 284 */     this.AdminRDVPanel.setVisible(false);
/* 285 */     this.adminSettingPanel.setVisible(false);
/*     */ 
/* 287 */     this.adminHome.setVisible(true); }
/*     */ 
/*     */   @FXML
/*     */   private void homeAdminOnClick(MouseEvent event) {
/* 291 */     if (event.getTarget() == this.adminDoctors) {
/* 292 */       this.adminHome.setVisible(false);
/* 293 */       this.AdminMedcinPanel.setVisible(true);
/*     */     }
/* 295 */     else if (event.getTarget() == this.adminNurse) {
/* 296 */       this.adminHome.setVisible(false);
/* 297 */       this.AdminNursePanel.setVisible(true);
/*     */     }
/* 299 */     else if (event.getTarget() == this.adminReceipt) {
/* 300 */       this.adminHome.setVisible(false);
/* 301 */       this.AdminRecepPanel.setVisible(true);
/*     */     }
/* 303 */     else if (event.getTarget() == this.adminPatient) {
/* 304 */       this.adminHome.setVisible(false);
/* 305 */       this.AdminPatientPanel.setVisible(true);
/*     */     }
/* 307 */     else if (event.getTarget() == this.adminRdv) {
/* 308 */       this.adminHome.setVisible(false);
/* 309 */       this.AdminRDVPanel.setVisible(true);
/*     */     }
/* 311 */     else if (event.getTarget() == this.adminSetting) {
/* 312 */       this.adminHome.setVisible(false);
/* 313 */       this.adminSettingPanel.setVisible(true);
/*     */     }
/*     */   }
/*     */ 
/*     */   @FXML
/*     */   private void addDocToDB() throws ClassNotFoundException, SQLException
/*     */   {
/* 320 */     String n = this.MnomAdd.getText().isEmpty() ? "?" : this.MnomAdd.getText();
/* 321 */     String p = this.MprenomAdd.getText().isEmpty() ? "?" : this.MprenomAdd.getText();
/* 322 */     String sx = this.MsexeAdd.getText().isEmpty() ? "?" : this.MsexeAdd.getText();
/* 323 */     String st = this.MsituationAdd.getText().isEmpty() ? "?" : this.MsituationAdd.getText();
/* 324 */     String ns = this.MnssAdd.getText().isEmpty() ? "?" : this.MnssAdd.getText();
/* 325 */     String sp = this.MspecAdd.getText().isEmpty() ? "?" : this.MspecAdd.getText();
/* 326 */     String adr = this.MadrAdd.getText().isEmpty() ? "?" : this.MadrAdd.getText();
/* 327 */     String cp = this.McpAdd.getText().isEmpty() ? "?" : this.McpAdd.getText();
/* 328 */     String v = this.MvilleAdd.getText().isEmpty() ? "?" : this.MvilleAdd.getText();
/* 329 */     String ps = this.MpaysAdd.getText().isEmpty() ? "?" : this.MpaysAdd.getText();
/* 330 */     String t1 = this.Mtel1Add.getText().isEmpty() ? "?" : this.Mtel1Add.getText();
/* 331 */     String t2 = this.Mtel2Add.getText().isEmpty() ? "?" : this.Mtel2Add.getText();
/* 332 */     String em = this.MemailAdd.getText().isEmpty() ? "?" : this.MemailAdd.getText();
/*     */ 
/* 334 */     String Adresse = adr + " " + cp + " " + v + " " + ps;
/* 335 */     String Tel = t1 + t2;
/* 336 */     if (Adresse.contains("?")) {
/* 337 */       Adresse.replaceAll("?", "");
/* 338 */       Adresse.replace("'", " ");
/*     */     }
/* 340 */     if (Tel.contains("?")) {
/* 341 */       Tel.replace("?", "");
/* 342 */       Tel.replace("'", " ");
/*     */     }
/* 344 */     if (Tel.isEmpty()) {
/* 345 */       Tel = Tel + "?";
/*     */     }
/* 347 */     if (Adresse.isEmpty()) {
/* 348 */       Adresse = Adresse + "?";
/*     */     }
/* 350 */     if (em.equals("?")) {
/* 351 */       return;
/*     */     }
/* 353 */     String query = "INSERT INTO ASSISTANT VALUES (?,'" + n + "','" + p + "','" + sx + "','" + st + "','" + ns + "','" + sp + "','" + Adresse + "','" + Tel + "','" + em + "',?);";
/* 354 */     System.out.println(query);
/* 355 */     HomeController.DataBase.executeQry(query);
/*     */   }
/*     */ 
/*     */   @FXML
/*     */   private void addNurseToDB()
/*     */     throws ClassNotFoundException, SQLException
/*     */   {
/* 362 */     String n = this.NrsnomAdd.getText().isEmpty() ? "?" : this.NrsnomAdd.getText();
/* 363 */     String p = this.NrsprenomAdd.getText().isEmpty() ? "?" : this.NrsprenomAdd.getText();
/* 364 */     String sx = this.NrssexeAdd.getText().isEmpty() ? "?" : this.NrssexeAdd.getText();
/* 365 */     String st = this.NrssituationAdd.getText().isEmpty() ? "?" : this.NrssituationAdd.getText();
/* 366 */     String ns = this.NrsnssAdd.getText().isEmpty() ? "?" : this.NrsnssAdd.getText();
/* 367 */     String sp = this.NrsspecAdd.getText().isEmpty() ? "?" : this.NrsspecAdd.getText();
/* 368 */     String adr = this.NrsadrAdd.getText().isEmpty() ? "?" : this.NrsadrAdd.getText();
/* 369 */     String cp = this.NrscpAdd.getText().isEmpty() ? "?" : this.NrscpAdd.getText();
/* 370 */     String v = this.NrsvilleAdd.getText().isEmpty() ? "?" : this.NrsvilleAdd.getText();
/* 371 */     String ps = this.NrspaysAdd.getText().isEmpty() ? "?" : this.NrspaysAdd.getText();
/* 372 */     String t1 = this.Nrstel1Add.getText().isEmpty() ? "?" : this.Nrstel1Add.getText();
/* 373 */     String t2 = this.Nrstel2Add.getText().isEmpty() ? "?" : this.Nrstel2Add.getText();
/* 374 */     String em = this.NrsemailAdd.getText().isEmpty() ? "?" : this.NrsemailAdd.getText();
/*     */ 
/* 376 */     String Adresse = adr + " " + cp + " " + v + " " + ps;
/* 377 */     String Tel = t1 + t2;
/* 378 */     if (Adresse.contains("?")) {
/* 379 */       Adresse.replaceAll("?", "");
/* 380 */       Adresse.replace("'", " ");
/*     */     }
/* 382 */     if (Tel.contains("?")) {
/* 383 */       Tel.replace("?", "");
/* 384 */       Tel.replace("'", " ");
/*     */     }
/* 386 */     if (Tel.isEmpty()) {
/* 387 */       Tel = Tel + "?";
/*     */     }
/* 389 */     if (Adresse.isEmpty()) {
/* 390 */       Adresse = Adresse + "?";
/*     */     }
/* 392 */     if (em.equals("?")) {
/* 393 */       return;
/*     */     }
/* 395 */     String query = "INSERT INTO ASSISTANT VALUES (?,'" + n + "','" + p + "','" + sx + "','" + st + "','" + ns + "','" + sp + "','" + Adresse + "','" + Tel + "','" + em + "',?);";
/* 396 */     System.out.println(query);
/* 397 */     HomeController.DataBase.executeQry(query);
/*     */   }
/*     */ 
/*     */   @FXML
/*     */   private void addAssistantToDB()
/*     */     throws ClassNotFoundException, SQLException
/*     */   {
/* 406 */     String n = this.AssnomAdd.getText().isEmpty() ? "?" : this.AssnomAdd.getText();
/* 407 */     String p = this.AssprenomAdd.getText().isEmpty() ? "?" : this.AssprenomAdd.getText();
/* 408 */     String sx = this.AsssexeAdd.getText().isEmpty() ? "?" : this.AsssexeAdd.getText();
/* 409 */     String st = this.AsssituationAdd.getText().isEmpty() ? "?" : this.AsssituationAdd.getText();
/* 410 */     String ns = this.AssnssAdd.getText().isEmpty() ? "?" : this.AssnssAdd.getText();
/* 411 */     String sp = this.AssspecAdd.getText().isEmpty() ? "?" : this.AssspecAdd.getText();
/* 412 */     String adr = this.AssadrAdd.getText().isEmpty() ? "?" : this.AssadrAdd.getText();
/* 413 */     String cp = this.AsscpAdd.getText().isEmpty() ? "?" : this.AsscpAdd.getText();
/* 414 */     String v = this.AssvilleAdd.getText().isEmpty() ? "?" : this.AssvilleAdd.getText();
/* 415 */     String ps = this.AsspaysAdd.getText().isEmpty() ? "?" : this.AsspaysAdd.getText();
/* 416 */     String t1 = this.Asstel1Add.getText().isEmpty() ? "?" : this.Asstel1Add.getText();
/* 417 */     String t2 = this.Asstel2Add.getText().isEmpty() ? "?" : this.Asstel2Add.getText();
/* 418 */     String em = this.AssemailAdd.getText().isEmpty() ? "?" : this.AssemailAdd.getText();
/*     */ 
/* 420 */     String Adresse = adr + " " + cp + " " + v + " " + ps;
/* 421 */     String Tel = t1 + t2;
/* 422 */     if (Adresse.contains("?")) {
/* 423 */       Adresse.replaceAll("?", "");
/* 424 */       Adresse.replace("'", " ");
/*     */     }
/* 426 */     if (Tel.contains("?")) {
/* 427 */       Tel.replace("?", "");
/* 428 */       Tel.replace("'", " ");
/*     */     }
/* 430 */     if (Tel.isEmpty())
/*     */     {
/* 432 */       Tel = Tel + "?";
/*     */     }
/* 434 */     if (Adresse.isEmpty()) {
/* 435 */       Adresse = Adresse + "?";
/*     */     }
/* 437 */     if (em.equals("?")) {
/* 438 */       return;
/*     */     }
/* 440 */     String query = "INSERT INTO ASSISTANT VALUES (?,'" + n + "','" + p + "','" + sx + "','" + st + "','" + ns + "','" + sp + "','" + Adresse + "','" + Tel + "','" + em + "',?);";
/* 441 */     System.out.println(query);
/* 442 */     HomeController.DataBase.executeQry(query);
/*     */   }
/*     */ 
/*     */   @FXML
/*     */   private void addPatientToDB() throws ClassNotFoundException, SQLException {
/* 447 */     String n = this.PnomAdd.getText().isEmpty() ? "?" : this.PnomAdd.getText();
/* 448 */     String p = this.PprenomAdd.getText().isEmpty() ? "?" : this.PprenomAdd.getText();
/* 449 */     String sx = this.PsexeAdd.getText().isEmpty() ? "?" : this.PsexeAdd.getText();
/* 450 */     String st = this.PsituationAdd.getText().isEmpty() ? "?" : this.PsituationAdd.getText();
/* 451 */     String ns = this.PnssAdd.getText().isEmpty() ? "?" : this.PnssAdd.getText();
/* 452 */     String d1 = this.PdateAdd.getText().isEmpty() ? "?" : this.PdateAdd.getText();
/* 453 */     String adr = this.PadrAdd.getText().isEmpty() ? "?" : this.PadrAdd.getText();
/* 454 */     String cp = this.PcpAdd.getText().isEmpty() ? "?" : this.PcpAdd.getText();
/* 455 */     String v = this.PvilleAdd.getText().isEmpty() ? "?" : this.PvilleAdd.getText();
/* 456 */     String ps = this.PpaysAdd.getText().isEmpty() ? "?" : this.PpaysAdd.getText();
/* 457 */     String t1 = this.Ptel1Add.getText().isEmpty() ? "?" : this.Ptel1Add.getText();
/* 458 */     String d2 = this.Pdate2Add.getText().isEmpty() ? "?" : this.Pdate2Add.getText();
/* 459 */     String em = this.PemailAdd.getText().isEmpty() ? "?" : this.PemailAdd.getText();
/*     */ 
/* 461 */     String Adresse = adr + " " + cp + " " + v + " " + ps;
/* 462 */     String Tel = t1;
/* 463 */     String Date = "e:" + d1 + "s:" + d2;
/* 464 */     if (Adresse.contains("?")) {
/* 465 */       Adresse.replaceAll("?", "");
/* 466 */       Adresse.replace("'", " ");
/*     */     }
/* 468 */     if (Date.contains("?")) {
/* 469 */       Date.replaceAll("?", "");
/* 470 */       Date.replace("'", " ");
/*     */     }
/* 472 */     if (Tel.contains("?")) {
/* 473 */       Tel.replace("?", "");
/* 474 */       Tel.replace("'", " ");
/*     */     }
/* 476 */     if (Tel.isEmpty())
/*     */     {
/* 478 */       Tel = Tel + "?";
/*     */     }
/* 480 */     if (Adresse.isEmpty()) {
/* 481 */       Adresse = Adresse + "?";
/*     */     }
/* 483 */     if (em.equals("?")) {
/* 484 */       return;
/*     */     }
/* 486 */     String query = "INSERT INTO PATIENT VALUES (?,'" + n + "','" + p + "','" + sx + "','" + st + "','" + ns + "','" + Date + "','" + Adresse + "','" + Tel + "','" + em + "');";
/* 487 */     System.out.println(query);
/* 488 */     HomeController.DataBase.executeQry(query);
/*     */   }
/*     */ 
/*     */   public void initialize(URL arg0, ResourceBundle arg1)
/*     */   {
/*     */     try
/*     */     {
/* 505 */       HomeController.DataBase.seConnecter();
/*     */     }
/*     */     catch (ClassNotFoundException|SQLException e) {
/* 508 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */ }

/* Location:           /home/pc-home/Bureau/HMS1.jar
 * Qualified Name:     HMSDesign.Space.AdminSpaceController
 * JD-Core Version:    0.6.2
 */