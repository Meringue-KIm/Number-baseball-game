package Js_Project;

public class Nbg_output {
    int Ball = 0;
    int Strike = 0;

    public void 낫싱print() {
        if (Strike == 0 && Ball == 0) {
            System.out.println("낫싱");
        } else {
            스트라이크print();
        }
    }

    public void 스트라이크print() {
        if (Strike > 0 && Ball == 0) {
            System.out.println(Strike + " 스트라이크");
        } else {
            볼print();
        }
    }

    public void 볼print() {
        if (Strike > 0 && Ball > 0) {
            System.out.println(Strike + " 스트라이크" + " " + Ball + "볼");
        } else {
            System.out.println(Ball + "볼");
        }
    }
}
