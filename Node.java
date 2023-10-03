public class Node <T> {

    public T data;
    public Node<T> next;
    public Node<T> prev;


    public Node(T data){

        this.data = data;
        this.next = null;  //in add metode mit wert versetzen / getter setter
        this.prev = null;
    }

}
