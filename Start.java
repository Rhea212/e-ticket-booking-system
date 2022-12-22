
import java.util.*;
import java.util.Date;

public class Start
{
    static Scanner sc=new Scanner(System.in);
    static Scanner cs=new Scanner(System.in);
    static char go;
    static int sel=0, tr_no,totalamt,adult,child;
    static String cla,tr_name;

    public static void main(String args[])
    {
        welcome();
        begin();
    }

    public static void welcome()
    {

        System.out.println("\t\t\t\t\t\t\t>>>>>Welcome to<<<<<");
        System.out.println();
        System.out.println("\t\t\t\t\t ▄█     ▄████████  ▄████████     ███      ▄████████ ");
        System.out.println("\t\t\t\t\t███    ███    ███ ███    ███ ▀█████████▄ ███    ███ ");
        System.out.println("\t\t\t\t\t███▌   ███    ███ ███    █▀     ▀███▀▀██ ███    █▀ ");
        System.out.println("\t\t\t\t\t███▌  ▄███▄▄▄▄██▀ ███            ███   ▀ ███           ");
        System.out.println("\t\t\t\t\t███▌ ▀▀███▀▀▀▀▀   ███            ███     ███         ");
        System.out.println("\t\t\t\t\t███  ▀███████████ ███    █▄      ███     ███    █▄  ");
        System.out.println("\t\t\t\t\t███    ███    ███ ███    ███     ███     ███    ███ ");
        System.out.println("\t\t\t\t\t█▀     ███    ███ ████████▀     ▄████▀   ████████▀  ");
        System.out.println("\t\t\t\t\t       ███    ███        ");
        System.out.println();
        System.out.println("\t\t\t\t\t(Indian Railway Catering and Tourism Corporation Ltd.)");
        System.out.println("\t\t\t\t\t\tSafety | Security | Punctuality |");
        System.out.println();
        System.out.println("Press z to continue");
        go=sc.next().charAt(0);
        if(go=='z')
        {
            begin();
        }
        else
        {
            System.out.println("\fInvalid choice....try again");

            welcome();
        }

    }

    public static boolean check(int a,int b)
    {
        if(a>=1&&a<=b)
        {
            return true;
        }
        else
        {
            System.out.println("Invalid choice..try again..");
            System.out.println("There are only "+b+" options");
            sc.nextLine();
            return false;
        }
    }

    public static void begin()
    {
        while(true)
        {
            System.out.println();
            System.out.println("1.Trains");
            System.out.println("2.Holidays");
            System.out.println("3.About e-catering");

            System.out.println("4.Exit..");
            System.out.println("Make your selection");
            sel=sc.nextInt();
            if(check(sel,4)==true)
            {
                break;
            }
            else
            {

                System.out.println(" Press enter to continue..");
                sc.nextLine();
            }
        }

        if(sel==1)
        {
            trains();
        }
        else if(sel==2)
        {
            Holidays();
        }

        else if(sel==3)
        {
            e_cater();
        }

        else if(sel==4)
        {
            System.exit(0);

        }

    }

    public static void trains()
    {
        while(true)
        {
            System.out.println("1.Book Ticket");

            System.out.println("2.Return");
            System.out.println("Make your selection");
            sel =sc.nextInt();
            if(check(sel,3)==true)
            {
                break;
            }
            else
            {

                System.out.println(" Press enter to continue..");
                sc.nextLine();
            }
        }
        if(sel==1)
        {
            train();
        }
        if(sel==2)
        {
            begin();
        }
    }

    public static void Holidays()
    {

        String s="\f\t\t\t\t\t~>>Special Train: The Maharajas' Express<<~\n\n\t\t\t\tWelcome aboard the Maharajas' Express, bestowed the \"World's Leading Luxury\n\t\t\t\tTrain\" award at the World Travel Awards for five consecutive years from 2012 to\n\t\t\t\t2016. The Maharajas' Express has redefined the luxury travel experience by offering\n\t\t\t\tguests the opportunity to explore fabled destinations providing a glimpse of rich\n\t\t\t\tcultural heritage of Incredible India which will leave you with fond memories of this\n\t\t\t\ttrain journey to be cherished.\n\n\t\t\t\tThe luxuries include:\n\t\t\t\t-Restauraunts\n\t\t\t\t-Lounge Bar\n\t\t\t\t-Deluxe Cabin";

        for(int i=0;i<s.length();i++)
        {
            for(double c=0;c<=10000000;c++)
            {
            }
            System.out.print(s.charAt(i));
        }
        System.out.println();
        System.out.println();
        System.out.println("Press z to return");
        go=sc.next().charAt(0);
        if(go=='z')
        {
            begin();
        }
        else
        {
            System.out.println("You chose wrongly.");
            sc.nextLine();
            sc.nextLine();

            Holidays();
        }

    }

