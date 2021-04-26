package main;

import java.util.ArrayList;
import java.util.List;

public class PrincalsTriangle {
    public static void main(String[] args) {
        SolutionG solutionG = new SolutionG();
        List<List<Integer>> result = new ArrayList<>();
        result = solutionG.generate(5);
        System.out.print(result);
    }

}
class SolutionG{
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        result.add(new ArrayList(){{add(1);}}); //添加一个数
        if (numRows == 1) {
            return result;  //如果只需要生成1个直接返回
        }
        result.add(new ArrayList(){{add(1); add(1);}}); //添加第二列的1
        if (numRows == 2) {
            return result;
        }
        List<Integer> preNuumber = result.get(1);//初始获取第2个数组开始两边的值
        for (int i = 3; i <= numRows; i++) {
            List<Integer> list = new ArrayList(){{add(1);}};//每次都将第1个数设置为1
            for (int j = 1; j < i - 1; j++) {
                list.add(preNuumber.get(j) + preNuumber.get(j - 1));//获取当期索引值的左右两边的值
            }
            list.add(1);//添加末尾的1
            preNuumber = list;
            result.add(list);
        }
        return result;
    }
}
