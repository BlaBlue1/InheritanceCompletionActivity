import com.sun.javafx.binding.StringFormatter;

public class Product extends Book {
    private String code;
    private String description;
    private float price;
    protected static int count = 0; //a protected static variable

    public Product() {
        code = "";
        description = "";
        price = 0;

    }
    public Product(String code, String description, float price) {
        this.code = code;
        this.description = description;
        this.price = price;

    }
    //Get and set accessors for the code, description, and price instance variables
    @Override
    public String toString() {
        return "Code:             " + code + "\n" +
                "Description:     " + description + "\n" +
                "Price:           " + this.getFormattedPrice() + "\n";
    }
    private float getFormattedPrice() {
        return price;
        //Use the StringFormat class to format the price to 2 decimal places
    }
    //Create public access for the count variable
    public static int getCount() {
        return count;
    }

}
