import java.util.Comparator;

public class Person
{
    public int power;
    public int dexterity;
    public int intelligence;

    public Person(int power, int dexterity, int intelligence)
    {
        this.power = power;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    public static class compareByPower implements Comparator<Person>
    {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.power - o2.power;
        }
    }

    public static class compareByDexterity implements Comparator<Person>
    {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.dexterity - o2.dexterity;
        }
    }

    public static class compareByIntelligence implements Comparator<Person>
    {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.intelligence - o2.intelligence;
        }
    }

    public static <T> T max(T[] array, Comparator<T> comparator) {
        if (array.length == 0)
            throw new IllegalArgumentException("empty array");

        int maxIndex=0;
        for (int i=1; i<array.length; i++)
            if (comparator.compare(array[maxIndex], array[i]) < 0)
                maxIndex = i;
        return array[maxIndex];
    }

    public static <T> T min(T[] array, Comparator<T> comparator) {
        if (array.length == 0)
            throw new IllegalArgumentException("empty array");

        int maxIndex=0;
        for (int i=1; i<array.length; i++)
            if (comparator.compare(array[maxIndex], array[i]) > 0)
                maxIndex = i;
        return array[maxIndex];
    }

    public static void bubbleSort(double arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
    public static <T> T[] sort(T[] array, Comparator<T> comparator) {
        if (array.length == 0)
            throw new IllegalArgumentException("empty array");

        for (int i = 0; i < array.length-1; i++)
            for (int j = 0; j < array.length-i-1; j++)
                if (comparator.compare(array[j], array[j+1]) > 0)
                {
                    T temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
        return array;
    }

    public static void main(String[] args) {
        Person[] Persons = {new Person(7,50, 40), new Person(9,200, 13), new Person(3,100, 32)};

        System.out.println(min(Persons, new compareByPower()).power);

        Person[] sortedPersons = sort(Persons, new compareByPower());
        for(Person person: sortedPersons)
        {
            System.out.print(person.power + " ");
        }
    }

}

