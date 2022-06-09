public class Constructor {
    public static void main(String[] args) {
        
        System.out.println("This is an Example of Constructor in java : ");

/*
        Employee1 newemp = new Employee1("Ramesh", 1);

        System.out.println(newemp.name+" "+ newemp.id);
 
 */
      //METHOD OVERLOADING 
      
      Employee1 emp1 = new Employee1("Raju",3,12000);

      System.out.println(emp1.name+" has id "+emp1.id+ " And Salary : "+emp1.salary);

    }

}


class Employee1{

    String name;
    int id;
    int salary;
    
    public Employee1(String n, int id1)
    {
        name = n;
        id = id1;
    }
    public Employee1(String n1, int id1, int salary1){
        name = n1;
        id =id1;
        salary = salary1;
    }
}