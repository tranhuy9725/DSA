package day3.bai4;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.addFirst(new Song("ST01", "Đừng Làm Trái Tim Anh Đau", "Sơn Tùng M-TP", 3.50));
        playlist.addFirst(new Song("ST02", "Chúng Ta Của Tương Lai", "Sơn Tùng M-TP", 4.10));
        playlist.addLast(new Song("ST03", "Lạc Trôi", "Sơn Tùng M-TP", 3.53));
        playlist.addAtPosition(1, new Song("ST04", "Hãy Trao Cho Anh", "Sơn Tùng M-TP", 4.20));


        System.out.println("Playlist (từ đầu đến cuối):");
        playlist.printForward();
        System.out.println();

        System.out.println("Playlist (từ cuối đến đầu):");
        playlist.printBackward();
        System.out.println();

        System.out.println("Tìm bài hát với id S02:");
        Song s1 = playlist.findById("S02");
        System.out.println(s1 != null ? s1 : "Không tìm thấy");
        System.out.println();

        System.out.println("Tìm bài hát với tên hoặc ca sĩ 'Q':");
        Song s2 = playlist.findByTitleOrArtist("Q");
        System.out.println(s2 != null ? s2 : "Không tìm thấy");
        System.out.println();

        System.out.println("Playlist sau khi xóa bài đầu:");
        playlist.removeFirst();
        playlist.printForward();
        System.out.println();

        System.out.println("Playlist sau khi xóa bài cuối:");
        playlist.removeLast();
        playlist.printForward();
        System.out.println();

        System.out.println("Playlist sau khi xóa bài với id S04:");
        playlist.removeById("S04");
        playlist.printForward();
        System.out.println();

        System.out.println("Số bài hát trong playlist: " + playlist.count());
        System.out.println();

        System.out.println("Tổng thời gian playlist: " + playlist.calculateTotalDuration() + " phút");
        System.out.println();

        System.out.println("Playlist sau khi sắp xếp theo tên A-Z:");
        playlist.sortByTitleAscending();
        playlist.printForward();
        System.out.println();

        System.out.println("Playlist sau khi sắp xếp theo thời lượng giảm dần:");
        playlist.sortByDurationDescending();
        playlist.printForward();
        System.out.println();

        System.out.println("Bài hát hiện tại: " + playlist.nextSong());
        System.out.println("Chuyển sang bài tiếp theo: " + playlist.nextSong());
        System.out.println("Quay lại bài trước: " + playlist.previousSong());
        System.out.println();

        System.out.println("Xóa toàn bộ playlist:");
        playlist.clearPlaylist();
        playlist.printForward();
    }
}