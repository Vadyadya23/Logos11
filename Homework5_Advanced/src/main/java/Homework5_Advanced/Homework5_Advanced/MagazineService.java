package Homework5_Advanced.Homework5_Advanced;

import java.util.List;

public interface MagazineService {
	void saveMagazine(magazine magazine);
    magazine getMagazineById(int id);
    List<magazine> getAllMagazines();
    void updateMagazine(magazine magazine);
    void deleteMagazine(int id);
}
