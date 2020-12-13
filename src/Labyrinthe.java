
public class Labyrinthe{

    private static int debutRow = 0;
    private static int debutCol = 1;
    private static int finRow = 19;
    private static int finCol = 18;
    private static int visited = 2;


    //affiche le labyrinthe sur 20 lignes et 40 colonnes
    public static void afficher(int[][] grid){

        for (int i=0;i< grid.length;i++){
            System.out.println();
            for (int j = 0; j< grid[i].length; j++)
                //0 == chemin vide
                if (grid[i][j] == 0 || grid[i][j] == 2 )
                    //decider de mettre des carre vide pour une meilleure representation
                    System.out.print("\u2b1c\t");
                //1 == wall
                else if (grid[i][j] == 1)
                    System.out.print("\u2588\u2588\t");
                //-1 == chemin montrant la solution existante, represente par des points
                else if (grid[i][j] == -1)
                    System.out.print("\u00b7\u00b7\t");
        }
        System.out.println();
    }

    //resout le labyrinthe
    public static boolean resoudre(int[][] grille) {

        //recursif
        //cas de base
        if (debutRow == finRow && debutCol == finCol)
            return true;
        //mark as visited
        grille[debutRow][debutCol] = visited;

        //directions N-S-E-O
        //check au dessus
        if (debutRow != 0 && grille[debutRow - 1][debutCol] == 0){
            grille[debutRow][debutCol] = -1;
            debutRow -= 1;

            if(resoudre(grille))
                return true;
            else {
                grille[debutRow][debutCol] = 2;
                debutRow += 1;
            }
        }
        //check en bas
        if (debutRow != grille.length && grille[debutRow + 1][debutCol] == 0){
            grille[debutRow][debutCol] = -1;
            debutRow += 1;

            if(resoudre(grille))
                return true;
            else {
                grille[debutRow][debutCol] = 2;
                debutRow -= 1;
            }
        }
        //check a droite
        if (debutCol != grille[0].length && grille[debutRow][debutCol + 1] == 0){
            grille[debutRow][debutCol] = -1;
            debutCol += 1;

            if(resoudre(grille))
                return true;
            else {
                grille[debutRow][debutCol] = 2;
                debutCol -= 1;
            }
        }
        //check a gauche
        if (debutCol != 0 && grille[debutRow][debutCol - 1] == 0){
            grille[debutRow][debutCol] = -1;
            debutCol -= 1;

            if(resoudre(grille)) {
                grille[debutRow][debutCol] = -1;
                return true;
            }
            else {
                grille[debutRow][debutCol] = 2;
                debutCol += 1;
            }
        }
        grille[debutRow][debutCol] = 2;
        return false;
    }
}
