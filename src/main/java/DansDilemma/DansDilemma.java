package DansDilemma;

import java.util.ArrayList;
import java.util.Collections;

public class DansDilemma {

    public Integer dilemmaOfTwo(Double input1, Double input2) {
        double add = input1 + input2;
        double sub1 = input1 - input2;
        double sub2 = input2 - input1;
        double mul = input1 * input2;
        double div1 = input1/input2;
        double div2 = input2/input1;
        ArrayList<Double> temp = new ArrayList<>();
        temp.add(add);
        temp.add(sub1);
        temp.add(sub2);
        temp.add(mul);
        temp.add(div1);
        temp.add(div2);
        ArrayList<Double> temp1 = new ArrayList<>();
        for(int i =0;i<6;i++){
            if(!temp1.contains(temp.get(i)) && !temp.get(i).isNaN()){
                temp1.add(temp.get(i));
            }
        }
        return temp1.size();
    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
        ArrayList<Double> temp = new ArrayList<>();
        temp.add(input1);
        temp.add(input2);
        temp.add(input3);
        ArrayList<Double> temp1 = new ArrayList<>();
        for (int i = 0;i<3;i++){
            for(int j = i+1;j<3;j++){
                temp1.add(temp.get(i) + temp.get(j));
                temp1.add(temp.get(i) * temp.get(j));
                temp1.add(temp.get(i)-temp.get(j));
                temp1.add(temp.get(j)-temp.get(i));
                temp1.add(temp.get(i)/temp.get(j));
                temp1.add(temp.get(j)/temp.get(i));
            }
        }
        ArrayList<Double> ans = new ArrayList<>();
        for(int i = 0; i<temp1.size();i++){
            if(!ans.contains(temp1.get(i)) && !temp1.get(i).isNaN()){
                ans.add(temp1.get(i));
            }
        }
        return ans.size();
    }

    public Integer dilemmaOfN(Double... args){
        int size = args.length;
        int count = 0;
        ArrayList<Double> temp1 = new ArrayList<>();
        for (int i = 0;i<size;i++){
            for(int j = i+1;j<size;j++){
                if(!temp1.contains(args[i] + args[j])){
                    temp1.add(args[i] + args[j]);
                }
                if(!temp1.contains(temp1.add(args[i] * args[j]))){
                    temp1.add(args[i] * args[j]);
                }
                if(!temp1.contains(args[i]-args[j])){
                    temp1.add(args[i]-args[j]);
                }
                if(!temp1.contains(args[j]-args[i])){
                    temp1.add(args[j]-args[i]);
                }
                if(!temp1.contains(args[i]/args[j])){
                    temp1.add(args[i]/args[j]);
                }
                if(!temp1.contains(args[j]/args[i])){
                    temp1.add(args[j]/args[i]);
                }
            }
            System.out.println(count);
            count++;
        }
        System.out.println("HELLO: " + temp1.size());
        count=0;
        ArrayList<Double> ans = new ArrayList<>();
        for(int i = 0; i<temp1.size();i++){
            if(!ans.contains(temp1.get(i)) && !temp1.get(i).isNaN() && !Double.isInfinite(temp1.get(i))){
                ans.add(temp1.get(i));
            }
            System.out.println(count);
            count++;
        }
        return ans.size();
    }
}
