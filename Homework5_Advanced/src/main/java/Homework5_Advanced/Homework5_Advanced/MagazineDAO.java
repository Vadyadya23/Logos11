package Homework5_Advanced.Homework5_Advanced;

import java.sql.SQLException;
import java.util.List;

public interface MagazineDAO {
	void saveMagazine(magazine magazine);
    magazine getMagazineById(int id);
    List<magazine> getAllMagazines();
    void updateMagazine(magazine magazine);
    void deleteMagazine(int id);
}
