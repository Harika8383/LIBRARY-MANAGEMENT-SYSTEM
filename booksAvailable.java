class BooksAvailable extends ColorConsole {
    static Scanner sc = new Scanner(System.in);
    String one[] = new String[]{"M1 BOOK                           ","M2 BOOK                           ","MODERN PHYSICS BOOK               ","ENVIRONMENTAL CHEMISTRY BOOK      ","","","","","",""};
    String two[] = new String[]{"DATA STRUCTURES AND ALGORITHMS BOOK","JAVA BOOK                          ","PYTHON BOOK                        ","APPLIED STATISTICS BOOK            ","","","","","",""};
    String three[] = new String[]{"DATABASE MANAGEMENT SYSTEM BOOK    ","THEORY OF COMPUTATION BOOK         ","COMPUTER NETWORKS BOOK             ","OPERATING SYSTEMS BOOK             ","","","","","",""};
    String four[] = new String[]{"ARTIFICIAL INTELLIGENCE BOOK       ","MACHINE LEARNING BOOK              ","DEEP LEARNING BOOK                 ","NATURAL LANGUAGE PROCESSING BOOK   ","","","","","",""};
    void FirstYear() {
        for (int i = 0; i < addBooks.obj.one.length; i++) {
            if (addBooks.obj.one[i].equals("")) {
                break;
            } else {
                System.out.println((i + 1) + ". " + addBooks.obj.one[i]);}}
        System.out.println();}
    void SecondYear() {
        for (int i = 0; i < addBooks.obj.two.length; i++) {
            if (addBooks.obj.two[i].equals("")) {
                break;
            } else {
                System.out.println((i + 1) + ". " + addBooks.obj.two[i]);}}
        System.out.println();}
    void ThirdYear() {
        for (int i = 0; i < addBooks.obj.three.length; i++) {
            if (addBooks.obj.three[i].equals("")) {
                break;
            } else {
                System.out.println((i + 1) + ". " + addBooks.obj.three[i]);}}
        System.out.println();}
    void FourthYear() {
        for (int i = 0; i < addBooks.obj.four.length; i++) {
            if (addBooks.obj.four[i].equals("")) {
                break;
            } else {
                System.out.println((i + 1) + ". " + addBooks.obj.four[i]);}}
        System.out.println();}
    void AvailableBooks() {
        System.out.println(BrightYellow
                + "WHICH YEAR BOOK LIST YOU NEED \n 1. FIRST YEAR \n 2. SECOND YEAR \n 3. THIRD YEAR \n 4. FOURTH YEAR"
                + Reset);
        switch (sc.nextInt()) {
            case 1:{
                System.out.println();
                System.out.println(BrightCyan + "BOOKS AVAILABLE IN FIRST YEAR" + Reset);
                System.out.println(BrightCyan + "_____________________________\n" + Reset);
                FirstYear();
                break;}
            case 2:{
                System.out.println();
                System.out.println(BrightCyan + "BOOKS AVAILABLE IN SECOND YEAR" + Reset);
                System.out.println(BrightCyan + "______________________________\n" + Reset);
                SecondYear();
                break;}
            case 3:{
                System.out.println();
                System.out.println(BrightCyan + "BOOKS AVAILABLE IN THIRD YEAR" + Reset);
                System.out.println(BrightCyan + "_____________________________\n" + Reset);
                ThirdYear();
                break;}
            case 4:{
                System.out.println();
                System.out.println(BrightCyan + "BOOKS AVAILABLE IN FOURTH YEAR" + Reset);
                System.out.println(BrightCyan + "______________________________\n" + Reset);
                FourthYear();
                break;}
	    default:{
		System.out.println(Red+"INVALID INPUT! PLEASE TRY AGAIN!!"+Reset);
		AvailableBooks();}}}}
