package fib;

public class Fib {

    public int fib(int index){
       if (index == 1 || index == 0){
            return 1;
        }
        else {

           return fib(index - 2) + fib(index - 1);

        }

    }

    public int fibSecondVers(int index){

        return index < 2 ? 1 : fibSecondVers(index - 1) + fibSecondVers(index - 2);

    }

}
