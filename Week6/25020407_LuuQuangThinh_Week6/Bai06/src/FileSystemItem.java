public abstract class FileSystemItem {
    Folder parent;
    String name;

    public String getPath(){
        if (parent == null) return '/' + name;
        return parent.getPath() + '/' + name;
    }

    abstract void print(String indent);
}
