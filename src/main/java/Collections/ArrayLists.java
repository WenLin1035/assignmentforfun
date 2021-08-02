package Collections;

import java.util.ArrayList;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        //add each element in list 2 to list 1
        for(int i : list2){
            list1.add(i);
        }
        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int total=0;
        if(list1.size() > list2.size()){
            for(int i =0; i<list2.size();i++){
                total += list1.get(i) + list2.get(i);
            }
            for(int i =list2.size();i<list1.size();i++){
                total += list1.get(i);
            }
            return total;
        }else if(list1.size() < list2.size()){
            for(int i =0; i<list1.size();i++){
                total += list1.get(i) + list2.get(i);
            }
            for(int i =list1.size();i<list2.size();i++){
                total += list2.get(i);
            }
            return total;
        }else if(list1.size() == list2.size()){
            for(int i =0; i<list1.size();i++){
                total += list1.get(i) + list2.get(i);
            }
            return total;
        } else
        return 0;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        for(int i = original.size()-1;i>=0;i--){
            if(original.get(i) == toRemove){
                original.remove(i);
            }
        }
        return original;
    }

    public boolean happyList(ArrayList<String> original) {
        // 1 or 0 elements in array
        if(original.size() == 0 || original.size() == 1){
            return true;
        }else
        // 2 elements in array
        if(original.size() == 2){
            for (int i = 0; i<original.get(0).length();i++){
                if(original.get(1).contains(String.valueOf(original.get(0).indexOf(i)))){
                    return true;
                }
            }
            return false;
        }
        // 3 or more elements in array
        for(int i = 1; i< original.size()-1;i++){
            for(int j =0;j<original.get(i).length();j++){
                if(!original.get(i-1).contains(String.valueOf(original.get(i).charAt(j))) &&
                        !original.get(i+1).contains(String.valueOf(original.get(i).charAt(j)))){
                    return false;
                }
                break;
            }
        }
        return true;
    }
}
