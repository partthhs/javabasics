public class Staticvariable {
    int rollno ;
    String name;
    static String clgNm = "PCE";

    void dataDisplay()
    {
        System.out.println("ROLL NUMBER = "+rollno);
        System.out.println("NAME = " +name);
        System.out.println("COLLEGE NAME = " +clgNm);
    }
    public static void main(String[]args)
    {
        Staticvariable st=new Staticvariable();
        st.rollno = 100;
        st.name= "John";
        st.dataDisplay();

        Staticvariable s2=new Staticvariable();
        s2.rollno = 101;
        s2.name = "Alice";
s2.dataDisplay();

    }

}
