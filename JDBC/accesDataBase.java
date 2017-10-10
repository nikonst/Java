/**
 * Created by Nikos on 7/15/2017.
 */

import java.sql.*;
public class accesDataBase {

        static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  // JDBC driver name
        static final String DB_URL = "jdbc:mysql://localhost/adatabase"; //Database URL
        //  Credentials
        static final String USER = "root";
        static final String PASS = "12345";

        public static void main(String[] args) {
            Connection conn = null;
            Statement stmt = null;
            try{
                //Register JDBC driver
                Class.forName("com.mysql.jdbc.Driver");
                //Open connection
                System.out.println("Connecting to database...");
                conn = DriverManager.getConnection(DB_URL,USER,PASS);
                //Execute a query
                System.out.println("Creating statement...");
                stmt = conn.createStatement();
                String sql;
                sql = "SELECT book.idbook, book.title, book.price, author.sirname FROM book INNER JOIN author " +
                        "ON book.author=author.idauthor ORDER BY sirname;";
                ResultSet rs = stmt.executeQuery(sql);

                String format = "%-15s%-35s%-15s%-15s\n";
                System.out.printf(format,"ID","Title","Price","Author");
                System.out.printf(format,"--","-----","-----","------");
                //Extract data from result set
                while(rs.next()){
                    //Retrieve rows
                    int id  = rs.getInt("book.idbook");
                    String title= rs.getString("book.title");
                    String price = rs.getString("book.price");
                    String sirname = rs.getString("author.sirname");
                    //Display values
                    System.out.printf(format,id,title,price,sirname);
                }
                //Clean-up
                rs.close();
                stmt.close();
                conn.close();
            }
            catch(SQLException se){
                //JDBC Error
                se.printStackTrace();
            }
            catch(Exception e){
                //Class.forName Error
                e.printStackTrace();
            }
            finally{
                //Close resources
                try{
                    if(stmt!=null)
                        stmt.close();
                }
                catch(SQLException se2){
                }
                try{
                    if(conn!=null)
                        conn.close();
                }
                catch(SQLException se){
                    se.printStackTrace();
                }//Finally
            }//Try
            System.out.println("Done!");
        }// Main
    }

