class Noeud {
    int valeur;
    Noeud gauche;
    Noeud droit;
    boolean estRouge;

    public Noeud(int valeur) {
        this.valeur = valeur;
        this.gauche = null;
        this.droit = null;
        this.estRouge = true;
    }
}

class ArbreRougeNoir {
    private Noeud racine;

    public ArbreRougeNoir() {
        this.racine = null;
    }

    private Noeud inserer(Noeud noeud, int valeur) {
        if (noeud == null) {
            return new Noeud(valeur);
        }

        if (valeur < noeud.valeur) {
            noeud.gauche = inserer(noeud.gauche, valeur);
        } else if (valeur > noeud.valeur) {
            noeud.droit = inserer(noeud.droit, valeur);
        } else {
            // Valeur déjà présente dans l'arbre, ne rien faire
            return noeud;
        }

        // À implémenter : Rééquilibrage de l'arbre rouge-noir

        return noeud;
    }

    public void inserer(int valeur) {
        this.racine = inserer(this.racine, valeur);
    }

    private Noeud supprimer(Noeud noeud, int valeur) {
        if (noeud == null) {
            return null;
        }

        if (valeur < noeud.valeur) {
            noeud.gauche = supprimer(noeud.gauche, valeur);
        } else if (valeur > noeud.valeur) {
            noeud.droit = supprimer(noeud.droit, valeur);
        } else {
            // Noeud trouvé, effectuer la suppression
            // À implémenter
        }

        // À implémenter : Rééquilibrage de l'arbre rouge-noir

        return noeud;
    }

    public void supprimer(int valeur) {
        this.racine = supprimer(this.racine, valeur);
    }

    private boolean rechercher(Noeud noeud, int valeur) {
        if (noeud == null) {
            return false;
        }

        if (valeur < noeud.valeur) {
            return rechercher(noeud.gauche, valeur);
        } else if (valeur > noeud.valeur) {
            return rechercher(noeud.droit, valeur);
        } else {
            return true;
        }
    }

    public boolean rechercher(int valeur) {
        return rechercher(this.racine, valeur);
    }
}
