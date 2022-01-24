package dimoPractice.US;

public class Calc {

    private String name;
    private int x,y,result;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void plus(){

        setResult(getX()+getY());

    }

    public void minus(){
        setResult(getX()-getY());
    }
}
