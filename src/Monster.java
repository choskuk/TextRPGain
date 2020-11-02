//import java.io.IOException;

import java.util.*;
//import java.io.FileOutputStream;
//import java.io.OutputStream;

class Monster
{



    int abcex;

    private String sMonsterName;
    private int iMonsterHP;
    private int iMonsterDamage;
    private int iEXP;
    private int iSelect;
    private int iGold;
    Random igold;




    public Monster()
    {
        sMonsterName = "";
        iMonsterHP = 0;
        iMonsterDamage = 0;
        iSelect = 0;
        igold = new Random();



    }

    public void DungeonSelect(Person person)
    {


        while(true)//this.iSelect<6 || this.iSelect>=0)
        {
            System.out.println("던전을 선택하세요 : 1. 초급   2. 중급   3. 고급 4. 내정보  5. 상점   6. 저장  7. 불러오기  0. 끝내기");
            @SuppressWarnings("resource")
            Scanner iSelect = new Scanner(System.in);
            this.iSelect = iSelect.nextInt();

            if(this.iSelect == 0)
                break;


            if(this.iSelect == 1)
            {
                System.out.println("초급 던전 입니다");
                sMonsterName = "슬라임";
                iMonsterHP = 10;
                iMonsterDamage = 1;
                iEXP = 60;
                iGold = igold.nextInt(10)+1;
                System.out.println("이름 : " + sMonsterName);
                System.out.println("H.P : " + iMonsterHP);
                System.out.println("데미지: " + iMonsterDamage);

                Field(person);
                break;
            }


            else if(this.iSelect == 2)
            {
                System.out.println("중급 던전 입니다");
                sMonsterName = "골렘";
                iMonsterHP = 30;
                iMonsterDamage = 3;
                iEXP = 20;
                iGold = 20;
                System.out.println("이름 : " + sMonsterName);
                System.out.println("H.P : " + iMonsterHP);
                System.out.println("데미지: " + iMonsterDamage);
                Field(person);
                break;
            }
            else if(this.iSelect == 3)
            {
                System.out.println("고급 던전 입니다");
                sMonsterName = "드래곤";
                iMonsterHP = 100;
                iMonsterDamage = 10;
                iEXP = 40;
                iGold = 100;
                System.out.println("이름 : " + sMonsterName);
                System.out.println("H.P : " + iMonsterHP);
                System.out.println("데미지: " + iMonsterDamage);
                Field(person);
                break;
            }
            else if(this.iSelect == 4)
            {
                person.showData();
            }
            else if(this.iSelect == 5)
            {
                Store store = new Store();
                store.Select(person);
            }
            else if(this.iSelect == 6)
            {
                Save save = new Save(person);
            }
            else if(this.iSelect == 7)
            {
                Load load = new Load(person);
            }
//				else if(this.iSelect == 99)  // 히든 스테이지
//				{
//
//				}

            else
                System.out.println("다시선택하여주세요");
        }

    }



    @SuppressWarnings("resource")
    void Field(Person person)
    {

        int iSelect = 0;



        while(0<=iSelect && iSelect <2 || person.iHP>0 || iMonsterHP >0)
        {
            if(person.iHP <=0)
            {
                System.out.println("플레이어 사망 게임끝");
                break;
                //iSelect = 0;

            }
            if(iMonsterHP <= 0)
            {
                int tmp = 0;
                System.out.println("몬스터 사망");
                System.out.println("경험치가 " + iEXP + " 올랐습니다.");
                iMonsterHP = 0;
                person.iEXP += iEXP;
                person.iGold += iGold;
                if(person.iEXP >= 100) {
                    person.iLevel +=1;
                    tmp = person.iEXP - 100;
                    person.iEXP = tmp;
                    person.iDamage += person.LevleupDamage;
                    person.iMaxHP += person.LevelupHP;
                    person.iHP = person.iMaxHP;


                }
                DungeonSelect(person);

                break;
            }

            System.out.println("1.공격  0. 도망");
            Scanner scansellct = new Scanner(System.in);
            iSelect = scansellct.nextInt();

            if(iSelect == 0)
            {
                DungeonSelect(person);
                break;
            }
            else if(iSelect == 1)
            {
                System.out.println("1. 기본공격   2. 스킬");
                Scanner scanSel = new Scanner(System.in);
                int iSel = scanSel.nextInt();


                if(iSel == 1)
                {

                    //person.iMaxHP = 0;
                    person.iHP -= iMonsterDamage;
                    iMonsterHP -= person.iDamage;
                    if(iMonsterHP < 0)
                        iMonsterHP = 0;
                    person.showData();
                    System.out.println("--------------------------------");
                    System.out.println("이름 : " + sMonsterName);
                    System.out.println("H.P : " + iMonsterHP);
                    //System.out.println("데미지: " + iMonsterDamage);
                }
                else if(iSel == 2)
                {
                    System.out.println("1. " + person.sSkillName1 + "2. ");
                    Scanner scanSkillSelect = new Scanner(System.in);
                    int iSkillSelect = scanSkillSelect.nextInt();

                    if(iSkillSelect == 1)
                    {
                        person.iHP -= iMonsterDamage;
                        iMonsterHP -= person.iSkillDamge1;
                        if(iMonsterHP < 0)
                            iMonsterHP = 0;
                        person.showData();
                        System.out.println("--------------------------------");
                        System.out.println("이름 : " + sMonsterName);
                        System.out.println("H.P : " + iMonsterHP);

                    }
                }


            }


        }


    }


}