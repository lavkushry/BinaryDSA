package classes_and_objects;
 class RData
{
    private String name;
    private String address;
    private String phone;
    private float rating;

    //Setting Name
    public void setName(String cName)
    {
        name=cName;
    }
    public String getName()
    {
        return name;
    }
    //Setting Address
    public void setAddress(String cAddress)
    {
        address=cAddress;
    }
    public String getAddress()
    {
        return address;
    }
    //Setting Phone
    public void setPhone(String cPhone)
    {
        phone=cPhone;
    }
    public String getPhone()
    {
        return phone;
    }
    //Setting Rating
    public void setRating(float cRating)
    {
        rating=cRating;
    }
    public float getRating()
    {
        return rating;
    }
}
public class  Restraunant {
    public static void main(String[] args) {
      RData d=new RData();
      d.setName("Lavkush");
      System.out.println(d.getName());
      d.setAddress("Patna");
      System.out.println(d.getAddress());
      d.setPhone("9122036484");
      System.out.println(d.getPhone());
      d.setRating(7.9f);
      System.out.println(d.getRating());
    }
}
