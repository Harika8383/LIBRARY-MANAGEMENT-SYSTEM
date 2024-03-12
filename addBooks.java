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