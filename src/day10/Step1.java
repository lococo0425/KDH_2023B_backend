package day10;

public class Step1 {
    public static void main(String[] args) {
        캐릭터 user1 = new 캐릭터("자바맨");
        System.out.println("user1.닉네임 = " + user1.닉네임);
        System.out.println("user1.toString() = " + user1.toString());
        
        캐릭터 user2 = new 캐릭터("클래스맨");
        System.out.println("user2.닉네임 = " + user2.닉네임);
            
        user1.직업 = "마법사";
        System.out.println("user2.toString() = " + user2.toString());
        user2.직업 = "전사";
        System.out.println("user2.toString() = " + user2.toString());
        
        user1.공격();
        System.out.println("user1.toString() = " + user1.toString());
        user2.공격();
        System.out.println("user2.toString() = " + user2.toString());
    }
}
