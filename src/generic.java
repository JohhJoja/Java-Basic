public class generic<T> {

    T item;

    public void setter(T item){
        this.item = item;
    }

    public T getter(){
        return this.item;
    }

}
