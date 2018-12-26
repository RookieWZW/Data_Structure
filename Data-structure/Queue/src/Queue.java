/**
 * Created by RookieWangZhiWei on 2018/10/10.
 */
public interface Queue<E> {
    int getSize();

    boolean isEmpty();

    void enqueue(E e);

    E dequeue();

    E getFront();

}
