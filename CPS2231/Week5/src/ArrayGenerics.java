public class ArrayGenerics{

    public static <T> boolean contains(T[] array, T element){
        for( T item : array){
            if(item.equals(element)){
                return true;
            }
        }
        return false;
    }
    public static void main(String [] args){
        Integer[] intArray = {1,2,3,4,5};
        String[] stringArray = {"Alice", "Bob", "Charlie"};

        boolean containsNumbers = contains(intArray, 3);
        boolean containsStrings = contains(stringArray, "Bob");


        System.out.println("Contains number 3: "+containsNumbers);
        System.out.println("Contains name Bob? "+ containsStrings);


    }
}
