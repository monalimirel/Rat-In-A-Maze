/* Monali Mirel Chuatico & Darren Jian
 * CIS 256
 * Term Project: Rat-in-a-Maze
 * SearchPath.java
 */

public class SearchPath {
    public SearchPath parent = null;
    private Object item;

    public SearchPath(Object item) {
        this.item = item;
    }

    public  void add (Object item){
        parent = new SearchPath(item);
    }

    public Object item(){
        return item;
    }
}
