package xr.com;
class employee{
    public int id=12;
    private String name="ujval";
    employee(){
        System.out.println("Employee name is "+name);
        System.out.println("Employee id is "+id);
    }
}
public class abc {
    public static void main(String[] args) {
        employee em= new employee();
    }
}
