public class updateP {
    public static void main(String[] args) {
       Book book = new Book("hahahah", 120);
       book.info();
       book.updatePrice();
       System.out.println("==================");
        book.info();
    }
    }

    class Book {
    String name;
    double price;
    public Book(String name, double price){
        this.name = name;
        this.price = price;
    }
    public void updatePrice() {
        if (price >150){
            price = 150;
        } else if (price >100 ){
            price= 100;
        }
    }
    public void info(){
        System.out.println("book name = " +this.name +" price = "+this.price);
    }
    }