    public static void e_cater ()
    {
        String s="\f\t\t\t\t\t\t!!Get Good Food Delivery in Train!!\n\nIRCTC is a mini ratna PSU of Indian Railways. To provide quality and variety in food to railway passengers, the ecatering scheme has been \nstarted. With ecatering scheme, passengers now have the freedom to order food of their choice.\nIRCTC is the official agency for this scheme which it runs through its authorized partners. Passengers can order food on any of the stations.\nFew of the major stations where passengers avail ecatering are as Mumbai Central (BCT) , Chatrapati Shivaji Terminal (CST),\nNew Delhi Railway Station (NDLS), Old Delhi Railway Station(DEL), Bangalore City Junction (SBC), Chennai Central (MAS), \nKanpur (CNB), Allahabad Junction (ALD), Varanasi (BSB), Lucknow (LKO), Itarasi (ET), Bhopal Junction (BPL), Vijaywada(BZA) etc.\nFrom a simple combo of daal, roti, and chawal to Mughlai biryani and delicious pizzas, passengers can exercise their freedom and delve\ninto yummy food in Indian railways.\n\nOur valued partners are:\n-Domino's\n-Comesum\n-Zoop\n-Railrestro\n-Rel Food\n-Garg Rajdhani Online Food\n\nTo enjoy this facility, download the IRCTC eCatering - Food on Track app";
        for(int i=0;i<s.length();i++)
        {
            for(double c=0;c<=10000000;c++)
            {
            }
            System.out.print(s.charAt(i));
        }
        System.out.println();
        System.out.println();
        System.out.println("Press z to return");
        go=sc.next().charAt(0);
        if(go=='z'|| go=='Z')
        {
            begin();
        }
        else
        {
            System.out.println("Invalid choice.");
            sc.nextLine();
            sc.nextLine();
            e_cater();
        }
    }

