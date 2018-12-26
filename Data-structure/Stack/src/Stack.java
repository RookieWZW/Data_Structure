/**
 * Created by RookieWangZhiWei on 2018/10/10.
 */
public interface Stack<E> {

    int getSize();

    boolean isEmpty();

    void push(E e);

    E peek();

    E pop();
}
