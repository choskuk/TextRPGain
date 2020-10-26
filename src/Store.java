//import java.io.IOException;
import java.io.*;
import java.util.*;
//import java.io.FileOutputStream;
//import java.io.OutputStream;



class Store{
    //	private int iPortion[];
    private int iSelect;
    //private int sel;

    public Store()
    {
        //int i = 0;
//		for(i = 0 ; i<3; ++i)
//		{
//			iPortion[i] = 0;
//
//		}
        iSelect = 100;

    }
    public void Select(Person person)
    {
        while(this.iSelect >0 || this.iSelect <4 ) {

            System.out.println("1.포션상점  2.장비상점 3.나가기");
            //int iSELC;
            @SuppressWarnings("resource")
            Scanner iselect = new Scanner(System.in);
            this.iSelect = iselect.nextInt();

            if(this.iSelect == 1)
                SelectPortion(person);
            else if(this.iSelect == 2)
                SelectEqShop(person);
            else if(this.iSelect == 3)
                break;
            else
                System.out.println();
        }
    }

    public void SelectEqShop(Person person)
    {
        while(this.iSelect < 5 || this.iSelect >0)
        {

            System.out.println("1.낡은 검 at+1(100G)   2.평범한 검 at+2(200G)  3.고급 검 at+3(300G)   4.나가기");
            @SuppressWarnings("resource")
            Scanner iselect = new Scanner(System.in);

            iSelect = iselect.nextInt();
            if(iSelect ==1)
            {
                if(person.iGold < 100)
                    System.out.println("돈없어서 구매불가");
//				else if(person.iHP == person.iMaxHP) {
//					System.out.println("체력이 꽉차있어서 구매불가합니다.");
//
//				}
                else {
                    person.iGold -= 100;
                    person.iDamage +=1;
                    System.out.println("소지금 : " + person.iGold + "남았습니다.");
                }

            }
            else if(iSelect == 2)
            {
                if(person.iGold < 200)
                    System.out.println("돈없어서 구매불가");
                else {
                    person.iGold -= 200;
                    person.iDamage +=2;
                    System.out.println("소지금 : " + person.iGold + "남았습니다.");
                }

            }
            else if(iSelect == 3)
            {
                if(person.iGold < 300)
                    System.out.println("돈없어서 구매불가");
                else {
                    person.iGold -= 300;
                    person.iDamage +=3;
                    System.out.println("소지금 : " + person.iGold + "남았습니다.");
                }

            }
            else if(iSelect ==4)
                break;
            else
                System.out.println("1~4번을 다시입력해주세요");
        }



    }
    public void SelectPortion (Person person)
    {
        while (this.iSelect < 5 || this.iSelect >0)
        {

            System.out.println("1.10G초급포션   2.20G중급포션   3.30G고급포션   4.나가기");
            @SuppressWarnings("resource")
            Scanner iselect = new Scanner(System.in);

            iSelect = iselect.nextInt();

            if(iSelect == 1)
            {
                if(person.iGold < 10)
                    System.out.println("돈없어서 구매불가");
                else if(person.iHP == person.iMaxHP) {
                    System.out.println("체력이 꽉차있어서 구매불가합니다.");

                }
                else
                {

                    System.out.println("초급포션 10G,HP10회복");
                    person.iHP +=10;
                    if(person.iHP > person.iMaxHP)
                        person.iHP = person.iMaxHP;
                    person.iGold-=10;
                    System.out.println("소지금 : " + person.iGold + "남았습니다.");
                    System.out.println("HP : " + person.iHP);
                    if(person.iHP > person.iMaxHP)
                        person.iHP = person.iMaxHP;
                }

            }
            else if(iSelect == 2)
            {
                if(person.iGold < 20)
                    System.out.println("돈없어서 구매불가");
                else if(person.iHP == person.iMaxHP) {
                    System.out.println("체력이 꽉차있어서 구매불가합니다.");

                }
                else {
                    System.out.println("중급포션 20G,HP20회복");
                    person.iHP +=20;
                    person.iGold-=20;
                    System.out.println("소지금 : " + person.iGold + "남았습니다.");
                    System.out.println("HP : " + person.iHP);
                    if(person.iHP > person.iMaxHP)
                        person.iHP = person.iMaxHP;
                }
            }
            else if(iSelect == 3)
            {
                if(person.iGold < 30)
                    System.out.println("돈없어서 구매불가");
                else if(person.iHP == person.iMaxHP) {
                    System.out.println("체력이 꽉차있어서 구매불가합니다.");

                }
                else
                {

                    System.out.println("고급포션 30G,HP30회복");
                    person.iHP +=30;
                    person.iGold-=30;
                    System.out.println("소지금 : " + person.iGold + "남았습니다.");
                    System.out.println("HP : " + person.iHP);
                    if(person.iHP > person.iMaxHP)
                        person.iHP = person.iMaxHP;
                }
            }
            else if(iSelect ==4)
                break;
            else
                System.out.println("1~4번을 다시입력해주세요");
        }

    }

}