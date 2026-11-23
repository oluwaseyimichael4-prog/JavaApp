import java.util.Scanner;

public class myNokia {
    static Scanner scanner = new Scanner(System.in);
    static boolean returnToHome = false;
    
    //Entry point
    public static void main(String[] args) {
        mainMenu();
        System.out.println("\nExiting Nokia 5510 Menu. Goodbye!");
        scanner.close();
    }

    // Nokia 5510 Main menu Dashboard (Home)
   public static void mainMenu() {
        int choice;
        do {
            returnToHome = false; 
            System.out.println("\nNOKIA 5510 - MAIN MENU");
            System.out.println("1. PHONE BOOK");
            System.out.println("2. MESSAGES");
            System.out.println("3. CHAT");
            System.out.println("4. CALL REGISTER");
            System.out.println("5. TONES");
            System.out.println("6. SETTINGS");
            System.out.println("7. CALL DIVERT¹");
            System.out.println("8. MUSIC");
            System.out.println("9. GAMES");
            System.out.println("10. CALCULATOR");
            System.out.println("11. REMINDERS");
            System.out.println("12. CLOCK");
            System.out.println("13. PROFILES");
            System.out.println("14. SERVICES");
            System.out.println("15. SIM SERVICES");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");
            choice = readInt();

            switch (choice) {
                case 1:
                    phoneBookMenu();
                    break;
                case 2:
                    messagesMenu();
                    break;
                case 3:
                    chatMenu();
                    break;
                case 4:
                    callRegisterMenu();
                    break;
                case 5:
                    tonesMenu();
                    break;
               case 6:
                    settingMenu();
                    break;
               case 7:
                    callDivertMenu();
                    break;
               case 8:
                    musicMenu();
                    break;
               case 9:
                    gamesMenu();
                    break;
               case 10:
                    calculatorMenu();
                    break;
               case 11:
                    remindersMenu();
                    break;
               case 12:
                    clockMenu();
                    break;
               case 13:
                    profilesMenu();
                    break;
              case 14:
                    servicesMenu();
                    break;
              case 15:
                    simServiceMenu();
                    break;      
                case 0:
                    System.out.println("Powering off... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option! Please Try again.");
            }
        } while (choice != 0);
    }
    
//for readInt() adopt in line 37, Crash-Proof Integer Reader -simple helper to avoid crash on wrong input
    static int readInt() {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Enter a number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
    // --- Empty Method Stubs (Prevents Compilation Errors) ---


   // public static void servicesMenu() { System.out.println("Services coming soon..."); }
   // public static void simServiceMenu() { System.out.println("SIM Services coming soon..."); }

    // 1. Phone Book Menu Method
    public static void phoneBookMenu() {
      int choice;
      do {
        System.out.println("\n-- 1. PHONE BOOK --");
        System.out.println("1. Search");
        System.out.println("2. Service Nos.1");
        System.out.println("3. Add name");
        System.out.println("4. Erase");
        System.out.println("5. Edit");
        System.out.println("6. Copy");
        System.out.println("7. Assign tone");
        System.out.println("8. Send b'card");
        System.out.println("9. Options");
        System.out.println("10. Speed dials");
        System.out.println("11. Voice tags");
        System.out.println("0. Back to Home Menu");
        System.out.printf("%nSelect an option: ");
        choice = readInt();
        
        switch (choice) {
            case 1:
                System.out.println("Searching... No contacts found.");
                break;
            case 2:
                System.out.println("Opening... Service Nos.");
                break;
            case 3:
                System.out.println("Opening... Add Name.");
                break;                
            case 4:
                System.out.println("Opening... Erase.");
                break;                
            case 5:
                System.out.println("Opening... Edit.");
                break;                
            case 6:
                System.out.println("Opening... Copy.");
                break;                
            case 7:
                System.out.println("Opening... Assign tone.");
                break;                
            case 8:
                System.out.println("Opening... Send Card");
                break;                
            case 9:
                optionMenu();
                break;                
            case 10:
                System.out.println("Opening Speed dials...");
                break;                
            case 11:
                System.out.println("Opening... Voice tags.");
                break;                             
            case 0:
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
      } while (choice != 0 && !returnToHome);
    }

    // Method 4 case 9 --OPTIONS Sub-Menu (Under Phone Book)
    static void optionMenu() {
      int choice;
      do {
          System.out.println("\n--- 9. OPTIONS ---");
          System.out.println("1. Memory in use");
          System.out.println("2. Type of view");
          System.out.println("3. Memory status");
          System.out.println("0. Back to Phone Book");
          System.out.println("99. Home Menu");
          System.out.printf("%nSelect an option: ");
          choice = readInt();
          
          switch (choice) {
            case 1:  System.out.println("Viewing Memory in use..."); break;
            case 2:  System.out.println("Selecting Type of view..."); break;
            case 3:  System.out.println("Checking Memory status..."); break;
            case 0:  break;
            case 99:
              returnToHome = true;
              break;
            default:
              System.out.println("invalid option. please try again.");
          }
      } while (choice != 0 && !returnToHome);
    }
   
   
 // // // 2, MESSAGE Method Main-Menu    
    static void messagesMenu() {
      int choice;
      do {
          System.out.println("\n--- 2. MESSAGES ---");
          System.out.println("1. Write messages");
          System.out.println("2. Inbox");
          System.out.println("3. Outbox");
          System.out.println("4. Picture messages");
          System.out.println("5. Templates");
          System.out.println("6. Smiley");
          System.out.println("7. Message settings");
          System.out.println("8. info Service");
          System.out.println("9. Voice mailbox number");
          System.out.println("10. Service command editor");
          System.out.println("0. Back to Main Menu");
          System.out.println("99. Home Menu");
          System.out.print("Select an option: ");
          choice = readInt();
          
          switch (choice) {
            case 1:  System.out.println("Opening messages..."); break;
            case 2:  System.out.println("Opening inbox..."); break;
            case 3:  System.out.println("Opening outbox..."); break;
            case 4:  System.out.println("Pic messages..."); break;
            case 5:  System.out.println("Templates"); break;
            case 6:  System.out.println("Smiley"); break;
            case 7:  mesSettingsMenu(); break;
            case 8:  System.out.println("info Service"); break;
            case 9:  System.out.println("Voice mailbox number"); break;
            case 10:  System.out.println("Service command editor"); break;
            case 0:
              break;
            case 99:  returnToHome = true;
              break;
              default:
                    System.out.println("Invalid option. Please try again.");
              }
          } while (choice != 0 && !returnToHome);
    }
    
    // Method for case 7 --Message setting Sub-Menu (Under Message)
    static void mesSettingsMenu() {
      int choice;
      do {
          System.out.println("\n--- 7. MESSAGE SETTINGS ---");
          System.out.println("1. Set 1");
          System.out.println("2. Common");
          System.out.println("0. Back to Phone Book");
          System.out.println("99. Home Menu");
          System.out.printf("%nSelect an option: ");
          choice = readInt();
          
          switch (choice) {
            case 1:  set1Menu(); break;
            case 2:  commonMenu(); break;
            case 0:  
              break;
            case 99:
              returnToHome = true;
              break;
            default:
              System.out.println("invalid option. please try again.");
          }
      } while (choice != 0 && !returnToHome);
    }
    
    // Method for case 1 Set 1 --Message setting main-Menu (Under Message)
    static void set1Menu() {
      int choice;
      do {
          System.out.println("\n---- 1. SET 1 ----");
          System.out.println("1. Message centre number");
          System.out.println("2. Messages sent as");
          System.out.println("3. Messages validity");
          System.out.println("0. Back to Message Settings");
          System.out.println("99. Home Menu (Main Menu)");
          System.out.print("Select an option: ");
          choice = readInt();
          
          switch (choice) {
            case 1:  System.out.println("Setting Message centre number..."); break;
            case 2:  System.out.println("Setting Messages sent as..."); break;
            case 3:  System.out.println("Setting Messages validity..."); break;
            case 0:
              break;
            case 99:
            returnToHome = true;
              break;
            default:
            System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 0 && !returnToHome);
    }
    
    // Method for case 2 Common --Message setting main-Menu (Under Message)
    static void commonMenu() {
      int choice;
      do {
          System.out.println("\n---- 2. COMMON ----");
          System.out.println("1. Delivery reports");
          System.out.println("2. Reply via same centre");
          System.out.println("3. Character support");
          System.out.println("0. Back to Message Settings");
          System.out.println("99. Home Menu");
          System.out.print("Select an option: ");
          choice = readInt();
          
          switch (choice) {
            case 1:  System.out.println("Setting Message centre number..."); break;
            case 2:  System.out.println("Setting Messages sent as..."); break;
            case 3:  System.out.println("Setting Messages validity..."); break;
            case 0:
              break;
            case 99:
            returnToHome = true;
              break;
            default:
            System.out.println("Invalid option. Please try again.");
          }
        } while (choice != 0 && !returnToHome);
    }
    
     // // // 3, CHAT Method Main-Menu 
     static void chatMenu() {
       int choice;
       do {
          System.out.println("\n--- 3. CHAT ---");
          System.out.println("0. Back to Main Menu");
          System.out.println("Select an option: ");
          choice = readInt();
          
          switch (choice) {
            case 0:
            returnToHome = true;
              break;
            default:
            System.out.println("Connection Error, try later");
          }
        } while (choice != 0);   
     }
     
     
     // // // 4, CALL REGISTER Method Main-Menu 
     static void callRegisterMenu() {
      int choice;
      do {
          System.out.println("\n--- 4. CALL REGISTER ---");
          System.out.println("1. Missed calls");
          System.out.println("2. Received calls");
          System.out.println("3. Dialled numbers");
          System.out.println("4. Erase recent call lists");
          System.out.println("5. Show call duration");
          System.out.println("6. Show call cost");
          System.out.println("7. Call cost settings");
          System.out.println("0. Back to Main Menu");
          System.out.print("Select an option: ");
          choice = readInt();
          
          switch (choice) {
            case 1:  System.out.println("Missed calls..."); break;
            case 2:  System.out.println("Received calls..."); break;
            case 3:  System.out.println("Dialled numbers..."); break;
            case 4:  System.out.println("Erase recent call lists..."); break;
            case 5:  callDuration(); break;
            case 6:  callCost(); break;
            case 7:  callSetting(); break;
            case 0:
              break;
            default:
            System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 0 && !returnToHome);
    }  
    
     // Method for case 5 Show call duration --CALL REGISTER main-Menu 
    static void callDuration() {
      int choice;
      do {
          System.out.println("\n---- 5. SHOW CALL DURATION ----");
          System.out.println("1. Last call duration");
          System.out.println("2. All calls' duration");
          System.out.println("3. Received calls' duration");
          System.out.println("4. Dialled calls' duration");
          System.out.println("5. Clear counters");
          System.out.println("0. Back to call register");
          System.out.println("99. Home Menu");
          System.out.println("Select an option: ");
          choice = readInt();
          
          switch (choice) {
            case 1:  System.out.println("loading Message centre number..."); break;
            case 2:  System.out.println("loading All calls' duration..."); break;
            case 3:  System.out.println("loading Received calls' duration..."); break;
            case 4:  System.out.println("loading Dialled calls' duration..."); break;
            case 5:  System.out.println("Clearing counters..."); break;
            case 0:
              break;
            case 99:
            returnToHome = true;
              break;
            default:
            System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 0 && !returnToHome);
    }
    
    // Method for case 6 Show call cost --CALL REGISTER main-Menu 
    static void callCost() {
      int choice;
      do {
          System.out.println("\n---- 5. SHOW CALL COSTS ----");
          System.out.println("1. Last call cost");
          System.out.println("2. All calls' cost");
          System.out.println("3. Clear counters");
          System.out.println("0. Back to call register");
          System.out.println("99. Home Menu");
          System.out.println("Select an option: ");
          choice = readInt();
          
          switch (choice) {
            case 1:  System.out.println("loading Last call..."); break;
            case 2:  System.out.println("loading All calls..."); break;
            case 3:  System.out.println("loading Clear counters..."); break;
            case 0:
              break;
            case 99:
            returnToHome = true;
              break;
            default:
            System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 0 && !returnToHome);
    }
    
    // Method for case 7 Show call cost --CALL REGISTER main-Menu 
    static void callSetting() {
      int choice;
      do {
          System.out.println("\n---- 7. CALL COST SETTINGS ----");
          System.out.println("1. Call cost limit");
          System.out.println("2. Show costs in");
          System.out.println("0. Back to call register");
          System.out.println("99. Home Menu");
          System.out.println("Select an option: ");
          choice = readInt();
          
          switch (choice) {
            case 1:  System.out.println("setting .Call cost limit..."); break;
            case 2:  System.out.println("setting Show costs in..."); break;
            case 0:
              break;
            case 99:
            returnToHome = true;
              break;
            default:
            System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 0 && !returnToHome);
    }
    
    // // // 5 TONES Method Main-Menu 
    static void tonesMenu() {
      int choice;
      do {
          System.out.println("\n--- 5. TONES ---");
          System.out.println("1. Ringing tone");
          System.out.println("2. Ringing volume");
          System.out.println("3. Incoming call alert");
          System.out.println("4. Message alert tone");
          System.out.println("5. Keypad tones");
          System.out.println("6. Warning tones");
          System.out.println("7. Vibrating alert");
          System.out.println("8. Screen saver");
          System.out.println("0. Back to Home Menu");
          System.out.println("Select an option: ");
          choice = readInt();
          
          switch (choice) {
          case 1:  System.out.println("activating Ringing tone..."); break;
          case 2:  System.out.println("activating Ringing volume ..."); break;
          case 3:  System.out.println("activating Incoming call..."); break;
          case 4:  System.out.println("activating Message alert tone.."); break;
          case 5:  System.out.println("activating Keypad tones..."); break;
          case 6:  System.out.println("activating Warning tones..."); break;
          case 7:  System.out.println("activating Vibrating alert..."); break;
          case 8:  System.out.println("loading Screen saver..."); break;
          case 0:
            break;
          default:
            System.out.println("Invalid option. Please try again.");
          }
        } while (choice != 0 && !returnToHome);
    }
    
    
    // // // 6, SETTINGS Method Main-Menu 
     static void settingMenu() {
      int choice;
      do {
          System.out.println("\n--- 6. SETTINGS ---");
          System.out.println("1. Call settings");
          System.out.println("2. Phone settings");
          System.out.println("3. Security settings");
          System.out.println("4. Restore factory settings");
          System.out.println("0. Back to Main Menu");
          System.out.print("Select an option: ");
          choice = readInt();
          
          switch (choice) {
            case 1:  callSettings(); break;
            case 2:  phoneSetting(); break;
            case 3:  securitySetting(); break;
            case 4:  System.out.println("Restore factory settings..."); break;
            case 0:
              break;
            default:
            System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 0 && !returnToHome);
    }  
    
    // Method for case 1 Call settings --SETTINGS sub-Menu 
    static void callSettings() {
      int choice;
      do {
          System.out.println("\n---- 1. CALL SETTINGS ----");
          System.out.println("1. Automatic redial");
          System.out.println("2. Speed dialling");
          System.out.println("3. Call waiting options");
          System.out.println("4. Own number sending");
          System.out.println("5. Phone line in use");
          System.out.println("6. Automatic answer");
          System.out.println("0. Back to Settings");
          System.out.println("99. Home Menu");
          System.out.println("Select an option: ");
          choice = readInt();
          
          switch (choice) {
            case 1:  System.out.println("initializing redial..."); break;
            case 2:  System.out.println("initializing Speed dialling..."); break;
            case 3:  System.out.println("initializing call waiting..."); break;
            case 4:  System.out.println("initializing self no..."); break;
            case 5:  System.out.println("initializing line in..."); break;
            case 6:  System.out.println("initializing auto answer..."); break;
            case 0:
              break;
            case 99:
            returnToHome = true;
              break;
            default:
            System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 0 && !returnToHome);
    }
    
    // Method for case 2 Phone settings --SETTINGS sub-Menu 
    static void phoneSetting() {
      int choice;
      do {
          System.out.println("\n---- 2. PHONE SETTINGS ----");
          System.out.println("1. Language");
          System.out.println("2. Cell info display");
          System.out.println("3. Welcome note");
          System.out.println("4. Network selection");
          System.out.println("5. Confirm SIM service actions");
          System.out.println("0. Back to Settings");
          System.out.println("99. Home Menu");
          System.out.println("Select an option: ");
          choice = readInt();
          
          switch (choice) {
            case 1:  System.out.println("initializing Language..."); break;
            case 2:  System.out.println("initializing CID..."); break;
            case 3:  System.out.println("initializing..."); break;
            case 4:  System.out.println("initializing Network..."); break;
            case 5:  System.out.println("initializing SIM service..."); break;
            case 0:
              break;
            case 99:
            returnToHome = true;
              break;
            default:
            System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 0 && !returnToHome);
    }
    
    // Method for case 3 Security settings --SETTINGS sub-Menu 
    static void securitySetting() {
      int choice;
      do {
          System.out.println("\n---- 3. SECURITY SETTINGS ----");
          System.out.println("1. PIN code request");
          System.out.println("2. Call barring service");
          System.out.println("3. Fixed dialling");
          System.out.println("4. Closed user group");
          System.out.println("5. Security level");
          System.out.println("6. Change access codes");
          System.out.println("0. Back to Settings");
          System.out.println("99. Home Menu");
          System.out.println("Select an option: ");
          choice = readInt();
          
          switch (choice) {
            case 1:  System.out.println("initializing PIN..."); break;
            case 2:  System.out.println("initializing Call barring.."); break;
            case 3:  System.out.println("initializing fixed dialling..."); break;
            case 4:  System.out.println("Closing..."); break;
            case 5:  System.out.println("initializing Security level..."); break;
            case 6:  System.out.println("initializing Access codes..."); break;
            case 0:
              break;
            case 99:
            returnToHome = true;
              break;
            default:
            System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 0 && !returnToHome);
    }
    
    
    // // // 7, CALL DIVERT¹ Method Main-Menu 
     static void callDivertMenu() {
       int choice;
       do {
          System.out.println("\n--- 7. CALL DIVERT ---");
          System.out.println("0. Back to Main Menu");
          System.out.println("Select an option: ");
          choice = readInt();
          
          switch (choice) {
            case 0:
              break;
          default:
            System.out.println("Connection Error, try later");
            }
        } while (choice != 0);   
     }
    
    
    // // // 8, MUSIC Method Main-Menu 
      static void musicMenu() {
      int choice;
      do {
          System.out.println("\n--- 8. MUSIC ---");
          System.out.println("1. Music player");
          System.out.println("2. Radio");
          System.out.println("3. Recorder");
          System.out.println("4. Track list");
          System.out.println("0. Back to Main Menu");
          System.out.println("Select an option: ");
          choice = readInt();
          
          switch (choice) {
            case 1:  System.out.println("Opening Music player..."); break;
            case 2:  System.out.println("Opening Radio..."); break;
            case 3:  System.out.println("Opening Recorder..."); break;
            case 4:  System.out.println("Opening Track list..."); break;
            case 0:
              break;
            default:
            System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 0);
    }
    
      // // // 9, GAME Method Main-Menu 
     static void gamesMenu() {
       int choice;
       do {
          System.out.println("\n--- 9. GAMES ---");
          System.out.println("No Game yet");
          System.out.println("0. Back to Main Menu");
          System.out.println("Select an option: ");
          choice = readInt();
          
          switch (choice) {
            case 0:
              break;
          default:
            System.out.println("Invalid option. Try later");
            }
        } while (choice != 0);   
     }
    
            // // // 10, CALCULATOR Method Main-Menu 
     static void calculatorMenu() {
       int choice;
       do {
          System.out.println("\n--- 10. CALCULATOR ---");
          System.out.println("0. Back to Main Menu");
          System.out.println("Select an option: ");
          choice = readInt();
          
          switch (choice) {
            case 0:
              break;
          default:
            System.out.println("Invalid option. Try later");
            }
        } while (choice != 0);   
     }
     
            // // // 12, REMINDERS Method Main-Menu 
     static void remindersMenu() {
       int choice;
       do {
          System.out.println("\n--- 10. REMINDERS---");
          System.out.println("0. Back to Main Menu");
          System.out.println("Select an option: ");
          choice = readInt();
          
          switch (choice) {
            case 0:
              break;
          default:
            System.out.println("Invalid option. Try later");
            }
        } while (choice != 0);   
     }
      
      
      // // // 12, CLOCK Method Main-Menu 
      static void clockMenu() {
      int choice;
      do {
          System.out.println("\n--- 8. CLOCK ---");
          System.out.println("1. Alarm clock");
          System.out.println("2. Clock settings");
          System.out.println("3. Date setting");
          System.out.println("4. Stopwatch");
          System.out.println("5. Countdown timer");
          System.out.println("6. Auto update of date and time");
          System.out.println("0. Back to Main Menu");
          System.out.println("Select an option: ");
          choice = readInt();
          
          switch (choice) {
            case 1:  System.out.println("Opening Alarm clock..."); break;
            case 2:  System.out.println("Opening Clock settings..."); break;
            case 3:  System.out.println("Opening Date setting..."); break;
            case 4:  System.out.println("Opening Stopwatch..."); break;
            case 5:  System.out.println("Opening Countdown timer..."); break;
            case 6:  System.out.println("Opening Auto update of date and time..."); break;
            case 0:
              break;
            default:
            System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 0);
    }
    
       // // // 13, PROFILES Method Main-Menu 
     static void profilesMenu() {
       int choice;
       do {
          System.out.println("\n--- 13. PROFILES ---");
          System.out.println("0. Back to Main Menu");
          System.out.println("Select an option: ");
          choice = readInt();
          
          switch (choice) {
            case 0:
              break;
          default:
            System.out.println("Invalid option. Try later");
            }
        } while (choice != 0);   
     }
    
      // // // 14, SERVICES Method Main-Menu 
     static void servicesMenu() {
       int choice;
       do {
          System.out.println("\n--- 14. SERVICES ---");
          System.out.println("0. Back to Main Menu");
          System.out.println("Select an option: ");
          choice = readInt();
          
          switch (choice) {
            case 0:
              break;
          default:
            System.out.println("Invalid option. Try later");
            }
        } while (choice != 0);   
     }
     
      // // // 15, SIM SERVICES Method Main-Menu 
     static void simServiceMenu() {
       int choice;
       do {
          System.out.println("\n--- 15. SIM SERVICES ---");
          System.out.println("0. Back to Main Menu");
          System.out.println("Select an option: ");
          choice = readInt();
          
          switch (choice) {
            case 0:
              break;
          default:
            System.out.println("Invalid option. Try later");
            }
        } while (choice != 0);   
     }
    
    
    
    
}






