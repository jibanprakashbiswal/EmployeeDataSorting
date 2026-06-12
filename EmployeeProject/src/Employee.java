import java.util.ArrayList;
import java.util.Collections;


public class Employee extends Thread {

    @Override
    public void run() {
    ArrayList emp = new ArrayList();
      emp.add(new EmpData(103,"Sanajay",10000.50));
      emp.add(new EmpData(105,"Ajaya",20000.30));
      emp.add(new EmpData(101,"Ramesh",16000.80));
      emp.add(new EmpData(102,"Kartik",35000.70));

      //  System.out.println(emp);
    Collections.sort(emp);
        System.out.println(emp);

    }
    public static void main(String[] args) {

        Thread t1=new Thread(new Employee());
        t1.start();
        System.out.println("Project end");       
    }
}
