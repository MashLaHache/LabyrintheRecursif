import java.util.Arrays;

public class Labyrinthe{

    //affiche le labyrinthe sur 20 lignes et 40 colonnes
    public static void afficher(int[][] grid){



        for (int i=0;i< grid.length;i++){
            System.out.println();
            for (int j = 0; j< grid[i].length; j++)
                if (grid[i][j] == 0)
                    //decider de mettre des carre vide pour une meilleure representation
                    System.out.print("\u2b1c\t");
                else if (grid[i][j] == 1)
                    System.out.print("\u2588\u2588\t");
        }
        System.out.println();
    }

    //resout le labyrinthe
    public static boolean resoudre(int[][] grille){





        /*

        //marking of coordinates
        visited
        deadend
        exit


        find the start coordinate from the first line
        find the exit coordinate from the last line

        if no exit
            return unsolvable cause of no exit

        recursif

        //cas de base
        if current location == exit
            return current location //found the exit
            change affichage des cases visited

        //autres cas

        check down first
        check right
        check left
        check up

        if never went
            mark current coordinate as visited
            go to next coordinates

        if wall or deadend
            mark current coordinate as deadend
            go back to last visited

         */







        int x=0;
        int y=0;

        int left = grille[x-1][y];


        boolean trouve;
        int deadend = -1;
        boolean isValid = y >= 0 || y < grille.length || x >= 0 || x < grille[y].length; ;

        if (y < 0 || y >= grille.length || x < 0 || x >= grille.length)



        for (x=0;x< grille.length;x++){

            for (y = 0; y< grille[x].length; y++)
                if (grille[x][y] == 0){
                    //TODO check if deadend, if so change value for deadend.
                    if (grille[x][y] != left){

                    }
                }
        }

        return true;
    }
}
