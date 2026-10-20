import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double price;
        double total = 0.0;
        boolean moreItems;

        do
        {
            price = SafeInput.getRangedDouble(in,
                    "Enter the item price", 0.50, 1000.00);

            total += price;

            moreItems = SafeInput.getYNConfirm(in,
                    "Do you have another item");

        }
        while(moreItems);

        System.out.printf("\nYour total is: $%.2f\n", total);
    }
}
