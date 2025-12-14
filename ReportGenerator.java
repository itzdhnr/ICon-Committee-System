public class ReportGenerator {

    public static void printReport(CommitteeManager cm) {
        System.out.println("\n========================================");
        System.out.println("       COMMITTEE SYSTEM REPORT");
        System.out.println("========================================");

        // Display all committees
        cm.viewAll();

        System.out.println("\n========================================");
        System.out.println("         END OF REPORT");
        System.out.println("========================================");
    }
}
