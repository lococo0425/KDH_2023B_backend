package day19;

public class Step4 {
    public static void printLength(String data){
        try {
            int result = data.length();             // .(도트) : 참조객체의 인스턴스 멤버 호출
            System.out.println("문자수 : " + result);
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }finally {
            System.out.println("마무리실행");
        }
    }

    public static void main(String[] args) {
        //1.[실행예외]NullPointerException
        printLength("ThisIsJAVA");
//        printLength(null); // null이면 참조가 없으므로 .(도트)불가능

        //2.[일반예외]ClassNotFoundException
        try {
            Class.forName("java.lang.String");
            Class.forName("java.lang.String2");
        }catch (Exception e){
            e.printStackTrace();
        }
        
        //3.NumberFormatException , 4.ArrayIndexOutOfBoundsException

        String[] array = {"100","1oo"};
        for(int i=0; i<= array.length; i++){
            try{
                int value = Integer.parseInt(array[i]);
                System.out.println("array[i] = " + value);
            }catch (NumberFormatException e){
                System.out.println("숫자로 변환 할 수 없음 = " + e.getMessage());
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("배열 인덱스 초과 = " + e.getMessage());
            }
        }
    }
    

}
