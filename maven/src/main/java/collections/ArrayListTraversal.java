package collections;

import java.util.ArrayList;

public class ArrayListTraversal {

    public void traverseWithForLoop(ArrayList<String> stringList) {
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
    }

    public void traverseWithEnhancedForLoop(ArrayList<String> stringList) {
        for (String fruit : stringList) {
            System.out.println(fruit);
        }
    }


}