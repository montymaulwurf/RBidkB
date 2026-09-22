import java.util.function.Function;

public abstract class Sortierer {
    public static <T, C extends Comparable> T[] sort(T[] data, Function<T, C> getComparableItem) {
        return quickSort(data, 0, data.length - 1, getComparableItem);
    }
    
    private static <T> void swap(T[] data, int x, int y) {
        T tmp = data[x];
        data[x] = data[y];
        data[y] = tmp;
    }
    
    private static <T, C extends Comparable> T[] quickSort(T[] data, int l, int r, Function<T, C> getComparableItem) {
        if (l < r) {
            T pivot = data[l];
            // index of smallest element higher than pivot
            int j = l + 1;
            for (int i = l + 1; i <= r; i++) {
                if (getComparableItem.apply(data[i]).compareTo(getComparableItem.apply(pivot)) < 0) {
                    swap(data, i, j);
                    j++;
                }
            }
            swap(data, l, j - 1);
                        
            quickSort(data, l, j - 2, getComparableItem);
            quickSort(data, j, r, getComparableItem);
        }
        return data;
    }
}