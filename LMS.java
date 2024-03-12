import java.util.Scanner;
import java.util.Date;
class ColorConsole {
    static String Black = "\u001b[30m";
    static String Red = "\u001b[31m";
    static String Green = "\u001b[32m";
    static String Yellow = "\u001b[33m";
    static String Blue = "\u001b[34m";
    static String Magenta = "\u001b[35m";
    static String Cyan = "\u001b[36m";
    static String White = "\u001b[37m";
    static String BrightBlack = "\u001b[30;1m";
    static String BrightRed = "\u001b[31;1m";
    static String BrightGreen = "\u001b[32;1m";
    static String BrightYellow = "\u001b[33;1m";
    static String BrightBlue = "\u001b[34;1m";
    static String BrightMagenta = "\u001b[35;1m";
    static String BrightCyan = "\u001b[36;1m";
    static String BrightWhite = "\u001b[37;1m";
    static String Reset = "\u001b[0m";}
class A extends ColorConsole {
    static Scanner sc = new Scanner(System.in);
    String username[] = new String[]{"harika","priya","manu","hari","","","","","",""};
    String id[] = new String[]{"838383","3838383","143031","219427","","","","","",""};
    void m1(String username, String id) {
        for (int i = 0; i < this.username.length; i++) {
            if (this.username[i].equals("")) {
                this.username[i] = username;
                break;}}
        for (int i = 0; i < this.id.length; i++) {
            if (this.id[i].equals("")) {
                this.id[i] = id;
                break;}}}
    boolean m2(String username, String id) {
        boolean b1 = false;
        boolean b2 = false;
        int i = 0;
        for (i = 0; i < this.username.length; i++) {
            if (this.username[i].equals(username)) {
                b1 = true;
                break;}}
        int j = 0;
        for (j = 0; j < this.id.length; j++) {
            if (this.id[j].equals(id)) {
                b2 = true;
                break;}}
        if (i == j && b1 == true && b2 == true) {
            return true;}
        return false;}}
class reg extends A {
    int c = 0;
	static int n=0;
	static A obj = new A();
	static String newUser;
	void testAdmin(){
		System.out.println();
                System.out.println(BrightYellow + "ENTER USERNAME AND ID : " + Reset);
                System.out.println();
                obj.m1(sc.next(), sc.next());
                System.out.println(BrightCyan + "YOU HAVE SIGNED IN SUCCESSFULLY!" + Reset);}
	void testUser(){
		System.out.println();
                System.out.println(BrightYellow + "ENTER USERNAME AND ID : " + Reset);
                System.out.println();
		String username=sc.next();
		String id=sc.next();
                obj.m1(username,id);
		System.out.println(BrightYellow+"ENTER YOUR BRANCH AND YEAR OF PASSOUT: "+Reset);
		String branch=sc.next();
		String year=sc.next();
		newUser=username+"		"+id+"		"+branch+"			"+year;
                System.out.println(BrightCyan + "YOU HAVE SIGNED IN SUCCESSFULLY!" + Reset+" ");}
    void displayAdmin() {
        System.out.println(BrightYellow + "1. NEW USER!" + Reset);
        System.out.println(BrightYellow + "2. ALREADY HAVE AN ACCOUNT!" + Reset);
        switch (sc.nextInt()) {
            case 1:{
                testAdmin();}
                break;
            case 2:{
                System.out.println();
                System.out.println(BrightYellow + "ENTER USERNAME AND ID : " + Reset);
                System.out.println();
                if (obj.m2(sc.next(), sc.next()) == true) {
                    System.out.println(
                            BrightCyan + "AUTHENTICATION SUCCESSFUL!\nYOU HAVE LOGGED IN SUCCESSFULLY!" + Reset);
                    System.out.println();
                    break;
                } else {
                    System.out.println(BrightRed + "INVALID CREDENTIALS!PLEASE TRY AGAIN!" + Reset);
                    System.out.println();
                    c++;
                    if (c >= 5) {
                        c = 0;
                        System.out.print(Yellow + "TOO MANY ATTEMPTS...PLEASE TRY LOGGING IN AFTER 5 MINUTES." + Reset);
			System.exit(0);
                        break;}
                    displayAdmin();
                    break;}}
		default:{
			System.out.println(Red+"INVALID INPUT! PLEASE TRY AGAIN!!"+Reset);
			displayAdmin();}}}
static String u;
void displayUser() {
        System.out.println(BrightYellow + "1. NEW USER!" + Reset);
        System.out.println(BrightYellow + "2. ALREADY HAVE AN ACCOUNT!" + Reset);
        switch (sc.nextInt()) {
            case 1:
                testUser();
		n++;
                break;
            case 2:{
                System.out.println();
                System.out.println(BrightYellow + "ENTER USERNAME AND ID : " + Reset);
                System.out.println();
		u=sc.next();
                if (obj.m2(u, sc.next()) == true) {
                    System.out.println(
                            BrightCyan + "AUTHENTICATION SUCCESSFUL!\nYOU HAVE LOGGED IN SUCCESSFULLY!" + Reset);
                    System.out.println();
                    break;
                } else {
                    System.out.println(BrightRed + "INVALID CREDENTIALS!PLEASE TRY AGAIN!" + Reset);
                    System.out.println();
                    c++;
                    if (c >= 5) {
                        c = 0;
                        System.out.print(Yellow + "TOO MANY ATTEMPTS...PLEASE TRY LOGGING IN AFTER 5 MINUTES." + Reset);
			System.exit(0);
                        break;}
                    displayUser();
                    break;}}
	default:{
		System.out.println(Red+"INVALID INPUT! PLEASE TRY AGAIN!!"+Reset);
		displayUser();}}}}
