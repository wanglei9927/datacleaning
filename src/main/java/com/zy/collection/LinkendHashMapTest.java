package com.zy.collection;

import com.beust.jcommander.internal.Lists;
import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class LinkendHashMapTest {

    @Test
    public void test1(){

        Map<String,String> map1= Maps.newLinkedHashMap();
        Map<String,String> map2 = Maps.newLinkedHashMap();

        List<Map<String,String>> list = Lists.newArrayList();

        map1.put("medicinePerson","婴幼儿");
        map1.put("medicinePhotoUrl","http://whswh.z-health.cn:8081/st/e6263e29f34c49369418bda9bdb3c9be.jpeg");

        map2.put("medicinePerson","婴幼儿");
        map2.put("medicinePhotoUrl","http://whswh.z-health.cn:8081/st/e6263e29f34c49369418bda9bdb3c9be.jpeg");

        list.add(map1);
        list.add(map2);
    }
}
