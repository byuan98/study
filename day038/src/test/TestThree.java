package test;

import java.util.*;

public class TestThree {
//  entrySet()≤‚ ‘
    public static void main(String[] args) {
        HashMap<String, Double> priceTable = new HashMap();
        priceTable.put("milk", 2.5);
        priceTable.put("bread", 5.5);
        priceTable.put("ham", 6.3);
        priceTable.put("egg", 1.2);

        System.out.println(priceTable);

        Set<Map.Entry<String, Double>> table = priceTable.entrySet();
        System.out.println(table);
        for (Map.Entry<String, Double> entry : table) {
//			System.out.println(entry.setValue(1.0));
            System.out.println(entry);
            System.out.println(entry.getKey() + ":::" + entry.getValue());
        }
        System.out.println(table.hashCode());
        System.out.println(priceTable.hashCode());

        System.out.println(priceTable.values());

    }

}
