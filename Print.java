public class Print {

    String documentName;
    double costperPage;

    public Print(String documentName, double costperPage) {
        super();
        this.documentName = documentName;
        this.costperPage = costperPage;
    }

    double calculateCost(int pages) {
        return pages * costperPage;
    }

    double calculateCost(int pages, boolean colorPrint) {
        if (colorPrint) {
            return pages * costperPage * 3.5;
        }
        return pages * costperPage;
    }

    public static void main(String[] args) {
        Print job = new Print("report.pdf", 2.0);
        double bw = job.calculateCost(10);
        double color = job.calculateCost(10, true);
        System.out.println("Black & White cost: " + bw);
        System.out.println("Color cost: " + color);
    }
}