class IssueBook extends BooksAvailable {
	static int x=0;
    static Scanner sc = new Scanner(System.in);
    void FirstYear() {
        for (int i = 0; i < addBooks.obj.one.length; i++) {
            if (addBooks.obj.one[i].equals("")) {
                break;
            } else {
                System.out.println((i + 1) + ". " + addBooks.obj.one[i]);}}
        First: while (true) {
            System.out.println(BrightYellow + "WHICH BOOK DO YOU WANT!" + Reset);
            int k = sc.nextInt();
            int i = 0;
            for (i = 0; i < 10; i++) {
                if (i == k - 1 && !addBooks.obj.one[i].equals("")) {
                    System.out.println(BrightCyan + addBooks.obj.one[i] + "==>		  ISSUED SUCCESSFULLY!!" + Reset);
                    history.str = history.str + addBooks.obj.one[i] + "                                   " + new Date() + "\n";
                    break First;}}
            if (i == 10) {
                System.out.println(Red + "ENTER VALID INPUT" + Reset);
            }}}
    void SecondYear() {
        for (int i = 0; i < addBooks.obj.two.length; i++) {
            if (addBooks.obj.two[i].equals("")) {
                break;
            } else {
                System.out.println((i + 1) + ". " + addBooks.obj.two[i]);}}
        Second: while (true) {
            System.out.println(BrightYellow + "WHICH BOOK DO YOU WANT!" + Reset);
            int k = sc.nextInt();
            int i = 0;
            for (i = 0; i < 10; i++) {
                if (i == k - 1 && !addBooks.obj.two[i].equals("")) {
                    System.out.println(BrightCyan + addBooks.obj.two[i] + "==>		  ISSUED SUCCESSFULLY!!" + Reset);
                    history.str = history.str + addBooks.obj.two[i] + "                                  " + new Date() + "\n";
                    break Second;}}
            if (i == 10) {
                System.out.println(Red + "ENTER VALID INPUT" + Reset);}}}
    void ThirdYear() {
        for (int i = 0; i < addBooks.obj.three.length; i++) {
            if (addBooks.obj.three[i].equals("")) {
                break;
            } else {
                System.out.println((i + 1) + ". " + addBooks.obj.three[i]);}}
        Three: while (true) {
            System.out.println(BrightYellow + "WHICH BOOK DO YOU WANT!" + Reset);
            int k = sc.nextInt();
            int i = 0;
            for (i = 0; i < 10; i++) {
                if (i == k - 1 && !addBooks.obj.three[i].equals("")) {
                    System.out.println(BrightCyan + addBooks.obj.three[i] + "==>		  ISSUED SUCCESSFULLY!");
                    history.str = history.str + addBooks.obj.three[i] + "                                  " + new Date() + "\n";
                    break Three;}}
            if (i == 10) {
                System.out.println(Red + "ENTER VALID INPUT" + Reset);}}}
    void FourthYear() {
        for (int i = 0; i < addBooks.obj.four.length; i++) {
            if (addBooks.obj.four[i].equals("")) {
                break;
            } else if (!addBooks.obj.four[i].equals("")) {
                System.out.println( (i + 1) + ". " + addBooks.obj.four[i] );}}
        Four: while (true) {
            System.out.println(BrightCyan + "WHICH BOOK DO YOU WANT!" + Reset);
            int k = sc.nextInt();
            int i = 0;
            for (i = 0; i < 10; i++) {
                if (i == k - 1 && !addBooks.obj.four[i].equals("")) {
                    System.out.println(BrightCyan + addBooks.obj.four[i] + "==>		  ISSUED SUCCESSFULLY!" + Reset);
                    history.str = history.str + addBooks.obj.four[i] + "                                  " + new Date() + "\n";
                    break Four;}}
            if (i == 10) {
                System.out.println(Red + "ENTER VALID INPUT" + Reset);}}}
    void AvailableBooks() {
	x++;
        System.out.println(BrightYellow + " 1. FirstYear \n 2. SecondYear \n 3. ThirdYear \n 4. FourthYear" + Reset);
        switch (sc.nextInt()) {
            case 1:
                FirstYear();
                break;
            case 2:
                SecondYear();
                break;
            case 3:
                ThirdYear();
                break;
            case 4:
                FourthYear();
                break;
            default:{
                System.out.println(Red + "INVALID INPUT! PLEASE TRY AGAIN!!" + Reset);
                AvailableBooks();}}}
    void show() {
        IssueBook obj1 = new IssueBook();
        int c = 0;
        if (c == 0) {
            System.out.println(BrightYellow + "\nWHICH YEAR'S BOOK DO YOU WANT!" + Reset);
            obj1.AvailableBooks();
            c++;}
        while (c != 0) {
            System.out.println(BrightYellow + "\n\nDO YOU NEED ANYTHING ELSE!" + Reset);
            System.out.println("yes / no");
            String s = sc.next();
            switch (s) {
                case "yes":
            	    System.out.println(BrightYellow + "\nWHICH YEAR'S BOOK DO YOU WANT!" + Reset);
                    obj1.AvailableBooks();
                    break;}
            if (s.equals("no")) {
                System.out.println(BrightCyan + "BOOKS ISSUED SUCCESSFULLY! HAPPY LEARNING!" + Reset);
                history.showHistory();
                break;}}}}
