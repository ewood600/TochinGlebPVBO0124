package package12;

import java.util.ArrayList;

public class Shop {
    private ArrayList list = new ArrayList();

    public void add(String computer){
        list.add(computer);
    }

    public void remove(String computer){
        list.remove(computer);
    }

    public String search(String computer){
        if(list.contains(computer)){
            return "shop contains " + computer;
        }
        else {
            return "shop doesnt contain " + computer;
        }
    }

}
