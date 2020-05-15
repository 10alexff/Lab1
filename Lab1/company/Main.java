package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Test();

    }

    public static String program (String input)
    {
        String output ="";
        int f1 = 0;
        int f2 = 0;
        int d = input.length();
        char mas[] = input.toCharArray();
        for (;;)
        {
            if(f1>=d){break;}
            if (mas[f1]!=' ')
            {
                for(int j=f1;j<d;j++ )
                {
                    if(mas[j]==' ')
                    {
                        f2=j-1;break;
                    }
                    if(j==d-1){
                        f2=d-1;
                    }
                }
            }
            else
                {f1+=1;continue;}
            int k=0;
            char chest;
            for(int j=f1;j<=f2;j++)
            {
                chest = mas[j];
               for(int h = j+1;h<=f2;h++)
               {
                   if(chest==mas[h]){k=1;break;}
               }
               if(k==1){break;}

            }
            if (k==0)
            {
                if(output!=""){output+=' ';}
                for(int j=f1;j<=f2;j++)
                {
                    output +=mas[j];
                }


            }
            f1=f2+1;
        }

        return output;
    }

    public static void Test()
        {
            int k=0;
            String a1 = "Розробити програму для реалізації обраного алгоритму";
            String b1 = program(a1);
            //"для алгоритму";
            if(program(a1).equals(b1)){k+=1;System.out.println("1ok");}
            System.out.println(program(a1));
            String a2 = "повторювані частини коду в окремі методи та покрити модульними тестами";
            String b2 = "коду в окремі методи та";
            if(program(a2).equals(b2)){k+=1;System.out.println("2ok");}
            System.out.println(program(a2));
            String a3 = "Вибрати для реалізації один із наступних варіантів";
            String b3 = "для один із";
            if(program(a3).equals(b3)){k+=1;System.out.println("3ok");}
            System.out.println(program(a3));
            String a4 = "Знайти ті слова які містять тільки символи латинського алфавіту";
            String b4 ="Знайти ті слова які тільки";
            if(program(a4).equals(b4)){k+=1;System.out.println("4ok");}
            System.out.println(program(a4));
            String a5 = "Знайти слова які складаються тільки з різних символів На виході   масив String";
            String b5 ="Знайти слова які тільки з різних На виході масив String";
            System.out.println(program(a5));
            if(program(a5).equals(b5)){k+=1;System.out.println("5ok");}

            System.out.println(k+" /5");
        }
    
}
