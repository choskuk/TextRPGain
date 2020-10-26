//import java.io.IOException;
import java.io.*;
import java.util.*;
//import java.io.FileOutputStream;
//import java.io.OutputStream;



class Save{		//저장
    public Save()
    {
        System.out.println("notting");
    }


    public Save(Person person)
    {
        try {
            OutputStream output = new FileOutputStream("C:\\Users\\user\\IdeaProjects\\TextRPGMain\\src");
            //output = new FileOutputStream("C:\\Users\\user\\eclipse-workspace\\EX_1\\src\\TE1XR.txt");
            //String str[] = new String[11];
            //String str[0] = person.sName;
            String str[] = new String[6];

            // 2차배열

//			for(int i= 0 ; i< str.length ; ++i)
//			{
//				str[i] =
//
//			}
            //int istr[] = new int[9];
            str[0] = person.sName;
            str[1] = person.iJobName;
            //str[2] = Integer.toString(person.LevleupDamage);
            //str[3] = Integer.toString(person.iJob);
            str[2] = Integer.toString(person.iHP);
            str[3] = Integer.toString(person.iLevel);
            str[4] = Integer.toString(person.iDamage);
            str[5] = Integer.toString(person.iEXP);
            //str[8] = Integer.toString(person.iMaxHP);
            str[6] = Integer.toString(person.iGold);
            //str[10] = Integer.toString(person.LevelupHP);


            byte[] by = str[0].getBytes();//new byte[10];
            byte[] by2 = str[1].getBytes();
            byte[] by3 = str[2].getBytes();
            byte[] by4 = str[3].getBytes();
            byte[] by5 = str[4].getBytes();
            byte[] by6 = str[5].getBytes();
            byte[] by7 = str[6].getBytes();
//			byte[] by8 = str[7].getBytes();
//			byte[] by9 = str[8].getBytes();
//			byte[] by10 = str[9].getBytes();
//			byte[] by11 = str[10].getBytes();
//


            //by[0] =str[0].getBytes();




            output.write(by);
            //System.out.println(" ");
            output.write(by2);
            output.write(by3);
            output.write(by4);
            output.write(by5);
            output.write(by6);
            output.write(by7);
//			output.write(by8);
//			output.write(by9);
//			output.write(by10);
//			output.write(by11);
//

        }catch(Exception e) {
            e.getStackTrace();

        }
    }
}