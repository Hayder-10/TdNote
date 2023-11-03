package test;

import java.util.Objects;

public class Client { 
	private int code; 
	private String nom;
private String prenom;
public Client(int code, String
nom) {
this.code=code;
this.nom=nom;
}
public int getCode() {
return code;
}
public void setCode(int code) {
this.code = code;
}
public String getNom() {
return nom;
}
public void setNom(String nom) {
this.nom = nom;
}
public String getPrenom() {
return prenom;
}
public void setPrenom(String
prenom) {
this.prenom = prenom;
}
@Override
public String toString() {
	return "Client [code=" + code + ", nom=" + nom + ", prenom=" + prenom + "]";
}
@Override
public int hashCode() {
	return Objects.hash(code);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Client other = (Client) obj;
	return code == other.code;
}




}