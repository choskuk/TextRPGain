//import java.io.IOException;
import java.io.*;
import java.util.*;
//import java.io.FileOutputStream;
//import java.io.OutputStream;


class Load{

    public Load(Person person) {

//		 String sName;
//		 String iJobName;
//		 int LevleupDamage;
//		 int iJob;
//		 int iHP;
//		 int iLevel;
//		 int iDamage;
//		 int iEXP;
//		 int iMaxHP;
//		 int iGold;
//		 int LevelupHP;


        try {
            File file = new File("C:\\Users\\user\\IdeaProjects\\TextRPGMain\\src");

            FileReader file_reader = new FileReader(file);
            int cur = 0;
            //sName
            while((cur = file_reader.read()) != -1) {
                //person.sName = sName;
                //System.out.println(sName);
                System.out.print((char)cur);
            }
            file_reader.close();


        }
        catch(FileNotFoundException e)
        {
            e.getStackTrace();
        }
        catch(IOException e)
        {
            e.getStackTrace();
        }
    }



}