class AccountDetails extends reg {
    String accDetails[] = new String[]{"harika","838383","CSE","2025","priya","383838","BBA","2024","manu","143031","CSE","2026","hari","219427","ECE","2022","","","","","","","","","","","","","","","","","","","","","","",""};
    	void m3(String username, String id) {
	if(reg.u.equals(username)){
        for (int i = 0; i < this.accDetails.length; i++) {
            if (this.accDetails[i].equals(username) && this.accDetails[i + 1].equals(id)) {
                System.out.println();
                System.out.println(BrightCyan + "USERNAME        ID      BRANCH      YEAR OF PASSOUT	" + Reset);
                System.out.println(accDetails[i] + "        " + accDetails[i + 1] + "     " + accDetails[i + 2]
                        + "	      " + accDetails[i + 3]);
                System.out.println();
                break;}}}}
    void show1() {
        AccountDetails obj = new AccountDetails();
        System.out.println(BrightYellow + "ENTER USERNAME AND ID : " + Reset);
        String a = sc.next();
        String b = sc.next();
        if (obj.m2(a, b) == true) {
            obj.m3(a, b);
        } else {
            System.out.println(BrightRed + "INVALID CREDENTIALS! PLEASE TRY AGAIN!" + Reset);
            show1();}}}
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
class addBooks extends BooksAvailable {
    static addBooks obj = new addBooks();
    void One(String s1) {
        for (int i = 0; i < obj.one.length; i++) {
            if (obj.one[i].equals("")) {
                obj.one[i] = s1;
                for (int j = 0; j <= i; j++) {
                    System.out.println((j + 1) + ". " + obj.one[j]);}
                break;}}}
    void Two(String s1) {
        for (int i = 0; i < obj.two.length; i++) {
            if (obj.two[i].equals("")) {
                obj.two[i] = s1;
		for (int j = 0; j <= i; j++) {
                    System.out.println((j + 1) + ". " + obj.two[j]);}
                break;}}}
    void Three(String s1) {
        for (int i = 0; i < obj.three.length; i++) {
            if (obj.three[i].equals("")) {
                obj.three[i] = s1;
		for (int j = 0; j <= i; j++) {
                    System.out.println((j + 1) + ". " + obj.three[j]);}
                break;}}}
    void Four(String s1) {
        for (int i = 0; i < obj.four.length; i++) {
            if (obj.four[i].equals("")) {
                obj.four[i] = s1;
		for (int j = 0; j <= i; j++) {
                    System.out.println((j + 1) + ". " + obj.four[j]);}
                break;}}}
    void view() {
        System.out.println(BrightYellow + "NAME OF THE BOOK YOU WANT TO ADD : " + Reset);
        String s1 = sc.next();
        System.out.println(BrightYellow + "WHICH YEAR'S COURSE BOOK IS IT!" + Reset);
        System.out
                .println(BrightYellow + " 1. FIRST YEAR \n 2. SECOND YEAR \n 3. THIRD YEAR \n 4. FOURTH YEAR" + Reset);
        switch (sc.nextInt()) {
            case 1:
                obj.One(s1);
                break;
            case 2:
                obj.Two(s1);
                break;
            case 3:
                obj.Three(s1);
                break;
            case 4:
                obj.Four(s1);
                break;
            default:{
                System.out.println(Red + "INVALID INPUT!PLEASE TRY AGAIN!!" + Reset);
                view();}}}}
