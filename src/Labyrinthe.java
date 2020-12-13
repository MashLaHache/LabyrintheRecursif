import java.util.Arrays;

public class Labyrinthe{

    private static int row;
    private static int col;
    private static int debutRow = 0;
    private static int debutCol;
    private static int finRow = 19;
    private static int finCol;
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

    public static void trouverDebutLabyrinthe(int[][] grille) {
        //trouver le debut du labyrinthe. always start au top. premier row, trouver colonne
        for (int i = 0; i < grille[debutRow].length; i++) {
            if (grille[debutRow][i] == 0)
                debutCol = i;
        }
        //trouver la fin du labyrinthe. always end at last row. dernier row, trouver colonne
        for (int i = 0; i < grille[finRow].length; i++) {
            if (grille[finRow][i] == 0)
                finCol = i;
        }
        row = debutRow;
        col = debutCol;
    }

    //resout le labyrinthe
    public static boolean resoudre(int[][] grille) {

        //recursif
        //cas de base
        if (row == finRow && col == finCol)
            return true;
        //mark as visited
        grille[row][col] = visited;

        //directions N-S-E-O
        //check au dessus
        if (row != 0 && grille[row - 1][col] == 0){
            grille[row][col] = -1;
            row -= 1;

            if(resoudre(grille))
                return true;
            else {
                grille[row][col] = 2;
                row += 1;
            }
        }
        //check en bas
        if (row != grille.length && grille[row + 1][col] == 0){
            grille[row][col] = -1;
            row += 1;

            if(resoudre(grille))
                return true;
            else {
                grille[row][col] = 2;
                row -= 1;
            }
        }
        //check a droite
        if (col != grille[0].length && grille[row][col + 1] == 0){
            grille[row][col] = -1;
            col += 1;

            if(resoudre(grille))
                return true;
            else {
                grille[row][col] = 2;
                col -= 1;
            }
        }
        //check a gauche
        if (col != 0 && grille[row][col - 1] == 0){
            grille[row][col] = -1;
            col -= 1;

            if(resoudre(grille)) {
                grille[row][col] = -1;
                return true;
            }
            else {
                grille[row][col] = 2;
                col += 1;
            }
        }
        grille[row][col] = 2;
        return false;
    }
}
