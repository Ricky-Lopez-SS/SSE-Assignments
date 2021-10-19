public class Assignment1{
    public static void main(String[] args){
        int sum = 0;
        try{
            for(String s : args){sum += Integer.parseInt(s);}
        }catch(NumberFormatException e){
            System.out.println("one or more of your inputs are invalid, please try again.");
            return;
        }

        System.out.println(sum);

    }
}