class history extends ColorConsole {
    public static String str = "";
    static void showHistory() {
        System.out.println(
                Magenta + "BOOKNAME                                 				ISSUEDATE - ISSUETIME" + Reset);
        System.out.println(str);}}
class fine extends ColorConsole {
    static String book="";
    static Scanner sc = new Scanner(System.in);
    String[] AccNo = new String[]{"123456789","234567890","345678900","","","","","","",""};
    String[] pin = new String[]{"123456","234567","345678","","","","","","",""};
    boolean m1(String AccNo, String pin) {
        boolean b1 = false;
        boolean b2 = false;
        int i = 0;
        for (i = 0; i < this.AccNo.length; i++) {
            if (this.AccNo[i].equals(AccNo)) {
                b1 = true;
                break;}}
        int j = 0;
        for (j = 0; j < this.pin.length; j++) {
            if (this.pin[j].equals(pin)) {
                b2 = true;
                break;}}
        if (i == j && b1 == true && b2 == true) {
            return true;}
        return false; }
    void show() {System.out.println(BrightYellow + "1. NET BANKING \n2. CASH" + Reset);}
    void payment(String AccNo, String pin, int diff) {
        if (m1(AccNo, pin) == true) {
            System.out.println(BrightYellow + "TOTAL AMOUNT : Rs " + (5 * diff) + "/-" + Reset);
            System.out.println(Green + "PAYMENT SUCCESSFUL! THANK YOU \nHAPPY LEARNING!" + Reset);
        } else {
            System.out.println(BrightRed + "INVALID CREDENTIALS! PLEASE TRY AGAIN!" + Reset);
            payment(sc.next(), sc.next(), diff);}}
    void display() {
        fine obj = new fine();
	System.out.println(BrightYellow+"NAME OF THE BOOK YOU ARE RETURNING : "+Reset);
	book=sc.next();
        System.out.println(BrightYellow + "HOW MANY DAYS IT'S BEEN SINCE YOU TOOK THIS BOOK" + Reset);
        int days = sc.nextInt();
        int diff = days - 7;
        if (diff > 0) {
	    System.out.println(Cyan+"*AFTER A WEEK, YOU WILL BE CHARGED Rs.5/- PER DAY*"+Reset);
            System.out.println(BrightCyan + "TOTAL AMOUNT TO BE PAID : Rs " + (5 * diff) + "/-" + Reset);
            System.out.println(BrightYellow + "WHICH MODE OF TRANSFER YOU PREFER!" + Reset);
            obj.show();
            switch (sc.nextInt()) {
                case 1:
                    System.out.println(BrightYellow + "ENTER ACCOUNT NUMBER AND PIN : " + Reset);
                    obj.payment(sc.next(), sc.next(), diff);
                    break;
                case 2:
                    System.out.println(Green
                            + "INVOICE WILL BE GENERATED IN YOUR ACCOUNT WITHIN 24 HOURS...THANK YOU. \nHAPPY LEARNING"
                            + Reset);
                    break;
                default:
                    System.out.println(Red + "INVALID INPUT! \nPLEASE CHOOSE ANYONE OPTION ABOVE!" + Reset);
		display();}
        } else {
            System.out.println(BrightCyan + book+" BOOK RETURNED SUCCESSFULLY! HAPPY LEARNING!" + Reset);}}}
