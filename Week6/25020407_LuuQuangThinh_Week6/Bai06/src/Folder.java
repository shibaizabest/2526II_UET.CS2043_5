public class Folder extends FileSystemItem{
    FileSystemItem[] folder;

    public Folder(String name, FileSystemItem[] folder){
        this.name = name;
        this.folder = folder;

        for (FileSystemItem item : folder) {
            item.parent = this;
        }
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "Folder: " + name);
        for (FileSystemItem item : folder){
            item.print(indent + "  ");
        }
    }
}
