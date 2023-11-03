package test;

import java.util.Objects;

public class Voiture {
    private int immatriculation;
    private String marque;
    private float prixLocation;

    public Voiture(int immatriculation, String marque, float prixLocation) {
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.prixLocation = prixLocation;
    }

    public int getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(int immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public float getPrixLocation() {
        return prixLocation;
    }

    public void setPrixLocation(float prixLocation) {
        this.prixLocation = prixLocation;
    }



    

    

	@Override
	public int hashCode() {
		return Objects.hash(immatriculation, marque);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voiture other = (Voiture) obj;
		return immatriculation == other.immatriculation && Objects.equals(marque, other.marque);
	}

	@Override
    public String toString() {
        return "Voiture [immatriculation=" + immatriculation + ", marque=" + marque + ", prixLocation=" + prixLocation
                + "]";
    }
}
;