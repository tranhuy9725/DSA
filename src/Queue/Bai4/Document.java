package Queue.Bai4;

public class Document {
    private String fileName;
    private int pageCount;

    public Document(String fileName, int pageCount) {
        this.fileName = fileName;
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String toString() {
        return "Document{fileName='" + fileName + "', pageCount=" + pageCount + "}";
    }
}
