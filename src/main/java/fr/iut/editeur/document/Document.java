package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }
    public void majuscules(int start, int end) {
        if (start >= 0 && start <= end && end <= texte.length()) {
            String portion = texte.substring(start, end);
            String portionMajuscules = portion.toUpperCase();
            remplacer(start, end, portionMajuscules);
        }
    }

    public void clear() {
        texte = "";
    }
    public void introduireBug() {
        texte += "X";
    }


    @Override
    public String toString() {
        return this.texte;
    }
}
