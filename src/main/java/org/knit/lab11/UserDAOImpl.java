package org.knit.lab11;

import java.io.Console;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO{
    private Connection connection;

    public UserDAOImpl()throws SQLException{
        this.connection=DatabaseConnection.getConnection();
    }
    @Override
    public void create(User user) throws SQLException {
        String sql = "INSERT INTO users (name, email) VALUES (?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, user.getName());
            statement.setString(2, user.getEmail());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public User findById(int id) throws SQLException{
       String sql="SELECT name,email from users WHERE rowid=(?);";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            ResultSet results = statement.executeQuery();
            String name = results.getString("name");
            String email = results.getString("email");
            return new User(name,email);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }
    @Override
    public List<User> findAll() throws SQLException{
        String sql="SELECT rowid, name, email FROM users;";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet results = statement.executeQuery();
            List<User> users = new ArrayList<User>();
            while (results.next()) {
                String name = results.getString("name");
                String email = results.getString("email");
                long id = results.getLong(1);
                users.add(new User(id, name, email));
            }
            return users;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }
    @Override
    public void update(int id,User user) throws SQLException{
        String sql = "INSERT INTO users (name, email) VALUES (?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, user.getName());
            statement.setString(2, user.getEmail());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void delete(int id) throws SQLException{
        String sql = "DELETE FROM users WHERE rowid=(?);";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public boolean emailExists(String email) throws SQLException{
        String sql="SELECT * FROM users;";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet results = statement.executeQuery();
            List<User> users = new ArrayList<User>();
            int k=0;
            while (results.next()) {
                String emailcheck = results.getString("email");
                if(email.equals(emailcheck)){
                    k+=1;
                }
            }
            if (k>0){
                return true;
            }else {
                return false;
            }


        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}




//    @Override
//    void update(User user) throws SQLException;
//    @Override
//    void delete(int id) throws SQLException;
//    @Override
//    boolean emailExists(String email) throws SQLException;


