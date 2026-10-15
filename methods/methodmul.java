public class methodmul{

    public static int name(int x, int r){
        return x + r;
    }
    public static int name1(int c){
        return c * c;

    }
    public static int name2(int d, int v){
        return d - v;
    }
    public static int name3(int g, int k){
        return g / k;
    }
    public static int name4(int j, int h, int g){
        return j + h + g;
    }
    public static void main(String[] args){
        methodmul bvc=new methodmul();
        methodmul rdx=new methodmul();
        int result=bvc.name(20,50);
        result=rdx.name(20,50);
        System.out.println(result);
        result=bvc. name1(50);
        System.out.println(result);
        result= bvc.name2(100,64);
        System.out.println(result);
        result= bvc.name3(98,2);
        System.out.println(result);
        result= rdx.name4(34,65,76);
        System.out.println(result);
    }
}