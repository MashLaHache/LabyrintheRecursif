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
        return true;
    }

    //1.Find deadends
        //a. if i != 1 then check with this index
        //b. if index is surrounded by 1 == deadends (change index to -1)
        //c. comeback to last index (move index by 1)

    //2.fill from deadends until any junction

    //3. whats left is solution

    /*

    110111
    110101
    100001
    111101

      check ton premier if en premier
      when index(0) found check if index(-1),index(+1) is another 0
      if no index(0) around == deadends
      traceback until junction found two 0.

     */



}
