package package21;

public class Array<E> {
    private E[] array;

    public Array(E[] array) {
        this.array = array;
    }

    public E[] getArray() {
        return array;
    }

    public void setArray(E[] array) {
        this.array = array;
    }
    public E returnElem(int i){
        return array[i];
    }
}
