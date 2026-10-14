public class StringBuilderdemo{
    public static void main(String[] args){
        StringBuilder sb= new StringBuilder("java");
        sb.append("programmin");
        sb.insert(4,"Core");
        sb.reverse();

        System.out.println(sb.toString());

        StringBuilder sr=new StringBuilder("sarath");
         System.out.println(sr.toString());


         StringBuilder sd=new StringBuilder("ammu");
         System.out.println(sd.toString());
         sd.append(" kutti");
         System.out.println(sd.toString());
         StringBuilder sg=new StringBuilder("asdfghjkl");

         System.out.println(sg.toString());
         sg.insert(7, "Rahul");
         System.out.println(sg.toString());


    StringBuilder se=new StringBuilder("misse");
    se.reverse();
    System.out.println(se.toString());



        }
    }

