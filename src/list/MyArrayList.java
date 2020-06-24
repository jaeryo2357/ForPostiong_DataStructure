package list;



//배열로 이루어진 ArrayList 따라서 값이 추가될 때마다 배열의 복사가 이루어 진다.

public class MyArrayList {
    private final int DEFAULT_ARRAY_SIZE = 100;
    private int array[];
    private int size;

    MyArrayList() {
        array = new int[DEFAULT_ARRAY_SIZE];
        size = 0;
    }

    MyArrayList(int size) {
        array = new int[size];
        this.size = 0;
    }

    /*
      ArrayList의 마지막에 값 추가
      @param data
     */
    public void add(int data) {
        if (size == array.length) { //배열의 고정된 크기를 늘려주는 작업
            updateSize();
        }

        array[size] = data;
        size++;
    }

    /*
      ArrayList index 위치에 값 추가
      @param data
     */
    public void add(int index, int data) {
        if (size == array.length) {
            updateSize();
        }
        copyAddArray(index);

        array[index] = data;
        size++;
    }

    public void remove() {
        if (size == 0) {
            throw new IndexOutOfBoundsException();
        }
        size--;
    }

    public void remove(int index) {

       if (size < index) {
         throw new IndexOutOfBoundsException();
       }
       copyRemoveArray(index);

       size--;
    }

    private void updateSize() {
        int[] newArray = new int[size + 1];

        for (int index = 0; index < size; index++) {
            newArray[index] = array[index];
        }

        array = newArray;
    }

    private void copyAddArray(int index) {
        for (int moveIndex = index; moveIndex < array.length - 1; moveIndex++) {
            array[moveIndex + 1] = array[moveIndex];
        }
    }

    private void copyRemoveArray(int index) {
        for (int moveIndex = index; moveIndex < array.length - 1; moveIndex++) {
            array[moveIndex] = array[moveIndex + 1];
        }
    }

    public int getSize() {
        return size;
    }
}
