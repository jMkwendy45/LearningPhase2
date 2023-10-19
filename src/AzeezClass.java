public class AzeezClass {
    private String firstName;
    private String lastName;
    private String fullName =firstName+""+lastName;
    private int age;
    private String email;

    public  AzeezClass(String firstName,String lastName,int age,String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    public  void setAge(int Age){
    }

    public  int getAge(){
        return age;
    }
     public  void  setFirstName(String firstName){
     }
     public String getFirstName(){
        return firstName;
     }

    public static void main(String[] args) {
        AzeezClass azeezClass = new AzeezClass("oooo","oooo",90,"ook@gmail.com");
//        System.out.println(azeezClass.);
    }


}
