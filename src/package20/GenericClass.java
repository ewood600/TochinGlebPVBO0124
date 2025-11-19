package package20;

class GenericClass<T extends Comparable<T>, V extends Animal, K> {
    private final T T;
    private final V V;
    private final K K;

    public GenericClass(T t, V v, K k) {
        T = t;
        V = v;
        K = k;
    }

    public T getFirst() {
        return T;
    }

    public V getSecond() {
        return V;
    }

    public K getThird() {
        return K;
    }

    public void printClassNames() {
        System.out.println("T class: " + T.getClass().getSimpleName());
        System.out.println("V class: " + V.getClass().getSimpleName());
        System.out.println("K class: " + K.getClass().getSimpleName());
    }
}