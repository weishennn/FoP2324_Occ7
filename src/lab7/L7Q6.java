package lab7;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
public class L7Q6 {
    public static void main(String[] args) {
        System.out.printf("%-12s%-22s%-11s%-15s%8s\n","ProductID","ProductName","Quantity","PricePerUnit","Total");
        try {
            Scanner orderStream = new Scanner(new FileInputStream("order.txt"));
            while (orderStream.hasNextLine()) {
                String order = orderStream.nextLine();
                String[] orderInfo = order.split(",");
                String productID = orderInfo[1];
                int orderQuantity = Integer.parseInt(orderInfo[2]);
                double price=0;
                double totalPrice=0;
                String productName =" ";

                Scanner productStream = new Scanner(new FileInputStream("product.txt"));
                while (productStream.hasNextLine()) {
                    String product = productStream.nextLine();
                    String[] productInfo = product.split(",");
                    if(productID.equals(productInfo[0])){
                        productName = productInfo[1];
                        price = Double.parseDouble(productInfo[2]);
                        totalPrice = orderQuantity*price;
                    }

                }
                System.out.printf("%-12s%-24s%-14d%5.2f%13.2f\n",productID,productName,orderQuantity,price,totalPrice);
            }
        }catch (IOException e){
            System.out.println("Problem with file output");
        }
    }
}
