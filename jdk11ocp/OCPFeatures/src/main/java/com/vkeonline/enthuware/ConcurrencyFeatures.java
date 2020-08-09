package com.vkeonline.enthuware;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrencyFeatures {

    class COWList {
        private CopyOnWriteArrayList<String> cal = new CopyOnWriteArrayList<>();

        public void addDataList(List<String> list) {
            cal.addAll(list);
        }

        public Iterator getIterator() {
            return cal.iterator();
        }
    }

}
