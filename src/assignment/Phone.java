package assignment;

import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                ->Nokia 3310
                ->press 1 for PhoneBook Menu
                ->press 2 for messages Menu
                ->press 3 for Chat
                ->press 4 for Call Register
                ->press 5 for Tones
                ->press 6 for Settings
                ->press 7 for Call Divert
                ->press 8 for Games
                ->press 9 for Calculator
                ->press 10 for Reminders
                ->press 11 for Menu
                ->press 12 for Profile
                ->press 13 for Sim Services
                ->press 0 to SwitchOff
                                 
                """);
        System.out.println("enter a number");
        int nokia3310 = input.nextInt();
        switch (nokia3310) {
            case 1:
                System.out.println("""
                        1 ->search;
                        2->services Nos;
                        3->Add name;
                        4->Erase;
                        5->Edit;
                        6-> Assign Tone;
                        7->send b'card;
                        8->option;
                        9->speed dials;
                        10->Voice tags;
                        default->invalid input;
                                        
                        """);
                int option = input.nextInt();
                switch (option) {
                    case 8:
                        System.out.println("""
                                1->Type of view
                                2->Memory Status
                                """);
                        break;
                }
                break;
        }

        switch (nokia3310) {
            case 2:
                System.out.println("""
                        1.Write message
                        2.Inbox
                        3.Outbox
                        4.Picture messages
                        5.Templates
                        6.Smileys
                        7.Message Settings
                        8.info Service
                        9.Voice mailbox number
                        10.Service command editor 
                                   
                         """);

                int messageSettings = input.nextInt();
                switch (messageSettings) {
                    case 7:
                       System.out.println("""
                                1->Set1^2
                                2->common^3
                                                        
                                """);

                        int set1 = input.nextInt();
                        switch (set1) {
                            case 1:
                                System.out.println("""
                                         1->Message centre number
                                         2-> Message sent as 
                                         3-> Message Validity
                                           
                                        """);
                                break;
                        }
                                int common = input.nextInt();
                            switch (common) {
                                case 2:
                                    System.out.println("""
                                            case 1->Delivery Report
                                            case 2->Reply via same centre
                                            case 3->Character support
                                                                     
                                             """);
                            }    break;

                }
                break;
        }

        switch (nokia3310) {
            case 3:
                System.out.println("""
                        Chat
                        """);
                break;
        }
        switch (nokia3310) {
            case 4:
                System.out.println("""
                        1.Missed calls
                        2.Received calls
                        3.Dialled numbers
                        4.Erase recent call lists
                        5.Show call duration
                        6.Show call costs
                        7.Call cost settings
                        8.Prepaid credit
                                            
                          """);
                int showCallDuration = input.nextInt();
                switch (showCallDuration) {
                    case 5:
                        System.out.println("""
                                1->Last call duration
                                2->All calls' duration
                                3->Received calls' duration
                                4->Dialled calls' duration
                                5->Clear timers
                                                        
                                """);
                        break;
                }
                int showCallCosts = input.nextInt();
                switch (showCallCosts) {
                    case 6:
                        System.out.println("""
                                1->Last call cost
                                2->All calls' cost
                                3->Clear counters
                                                                        
                                                       
                                """);
                        break;
                }
                int callCostSettings = input.nextInt();
                switch (callCostSettings) {
                    case 7:
                        System.out.println("""
                                1->Call cost limit
                                2->Show costs in
                                                                        
                                """);
                        break;
                }
                break;
        }

        switch (nokia3310) {
            case 5:
                System.out.println("""
                        1.Ringing tone
                        2.Ringing volume
                        3.Incoming call alert
                        4.Composer
                        5.Message alert tone
                        6.Keypad tones
                        7.Warning and game tones
                        8.Vibrating alert
                        9.Screensaver
                                                        
                        """);
                break;
        }


                switch (nokia3310) {
                    case 6:
                        System.out.println("""
                                1.Call settings
                                2.Phone settings
                                3.Security settings
                                4.Restore factory settings
                                                 
                                """);

                        int callSettings = input.nextInt();
                        switch (callSettings) {
                            case 1:
                                System.out.println("""
                                        1->Automatic redial
                                        2->Speed dialing
                                        3->Call waiting options
                                        4->Own number sending
                                        5->Phone line in use
                                        6->Automatic answer
                                                                
                                        """);
                        }
                        int phoneSettings = input.nextInt();
                        switch (phoneSettings) {
                            case 2:
                                System.out.println("""
                                        1->Language
                                        2->Cell info display
                                        3->Welcome note
                                        4->Network selection
                                        5->Lights^2
                                        6->Confirm SIM service actions
                                            
                                        """);
                                break;
                        }
                        int securitySettings = input.nextInt();
                        switch (securitySettings){
                        case 3:
                        System.out.println("""
                                1->Pin code request
                                2->Call barring Service
                                3->Fixed dialing
                                4->Closed user group
                                5->Phone security
                                6->Change access codes
                                                        
                                """);
                        break;
                }}
                if (nokia3310 == 7) {
                    System.out.println("""
                                       Call divert
                                       """);
                }
                if (nokia3310 == 8) {
                    System.out.println("""
                                       Games
                                       """);
                }
                if (nokia3310 == 9) {
                    System.out.println("""
                                       Calculator
                                       """);
                }
                if (nokia3310 == 10) {
                    System.out.println("""
                                       Reminders
                                       """);

                }


                switch (nokia3310) {
                    case 11:
                        System.out.println("""
                                1.Alarm clock
                                2.Clock settings
                                3.Date settings
                                4.Stopwatch
                                5.Countdown timer
                                6.Auto update of date and time
                                    
                                """);
                        break;
                }
                if (nokia3310 == 12) {
                    System.out.println("""
                                       Profiles
                                       """);
                }
                if (nokia3310 == 13) {
                    System.out.println("""
                                       Sim services^3
                                       """);
                }

        }

    }






