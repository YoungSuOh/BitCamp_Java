package serialize_;

import java.io.*;

class Customer implements Serializable/*직렬화를 하겠다는 의도*/{
    int id;
    String name;
    String password;
    int age;

    public Customer(int id, String name, String password, int age) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", password=" + password + ", age=" + age
                +"]";
    }

}

/*public class SerializeMain {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "John", "Doe", 30);

        String fileName = "Customer.ser";

        try(FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(customer);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}*/
public class SerializeMain {
    public static void main(String[] args) {
        // 외부 파일명
        String fileName = "Customer.ser";

        // 파일 스트림 객체 생성 (try with resource)
        try(
                FileInputStream fis = new FileInputStream(fileName);
                ObjectInputStream in = new ObjectInputStream(fis)
        ) {
            // 바이트 스트림을 다시 자바 객체로 변환 (이때 캐스팅이 필요)
            Customer deserializedCustomer = (Customer) in.readObject();
            System.out.println(deserializedCustomer);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


