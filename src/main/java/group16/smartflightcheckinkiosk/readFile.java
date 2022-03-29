package group16.smartflightcheckinkiosk;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;


public class readFile {
    public static void readCsvFile(String filePath,infor []Allinfor) {
        try {
            ArrayList<String[]> csvList = new ArrayList<String[]>();
            CsvReader reader = new CsvReader(filePath,',',Charset.forName("GBK"));
//          reader.readHeaders(); //跳过表头,不跳可以注释掉

            while(reader.readRecord()){
                csvList.add(reader.getValues()); //按行读取，并把每一行的数据添加到list集合
            }

            for(int row=0;row<csvList.size();row++){
                infor inf =new infor(csvList.get(row)[0],csvList.get(row)[1],csvList.get(row)[2],csvList.get(row)[3],csvList.get(row)[4],csvList.get(row)[5],csvList.get(row)[6]);
                inf.add_infor(inf,Allinfor);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
