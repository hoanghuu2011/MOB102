
package Test0625_PD06670;

import java.io.Serializable;

public class Bookclass implements Serializable{
   private String bookid ,booktitle, bookcategory ;
   private float bookprice;

    public Bookclass() {
    }

    public Bookclass(String bookid, String booktitle, String bookcategory, float bookprice) {
        this.bookid = bookid;
        this.booktitle = booktitle;
        this.bookcategory = bookcategory;
        this.bookprice = bookprice;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getBooktitle() {
        return booktitle;
    }

    public void setBooktitle(String booktitle) {
        this.booktitle = booktitle;
    }

    public String getBookcategory() {
        return bookcategory;
    }

    public void setBookcategory(String bookcategory) {
        this.bookcategory = bookcategory;
    }

    public float getBookprice() {
        return bookprice;
    }

    public void setBookprice(float bookprice) {
        this.bookprice = bookprice;
    }
   
   
}
