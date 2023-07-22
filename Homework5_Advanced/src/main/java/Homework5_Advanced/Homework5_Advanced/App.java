package Homework5_Advanced.Homework5_Advanced;

import java.sql.SQLException;
import java.util.List;
import java.sql.Connection;
import Homework5_Advanced.Homework5_Advanced.ConnectionUtils;

public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        Connection connection = ConnectionUtils.openConnection();
        if (connection != null) {
            System.out.println("Connection established successfully.");
            
            MagazineDAO magazineDAO = new MagazineDAOImpl(connection);
            System.out.println("MagazineDAO object instantiated successfully.");
            
            // Example usage of the DAO methods
            magazine magazine1 = magazineDAO.getMagazineById(1);
            if (magazine1 != null) {
                System.out.println(magazine1);
            } else {
                System.out.println("Magazine not found.");
            }

            List<magazine> magazines = magazineDAO.getAllMagazines();
            for (magazine mag : magazines) {
                System.out.println(mag);
            }

            // Insert a new magazine
            magazine newMagazine = new magazine(5, "Harry Potter and Secret Room", "Harry Potter and Secret Room", 231.22);
            magazineDAO.saveMagazine(newMagazine);

            // Update a magazine
            magazine magazineToUpdate = magazineDAO.getMagazineById(2);
            magazineToUpdate.setTitle("Updated Title");
            magazineDAO.updateMagazine(magazineToUpdate);

            // Delete a magazine
            magazine magazineToDelete = magazineDAO.getMagazineById(3);
            magazineDAO.deleteMagazine(magazineToDelete.getId());
        } else {
            System.out.println("Failed to establish a connection to the database.");
        }
    }
}
