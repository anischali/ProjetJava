/*     */ package hospitalmanagementsystem;
/*     */ 
/*     */ import java.sql.Connection;
/*     */ import java.sql.DriverManager;
/*     */ import java.sql.PreparedStatement;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.SQLException;
/*     */ import java.sql.Statement;
/*     */ 
/*     */ public class HospitalDB
/*     */ {
/*     */   private static Connection conn;
/*  18 */   private static boolean donneePresente = false;
/*     */ 
/*     */   public void executeQry(String query) throws SQLException, ClassNotFoundException {
/*  21 */     if (conn == null) {
/*  22 */       seConnecter();
/*     */     }
/*     */ 
/*  25 */     Statement etat = conn.createStatement();
/*  26 */     etat.execute(query);
/*     */   }
/*     */ 
/*     */   public ResultSet getResult(String query) throws SQLException, ClassNotFoundException {
/*  30 */     if (conn == null) {
/*  31 */       seConnecter();
/*     */     }
/*     */ 
/*  34 */     Statement etat = conn.createStatement();
/*  35 */     ResultSet res = etat.executeQuery(query);
/*  36 */     return res;
/*     */   }
/*     */ 
/*     */   public void seConnecter() throws ClassNotFoundException, SQLException
/*     */   {
/*  41 */     Class.forName("org.sqlite.JDBC");
/*  42 */     conn = DriverManager.getConnection("jdbc:sqlite:Hospital.db");
/*     */   }
/*     */ 
/*     */   public void initialiser()
/*     */     throws SQLException, ClassNotFoundException
/*     */   {
/*  48 */     if (conn == null) {
/*  49 */       seConnecter();
/*     */     }
/*  51 */     if (!donneePresente) {
/*  52 */       donneePresente = true;
/*     */ 
/*  54 */       Statement creer = conn.createStatement();
/*  55 */       creer.execute("CREATE TABLE doctors (id integer,nom varchar(60),prenom varchar(60),sexe varchar(10),situation varchar(60),nss varchar(14),fonction varchar(60),adresse varchar(60),tel varchar(60),email varchar(60),password varchar(20),PRIMARY KEY(id));");
/*     */ 
/*  69 */       creer.execute("CREATE TABLE assistant (id integer,nom varchar(60),prenom varchar(60),sexe varchar(10), situation varchar(60),nss varchar(14),fonction varchar(60),adresse varchar(60),tel varchar(60),email varchar(60),password varchar(20),PRIMARY KEY(id));");
/*     */ 
/*  82 */       creer.execute("CREATE TABLE patient (id integer,nom varchar(60),prenom varchar(60),sexe varchar(10),situation varchar(60),nss varchar(14),date varchar(60),adresse varchar(60),tel varchar(60),email varchar(60),PRIMARY KEY(id));");
/*     */ 
/*  94 */       creer.execute("CREATE TABLE rdv (id integer,IDP varchar(60),IDD varchar(60),Date varchar(60),PRIMARY KEY(id));");
/*     */ 
/* 100 */       creer.execute("CREATE TABLE admin (id integer,name varchar(60),login varchar(60),password varchar(20),PRIMARY KEY(id));");
/*     */ 
/* 107 */       PreparedStatement pAdmin = conn.prepareStatement("INSERT INTO admin values(?,?,?,?)");
/*     */ 
/* 109 */       pAdmin.setString(2, "admin");
/* 110 */       pAdmin.setString(3, "admin");
/* 111 */       pAdmin.setString(4, "Password");
/*     */     }
/*     */   }
/*     */ 
/*     */   public void ajouterUnDoc(String nm, String pr, String sx, String sit, String nss, String fonc, String adr, String tel, String email) throws ClassNotFoundException, SQLException
/*     */   {
/* 117 */     seConnecter();
/*     */ 
/* 119 */     PreparedStatement prep = conn.prepareStatement("INSERT INTO doctors values(?,?,?,?,?,?,?,?,?,?,?);");
/* 120 */     prep.setString(2, nm);
/* 121 */     prep.setString(3, pr);
/* 122 */     prep.setString(4, sx);
/* 123 */     prep.setString(5, sit);
/* 124 */     prep.setString(6, nss);
/* 125 */     prep.setString(7, fonc);
/* 126 */     prep.setString(8, adr);
/* 127 */     prep.setString(9, tel);
/* 128 */     prep.setString(10, email);
/* 129 */     prep.setString(11, "password");
/* 130 */     prep.execute();
/*     */   }
/*     */ 
/*     */   public void ajouterUnAssist(String nm, String pr, String sx, String sit, String nss, String fonc, String adr, String tel, String email) throws ClassNotFoundException, SQLException {
/* 134 */     seConnecter();
/*     */ 
/* 136 */     PreparedStatement prep = conn.prepareStatement("INSERT INTO doctors values(?,?,?,?,?,?,?,?,?,?,?);");
/* 137 */     prep.setString(2, nm);
/* 138 */     prep.setString(3, pr);
/* 139 */     prep.setString(4, sx);
/* 140 */     prep.setString(5, sit);
/* 141 */     prep.setString(6, nss);
/* 142 */     prep.setString(7, fonc);
/* 143 */     prep.setString(8, adr);
/* 144 */     prep.setString(9, tel);
/* 145 */     prep.setString(10, email);
/* 146 */     prep.setString(11, "password");
/* 147 */     prep.execute();
/*     */   }
/*     */ 
/*     */   public void ajouterUnPat(String nm, String pr, String sx, String sit, String nss, String date, String adr, String tel, String email) throws ClassNotFoundException, SQLException {
/* 151 */     seConnecter();
/*     */ 
/* 153 */     PreparedStatement prep = conn.prepareStatement("INSERT INTO doctors values(?,?,?,?,?,?,?,?,?,?);");
/* 154 */     prep.setString(2, nm);
/* 155 */     prep.setString(3, pr);
/* 156 */     prep.setString(4, sx);
/* 157 */     prep.setString(5, sit);
/* 158 */     prep.setString(6, nss);
/* 159 */     prep.setString(7, date);
/* 160 */     prep.setString(8, adr);
/* 161 */     prep.setString(9, tel);
/* 162 */     prep.setString(10, email);
/*     */ 
/* 164 */     prep.execute();
/*     */   }
/*     */ 
/*     */   public void ajouterUnRDV(String IDP, String IDD, String date) throws ClassNotFoundException, SQLException {
/* 168 */     seConnecter();
/*     */ 
/* 170 */     PreparedStatement prep = conn.prepareStatement("INSERT INTO doctors values(?,?,?,?);");
/* 171 */     prep.setString(2, IDP);
/* 172 */     prep.setString(3, IDD);
/* 173 */     prep.setString(4, date);
/* 174 */     prep.execute();
/*     */   }
/*     */ }

/* Location:           /home/pc-home/Bureau/HMS1.jar
 * Qualified Name:     hospitalmanagementsystem.HospitalDB
 * JD-Core Version:    0.6.2
 */