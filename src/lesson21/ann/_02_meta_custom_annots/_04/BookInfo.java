package lesson21.ann._02_meta_custom_annots._04;

// Якщо просто @Book, то отримаємо
// default значення з interface Book
@Book(author = "Emma", title = "White river")
public class BookInfo {

    @Book(author = "Tom", title = "Silver coin")
    public String getData() {
        return "No data...";
    }
}
