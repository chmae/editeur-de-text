package fr.iut.editeur.document;

/**
 * Cette classe Document initialise les methodes generaux pour les autres classes
 */
public class Document {
    /**
     * C'est un texte de type String
     */
    private String texte;


    /**
     * Ce constructeur permet d'initialiser le texte
     * @initialise le texte
     */
    public Document() {
        this.texte = "";
    }

    /**
     * Cette méthode est un acceseur de texte pour le lire
     * @return le texte
     */
    public String getTexte() {
        return texte;
    }

    /**
     * Cette méthode permet de modifier le texte
     * @return rien
     */
    public void setTexte(String texte) {
        this.texte = texte;
    }

    /**
     * Cette méthode ajoute du texte
     * @param texte est le texte pour l'ajouter
     * @return rien
     */
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
    public void effacer(String texte) {
        if (texte != null && !texte.isEmpty()) {
            int startIndex = this.texte.indexOf(texte);
            if (startIndex != -1) {
                int endIndex = startIndex + texte.length();
                remplacer(startIndex, endIndex, "");
            }
        }

    }

            @Override
    public String toString() {
        return this.texte;
    }
}
