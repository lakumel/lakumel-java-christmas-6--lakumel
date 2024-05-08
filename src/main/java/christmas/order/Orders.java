package christmas.order;


import java.awt.*;
import java.util.Map;
import java.util.Set;

public class Orders {







    public Integer getTotalOrderAmount(){
        int result = 0;
        Set<Map.Entry<Menu,Integer>>menuEntrySet = menu.entrySet();
        for(Map.Entry<Menu,Integer>entry:menuEntrySet){
            Menu key= entry.getKey();
            Integer value = entry.getValue();
            result += key.getPrice()*value;
        }
        return result;
    }

}
