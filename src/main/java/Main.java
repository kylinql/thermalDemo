import com.alibaba.fastjson.JSONObject;

/**
 * @Author: kylin
 * @Date: 2020/3/2 下午10:53
 */
public class Main {

    public static void main(String[] args) {

        Parameter parameter = new Parameter();

        String jsonStr = JSONObject.toJSONString(parameter);

        System.out.println(jsonStr);

    }
}
