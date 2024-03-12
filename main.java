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