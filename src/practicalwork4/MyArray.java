package practicalwork4;


public class MyArray implements Collectable {
    private Object[] content;
    public static final int ARRAY_SIZE = 5;

    MyArray() {
        content = new Object[5];
    }

    @Override
    public void add(Object element) {
        int i = 0;
        System.out.println(content.length);
        for (Object object:content) {
            System.out.println("content object: " + object);
            if (object == null) {
                content[i] = element;
                System.out.println("new element added to: " + i + " position");
                break;
            }
            i++;
            System.out.println("i: " + i);
            if (i == content.length - 1) {
                Object[] last_content = content;
                content = new Object[content.length + ARRAY_SIZE];
                int j = 0;
                for (j = 0; j < last_content.length; j++) {
                    content[j] = last_content[j];
                }
            }
        }
    }

    @Override
    public void index() {
        for (Object object:content) {
            if (object != null) {
                System.out.println(object);
            }
        }
    }

    @Override
    public Object get(int position) {
        return null;
    }

    @Override
    public void delete(int position) {

    }

    @Override
    public void delete() {

    }
}
