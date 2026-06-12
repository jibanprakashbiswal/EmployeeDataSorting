
public class EmpData implements Comparable<EmpData>{

    int EmpId;
    String EmpName;
    double EmpSalary;

    public EmpData(int EmpId, String EmpName, double Empsalary) {
        this.EmpId = EmpId;
        this.EmpName = EmpName;
        this.EmpSalary = Empsalary;
    }

    @Override
    public String toString() {
        return
                "Id=" + EmpId +
                ", Name=" + EmpName + " " +
                ", Salary=" + EmpSalary
                ;
    }

    @Override
    public int compareTo(EmpData o) {
        return EmpId-o.EmpId;
    }
}
