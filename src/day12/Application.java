package day12;
//RUN

import day12.view.MainView;

public class Application {
    public static void main(String[] args) {
        //다른 클래스의 메소드를 호출 하는 방법
        //1. 해당 메소드가 인스턴스 메소드 인경우
        //new MainView().run();

        //2. 해당 메소드가 인스턴스 메소드 인 경우
        //MainView mainView = new MainView();
        //MainView.run();

        //4. 싱글톤 패턴으로 만들기
        MainView.getInstance().run();

        //3. 해당 메소드가 정적(static)메소드인 경우
        //MainView.run();

    }
}
