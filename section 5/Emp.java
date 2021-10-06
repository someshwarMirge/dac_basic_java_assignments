public class Emp {
     //instance variables
     private int  empID;
     private String name;
     private String dept;
     private double salary;
     private String address;
    

     public Emp(int id,String name_local ,  String department,Double salary_local , String address_local){
        this.empID=id;
        this.name=name_local;
        this.dept=department;
        this.salary=salary_local;
        this.address=address_local;
        System.out.println("Object Instantiated with given data.");

     }
     public void show_data(){
         System.out.println(this.empID +"  "+this.name+"  "+this.dept+"   "+this.salary +"   "+this.address);
     }

}
