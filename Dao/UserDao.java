package Dao;

import Logica.User;
import java.sql.*;

public class UserDao {
    FachadaBD fachada;


    public UserDao(){
        fachada = new FachadaBD();
    }



    public int saveUser(User user){
        String save_sql;
        int numberRows=0;

        save_sql="INSERT INTO user VALUES('"+
                user.getIdentification()+"','"+user.getProjectId()+"','"+user.getPassword()+"','"+user.getNickName()+"','"
                +user.getUserName()+"','"+user.getType()+"','"+user.getState()+"','"+user.getEmail()+"');";

        try{
            Connection conn= fachada.getConnetion();
            Statement sentence = conn.createStatement();

            numberRows= sentence.executeUpdate(save_sql);
            System.out.println("up" + numberRows);
            return numberRows;

        }catch(SQLException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        return -1;
    }



    public User viewUser(String identification){
        User user= new User();
        String sql_select;
        sql_select="SELECT identification,project_id,password,nickname,name,type,state,email"+
                " FROM users WHERE identification='"+identification+"';";

        try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentence = conn.createStatement();
            ResultSet tabla = sentence.executeQuery(sql_select);

            while(tabla.next()){
                user.setIdentification(tabla.getString(1));

                user.setProjectId(tabla.getString(2));

                user.setPassword(tabla.getString(3));

                user.setNickName(tabla.getString(4));

                user.setUserName(tabla.getString(5));

                user.setType(tabla.getString(6));

                user.setState(tabla.getString(7));

                user.setEmail(tabla.getString(8));

                System.out.println("ok");
            }

            return user;
        }
        catch(SQLException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        return null;
    }



    public void updateUser(String identification, String project_id, String password, String nickname, String userName, String type, String State, String email){

        String sql_select;
        sql_select="UPDATE users SET identification ='" + identification +  "', project_id = '"+ project_id +"', password = '"+ password +
                "', nickname ='" + nickname +"', name = '" + userName + "', email = '"+ email +" WHERE  identification='"+ identification +"';";
        try{
            Connection conn= fachada.getConnetion();
            System.out.println("Update in the bd");
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_select);

        }
        catch(SQLException e){ System.out.println(e); }
        catch(Exception e){ System.out.println(e); }

    }


    public void deleteUser(String identification){

        String sql_select;
        sql_select="DELETE FROM users WHERE  identification='"+ identification +"';";
        try{
            Connection conn= fachada.getConnetion();
            System.out.println("Delete in the bd");
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_select);
        }
        catch(SQLException e){ System.out.println(e); }
        catch(Exception e){ System.out.println(e); }

    }
}
