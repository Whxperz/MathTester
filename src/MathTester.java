public class MathTester {

    public static void main (String[] args){
        /*int firstNumber = 10;
        int secondNumber = 20;
        if(firstNumber>secondNumber){
            System.out.println(firstNumber +" is less");
        }
        else if(firstNumber<0){
            System.out.println(firstNumber + " is greater than 0");
        }
        else{
            System.out.println("I don't know what you want");
        }
        *//*String firstWord;
        String secondWord;
        int firstNumber,secondNumber,total;


        firstWord = "dog";
        secondWord = "house";

        firstNumber = 5;
        secondNumber = 10;
        total = firstNumber+secondNumber;
        System.out.println(total);
        total = total + 10;
        System.out.println(total);*//*
       *//* System.out.println(firstWord+secondWord);
        System.out.println(firstNumber+secondNumber);
        System.out.println("firstNumber + secondNumber is "+ (firstNumber+secondNumber));
        System.out.println("firstNumber - secondNumber is "+ (firstNumber-secondNumber));
        System.out.println("secondNumber /  firstNumber is "+ (secondNumber/firstNumber));
        System.out.println("firstNumber * secondNumber is "+ (firstNumber*secondNumber));
        System.out.println("The modulus of the secondNumber by the firstNumber" +
               " is "+ (secondNumber%firstNumber));*/

        //0,1,1,2,3,5,8,13
        System.out.println(fibonacci(144));

    }

    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2)
        }
    }
}
