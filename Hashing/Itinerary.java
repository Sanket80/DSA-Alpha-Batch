import java.util.*;
public class Itinerary {

    public static String startPoint(HashMap<String,String> tickets){
        HashMap<String,String> revtickets = new HashMap<>();
        for(String key: tickets.keySet()){
            revtickets.put(tickets.get(key), key);
        }

        for(String key : tickets.keySet()){
            if(!revtickets.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    
    public static void main(String args[]){
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = startPoint(tickets);
        System.out.print(start);
        for(String key : tickets.keySet()){
            System.out.print(" -> "+tickets.get(start));
            start = tickets.get(start);
        }
    }
}
