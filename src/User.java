public class User {
    public static int count = 0;
    public String fullname;
    public int age;

    public User(String fullname, int age) {
        this.fullname = fullname;
        this.age = age;
        // count++;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getCount() {
        return count;
    }
}
