package Queue.Bai4;

import java.util.LinkedList;
import java.util.Queue;

public class PrintQueueSimulation {
    public static void main(String[] args) {
        Queue<Document> printQueue = new LinkedList<>();

        printQueue.add(new Document("Report.pdf", 10));
        printQueue.add(new Document("Thesis.docx", 25));
        printQueue.add(new Document("Invoice.xlsx", 5));

        System.out.println("Danh sách tài liệu đang chờ in:");
        for (Document doc : printQueue) {
            System.out.println(doc);
        }

        Document printed = printQueue.poll();
        System.out.println("\nĐã in xong: " + printed);

        System.out.println("\nDanh sách tài liệu còn lại:");
        for (Document doc : printQueue) {
            System.out.println(doc);
        }

        int totalPages = 0;
        for (Document doc : printQueue) {
            totalPages += doc.getPageCount();
        }
        System.out.println("\nTổng số trang còn lại chưa in: " + totalPages);
    }
}