    public static void train()
    {
        while(true)
        {
            System.out.println("1.North");
            System.out.println("2.South");
            System.out.println("3.Return");
            System.out.println("Where do you want to travel?(1/2)");
            sel=sc.nextInt();
            if(check(sel,4)==true)
            {
                break;
            }
            else
            {

                System.out.println(" Press enter to continue..");
                sc.nextLine();
            }
        }
        if(sel==1)
        {
            System.out.println("\fAvailable trains include:\nMumbai Rajdhani\t\t12951\nDehradhun Express\t12687\nGaribrath\t\t12216");

            System.out.println("----------------------------------------------------------------------------------------------------------------------------");
            System.out.println("The following table gives comparative details of each train.");
            System.out.println("Name\t\t\t\tDays\t\t\tBoarding Station\tDestination Station");
            System.out.println("Mumbai Rajdhani\t\tall days\t\tMumbai Central\t\tNew Delhi");
            System.out.println("Dehradhun Express\tWed,Sun\t\t\tMadurai JN\t\t\tChandigarh");
            System.out.println("Garibrath\t\t\tTue,Wed,Fri,Sun\tBandra Terminus\t\tDelhi S Rohilla");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------");
            System.out.println("The following table shows the fare for adult and child in the various classes");
            System.out.println("Name\t\t\t\t3A\t\t\t2A\t\t\tFC");
            System.out.println("Mumbai Rajdhani\t\t1624\t\t2367\t\t4093");
            System.out.println("Dehradhun Express\t1867\t\t2767\t\t4807");
            System.out.println("Garibrath\t\t\t443");
            System.out.println();
            System.out.println(" Press z to return or press x to proceed with finalizing the train and class");
            go=sc.next().charAt(0);
            if(go=='z')
            {
                trains();
            }
            else if(go=='x')
            {
                System.out.println("\nEnter train number");
                tr_no=sc.nextInt();
                System.out.println("Enter the type of class you want to travel in (Classes include AC 3-tier(3A), AC 2-tier(2A) and First Class(FC))");
                cla=cs.nextLine();
                System.out.println("Enter number of adults travelling");
                adult=sc.nextInt();
                System.out.println("Enter number of childern travelling");
                child=sc.nextInt();
                if(tr_no==12951)
                {
                    if(cla.equalsIgnoreCase("3A"))
                    {

                        totalamt=adult*1624+child*1624;
                    }
                    else if(cla.equalsIgnoreCase("2A"))
                    {
                        totalamt=adult*2367+child*2367;
                    }
                    else if(cla.equalsIgnoreCase("FC"))
                    {
                        totalamt=adult*4093+child*4093;
                    }
                    tr_name="Mumbai Rajdhani";
                }
                else if(tr_no==12687)
                {
                    if(cla.equalsIgnoreCase("3A"))
                    {
                        totalamt=adult*1867+child*1867;
                    }
                    else if(cla.equalsIgnoreCase("2A"))
                    {
                        totalamt=adult*2767+child*2767;
                    }
                    else if(cla.equalsIgnoreCase("FC"))
                    {
                        totalamt=adult*4807+child*4807;
                    }
                    tr_name="Dehradhun Express";
                }
                else if(tr_no==12216)
                {
                    if(cla.equalsIgnoreCase("3A"))
                    {
                        totalamt=adult*443+child*443;
                    }
                    else
                    {
                        System.out.println("Sorry, this class is not available.Press enter to go back and try again.");
                        sc.nextLine();
                        sc.nextLine();
                        train();
                    }
                    tr_name="Garibrath";
                }
                else
                {
                    System.out.println("Invalid train number. Kindly choose a train from the ones mentioned in the \"Available Trains\" section");
                    sc.nextLine();
                    sc.nextLine();
                    trains();
                }
            }
            else
            {
                System.out.println("Invalid choice. Press enter to go back and try again.");
                sc.nextLine();
                sc.nextLine();
                begin();
            }
            System.out.println("Press enter to continue");
            sc.nextLine();
            sc.nextLine();
            bookFinal();
        }
        if(sel ==2)
        {
            System.out.println("\fAvailable trains include:\nKanyakumari Express\t\t16381\nShatabdi Express\t\t12028\nRajdhani Express\t\t12432");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------");
            System.out.println("The following table gives comparative details of each train.");
            System.out.println("Name\t\t\t\t\tDays\t\t\t\t\t\tBoarding Station\t\tDestination Station");
            System.out.println("Kanyakumari Express\t\tall days\t\t\t\t\tCST\t\t\t\t\t\tKanyakumari");
            System.out.println("Shatabdi Express\t\tMon,Wed,Thurs,Fri,Sat,Sun\tKSR Bengaluru\t\t\tChennai Central");
            System.out.println("Rajdhani Express\t\tTue,Wed,Sun\t\t\t\t\tH Nizamuddin\t\t\tTrivandrum CNTL");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------");
            System.out.println("The following table shows the fare for adult and child in the various classes");
            System.out.println("Name\t\t\t\t3A\t\t\t2A\t\t\tFC");
            System.out.println("Kanyakumari Express\t1845\t\t2740");
            System.out.println("Shatabdi Express\t504");
            System.out.println("Rajdhani Express\t2537\t\t3810\t\t6665");
            System.out.println();
            System.out.println(" Press z to return or press x to proceed with finalizing the train and class");
            go=sc.next().charAt(0);
            if(go=='z')
            {
                trains();
            }
            else if(go=='x')
            {
                System.out.println("\nEnter train number");
                tr_no=sc.nextInt();
                System.out.println("Enter the type of class you want to travel in (Classes include AC 3-tier(3A), AC 2-tier(2A) and First Class(FC))");
                cla=cs.nextLine();
                System.out.println("Enter number of adults travelling");
                adult=sc.nextInt();
                System.out.println("Enter number of childern travelling");
                child=sc.nextInt();
                if(tr_no==16381)
                {
                    if(cla.equalsIgnoreCase("3A"))
                    {
                        totalamt=adult*1845+child*1845;
                    }
                    else if(cla.equalsIgnoreCase("2A"))
                    {
                        totalamt=adult*2740+child*2740;
                    }
                    else
                    {
                        System.out.println("Sorry, this class is not available.Press enter to go back and try again.");
                        sc.nextLine();
                        sc.nextLine();
                        train();
                    }
                    tr_name="Kanyakumari Express";
                }
                else if(tr_no==12028)
                {
                    if(cla.equalsIgnoreCase("3A"))
                    {
                        totalamt=adult*504+child*504;
                    }
                    else
                    {
                        System.out.println("Sorry, this class is not available. Press enter to go back and try again.");
                        sc.nextLine();
                        sc.nextLine();
                        train();
                    }
                    tr_name="Shatabdi Express";
                }
                else if(tr_no==12432)
                {
                    if(cla.equalsIgnoreCase("3A"))
                    {
                        totalamt=adult*2537+child*2537;
                    }
                    else if(cla.equalsIgnoreCase("2A"))
                    {
                        totalamt=adult*3810+child*3810;
                    }
                    else if(cla.equalsIgnoreCase("FC"))
                    {
                        totalamt=adult*6665+child*6665;
                    }
                    tr_name="Rajdhani Express";
                }
                else
                {
                    System.out.println("Invalid train number. Kindly choose a train from the ones mentioned in the \"Available Trains\" section.\nPress enter to go continue.");
                    sc.nextLine();
                    sc.nextLine();
                    trains();
                }
            }
            else
            {
                System.out.println("Invalid choice. Press enter to go back and try again.");
                sc.nextLine();
                sc.nextLine();
                begin();
            }
            if(sel==3)
            {
                trains();
            }
            System.out.println("Press enter to continue");
            sc.nextLine();
            sc.nextLine();
            bookFinal();
        }
    }

