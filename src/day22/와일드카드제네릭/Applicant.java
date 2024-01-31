package day22.와일드카드제네릭;

public class Applicant<T> { //필드 내 T 값 정의
    public T kind;

    public Applicant(T kind){
        this.kind = kind;
    }
}
