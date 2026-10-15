public class method {

    public void displaymssage() {
        System.out.println("this is an intance method.");
    }
    public void display01mssage() {
        System.out.println("this is an intance method.01");
    }

    public static void main(String[] args) {
       method obj = new method();
        obj.displaymssage();
        obj.display01mssage();
    }
}