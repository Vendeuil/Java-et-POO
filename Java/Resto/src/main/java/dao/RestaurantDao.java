package DAO;

public interface RestaurantDAO {
//DEBUT des 4 méthodes CRUD
	void create(String code, String nom, String adresse);
	void read(String code);//Via la pk
	void update(String code);//Via la pk
	void delete(String code);//Via la pk
// FIN
	boolean existeCeCode(String code);
	boolean existeCeNom(String nom);
}