    public static void bookFinal()
    {
        System.out.println("\fEnter date of journey (e.g. 21-Feb-2019)");
        String date= cs.nextLine();
        System.out.println("Enter your quota (Quotas include General, Tatkal and Ladies)");
        String quota=cs.next();
        Scanner b=new Scanner(System.in);
        System.out.println("Enter boarding station");
        String b_station=b.nextLine();
        System.out.println("Enter destination");
        String destination=b.nextLine();

        long PNR = (long) Math.floor(Math.random() * 9000000000L) + 1000000000L;

        String pass_na[]=new String[adult+child];
        int pass_age[]=new int[adult+child];
        String gender[]=new String[adult+child];
        int seatno[]=new int[adult+child];

        System.out.println("Enter names of passengers (e.g. if name is \"Arya Stark\", enter it as \"AStark\" to prevent confusions)");
        for(int q=0;q<pass_na.length;q++)
        {
            pass_na[q]=b.next();
        }

        System.out.println("Enter age of passengers(follow the order of names entered)");
        for(int r=0;r<pass_age.length;r++)
        {
            pass_age[r]=sc.nextInt();
        }

        System.out.println("Enter the gender of passengers(Female/Male/Other)");
        for(int s=0;s<gender.length;s++)
        {
            gender[s]=cs.next();
        }
        Random ra=new Random();
        for(int i=0;i<seatno.length;i++)
        {

            seatno[i]=(int)(Math.random()*((60-10)+1))+10;
        }

        //Printing the Reservation Slip
        Date ob=new Date();
        System.out.println("\f\t\t\t\t\t\t~~~~~~~~~~IRCTC's e-Ticketing Service~~~~~~~~~~");
        System.out.println();
        System.out.println("\t\t +-+ +-+ +-+ +-+ +-+ +-+ +-+ +-+ +-+ +-+   +-+ +-+ +-+ +-+ +-+ +-+ +-+ +-+ +-+ +-+ +-+   +-+ +-+ +-+ +-+");
        System.out.println("\t\t|E| |l| |e| |c| |t| |r| |o| |n| |i| |c|   |R| |e| |s| |e| |r| |v| |a| |t| |i| |o| |n|   |S| |l| |i| |p|");
        System.out.println("\t\t +-+ +-+ +-+ +-+ +-+ +-+ +-+ +-+ +-+ +-+   +-+ +-+ +-+ +-+ +-+ +-+ +-+ +-+ +-+ +-+ +-+   +-+ +-+ +-+ +-+");
        System.out.println();
        System.out.println();
        System.out.println("\tPNR No: "+PNR+"\t\t\t\t\t\t\t\t\t"+"Class: "+cla);
        System.out.println("\t\t\t\t\t\tTrain Name: "+tr_name);
        System.out.println("\t\t\t\t\t\tTrain Number: "+tr_no);
        System.out.println("\t\t\t\t\t\tDate of Journey: "+date);
        System.out.println("\t\t\t\t\t\tDay/Date/Time: "+ob);
        System.out.println("\t\t\t\t\t\tBoarding: "+b_station);
        System.out.println("\t\t\t\t\t\tResv upto: "+destination);
        System.out.println("\t\t\t\t\t\tAdult: "+adult+"\tChild: "+child);
        System.out.println("\t\t\t\t\t\tTotal Fare: "+totalamt);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("\t\t\tSNO\t\tName\t\tAge\t\tSex\t\tStatus/CoachNo/SeatNo");

        for(int u=0;u<adult+child;u++)
        {

            System.out.println("\t\t\t"+(u+1)+"\t\t"+pass_na[u]+"\t\t"+pass_age[u]+"\t\t"+gender[u]+"\t\t"+"CONFIRM/D3/0"+seatno[u]);
        }
    }
}

