public class Main {
    public static void main(String[] args) {
        FileItem a = new FileItem("a.txt",12);
        FileItem b = new FileItem("b.txt", 8);

        Shortcut aShortcut = new Shortcut("a-shortcut", a);
        FileItem readMe = new FileItem("readme.md", 4);

        Folder docs = new Folder("docs", new FileSystemItem[]{a, b, aShortcut});
        Folder root = new Folder("root", new FileSystemItem[]{docs, readMe});

        root.print("  ");
    }
}