class Admin extends ColorConsole {
    static Scanner sc = new Scanner(System.in);
	static int c=0;
    void showAdmin() {
        System.out.println(
                "\n======================================================================================================================");
        System.out.println(BrightYellow
                + "\t1. REGISTRATION(LOGIN / SIGNUP) \n\n\t2. BOOKS AVAILABLE \n\n\t3. ADD BOOKS \n\n\t4. LOGOUT"
                + Reset);
        System.out.println(
                "\n======================================================================================================================");}
    void show(){
                System.out.println(BrightCyan + "SUCCESSFULLY LOGGED OUT!" + Reset);
                System.out.println("DO YOU WANT TO LOGIN AGAIN? \nyes / no");
                switch (sc.next()) {
                    case "yes":
                        System.out.println(BrightYellow + "WHAT IS YOUR ROLE : \n1. ADMIN \n2. USER" + Reset);
                        switch (sc.nextInt()) {
                            case 1: {
				Admin.c=0;
                                Admin obj1 = new Admin();
                                obj1.showAdmin();
                                obj1.Admin();}
                                break;
                            case 2: {
				User.c=0;
                                User obj2 = new User();
                                obj2.show();
                                obj2.user();}
                                break;
                            default:
                                System.out.println(Red + "INVALID INPUT! PLEASE TRY AGAIN!" + Reset);
				show();}
                        break;
                    case "no":
			System.out.println(Green+"          *****  *  *   **   *      *  *   *   *     *   **   *  *");
System.out.println("            *    *  *  *  *  **     *  *  *     *   *   *  *  *  *");
System.out.println("            *    *  *  *  *  * *    *  * *       * *    *  *  *  *");
System.out.println("            *    ****  ****  *  *   *  *          *     *  *  *  *");
System.out.println("            *    *  *  *  *  *   *  *  * *        *     *  *  *  *");
System.out.println("            *    *  *  *  *  *    * *  *  *       *     *  *  *  *");
System.out.println("            *    *  *  *  *  *      *  *   *      *      **    ** "+Reset);
                        System.exit(0);
		default:{
			System.out.println(Red+"INVALID INPUT! PLEASE TRY AGAIN!!"+Reset);
			show();}}}
    void Admin() {
	int s=sc.nextInt();
	if(c<5 && s==1){
		c++;}
        switch (s) {
            case 1: {
		if(c==1){
                System.out.println(Cyan + "REGISTRATION(LOGIN / SIGNUP)" + Reset);
		System.out.println(Cyan +"____________________________\n"+Reset);
                reg obj1 = new reg();
                obj1.displayAdmin();
                showAdmin();
                Admin();}
		else{
			System.out.println(Green+"YOU HAVE ALREADY LOGGED IN...!"+Reset);
			Admin();}}
                break;
            case 2: {
		if(c==0){
			System.out.println(Yellow+"YOU NEED TO BE AN AUTHORIZED USER BEFORE USING OTHER SERVICES! SO PLEASE DO REGISTER FIRST!"+Reset);
			Admin();}
		else{
                System.out.println(Cyan + "BOOKS AVAILABLE" + Reset);
		System.out.println(Cyan +"_______________\n"+Reset);
                BooksAvailable obj3 = new BooksAvailable();
                obj3.AvailableBooks();
                showAdmin();
                Admin();}}
                break;
            case 3: {
		if(c==0){
			System.out.println(Yellow+"YOU NEED TO BE AN AUTHORIZED USER BEFORE USING OTHER SERVICES! SO PLEASE DO REGISTER FIRST!"+Reset);
			Admin();}
		else{
                System.out.println(Cyan + "ADD BOOKS" + Reset);
		System.out.println(Cyan +"_________\n"+Reset);
                addBooks obj5 = new addBooks();
                obj5.view();
                showAdmin();
                Admin();}}
                break;
            case 4:{
		if(c==0){
			System.out.println(Yellow+"YOU NEED TO BE AN AN AUTHORIZED USER USER BEFORE USING OTHER SERVICES! SO PLEASE DO REGISTER FIRST!"+Reset);
			Admin();}
		else{
		show();
		break;}}
            default:{
		System.out.println(Red+"INVALID INPUT! PLEASE TRY AGAIN!!"+Reset);
		showAdmin();
		Admin();}}}}
