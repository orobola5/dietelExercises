package assignment;

import java.util.Objects;
import java.util.Scanner;

public class MyersBriggs {
    private static int countA1;
    private static int countB1;
    private static int countA2;
    private static int countB2;
    private static int countA3;
    private static int countB3;
    private static int countA4;
    private static int countB4;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userOption;

        for (int l = 1; l <= 20; l++) {
            System.out.println("enter either A or B");

            switch (l) {
                case 1: {
                    System.out.println("""
                            1.
                            A. expend energy,enjoy groups
                            B.conserve energy, enjoy one-on-one
                            """);
                    userOption = input.next();
                    if (Objects.equals(userOption, "A")) countA1++;
                    else countB1++;
                    break;
                }
                case 2: {
                    System.out.println("""
                            2.
                            A. interpret literally
                            B. look for meaning and possibilities
                            """);
                    userOption = input.next();

                    if (Objects.equals(userOption, "A")) countA2++;
                    else countB2++;
                    break;
                }
                case 3: {
                    System.out.println("""
                            3.
                            A. logical,thinking,questioning
                            B. empathetic, feeling, accommodating
                            """);
                    userOption = input.next();
                    if (Objects.equals(userOption, "A")) countA3++;
                    else countB3++;
                    break;
                }
                case 4: {
                    System.out.println("""
                            4.
                            A. organized,orderly
                            B. flexible,adaptable
                            """);
                    userOption = input.next();
                    if (Objects.equals(userOption, "A")) countA4++;
                    else countB4++;
                    break;
                }
                case 5: {
                    System.out.println("""
                            5.
                            A. more outgoing,think out loud
                            B.more reserved,think to yourself
                            """);
                    userOption = input.next();
                    if (Objects.equals(userOption, "A")) countA1++;
                    else countB1++;
                    break;
                }
                case 6: {
                    System.out.println("""
                            6.
                            A. practical,realistic,experiential
                            B. imaginative,innovative,theoretical
                            """);
                    userOption = input.next();
                    if (Objects.equals(userOption, "A")) countA2++;
                    else countB2++;
                    break;
                }
                case 7: {
                    System.out.println("""
                            7.
                            A. candid,straight forward,frank
                            B.tactful,kind,encouraging
                            """);
                    userOption = input.next();
                    if (Objects.equals(userOption, "A")) countA3++;
                    else countB3++;
                    break;
                }
                case 8: {
                    System.out.println("""
                            8.
                            A. plan,schedule
                            B. unplanned,spontaneous
                            """);
                    userOption = input.next();
                    if (Objects.equals(userOption, "A")) countA4++;
                    else countB4++;
                    break;
                }

                case 9: {
                    System.out.println("""
                            9.
                            A. seek many tasks,public activities,interaction with others
                            B.seek private,solitary activities with quiet to concentrate
                            """);
                    userOption = input.next();
                    if (Objects.equals(userOption, "A")) countA1++;
                    else countB1++;
                    break;
                }
                case 10: {
                    System.out.println("""
                            10.
                            A. standard,usual,conventional
                            B. different,novel,unique
                            """);
                    userOption = input.next();
                    if (Objects.equals(userOption, "A")) countA2++;
                    else countB2++;
                    break;
                }
                case 11: {
                    System.out.println("""
                            11.
                            A.firm,tend to criticize,hold the line
                            B. gentle,tend to appreciate,conciliate
                            """);
                    userOption = input.next();
                    if (Objects.equals(userOption, "A")) countA3++;
                    else countB3++;
                    break;
                }
                case 12: {
                    System.out.println("""
                            12.
                            A.regulated,structured 
                            B. easygoing,"live" and "let live"
                            """);
                    userOption = input.next();
                    if (Objects.equals(userOption, "A")) countA4++;
                    else countB4++;
                    break;
                }

                case 13: {
                    System.out.println("""
                            13.
                            A. external,communicative,express yourself
                            B.internal,reticent,keep to yourself
                            """);
                    userOption = input.next();
                    if (Objects.equals(userOption, "A")) countA1++;
                    else countB1++;
                    break;
                }
                case 14: {
                    System.out.println("""
                            14.
                            A. focus on here-and-now
                            B. look to the future,global perspective,"big picture"
                            """);
                    userOption = input.next();
                    if (Objects.equals(userOption, "A")) countA2++;
                    else countB2++;
                    break;
                }
                case 15: {
                    System.out.println("""
                            15.
                            A. tough-minded,just
                            B. tender-hearted,merciful
                            """);
                    userOption = input.next();
                    if (Objects.equals(userOption, "A")) countA3++;
                    else countB3++;
                    break;
                }
                case 16: {
                    System.out.println("""
                            16.
                            A. preparation,plan ahead
                            B. go with the flow,adapt as you go
                            """);
                    userOption = input.next();
                    if (Objects.equals(userOption, "A")) countA4++;
                    else countB4++;
                    break;
                }
                case 17: {
                    System.out.println("""
                            17.
                            A. active,initiate
                            B. reflective,deliberate
                            """);
                    userOption = input.next();
                    if (Objects.equals(userOption, "A")) countA1++;
                    else countB1++;
                    break;
                }
                case 18: {
                    System.out.println("""
                            18.
                            A. facts,things,"what is"
                            B. ideas,dreams,"what could be",philosophical
                            """);
                    userOption = input.next();
                    if (Objects.equals(userOption, "A")) countA2++;
                    else countB2++;
                    break;
                }
                case 19: {
                    System.out.println("""
                            19.
                            A. matter of fact,issue-oriented
                            B. sensitive,people-oriented,compassionate
                            """);
                    userOption = input.next();
                    if (Objects.equals(userOption, "A")) countA3++;
                    else countB3++;
                    break;
                }
                case 20: {
                    System.out.println("""
                            20.
                            A.control,govern 
                            B. latitude,freedom
                            """);
                    userOption = input.next();
                    if (Objects.equals(userOption, "A")) countA4++;
                    else countB4++;
                    break;
                }

            }

        }

                if (countA1 > countB1) {
                    System.out.print("E");
                } else {
                    System.out.print(" I");
                }
                if (countA2 > countB2) {
                    System.out.print(" S");
                } else {
                    System.out.print(" N");
                }
                if (countA3 > countB3) {
                    System.out.print(" T");
                } else {
                    System.out.print(" F");
                }
                if (countA4 > countB4) {
                    System.out.println("J");
                } else {
                    System.out.println(" P");
                }

            }
        }

