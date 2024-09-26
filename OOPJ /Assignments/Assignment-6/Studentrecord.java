public class Studentrecord {
    private String[] records;

    // Constructor to initialize the array
    public void Student(int size) {
        records = new String[size];
    }

    // Method to accept a record
    public void acceptRecord(int index, String record) {
        if (index >= 0 && index < records.length) {
            records[index] = record;
        } else {
            System.out.println("Invalid index");
        }
    }

    public void printRecord() {
        for (String record : records) {
            System.out.println(record);
        }
    }

    public static void main(String[] args) {
        Studentrecord student = new Studentrecord();

        student.acceptRecord(0, "John Doe");
        student.acceptRecord(1, "Jane Doe");
        student.acceptRecord(2, "Bob Smith");
        student.acceptRecord(3, "Alice Johnson");
        student.acceptRecord(4, "Mike Brown");

        student.printRecord();
    }
}
