
class Program
{
    public static void main(String[] args) {
        Help.about();
        Chair chair=new Chair(2000);
        System.out.println("Price of chir is "+chair.price);
    }
}