package org.knit.lab11;
import java.util.List;
import java.sql.Connection;
import java.sql.SQLException;
public interface UserDAO {
    void create(User user) throws SQLException;
    User findById(int id) throws SQLException;
    List<User> findAll() throws SQLException;
    void update(int id, User user) throws SQLException;
    void delete(int id) throws SQLException;
    boolean emailExists(String email) throws SQLException;
}