class User extends ColorConsole {
    static Scanner sc = new Scanner(System.in);
	static int c=0;
    void show() {
        System.out.println(
                "======================================================================================================================");
        System.out.println();
        System.out.println(BrightYellow
                + "\n\t1. REGISTRATION(LOGIN / SIGNUP) \n\n\t2. ACCOUNT DETAILS \n\n\t3. BOOKS AVAILABLE \n\n\t4. ISSUE BOOKS \n\n\t5. ADD BOOKS \n\n\t6. HISTORY \n\n\t7. PAYMENT(FINE) \n\n\t8. LOGOUT\n"
                + Reset);
        System.out.println(
                "======================================================================================================================");
        System.out.println();}
    void user() {
	int s=sc.nextInt();
	if(c<9 && s==1){
		c++;}
        switch (s) {
            case 1: {
		if(c==1){
                System.out.println(Cyan + "REGISTRATION(LOGIN / SIGNUP)" + Reset);
		System.out.println(Cyan +"____________________________\n"+Reset);
                reg obj1 = new reg();
                obj1.displayUser();
                show();
                user();}
		else{
			System.out.println(Green+"YOU HAVE ALREADY LOGGED IN...!"+Reset);
			user();}}
                break;
            case 2: {
		if(c==0){
			System.out.println(Yellow+"YOU NEED TO BE AN AUTHORIZED USER BEFORE USING OTHER SERVICES! SO PLEASE DO REGISTER FIRST!"+Reset);
			user();}
		else{
                System.out.println(Cyan + "ACCOUNT DETAILS" + Reset);
		System.out.println(Cyan +"_______________\n"+Reset);
                AccountDetails obj2 = new AccountDetails();
		if(reg.n==1){
			System.out.println(BrightCyan+"USERNAME	PASSWORD	BRANCH		YEAR OF PASSOUT"+Reset);
			System.out.println(reg.newUser);
			show();
			user();}
		else{
                obj2.show1();
                show();
                user();}}}
                break;
            case 3: {
		if(c==0){
			System.out.println(Yellow+"YOU NEED TO BE AN AUTHORIZED USER BEFORE USING OTHER SERVICES! SO PLEASE DO REGISTER FIRST!"+Reset);
			user();}
		else{
                System.out.println(Cyan + "BOOKS AVAILABLE" + Reset);
		System.out.println(Cyan +"_______________\n"+Reset);
                BooksAvailable obj3 = new BooksAvailable();
                obj3.AvailableBooks();
                show();
                user();}}
                break;
            case 4: {
		if(c==0){
			System.out.println(Yellow+"YOU NEED TO BE AN AUTHORIZED USER BEFORE USING OTHER SERVICES! SO PLEASE DO REGISTER FIRST!"+Reset);
			user();}
		else{
                System.out.println(Cyan + "ISSUE BOOKS" + Reset);
		System.out.println(Cyan +"___________\n"+Reset);
                IssueBook obj4 = new IssueBook();
                obj4.show();
                show();
                user();}}
                break;
            case 5: {
		if(c==0){
			System.out.println(Yellow+"YOU NEED TO BE AN AUTHORIZED USER BEFORE USING OTHER SERVICES! SO PLEASE DO REGISTER FIRST!"+Reset);
			user();}
		else{
                System.out.println(Cyan + "ADD BOOKS" + Reset);
		System.out.println(Cyan +"_________\n"+Reset);
                addBooks obj5 = new addBooks();
                obj5.view();
                show();
                user();}}
                break;
            case 6: {
		if(c==0){
			System.out.println(Yellow+"YOU NEED TO BE AN AUTHORIZED USER BEFORE USING OTHER SERVICES! SO PLEASE DO REGISTER FIRST!"+Reset);
			user();}
		else{
		if(IssueBook.x==0){
			System.out.println(Yellow+"NO BOOKS HAVE BEEN ISSUED YET!\n"+Reset);
			show();
                	user();
		}
		else{
                System.out.println(Cyan + "HISTORY" + Reset);
		System.out.println(Cyan +"_______\n"+Reset);
                history h = new history();
                h.showHistory();
                show();
                user();}}
                break;}
            case 7: {
		if(c==0){
			System.out.println(Yellow+"YOU NEED TO BE AN AUTHORIZED USER BEFORE USING OTHER SERVICES! SO PLEASE DO REGISTER FIRST!"+Reset);
			user();}
		else{
                System.out.println(Cyan + "PAYMENT(FINE)" + Reset);
		System.out.println(Cyan +"_____________\n"+Reset);
                fine f = new fine();
                f.display();
                show();
                user();}}
            case 8:
		if(c==0){
			System.out.println(Yellow+"YOU NEED TO BE AN AUTHORIZED USER BEFORE USING OTHER SERVICES! SO PLEASE DO REGISTER FIRST!"+Reset);
			user();}
		else{
		Admin obj=new Admin();
                obj.show();
                break;}
	    default:{
		System.out.println(Red+"INVALID INPUT! PLEASE TRY AGAIN!!"+Reset);
		user();
		}}}}
