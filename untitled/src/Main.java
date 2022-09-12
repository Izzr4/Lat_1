public class Main
{
    public static void main(String[] args)
    {
        int li = -75;
        float lf = 3.3f;
        char ch = 'i';
        boolean nilai = true;
        String sy = "Aku tampan";
        enum negara{indonesia, jepang, korea}

        System.out.printf("Literal Integer\t:%d\n",li);
        System.out.printf("Literal float\t:%.2f\n",lf);
        System.out.printf("Literal char\t:%c\n",ch);
        System.out.print("Literal bool\t:"+nilai+"\n");
        System.out.println("Literal String\t:"+sy);
        System.out.println("Negara saya\t\t:"+negara.indonesia);
    }
}
