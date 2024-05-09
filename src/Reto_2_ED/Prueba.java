package retogit.src.Reto_2_ED;

public class Prueba {

    private int num1;
    private int num2;
    private String text;

    public Prueba(int num1, int num2, String text){
        this.num1 = num1;
        this.num2 = num1;
        this.text = text;
    }
    public int getNum1() {
        return num1;
    }
    public int getNum2() {
        return num2;

    }
    public String getText() {
        return text;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public void setText(String text) {
        this.text = text;
    }
}
