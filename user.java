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