class Library extends ColorConsole {
static{
       System.out.println(Green
                + "      ******        **         **      **    **         **    **   ********   **         **    **   ********   ********   "
                + Reset);
        System.out.println(Green
                + "      **    **    **  **     **  **    **    **         **    **   ********   **         **    **   ********   ********   "
                + Reset);
        System.out.println(Green
                + "      **    **   **    **   **    **   **   **          **    **   **         **         **    **   **            **      "
                + Reset);
        System.out.println(Green
                + "      **    **   **    **   **    **   **  **           **    **   **         **         **    **   **            **      "
                + Reset);
        System.out.println(Green
                + "      **    **   **    **   **    **   ** **            **    **   **         **         **    **   **            **      "
                + Reset);
        System.out.println(Green
                + "      ******     **    **   **    **   ****             **    **   ********   **         **    **   ********      **      "
                + Reset);
        System.out.println(Green
                + "      ******     **    **   **    **   ****             **    **   ********   **         **    **   ********      **      "
                + Reset);
        System.out.println(Green
                + "      **    **   **    **   **    **   ** **            **    **   **         **         **    **   **            **      "
                + Reset);
        System.out.println(Green
                + "      **    **   **    **   **    **   **  **           **    **   **         **         **    **   **            **      "
                + Reset);
        System.out.println(Green
                + "      **    **   **    **   **    **   **   **          **    **   **         **         **    **   **            **      "
                + Reset);
        System.out.println(Green
                + "      **    **    **  **     **  **    **    **          **  **    ********   ********    **  **    ********      **      "
                + Reset);
        System.out.println(Green
                + "      ******        **         **      **    **            **      ********   ********      **      ********      **      "
                + Reset);}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         Library obj = new Library();
        Date d = new Date();
        System.out.println(BrightYellow + "WHAT IS YOUR ROLE : \n1. ADMIN \n2. USER" + Reset);
        switch (sc.nextInt()) {
            case 1: {
                Admin obj1 = new Admin();
                obj1.showAdmin();
                obj1.Admin();}
                break;
            case 2: {
                User obj2 = new User();
                obj2.show();
                obj2.user();}
                break;
            default:{
                System.out.println(Red + "INVALID INPUT! PLEASE TRY AGAIN!" + Reset);
                main(args);}}}}