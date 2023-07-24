package JAVA_PROGRAMMING_LANGUAGE;

public class FirstProgram
{
    public static void main(String[] a)
    {
        System.out.println("***Hello Juma***");
        
        /**************************************************************************** 
        Operators in Java 
        1.Unirary operator >>incrementation, >>decrementation, >>negation, >>inversion
        ******************************************************************************/ 
        int x=10;
        System.out.println("Unirary operator");
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);
        /*****************************************************************************
        2.Arithmetic Operetors >>addition, >>subtration >>multiplication >>division, >>modulus
        *******************************************************************************/
        int y=5;
        System.out.println("Arithemtical operator");
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);

        /*********************************************************************
        3.Shift operators >>left shift(add zeros to the left of binary number)
            >>right shift()
        **********************************************************************/
        System.out.println("Shift operator");
        System.out.println(x<<2); //left shift(1010<<2==101000(40))
        System.out.println(x>>2); //right shift(1010>>==10(2))

        /*********************************************************************
        4.Relational operator >>greater, >>lesser, >>equals (returns boolean)
        *********************************************************************/
        System.out.println(x>y); //x<y, x==y, x!=y, x>=y, x<=y

        /*********************************************************************
        5.Logical operator >>and(&&) >>or(||) >>not(!) (return boolean)
        **********************************************************************/
        System.out.println(x<y && x!=2 || y<6);

        /**********************************************************************
        6.Ternary operator
        ***********************************************************************/
        System.out.println("Ternary operator");
        int min = (x<y)? x:y;
        System.out.println(min);
        
        /*********************************************************************
        7. Asigment operator >>+=, -=, *=, /=, %=
        **********************************************************************/
        System.out.println("Assaigment operator");
        System.out.println(x%=5);

        
    }
}