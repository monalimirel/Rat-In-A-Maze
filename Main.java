/* Monali Mirel Chuatico & Darren Jian
 * CIS 256
 * Term Project: Rat-in-a-Maze
 * Generate a random two-dimensional square maze whose size is specified by the user
 * Read in a maze from a given text file
 * Solve maze using BFS & DFS 
 * Main.java
 */

import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws InterruptedException {
    	
    	//Prompt user if want to read in a maze from a given text file or generate a new maze
    	 System.out.println("What would you like to do? \n1 - Open a maze file \n2 - Create a new maze");
         Scanner action = new Scanner(System.in);
         int act = action.nextInt();
         
         Maze maze = null;

         
         //Open a maze file
         if (act == 1) {
             String fname = getFileName();
             maze = new Maze(fname);
             
         }

         //Create a new maze
         else if (act == 2) {
             System.out.println("Enter size of maze:");
             Scanner size = new Scanner(System.in);
             int s = size.nextInt();
             maze = new Maze(s * s);
         }
         maze.printMaze();
         solveMaze(maze);
     }
    
    
    
    /**
     * Prints the solution to the maze using BFS and DFS
     * @param maze
     */
    private static void solveMaze(Maze maze) {
    	maze.solve();
    }


    /**
     * Retrieves file
     * @return maze.txt
     */
    private static String getFileName() {
        return "maze.txt";
    }


}