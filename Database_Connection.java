import java.sql.DriverManager;
import java.sql.*;
public class Loginframe extends javax.swing.JFrame {
Connection c=null;
Statement stmt=null;
    /**
     * Creates new form Loginframe()
     */
    public Loginframe() {
        initComponents();
        try{
            Class.forName("org.sqlite.JDBC");
            c=DriverManager.getConnection("jdbc:sqlite:D:\\249046-1\\sqlite\\studenttable.db [ on Default schema]");
            if(c!=null){
                System.out.println("database connected .......... Sucessfully");
                stmt=c.createStatement();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
 private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
String uid,pass;
        uid=jTextField1.getText().trim();
        pass=String.valueOf(jPasswordField1.getPassword());
        try{
            String sql= "select * from login where username='"+uid+"' and password='"+pass+"'";
            rs=stmt.executeQuery(sql);
            if(rs.next()){
                System.out.println("Login id available "+uid+" password is "+pass);
                jLabel4.setText("Welcome");
                Home home= new Home();
               home.setVisible(true);
               setVisible(false);
            }
