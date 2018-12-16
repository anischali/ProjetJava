/*    */ package hospitalmanagementsystem;
/*    */ 
/*    */ import javafx.beans.property.SimpleIntegerProperty;
/*    */ import javafx.beans.property.SimpleStringProperty;
/*    */ 
/*    */ public class Docteur
/*    */ {
/*    */   public final SimpleIntegerProperty id;
/*    */   public final SimpleStringProperty nom;
/*    */   public final SimpleStringProperty prenom;
/*    */   public final SimpleStringProperty sexe;
/*    */   public final SimpleStringProperty situation;
/*    */   public final SimpleStringProperty nss;
/*    */   public final SimpleStringProperty fonction;
/*    */   public final SimpleStringProperty adresse;
/*    */   public final SimpleStringProperty telephone;
/*    */   public final SimpleStringProperty email;
/*    */ 
/*    */   public Docteur(Integer id, String nom, String prenom, String sexe, String situation, String nss, String fonction, String adresse, String telephone, String email)
/*    */   {
/* 23 */     this.id = new SimpleIntegerProperty(id.intValue());
/* 24 */     this.nom = new SimpleStringProperty(nom);
/* 25 */     this.prenom = new SimpleStringProperty(prenom);
/* 26 */     this.sexe = new SimpleStringProperty(sexe);
/* 27 */     this.situation = new SimpleStringProperty(situation);
/* 28 */     this.nss = new SimpleStringProperty(nss);
/* 29 */     this.fonction = new SimpleStringProperty(fonction);
/* 30 */     this.adresse = new SimpleStringProperty(adresse);
/* 31 */     this.telephone = new SimpleStringProperty(telephone);
/* 32 */     this.email = new SimpleStringProperty(email);
/*    */   }
/*    */ 
/*    */   public int getId()
/*    */   {
/* 37 */     return this.id.get();
/*    */   }
/*    */ 
/*    */   public String getNom()
/*    */   {
/* 42 */     return this.nom.get();
/*    */   }
/*    */ 
/*    */   public String getPrenom()
/*    */   {
/* 47 */     return this.prenom.get();
/*    */   }
/*    */ 
/*    */   public String getSexe()
/*    */   {
/* 52 */     return this.sexe.get();
/*    */   }
/*    */ 
/*    */   public String getSituation()
/*    */   {
/* 57 */     return this.situation.get();
/*    */   }
/*    */ 
/*    */   public String getNss()
/*    */   {
/* 62 */     return this.nss.get();
/*    */   }
/*    */ 
/*    */   public String getFonction()
/*    */   {
/* 67 */     return this.fonction.get();
/*    */   }
/*    */ 
/*    */   public String getAdresse()
/*    */   {
/* 72 */     return this.adresse.get();
/*    */   }
/*    */ 
/*    */   public String getTelephone()
/*    */   {
/* 77 */     return this.telephone.get();
/*    */   }
/*    */ 
/*    */   public String getEmail()
/*    */   {
/* 82 */     return this.email.get();
/*    */   }
/*    */ }

/* Location:           /home/pc-home/Bureau/HMS1.jar
 * Qualified Name:     hospitalmanagementsystem.Docteur
 * JD-Core Version:    0.6.2
 */