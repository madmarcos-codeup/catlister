package dao;

import com.mysql.cj.jdbc.Driver;
import model.Cat;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CatsDao {
    private Connection connection = null;

    public CatsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    public List<Cat> all() {
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement("SELECT * FROM cats");
            ResultSet rs = stmt.executeQuery();
            return createFromResultSet(rs);
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving the products.", e);
        }
    }

    private List<Cat> createFromResultSet(ResultSet rs) throws SQLException {
        List<Cat> cats = new ArrayList<>();
        while (rs.next()) {
            Cat cat = extract(rs);
            System.out.println("I made a cat! " + cat);
            cats.add(cat);
        }
        return cats;
    }

    private Cat extract(ResultSet rs) throws SQLException {
        return new Cat(
                rs.getLong("id"),
                rs.getString("cat_name"),
                rs.getInt("age")
        );
    }

    public Cat fetchCat(long catId) {
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement("SELECT * FROM cats where id = ?");
            stmt.setLong(1, catId);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            return extract(rs);
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving the products.", e);
        }

    }
}
