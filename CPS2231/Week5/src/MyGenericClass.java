 public class MyGenericClass <T> {
     private T data;

     public MyGenericClass(T data) {
         this.data = data;
     }

     public <U> void genericMethod(U value) {
         //perform some operation on data
         System.out.println("Data "+  data);
         System.out.println("Value "+ value);
     }

//     public static <E> void staticGenericMethod(E e) {
//         //perform some operation
//         System.out.println(e);
//     }

     public T getData(){
         return data;
     }


// public class TestGeneric<T> {

        public static void main(String[] args) {

            MyGenericClass<String> stringObject = new MyGenericClass<>("Hello");
            stringObject.genericMethod("world");

            MyGenericClass<Integer> integerObject = new MyGenericClass<>(42);
            integerObject.genericMethod(10.50);

//            MyGenericClass.staticGenericMethod("String method");
//            MyGenericClass.staticGenericMethod(123);

        }
}
