
// Single Responsibility Principle (SRP):

// A class should have only one reason to change, 
// meaning it should have only one responsibility.


// Before applying SRP
class Report {
    void generateReport() {
        // Generate report logic
    }

    void saveToFile() {
        // Save to file logic
    }
}

// After applying SRP
class Report {
    void generateReport() {
        // Generate report logic
    }
}

class ReportSaver {
    void saveToFile(Report report) {
        // Save to file logic
    }
}