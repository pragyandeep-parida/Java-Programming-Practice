package Numbers;

public class RandomNum
{
    public static void main(String[] args)
    {
        int random = (int) (Math.random() * 101); //generates random number between 0 to 100
        System.out.print(random);

//        System.out.print(Math.random() * 101);      //more direct without needeing a reference variable
    }
}
