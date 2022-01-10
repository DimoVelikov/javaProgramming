package dimoPractice;

public class IfElse4 {
    public static void main(String[] args) {

        int     x = 2,
                y = 5,
                z = 0;
        boolean a = x==2, // true
                b = x !=5, // true
                c = x !=5 && y>=5, // true
                d = z != 0  || x == 2, // first false second true result true
                e =!(y < 10); // false


        if(a){
            System.out.println(a);
        }
        if(b){
            System.out.println(b);
        }
        if(c){
            System.out.println(c);
        }
        if(d){
            System.out.println(d);
        }
        if(e){
            System.out.println("e = " + e);
        }

    }
}
/*
If
x = 2
y = 5
z = 0
then find values of the following expressions:
a. x == 2
b. x != 5
c. x != 5 && y >= 5
d. z != 0 || x == 2
e. !(y < 10)
 */