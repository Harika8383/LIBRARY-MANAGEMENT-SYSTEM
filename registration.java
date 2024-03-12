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