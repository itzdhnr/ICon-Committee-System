public class CommitteeManager {
    private IConCommittee[] committees;
    private int count;

    public CommitteeManager(int size) {
        committees = new IConCommittee[size];
        count = 0;
    }

    // Add
    public void addCommittee(IConCommittee c) {
        if (count < committees.length) {
            committees[count++] = c;
            System.out.println("Committee added!");
        } else {
            System.out.println("Array is full.");
        }
    }

    // View All
    public void viewAll() {
        if (count == 0) {
            System.out.println("No records available.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println("\nRecord " + (i + 1));
            committees[i].display();
        }
    }

    // Search by category
    public void searchByCategory(String category) {
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (committees[i].getCommitteeCategory().equalsIgnoreCase(category)) {
                committees[i].display();
                found = true;
            }
        }

        if (!found)
            System.out.println("No committees under this category.");
    }

    // Search by date
    public void searchByDate(String date) {
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (committees[i].getCommissionDate().equalsIgnoreCase(date)) {
                committees[i].display();
                found = true;
            }
        }

        if (!found)
            System.out.println("No committees with this date.");
    }

    // Update by ID
    public void updateCommittee(String id, IConCommittee updated) {
        for (int i = 0; i < count; i++) {
            if (committees[i].getCommitteeID().equalsIgnoreCase(id)) {
                committees[i] = updated;
                System.out.println("Committee updated.");
                return;
            }
        }
        System.out.println("Committee not found.");
    }

    // Delete by ID
    public void deleteCommittee(String id) {
        for (int i = 0; i < count; i++) {
            if (committees[i].getCommitteeID().equalsIgnoreCase(id)) {
                committees[i] = committees[count - 1];
                count--;
                System.out.println("Committee deleted.");
                return;
            }
        }
        System.out.println("Committee not found.");
    }

    // Getter for ID
    public IConCommittee[] getCommittees() {
        return committees;
    }

    public int getCount() {
        return count;
    }
}
