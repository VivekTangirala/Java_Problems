import java.util.*;

//By default interface methods are abstract and public
//and variables are public, static and final
interface Book {
    String title = "Inside Interface Book";

    void setTitle(String s);

    String getTitle();
}

class MyBook implements Book {
    // String title = "Inside Mybook implemented";

    public void setTitle(String s) {

    }

    public String getTitle() {
        return title;
    }

}

class Abstraction {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("");
        String title = "ello";
        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is " + new_novel.getTitle());
    }
}
