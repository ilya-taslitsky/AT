import java.lang.reflect.Field;

public class Ref
{
    int x,y,z;

    public Ref(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static <T> Object get(T object, String fieldName) {
        Field field = null;
        try {
            field = object.getClass().getDeclaredField(fieldName);
        } catch (NoSuchFieldException e) {
            System.out.println(e.getMessage());
        }
        field.setAccessible(true);
        try {
            Object value = field.get(object);
            return value;
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
    public static <T,J> void put(T object, String fieldName, J value)
    {
        Field field = null;
        try {
            field = object.getClass().getDeclaredField(fieldName);
        } catch (NoSuchFieldException e) {
            System.out.println(e.getMessage());
        }
        field.setAccessible(true);
        try {
            field.set(object,value);
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }

    public static <T> void clear(T object, String fieldName)
    {
        Field field = null;
        try {
            field = object.getClass().getDeclaredField(fieldName);
        } catch (NoSuchFieldException e) {
            System.out.println(e.getMessage());
        }
        field.setAccessible(true);
        try {
            field.set(object,0);
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Ref object = new Ref(510,2,3);
        System.out.println(get(object, "x"));
        put(object, "x", 100);
        System.out.println(object.x);
        clear(object, "x");
        System.out.println(object.x);

    }
}
