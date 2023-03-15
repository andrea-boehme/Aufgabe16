import java.util.Arrays;

public class GenericArrayWrapper <T>{

    // T steht für Platzhalter.
    // Bei der Objekterstellung wird ein Objekt anstelle des Platzhalters eingefügt.
    // Wie eine Parameterübergabe innerhalb einer Methode jedoch auf Klassenebene.
    private T[] array;
    private Integer elementCount = 0;

    // constructor methode mit Angabe der Anzahl der Elemente (Länge des Arrays)
    // constructor method used to initialize objects. It is called when an object of a class is created.
    // bei List "size" statt "length"
    public GenericArrayWrapper(int size) {
        this.array = (T[]) new Object[size]; // beim Erstellen des Arrays soll die Länge angegeben werden
        this.elementCount = 0;
        // "int[] array = new int[length]" : Erstellen des Arrays
    }

    // add-Methode; Elemente hinzufügen
    public void addToArray(T newElement) {
        if (elementCount < array.length) {
            array[elementCount++] = newElement;
        } else {                                        // wenn Länge nicht ausreicht, soll Länge verdoppelt werden
            T[] newArray = (T[]) new Object[this.elementCount*2]; // neues Array erstellen mit doppelter Länge

            System.arraycopy(array, 0, newArray, 0, array.length);
            newArray[elementCount] = newElement;     // das neue Element in das neue Array hinzufügen
            elementCount++;
            this.array = newArray;                          // das erste Array mit den Daten des neuen Arrays überschreiben
        }

        // array = Arrays.copyOf(array, elementCount*2); macht copy von ersten Array in ein neues Array mit neue Länge
    }

    // get-Methode; liefert das Element an bestimmten Stelle (index: Stelle)
    public T getElement(int index) {

        if (index < this.array.length) {
            return this.array[index];
        }

        return null;
    }

    // getArraySize-Methode; Länge des Arrays zurückliefern
    public int getArraySize() {
        return this.array.length;
    }

    // getElementCount-Methode; Anzahl der Elemente zurückliefert
    public int getElementCount() {
        return elementCount;
    }

    @Override
    public String toString() {
        return "GenericArrayWrapper{" + Arrays.toString(array) +
                '}';
    }
}

