package day3.bai4;

public class Playlist {
    private Node head;
    private Node tail;
    private Node current; // Để theo dõi bài hát hiện tại khi nghe nhạc

    public Playlist() {
        this.head = null;
        this.tail = null;
        this.current = null;
    }

    // Thêm bài hát vào cuối playlist
    public void addLast(Song song) {
        Node newNode = new Node(song);
        if (head == null) {
            head = tail = current = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Thêm bài hát vào đầu playlist
    public void addFirst(Song song) {
        Node newNode = new Node(song);
        if (head == null) {
            head = tail = current = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            if (current == null) current = head;
        }
    }

    // Thêm bài hát vào vị trí bất kỳ (index bắt đầu từ 0)
    public void addAtPosition(int position, Song song) {
        if (position < 0) {
            System.out.println("Vị trí không hợp lệ.");
            return;
        }
        Node newNode = new Node(song);
        if (position == 0) {
            addFirst(song);
            return;
        }
        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            if (temp == null) {
                System.out.println("Vị trí vượt quá kích thước playlist.");
                return;
            }
            temp = temp.next;
        }
        if (temp == null) {
            addLast(song);
            return;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        if (temp.next != null) {
            temp.next.prev = newNode;
        } else {
            tail = newNode;
        }
        temp.next = newNode;
    }

    // In playlist từ đầu đến cuối
    public void printForward() {
        if (head == null) {
            System.out.println("Playlist rỗng.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // In playlist từ cuối đến đầu
    public void printBackward() {
        if (tail == null) {
            System.out.println("Playlist rỗng.");
            return;
        }
        Node temp = tail;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }

    // Tìm bài hát theo id
    public Song findById(String id) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.getId().equals(id)) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    // Tìm bài hát theo tên bài hát hoặc tên ca sĩ
    public Song findByTitleOrArtist(String keyword) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.getTitle().equalsIgnoreCase(keyword) || temp.data.getArtist().equalsIgnoreCase(keyword)) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    // Xóa bài hát ở đầu
    public void removeFirst() {
        if (head == null) {
            System.out.println("Playlist rỗng.");
            return;
        }
        if (head == tail) {
            head = tail = current = null;
        } else {
            head = head.next;
            head.prev = null;
            if (current == head) current = head.next;
        }
    }

    // Xóa bài hát ở cuối
    public void removeLast() {
        if (tail == null) {
            System.out.println("Playlist rỗng.");
            return;
        }
        if (head == tail) {
            head = tail = current = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            if (current == tail.next) current = tail;
        }
    }

    // Xóa bài hát theo id
    public void removeById(String id) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.getId().equals(id)) {
                if (temp == head) {
                    removeFirst();
                } else if (temp == tail) {
                    removeLast();
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                    if (current == temp) current = temp.next;
                }
                return;
            }
            temp = temp.next;
        }
        System.out.println("Không tìm thấy bài hát với id: " + id);
    }

    // Đếm số lượng bài hát
    public int count() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Tính tổng thời gian playlist
    public double calculateTotalDuration() {
        double total = 0;
        Node temp = head;
        while (temp != null) {
            total += temp.data.getDuration();
            temp = temp.next;
        }
        return total;
    }

    // Sắp xếp theo tên bài hát A-Z
    public void sortByTitleAscending() {
        if (head == null) return;
        boolean swapped;
        do {
            swapped = false;
            Node temp = head;
            while (temp.next != null) {
                if (temp.data.getTitle().compareToIgnoreCase(temp.next.data.getTitle()) > 0) {
                    Song tempData = temp.data;
                    temp.data = temp.next.data;
                    temp.next.data = tempData;
                    swapped = true;
                }
                temp = temp.next;
            }
        } while (swapped);
    }

    // Sắp xếp theo thời lượng giảm dần
    public void sortByDurationDescending() {
        if (head == null) return;
        boolean swapped;
        do {
            swapped = false;
            Node temp = head;
            while (temp.next != null) {
                if (temp.data.getDuration() < temp.next.data.getDuration()) {
                    Song tempData = temp.data;
                    temp.data = temp.next.data;
                    temp.next.data = tempData;
                    swapped = true;
                }
                temp = temp.next;
            }
        } while (swapped);
    }

    // Chuyển đến bài hát tiếp theo
    public Song nextSong() {
        if (current == null) {
            System.out.println("Playlist rỗng.");
            return null;
        }
        if (current.next != null) {
            current = current.next;
            return current.data;
        } else {
            System.out.println("Đã ở bài hát cuối cùng.");
            return current.data;
        }
    }

    // Chuyển đến bài hát trước đó
    public Song previousSong() {
        if (current == null) {
            System.out.println("Playlist rỗng.");
            return null;
        }
        if (current.prev != null) {
            current = current.prev;
            return current.data;
        } else {
            System.out.println("Đã ở bài hát đầu tiên.");
            return current.data;
        }
    }

    // Xóa toàn bộ playlist
    public void clearPlaylist() {
        head = tail = current = null;
        System.out.println("Đã xóa toàn bộ playlist.");
    }
}
