/* Monali Mirel Chuatico & Darren Jian
 * CIS 256
 * Term Project: Rat-in-a-Maze
 * Queue.java
 * used to solve maze through BFS
 */

import LinkedList.SList;

public class Queue {
    SList list;

    public Queue() {
        this.list = new SList();
    }

    public void add(Object a){
        list.insertEnd(a);
    }

    public Object remove(){
        Object last = list.getHead();
        list.removeFront();
        return last;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
