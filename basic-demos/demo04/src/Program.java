
class Program
{
    public static void main(String[] args) {
        Help.about();
        Chair chair=new Chair(2000);
        System.out.println("Price of chir is "+chair.price);
        
        Table table = new Table(5000);

        Table table2=new Table();

        table2.addItem(1,1,"Data");

        ShoppingCart cart=new ShoppingCart();
        List wishList = new List();

        cart.addItem("Chair");
        wishList.addItem("Table");

    }
}