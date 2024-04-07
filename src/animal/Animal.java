package animal;

public class Animal {
    private String name; //カプセル化を行う
    private int age; //カプセル化を行う

    // コンストラクタの定義
    public Animal(String name, int age) {
        this.name = name; //インスタンス変数nameに引数の値を代入する
        this.age = age; //インスタンス変数ageに引数の値を代入する
    }

    public void say() {
        System.out.println(name + "です。" + age + "歳です。");
    }
}
