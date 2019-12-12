public class Problem2<T>{
    /** 数组默认长度 */
    private static final int DEFAULT_SIZE = 10;
    /** 存储队列中的元素 */
    private Object[] elements = null;
    /** 数组大小指针 */
    private int capacity;
    /** 当前游标 */
    private int current;
    /** 构造方法 */
    public Problem2(){
        this(DEFAULT_SIZE);
    }
    private Problem2(int size){
        if(size < 0){
            throw new RuntimeException("数组大小不能小于0");
        }else{
            this.elements = new Object[size];
            this.current = 0;
            capacity = size;
        }
    }
    public boolean add(Object e) {
        confirmSize();
        this.elements[current] = e;
        this.current++;
        return false;
    }
    public T get(int index) {
        confirmIndex(index);
        return (T) this.elements[index];
    }
    public Object remove(int index) {
        confirmIndex(index);
        for (int i = index; i < elements.length; i++) {
            if(i + 1 < elements.length){
                elements[i] = elements[i+1];
            }
        }
        current--;
        return null;
    }
    public int size(){
        return this.current;
    }
    /**  确认当前数组的容量，如果满足，则不操作，如果不满足，则增加空间 */
    private void confirmSize(){
        if(this.current == this.capacity){
            this.capacity = this.capacity + DEFAULT_SIZE;
            Object[] newElements = new Object[this.capacity];

            System.arraycopy(this.elements, 0, newElements, 0, this.elements.length);

            this.elements = newElements;
        }
    }
    /**  判断下标是否越界 */
    private void confirmIndex(int index){
        if(index > capacity || index < 0){
            throw new RuntimeException("下标越界");
        }
    }

    public static  void main(String[] args){
        Problem2<String> list = new Problem2<String>();
        for(int i=0;i<20;i++){
            list.add("test"+i);
        }
        list.remove(5);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

}