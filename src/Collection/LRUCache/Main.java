package Collection.LRUCache;
import java.util.HashMap;
import java.util.LinkedHashMap;
/*
Array Challenge
Have the function
AaYChallenge （strAtE） take the array of
characters stored in strArr, which will contai characters ranging from A to Z in some arbitrary order, and determine what elements still remain in a virtual cache that can hold up to 5 elements with an LRU cache a gorithm implemented. For example: if stater is l'A",
"B", "C", "D", "A", "EY, "D", "Z'1, then the following steps are taken:
 
 
1. ﻿﻿﻿﻿A does not exist in the cache, so access it and store it in the cache.
2. ﻿﻿﻿﻿B does not exist in the cache, so access it and store it in the cache as well. So far the cache contains: ['A", "B"1.
3. ﻿﻿﻿﻿Same goes for C, so the cache is now: ["A",
"В", "С*].
(4) Same goes for D, so the cache is now: ['A",
"B", "C", "D*1.
(5) Now A is accessed again, but it exists in the cache already so it is brought to the front: ["B",
"C", "D", "A'1-
(6) E does not exist in the cache, so access it and store it in the cache: I"B",
", "с", "D", "Аг, "Е1.
(7) D is accessed again so it is brought to the
front: ['В", "С", "А", "Е*, "D"1.
(8) Z does not exist in the cache so add it to the front and remove the least recently used element: ["C", "A", "E", "D", "21.
Now the caching steps have been completed and your program should return the order of the cache with the elements joined into a string, separated by a hyphen. Therefore, for the example above your program should return C-A-E-D-Z.*/

import java.util.LinkedHashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        String[] strArr = {"A", "B", "C", "D", "A", "E", "D", "Z"};
        System.out.println(LRUCache(strArr));
    }

    public static String LRUCache(String[] strArr) {
        LinkedHashSet<String> cache = new LinkedHashSet<>(5);
        for (String i : strArr) {
            if (!cache.add(i)) {
                cache.remove(i);
                cache.add(i);
            } else if (cache.size() > 4) {
                Iterator<String> it = cache.iterator();
                it.next();
                it.remove();
            }
        }

        StringBuilder result = new StringBuilder();
        for (String n : cache) {
            result.append(n).append("-");
        }
        result.setLength(result.length() - 1); // remove the last hyphen
        return result.toString();
    }
}