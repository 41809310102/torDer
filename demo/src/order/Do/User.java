package order.Do;

public class User{
    private int id;
    private String name;
    private String sex;
    private int age;
    private String sfz;
    private String phone;
    private String password;

    public User(int id) {
        this.id = id;
    }

    public User(int id, String name, String sex, int age, String sfz, String phone, String password) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.sfz = sfz;
        this.phone = phone;
        this.password = password;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", sfz='" + sfz + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSfz() {
        return sfz;
    }

    public void setSfz(String sfz) {
        this.sfz = sfz;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
