package 과제.과제1.과제6;

public class Member {
    public String id = "";
    public String pw = "";
    public String name="";
    public String num="";
    public int age=0;

    public Member(){}
    public Member(String id, String pw, String name, String num, int age) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.num = num;
        this.age = age;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
