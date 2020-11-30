public class Labyrinthe{

    //affiche le labyrinthe sur 20 lignes et 40 colonnes
    public static void afficher(int[][] grid){
        for (int i=0;i<10;i++){
            System.out.print("\u2588\u2588");
            System.out.print("  ");
        }
        System.out.println();
        System.out.println("Cette methode doit afficher le labyrinthe");
        for (int i=0;i<10;i++){
            System.out.print("\u2588\u2588");
            System.out.print("  ");
        }
        System.out.println();
    }

    //resout le labyrinthe
    public static boolean resoudre(int[][] grille){
        return true;
    }
}
