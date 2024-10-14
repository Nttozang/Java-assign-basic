package generic.basic;

public class PrintWriter<T> {
    public void print(T data){
        System.out.println(data);
    }
    public String concat(T data){
        System.out.println("Concat : " + data);
        return "";
    }

}
