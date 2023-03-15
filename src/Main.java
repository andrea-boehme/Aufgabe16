public class Main {

    public static void main(String[] args) {

        // Instanziierung des Arrays (Erzeugen eines Arrays)
        // neues Objekt "arr" der Klasse "ArrayClass" wird erstellt
        // bekommt als parameter die Länge des neuen Objektes "arr", da in constructor methode definiert
        GenericArrayWrapper<String> arr1 = new GenericArrayWrapper<>(10); // hier wird Typ definiert, z.B. String
        GenericArrayWrapper<Integer> arr2 = new GenericArrayWrapper<>(3);
        // Elemente werden hinzugefügt
        arr1.addToArray("Anna");
        arr1.addToArray("Berta");
        arr1.addToArray("Carlo");
        arr1.addToArray("Denis");
        arr1.addToArray("Eva");
        arr1.addToArray("Franz");
        arr1.addToArray("Georg");

        int arr1Size = arr1.getArraySize();
        int arr1Elements = arr1.getElementCount();
        int arr1Index = 3;
        String arr1IndexedElement = arr1.getElement(arr1Index);

        System.out.println();
        System.out.println("Array 1: " + arr1);
        System.out.println("Size of Array: " + arr1Size);
        System.out.println("Total number of elements in Array: " + arr1Elements);
        System.out.println("Element in position " + arr1Index + " : " + arr1IndexedElement);

        
        arr2.addToArray(5);
        arr2.addToArray(10);

        int arr2Size = arr2.getArraySize();
        int arr2Elements = arr2.getElementCount();
        int arr2Index = 1;
        Integer arr2IndexedElement = arr2.getElement(arr2Index);

        System.out.println();
        System.out.println("Array 2: " + arr2);
        System.out.println("Size of Array: " + arr2Size);
        System.out.println("Total number of elements in Array: " + arr2Elements);
        System.out.println("Element in position " + arr2Index + " : " + arr2IndexedElement);
    }
}

/*
- mit "new..." wird neues Objekt erstellt;
- statisch heißt dass man kein Objekt erstellt;
- statische Methoden/Variablen werden durch die direkte Annotation des Namens aufgerufen;
- nicht statische werden durch die Annotation "class.method" z.B. aufgerufen.
 */