import java.util.Arrays;

public class GenericArrayWrapper <T>{

    // T steht für Platzhalter.
    // Bei der Objekterstellung wird ein Objekt anstelle des Platzhalters eingefügt.
    // Wie eine Parameterübergabe innerhalb einer Methode jedoch auf Klassenebene.
    private T[] array;
    private Integer elementCount = 0;

    // constructor methode mit Angabe der Anzahl der Elemente (Größe des Arrays)
    // constructor method used to initialize objects. It is called when an object of a class is created.
    public GenericArrayWrapper(int size) {

        this.array = (T[]) new Object[size]; // beim Erstellen des Arrays soll die Größe angegeben werden
        this.elementCount = 0;
        // "T[] array = (T[]) new Object[size]" : Bei der Objekterstellung wird ein Objekt anstelle des Platzhalters eingefügt.
    }

    // add-Methode; Elemente hinzufügen
    public void addToArray(T newElement) {

        if (elementCount < array.length) {
            array[elementCount++] = newElement;
        } else {                                      // wenn Länge nicht ausreicht, soll Länge verdoppelt werden
            T[] newArray = (T[]) new Object[this.elementCount*2]; // neues Objekt erstellen anstelle des Platzhalters (T) mit doppelter Länge

            System.arraycopy(array, 0, newArray, 0, array.length);
            newArray[elementCount] = newElement;     // das neue Element in das neue Array hinzufügen
            elementCount++;
            this.array = newArray;                  // das erste Array mit den Daten des neuen Arrays überschreiben
        }
    }

    // get-Methode; liefert das Element an bestimmten Stelle (index: Stelle)
    public T getElement(int index) {

        if (index < this.array.length) {
            return this.array[index];
        }
        return null;
    }

    // getArraySize-Methode; Größe des Arrays zurückliefern
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

