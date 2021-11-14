package by.overone.lesson22;

import java.util.*;

public class Unique {

    public boolean isUnique (Map nameSurname) {

        Set<String> mySet = new HashSet<String>();
        for (Iterator iterator = nameSurname.entrySet().iterator(); iterator.hasNext(); ) {
            Map.Entry<String, String> entrySet = (Map.Entry) iterator.next();
            String value = entrySet.getValue();
            if (!mySet.add(value)){
                return false;
            }
        }
        return true;
    }
    public boolean isUnique1 (Map <String, String> nameSurname){
        Collection<String> collectionSurname = nameSurname.values();
        HashSet<String> setSurname = new HashSet<> (collectionSurname);
        return collectionSurname.size() == setSurname.size();
    }


}



