package Homework5_Advanced.Homework5_Advanced;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MagazineDAOImpl implements MagazineDAO {
    private Connection connection;

    public MagazineDAOImpl(Connection connection) {
        if (connection != null) {
            this.connection = connection;
        } else {
            throw new IllegalArgumentException("Connection cannot be null");
        }
    }

    @Override
    public void saveMagazine(magazine magazine) {
        // Implementation for saving a magazine in the database
    }

    @Override
    public magazine getMagazineById(int id) {
    	try (PreparedStatement statement = connection.prepareStatement("SELECT * FROM magazine.magazine WHERE id = ?")) {
    	    statement.setInt(1, id);
    	    ResultSet resultSet = statement.executeQuery();

    	    if (resultSet.next()) {
    	        int magazineId = resultSet.getInt("id");
    	        String title = resultSet.getString("title");
    	        String description = resultSet.getString("descript");
    	        double price = resultSet.getDouble("price");

    	        return new magazine(magazineId, title, description, price);
    	    }
    	} catch (SQLException e) {
    	    e.printStackTrace();
    	}
		return null;
    }

    @Override
    public List<magazine> getAllMagazines() {
        // Implementation for retrieving all magazines from the database
        return null;
    }

    @Override
    public void updateMagazine(magazine magazine) {
        // Implementation for updating a magazine in the database
    }

    @Override
    public void deleteMagazine(int id) {
        // Implementation for deleting a magazine from the database
    }
}
