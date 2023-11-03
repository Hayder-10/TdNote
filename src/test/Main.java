package test;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            
            Agence agence = new Agence("Agence de location Ariana ");

            
            Voiture voiture1 = new Voiture(1, "Bmw", 50);
            Voiture voiture2 = new Voiture(2, "Benz", 60);
            Voiture voiture3 = new Voiture(3, "Jaguar", 70);

            agence.ajoutVoiture(voiture1);
            agence.ajoutVoiture(voiture2);
            agence.ajoutVoiture(voiture3);

            
            Client client1 = new Client(1, "Hayder Mlik");
            Client client2 = new Client(2, "Leith Bendaya");
            
            agence.loueClientVoiture(client1, voiture1);
            agence.loueClientVoiture(client2, voiture2);
            
            agence.afficheLesClientsEtLeursListesVoitures();

            
            agence.retourClientVoiture(client1, voiture1);

            
            agence.afficheLesClientsEtLeursListesVoitures();

            
            agence.suppVoiture(voiture3);

            
            agence.afficheLesClientsEtLeursListesVoitures();

            
            CriterePrix criterePrix = new CriterePrix(65);
            List<Voiture> voituresSelonPrix = agence.selectVoitureSelonCritere(criterePrix);

            System.out.println("Voitures disponibles selon le critère de prix :");
            for (Voiture v : voituresSelonPrix) {
                System.out.println(v);
            }

            
            Map<Client, ListVoitures> clientsTriesParCode = agence.triCodeCroissant();

            System.out.println("Clients triés par code croissant :");
            for (Map.Entry<Client, ListVoitures> entry : clientsTriesParCode.entrySet()) {
                System.out.println(entry.getKey());
            }

            
            Map<Client, ListVoitures> clientsTriesParNom = agence.triNomCroissant();

            System.out.println("Clients triés par nom croissant :");
            for (Map.Entry<Client, ListVoitures> entry : clientsTriesParNom.entrySet()) {
                System.out.println(entry.getKey());
            }

        } catch (VoitureException e) {
            
        }
    }
}
