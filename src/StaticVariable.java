public class StaticVariable {
    int n1;
    int n2;
    public StaticVariable(int n1, int n2)
    {
        this.n1 = n1;
        this.n2 = n2;
    }
    public void setValue()
    {

        System.out.println(n1+n2);

    }

    public static void main(String[] args) {
        StaticVariable s1 = new StaticVariable(10,20);
        s1.setValue();

    }
}
