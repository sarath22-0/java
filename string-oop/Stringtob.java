public class Stringtob{
    public static void main(String[] args){
        String text=" java programing languge ";
        System.out.println(text.length());
        System.out.println(text.trim());
        System.out.println(text);
        System.out.println(text.substring(6,16));

        System.out.println(text.contains("program"));
        System.out.println(text.replace('a','o'));
        String[] wrods=text.trim().split("");
    }
}