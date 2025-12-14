import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CommitteeManager cm = new CommitteeManager(50);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== COMMITTEE MENU =====");
            System.out.println("1. Add Committee");
            System.out.println("2. View All");
            System.out.println("3. Search by Category");
            System.out.println("4. Search by Date");
            System.out.println("5. Update Committee");
            System.out.println("6. Delete Committee");
            System.out.println("7. View Report");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 0)
                break;

            switch (ch) {

                case 1:
                    System.out.println("1. Current  |  2. Past");
                    int type = sc.nextInt();
                    sc.nextLine();

                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Category: ");
                    String cat = sc.nextLine();
                    System.out.print("Date: ");
                    String date = sc.nextLine();

                    if (type == 1) {
                        System.out.print("Meetings: ");
                        int m = sc.nextInt();
                        System.out.print("Duty: ");
                        int d = sc.nextInt();

                        cm.addCommittee(new CurrentCommittee(id, name, cat, date, m, d));
                    } else {
                        System.out.print("Advisory Meetings: ");
                        int a = sc.nextInt();
                        System.out.print("Stay Back (true/false): ");
                        boolean s = sc.nextBoolean();

                        cm.addCommittee(new PastCommittee(id, name, cat, date, a, s));
                    }
                    break;

                case 2:
                    cm.viewAll();
                    break;

                case 3:
                    System.out.print("Category: ");
                    cm.searchByCategory(sc.nextLine());
                    break;

                case 4:
                    System.out.print("Date: ");
                    cm.searchByDate(sc.nextLine());
                    break;

                case 5:
                    System.out.print("Enter ID to update: ");
                    String uid = sc.nextLine();

                    System.out.println("Update to: 1=Current 2=Past");
                    int t2 = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String nm = sc.nextLine();
                    System.out.print("Category: ");
                    String ct = sc.nextLine();
                    System.out.print("Date: ");
                    String dt = sc.nextLine();

                    if (t2 == 1) {
                        System.out.print("Meetings: ");
                        int m2 = sc.nextInt();
                        System.out.print("Duty: ");
                        int d2 = sc.nextInt();
                        cm.updateCommittee(uid, new CurrentCommittee(uid, nm, ct, dt, m2, d2));
                    } else {
                        System.out.print("Advisory Meetings: ");
                        int a2 = sc.nextInt();
                        System.out.print("Stay Back: ");
                        boolean s2 = sc.nextBoolean();
                        cm.updateCommittee(uid, new PastCommittee(uid, nm, ct, dt, a2, s2));
                    }
                    break;

                case 6:
                    System.out.print("Enter ID to delete: ");
                    cm.deleteCommittee(sc.nextLine());
                    break;

                case 7:
                    ReportGenerator.printReport(cm);
                    break;
            }
        }
        sc.close();
    }
}
