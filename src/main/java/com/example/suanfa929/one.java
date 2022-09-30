package com.example.suanfa929;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author 池恩
 * @date 2022/9/30 10:25
 * @project_name
 */
public class one {
    String[] arrayDB = {"aa","bb","cc","dd","ee","gg"};
    String[] arrayIn = {"ee","ff","gg"};
    Set<String> bb = new HashSet<>(Arrays.asList(arrayIn));
    List<String> same = Arrays.asList(arrayDB).stream().filter(i->!bb.add(i)).collect(Collectors.toList());
}
