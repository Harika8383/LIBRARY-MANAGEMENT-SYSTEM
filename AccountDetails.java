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
