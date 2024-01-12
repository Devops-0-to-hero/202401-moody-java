import data.*;
import shopping.ShoppingCart;
import furnitures.Chair;
import furnitures.Table;


class Program
{
    public static void main(String[] args) {
        Help.about();
        Chair chair=new Chair(2000);
        Table table = new Table(5000); //furnitures.Table
        data.Table table2=new data.Table();

        furnitures.office.Table table3=new furnitures.office.Table(10000);

        ShoppingCart cart=new ShoppingCart();
        List wishList = new List();
        Search search=new Search();


        System.out.println(chair);
        System.out.println(table);
        System.out.println(table2);
        System.out.println(table3);
        System.out.println(cart);
        System.out.println(wishList);
        System.out.println(search);


    }
}