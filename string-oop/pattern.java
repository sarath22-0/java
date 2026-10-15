public class pattern{
    public static void main(String[] args){
        try{
            int result=10 / 0; 
            System.out.println("Result" + result);
        }catch (Exception e){
            System.out.println("Genric fallback catch block"+ e.getMessage());
        }
        int num1=10,num2=9,result;
        System.out.println(result=num1+num2);
    }
}