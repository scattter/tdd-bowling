import java.util.Arrays;

public class BowlingGame {

    public static int convert(int[] data){
        int score = 0;
        int flag = 0; //代表下一轮
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 10 && i < data.length-2){  //全中
                score += data[i]+data[i+1]+data[i+2];
                // 如果第十轮第一次就扔10分
                if (i == data.length-3){ return score; }
                // 代表下一轮开始了
                flag = 0;
            } else{
                if(flag == 1){
                    // 补中,加下一次分数
                    if(data[i]+data[i-1] == 10 && i < data.length-1){
                        score += data[i] + data[i+1];
                    }else{
                        score += data[i];
                    }
                    flag = 0;
                }else{ // 如果当前轮未结束
                    flag = 1;
                    score += data[i];
                }
            }
        }
        return score;
    }
}
