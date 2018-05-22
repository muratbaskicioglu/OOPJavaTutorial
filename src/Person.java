import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Person implements Externalizable {
    private String userName;
    private String SSN;

    public Person() {}

    public Person(String userName) {
        this.userName = userName;
        SSN = this.userName.substring(0,2) + ((int) (Math.random() * 10000) + 1);
    }

    private String getId() {
        return SSN + "-" + userName;
    }

    public String getUserName() {
        return userName;
    }

    public boolean isSamePerson(Person p) {
        if(p.getId().equals(this.getId())) {
            return true;
        } else {
            return false;
        }
    }

    public void writeExternal(ObjectOutput o) {
        try {
            o.writeObject(this.userName);
        } catch(Exception e) {
            System.out.println("Writing error!");
        }
    }

    public void readExternal(ObjectInput o) {
        try {
            this.userName = (String) o.readObject();
        } catch(Exception e) {
            System.out.println("Reading error!");
        }
    }
}
