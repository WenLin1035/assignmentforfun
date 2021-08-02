package Collections;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {
        return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {
        ArrayList<Object> answer = new ArrayList<>();
        map.forEach((key, val) -> {
            if(val.equals(value)){
                answer.add(key);
            }
        });
        Object[] ans = new Object[answer.size()];
        for(int i = 0; i< answer.size();i++){
            ans[i] = answer.get(i);
        }
        return ans;
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
        Map<Integer, Integer> answer = new TreeMap<Integer, Integer>();
        for(int i = 1; i<size+1; i++){
            if(i == 1 || i ==2){
                answer.put(i,1);
            }else{
                answer.put(i, answer.get(i-2) + answer.get(i-1));
            }
        }
        return answer;
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        Map<Integer, Integer> answer = new TreeMap<Integer, Integer>();
        if(size == 0){
            return answer;
        }else
        if(size == 1){
            answer.put(1,first);
            return answer;
        }else
        if(size == 2){
            answer.put(1,first);
            answer.put(2,second);
            return answer;
        }else
        answer.put(1,first);
        answer.put(2,second);
        if(size>2){
            for(int i = 3;i<size+1;i++){
                answer.put(i, answer.get(i-2) + answer.get(i-1));
            }
        }
        return answer;
    }
}
