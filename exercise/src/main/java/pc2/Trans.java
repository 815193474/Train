package pc2;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author luoGuanzhong  VX:a815193474
 * @Date 2020-07-11 15:11
 */
public class Trans {
    public static void main(String[] args) throws IOException {

       tran();
    }

    public static void  tran() throws IOException {

     try{
         // 创建文件输入流
         InputStreamReader inputStreamReader=new InputStreamReader(new FileInputStream("C:\\Users\\Administrator\\Desktop\\BAJG_T_SYS_ORG.json"),"UTF-8");
         BufferedReader reader=new BufferedReader(inputStreamReader);
        StringBuffer buffer=new StringBuffer();
        String s="";
        while ((s=reader.readLine())!=null){
            buffer.append(s);
            System.out.println(s);
        }
         //释放缓存
        reader.close();
        String str= buffer.toString();
         JSONArray jsonArray = JSON.parseArray(str);
         List<OrgLocalBean> list=new ArrayList<OrgLocalBean>();
         for (int i = 0; i < jsonArray.size(); i++) {
           JSONObject jsonObject=jsonArray.getJSONObject(i);
           OrgLocalBean orgLocalBean=JSON.toJavaObject(jsonObject,OrgLocalBean.class);
           list.add(orgLocalBean);
         }

     }catch (Exception e){

     }

    }
}
