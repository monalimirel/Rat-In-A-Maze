/* Monali Mirel Chuatico & Darren Jian
 * CIS 256
 * Term Project: Rat-in-a-Maze 
 * Stack.java
 * used to solve maze through DFS
 */
import LinkedList.SList;

public class Stack {
    SList list;
    public Stack() {
        this.list = new SList();
    }

    public Object pop(){
        Object last = list.getHead();
        list.removeFront();
        return last;
    }

    public void push(Object item){
        list.insertFront(item);
    }


    public boolean isEmpty() {
        return list.isEmpty();
    }
}
