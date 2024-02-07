package classes_and_objects;

 class CData {
    private  int id;
    private  String name;
    private  String phone;
    private  String address;
    private  String email;
    private  String gender;

    //ID SETTING
    public void setCid(int cid)
    {
        id=cid;
    }
    public int getId()
    {
        return id;
    }
    //name Setting
    public void setName(String cname) {
        name=cname;
    }
    public String getName()
    {
        return name;
    }
    //Phone setting
    public void setPhone(String cphone)
    {
        phone=cphone;
    }
    public String  getPhone() {
        return phone;
    }

    //Address setting
    public void setAddress(String cAddress)
    {
        address=cAddress;
    }
    public String  getAddress() {
        return address;
    }

    //Email setting
    public void setEmail(String cEmail)
    {
        email=cEmail;
    }
    public String  getEmail() {
        return email;
    }

    //Gender setting
    public void setGender(String cGender)
    {
        gender=cGender;
    }
    public String  getGender() {
        return gender;
    }
}
public class Customer {
    public static void main(String[] args) {
       CData c= new CData();
       c.setCid(1);
       System.out.println(c.getId());
       c.setName("Lavkush");
       System.out.println(c.getName());
       c.setPhone("9122036484");
       System.out.println(c.getPhone());
       c.setEmail("lavkushry@gmail.com");
       System.out.println(c.getEmail());
       c.setAddress("Patna");
       System.out.println(c.getAddress());
       c.setGender("M");
       System.out.println(c.getGender());
    }
}
