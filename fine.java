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
