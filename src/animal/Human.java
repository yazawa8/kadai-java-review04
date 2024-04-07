package animal;

public class Human extends Animal implements Thinkable {
    private String hobby; //カプセル化を行う

    // コンストラクタの定義
    public Human(String name, int age, String hobby) {
        super(name, age); // 親クラス(animal)のコンストラクタを呼び出す
        this.hobby = hobby; // インスタンス変数hobbyに引数の値を代入する
    }

    @Override
    public void think() {
        System.out.println("私は" + hobby + "について考えています。");
    }
}
