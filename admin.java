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
