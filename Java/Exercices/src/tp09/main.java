package tp09;

public class main {
	public static void main(String[] args) {
		Voiture voiture = new Voiture();
		Bateau bateau = new Bateau();

		String detailVoiture = voiture.GetNom();
		String detailBateau = bateau.GetNom();

		if (voiture.peutVoler()) detailVoiture = " peut voler";
		if (voiture.peutRouler()) detailVoiture += " peut rouler";
		if (voiture.peutNaviguer()) detailVoiture += " peut naviguer";

		if (bateau.peutVoler()) detailBateau += " peut voler";
		if (bateau.peutRouler()) detailBateau += " peut rouler";
		if (bateau.peutNaviguer()) detailBateau += " peut naviguer";

		System.out.println(detailVoiture);
		System.out.println(detailBateau);

	}
}
