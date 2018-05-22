import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String [] args) {
        Person p = new Person("Capensis");
        try {
            FileOutputStream fos = new FileOutputStream("/home/capensis/Desktop/Udacity Courses/Object Oriented Programming in Java/OOPJavaTutorial/test.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p);
            oos.close();
        } catch(Exception e) {
            e.printStackTrace();
        }

        Person getP;
        try {
            FileInputStream fis = new FileInputStream("/home/capensis/Desktop/Udacity Courses/Object Oriented Programming in Java/OOPJavaTutorial/test.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            getP = (Person) ois.readObject();
            System.out.println(getP.getUserName());
            ois.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
