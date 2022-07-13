package DAO;


import Models.*;

public interface SalarieDAO {
	//DEBUT des 4 méthodes CRUD
		void create(int id, String nom, String prenom, String code_restaurant);
		void read(int id);
		void update(int id);
		void delete(int id);
	//FIN
		int nbrHomonymes(String nom, String prenom);
		int id(String nom, String prenom);
		boolean travailleIci(Salarie sal, Restaurant res);
}
